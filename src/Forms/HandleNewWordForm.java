/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Forms;

import Model.Dictionary;
import Model.HandleXMLFile;
import Model.Model_Button;
import Swing.ScrollBar;
import java.awt.Color;
import java.text.Collator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author RAVEN
 */
public class HandleNewWordForm extends javax.swing.JPanel {

    private int keyLanguage = 1;

    /**
     * Creates new form Form_1
     */
    public HandleNewWordForm() {
        initComponents();
        init();
    }

    public void init() {
        deleteBtn.setData(new Model_Button(new ImageIcon(getClass().getResource("/com/raven/icon/3.png")), "Xóa từ"));
        SelectAllBtn.setData(new Model_Button(new ImageIcon(getClass().getResource("/com/raven/icon/5.png")), "Chọn tất cả"));
        SwitchLanguageBtn.setData(new Model_Button(new ImageIcon(getClass().getResource("/com/raven/icon/4.png")), "Anh - Việt"));
        addFavoriteBtn.setData(new Model_Button(new ImageIcon(getClass().getResource("/com/raven/icon/star.png")), "Yêu thích"));

        //  add row table
        jScrollTable.setVerticalScrollBar(new ScrollBar());
        jScrollTable.getVerticalScrollBar().setBackground(Color.WHITE);
        jScrollTable.getViewport().setBackground(Color.WHITE);
        JPanel p = new JPanel();
        p.setBackground(Color.WHITE);
        jScrollTable.setCorner(JScrollPane.UPPER_RIGHT_CORNER, p);
        addDataTable();
    }

    public HashMap<String, String> readData(int keyL) {
        if (keyL == 1) {
            return Dictionary.listNewWordAnh_Viet.getRecords();
        } else {
            return Dictionary.listNewWordViet_Anh.getRecords();
        }
    }

    public void addDataTable() {
        //table.setModel(new DefaultTableModel(null, new String[]{"#", "Word", "Meaning", "Chọn"}));
        DefaultTableModel dtm = (DefaultTableModel) table.getModel();
        dtm.setRowCount(0);
        // duyet danh sach
        HashMap<String, String> hm = readData(keyLanguage);
        int i = 1;
        for (Map.Entry<String, String> entry : hm.entrySet()) {
            table.addRow(new Object[]{i, entry.getKey(), entry.getValue()});
            i++;
            // Do something with the key and value
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelBorder2 = new Swing.PanelBorder();
        jScrollTable = new javax.swing.JScrollPane();
        table = new Swing.Table();
        jLabel1 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        deleteBtn = new Component.Button();
        SelectAllBtn = new Component.Button();
        SwitchLanguageBtn = new Component.Button();
        addFavoriteBtn = new Component.Button();

        panelBorder2.setBackground(new java.awt.Color(255, 255, 255));

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "#", "Word", "Meaning", "Chọn"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Boolean.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        table.setColumnSelectionAllowed(true);
        table.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jScrollTable.setViewportView(table);
        table.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        if (table.getColumnModel().getColumnCount() > 0) {
            table.getColumnModel().getColumn(0).setMaxWidth(70);
            table.getColumnModel().getColumn(3).setMaxWidth(70);
        }

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(16, 103, 158));
        jLabel1.setText("Danh sách từ mới");

        jComboBox1.setBackground(new java.awt.Color(153, 204, 255));
        jComboBox1.setForeground(new java.awt.Color(153, 153, 153));
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sắp xếp ", "Sắp xếp A - Z", "Sắp xếp Z - A" }));
        jComboBox1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelBorder2Layout = new javax.swing.GroupLayout(panelBorder2);
        panelBorder2.setLayout(panelBorder2Layout);
        panelBorder2Layout.setHorizontalGroup(
            panelBorder2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBorder2Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(panelBorder2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(panelBorder2Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollTable, javax.swing.GroupLayout.PREFERRED_SIZE, 798, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15))
        );
        panelBorder2Layout.setVerticalGroup(
            panelBorder2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBorder2Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(panelBorder2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelBorder2Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(15, 15, 15))
                    .addGroup(panelBorder2Layout.createSequentialGroup()
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addComponent(jScrollTable, javax.swing.GroupLayout.PREFERRED_SIZE, 457, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );

        deleteBtn.setColor1(new java.awt.Color(255, 51, 51));
        deleteBtn.setColor2(new java.awt.Color(204, 0, 0));
        deleteBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                deleteBtnMouseClicked(evt);
            }
        });

        SelectAllBtn.setColor1(new java.awt.Color(28, 181, 224));
        SelectAllBtn.setColor2(new java.awt.Color(0, 0, 150));
        SelectAllBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SelectAllBtnMouseClicked(evt);
            }
        });

        SwitchLanguageBtn.setColor1(new java.awt.Color(28, 181, 224));
        SwitchLanguageBtn.setColor2(new java.awt.Color(0, 0, 150));
        SwitchLanguageBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SwitchLanguageBtnMouseClicked(evt);
            }
        });

        addFavoriteBtn.setColor1(new java.awt.Color(255, 255, 0));
        addFavoriteBtn.setColor2(new java.awt.Color(255, 204, 0));
        addFavoriteBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addFavoriteBtnMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 858, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(15, 15, 15)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(panelBorder2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addGap(310, 310, 310)
                            .addComponent(SwitchLanguageBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(SelectAllBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(addFavoriteBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(deleteBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addContainerGap(15, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 654, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(35, 35, 35)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(deleteBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(SelectAllBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(SwitchLanguageBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(addFavoriteBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(15, 15, 15)
                    .addComponent(panelBorder2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(36, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
        // get selected value
        int x = jComboBox1.getSelectedIndex();
        HashMap<String, String> records = readData(keyLanguage);
        // Chuyển HashMap thành List
        List<Map.Entry<String, String>> list = new ArrayList<>(records.entrySet());
        // Sử dụng Collator để sắp xếp theo tiếng Việt
        Collator collator = Collator.getInstance(new Locale("vi", "VN"));
        collator.setStrength(Collator.SECONDARY); // Không phân biệt chữ hoa, chữ thường,

        DefaultTableModel dtm = (DefaultTableModel) table.getModel();
        dtm.setRowCount(0);
        int i = 1;

        switch (x) {
            case 0:

                addDataTable();
                break;
            case 1:
                // Sắp xếp List theo thứ tự từ A-Z của key
                Collections.sort(list, new Comparator<Map.Entry<String, String>>() {
                    public int compare(Map.Entry<String, String> o1, Map.Entry<String, String> o2) {
                        return collator.compare(o1.getKey(), o2.getKey());
                    }
                });

                for (Map.Entry<String, String> entry : list) {
                    table.addRow(new Object[]{i, entry.getKey(), entry.getValue()});
                    i++;
                    // Do something with the key and value
                }

                break;

            case 2:

                // Sắp xếp List theo thứ tự từ A-Z của key
                Collections.sort(list, new Comparator<Map.Entry<String, String>>() {
                    public int compare(Map.Entry<String, String> o1, Map.Entry<String, String> o2) {
                        return collator.compare(o2.getKey(), o1.getKey());
                    }
                });
                for (Map.Entry<String, String> entry : list) {
                    table.addRow(new Object[]{i, entry.getKey(), entry.getValue()});
                    i++;
                    // Do something with the key and value
                }

                break;
            default:
                break;
        }
    }//GEN-LAST:event_jComboBox1ActionPerformed

    public void deleteDataTable() {
        TableModel model = table.getModel(); // Lấy TableModel của JTable
        int rowCount = model.getRowCount(); // Số lượng dòng trong JTable
        HandleXMLFile handleXMLFile = new HandleXMLFile();
        List<String> keysToRemove = new ArrayList<>(); // Tạo danh sách để lưu các key cần xóa

        for (int i = 0; i < rowCount; i++) {
            Boolean checked = (Boolean) model.getValueAt(i, 3); // Lấy giá trị của cột boolean
            if (checked != null && checked) {
                // Phần tử đã được chọn     

                String keyToRemove = (String) model.getValueAt(i, 1); // Lấy giá trị key cần xóa
                keysToRemove.add(keyToRemove); // Thêm key cần xóa vào danh sách

            }
        }

        if (keyLanguage == 1) {
            for (String key : keysToRemove) {
                Dictionary.listNewWordAnh_Viet.removeRecord(key);
            }
            handleXMLFile.writeXMLFile("favoriteEnglish", "Data/newWordAnh_Viet.xml", Dictionary.listNewWordAnh_Viet);
            addDataTable();
        } else {
            for (String key : keysToRemove) {
                Dictionary.listNewWordViet_Anh.removeRecord(key);
            }
            handleXMLFile.writeXMLFile("favoriteVietnamese", "Data/newWordViet_Anh.xml", Dictionary.listNewWordViet_Anh);
            addDataTable();
        }
    }

    private void deleteBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteBtnMouseClicked
        // TODO add your handling code here:

        int columnIndex = 3; // Thay columnIndex bằng chỉ số của cột boolean trong JTable của bạn
        int check = 0;
        TableModel model = table.getModel(); // Lấy TableModel của JTable

        int rowCount = model.getRowCount(); // Số lượng dòng trong JTable

        for (int i = 0; i < rowCount; i++) {
            Boolean checked = (Boolean) model.getValueAt(i, 3); // Lấy giá trị của cột boolean
            if (checked != null && checked) {
                check = 1;
                break;
            }
        }

        if (check == 1) {
            int confirm = JOptionPane.showConfirmDialog(this, "Bạn chắc chắn muốn xóa những từ đã chọn !");
            if (confirm == 0) {
                deleteDataTable();
            }
        } else {
            JOptionPane.showMessageDialog(this, "Bạn chưa chọn phần tử !");
        }

    }//GEN-LAST:event_deleteBtnMouseClicked

    private void SelectAllBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SelectAllBtnMouseClicked
        // TODO add your handling code here:
        int columnIndex = 3; // Thay columnIndex bằng chỉ số của cột boolean trong JTable của bạn
        TableModel model = table.getModel(); // Lấy TableModel của JTable

        int rowCount = model.getRowCount(); // Số lượng dòng trong JTable

        for (int i = 0; i < rowCount; i++) {
            model.setValueAt(true, i, columnIndex); // Đặt giá trị true cho tất cả các dòng của cột boolean
        }
    }//GEN-LAST:event_SelectAllBtnMouseClicked

    private void SwitchLanguageBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SwitchLanguageBtnMouseClicked
        // TODO add your handling code here:
        if (keyLanguage == 1) {
            keyLanguage = 0;
            SwitchLanguageBtn.setData(new Model_Button(new ImageIcon(getClass().getResource("/com/raven/icon/4.png")), "Việt - Anh"));
            //SearchText.setHintText("Nhập từ tiếng Việt");
            addDataTable();

        } else {
            keyLanguage = 1;
            SwitchLanguageBtn.setData(new Model_Button(new ImageIcon(getClass().getResource("/com/raven/icon/4.png")), "Anh - Việt"));
            //SearchText.setHintText("Nhập từ tiếng Anh");
            addDataTable();

        }
    }//GEN-LAST:event_SwitchLanguageBtnMouseClicked

    public void addListFavoriteWord() {
        TableModel model = table.getModel(); // Lấy TableModel của JTable
        int rowCount = model.getRowCount(); // Số lượng dòng trong JTable
        HandleXMLFile handleXMLFile = new HandleXMLFile();

        if (keyLanguage == 1) {
            for (int i = 0; i < rowCount; i++) {
                Boolean checked = (Boolean) model.getValueAt(i, 3); // Lấy giá trị của cột boolean
                if (checked != null && checked) {
                    // Phần tử đã được chọn     
                    String w = (String) model.getValueAt(i, 1);
                    String m = (String) model.getValueAt(i, 2);
                    Dictionary.listFavoriteWordEnglish.addRecord(w, m);
                }
            }
            handleXMLFile.writeXMLFile("favoriteEnglish", "Data/favoriteEnglish.xml", Dictionary.listNewWordAnh_Viet);
            addDataTable();
        } else {
            for (int i = 0; i < rowCount; i++) {
                Boolean checked = (Boolean) model.getValueAt(i, 3); // Lấy giá trị của cột boolean
                if (checked != null && checked) {
                    // Phần tử đã được chọn     
                    String w = (String) model.getValueAt(i, 1);
                    String m = (String) model.getValueAt(i, 2);
                    Dictionary.listFavoriteWordVietnamese.addRecord(w, m);
                }
            }
            handleXMLFile.writeXMLFile("favoriteVietnamese", "Data/favoriteVietnamese.xml", Dictionary.listNewWordViet_Anh);
            addDataTable();
        }
    }

    private void addFavoriteBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addFavoriteBtnMouseClicked
        // TODO add your handling code here:
        int columnIndex = 3; // Thay columnIndex bằng chỉ số của cột boolean trong JTable của bạn
        int check = 0;
        TableModel model = table.getModel(); // Lấy TableModel của JTable

        int rowCount = model.getRowCount(); // Số lượng dòng trong JTable

        for (int i = 0; i < rowCount; i++) {
            Boolean checked = (Boolean) model.getValueAt(i, 3); // Lấy giá trị của cột boolean
            if (checked != null && checked) {
                check = 1;
                break;
            }
        }

        if (check == 1) {
            addListFavoriteWord();
            JOptionPane.showMessageDialog(this, "Thêm vào danh sách yêu thích thành công!");

        } else {
            JOptionPane.showMessageDialog(this, "Bạn chưa chọn phần tử !");
        }
    }//GEN-LAST:event_addFavoriteBtnMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private Component.Button SelectAllBtn;
    private Component.Button SwitchLanguageBtn;
    private Component.Button addFavoriteBtn;
    private Component.Button deleteBtn;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollTable;
    private Swing.PanelBorder panelBorder2;
    private Swing.Table table;
    // End of variables declaration//GEN-END:variables
}
