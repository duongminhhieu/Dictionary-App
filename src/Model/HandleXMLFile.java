/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.stream.XMLOutputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamWriter;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

/**
 *
 * @author ASUS
 */
public class HandleXMLFile {

    public RecordWord readXMLFile(String filePath) {
        RecordWord recordWord = new RecordWord();
        String word, meaning;
        File xmlFile = new File(filePath);
        // Kiểm tra xem file có tồn tại không
        if (!xmlFile.exists()) {
            try {
                // Nếu không tồn tại, tạo file mới
                xmlFile.createNewFile();
                System.out.println("Tạo file mới thành công!");
            } catch (IOException e) {
                System.out.println("Không thể tạo file mới!");
                e.printStackTrace();
            }
        }
        xmlFile.getParentFile().mkdirs();
        DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder dBuilder;

        try {
            dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(xmlFile);
            doc.getDocumentElement().normalize();
            NodeList nodeList = doc.getElementsByTagName("record");

            for (int i = 0; i < nodeList.getLength(); i++) {
                Node node = nodeList.item(i);

                if (node.getNodeType() == Node.ELEMENT_NODE) {
                    Element element = (Element) node;

                    word = element.getElementsByTagName("word").item(0).getTextContent();
                    meaning = element.getElementsByTagName("meaning").item(0).getTextContent();

                    recordWord.addRecord(word, meaning);
                }
            }

        } catch (IOException | ParserConfigurationException | SAXException e) {
            e.printStackTrace();
        }

        return recordWord;
    }

    public void writeXMLFile(String rootName, String filePath, RecordWord recordWord) {
        try {

            ByteArrayOutputStream out = new ByteArrayOutputStream();

            XMLOutputFactory output = XMLOutputFactory.newInstance();
            XMLStreamWriter writer = output.createXMLStreamWriter(out);
            writer.writeStartDocument("utf-8", "1.0");

            writer.writeStartElement(rootName);

            // duyet danh sach
            HashMap<String, String> hm = recordWord.getRecords();
            hm.forEach((word, meaning) -> {
                // System.out.println(meaning);
                try {
                    writer.writeStartElement("record");
                    writer.writeStartElement("word");
                    writer.writeCharacters(word);
                    writer.writeEndElement();

                    writer.writeStartElement("meaning");
                    writer.writeCharacters(meaning);
                    writer.writeEndElement();
                    writer.writeEndElement();

                } catch (XMLStreamException ex) {
                    Logger.getLogger(HandleXMLFile.class.getName()).log(Level.SEVERE, null, ex);
                }
            });

            writer.writeEndDocument();

            writer.flush();
            writer.close();

            String xml = new String(out.toByteArray(), StandardCharsets.UTF_8);
            // System.out.println(formatXML(xml));
            String prettyPrintXML = formatXML(xml);
            // print to console
            // System.out.println(prettyPrintXML);
            // Java 11 - write to file
            Files.writeString(Paths.get(filePath),
                    prettyPrintXML, StandardCharsets.UTF_8);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    private static String formatXML(String xml) throws TransformerException {

        // write data to xml file
        TransformerFactory transformerFactory = TransformerFactory.newInstance();
        Transformer transformer = transformerFactory.newTransformer();

        // pretty print by indention
        transformer.setOutputProperty(OutputKeys.INDENT, "yes");

        // add standalone="yes", add line break before the root element
        transformer.setOutputProperty(OutputKeys.STANDALONE, "yes");

        StreamSource source = new StreamSource(new StringReader(xml));
        StringWriter output = new StringWriter();
        transformer.transform(source, new StreamResult(output));

        return output.toString();

    }

}
