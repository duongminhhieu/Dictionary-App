/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Forms;

import Model.Dictionary;
import Model.HandleXMLFile;
import Model.Model_Button;
import Model.RecordWord;
import Swing.SearchText;
import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author RAVEN
 */
public class LookupForm extends javax.swing.JPanel {

    private int keyLanguage = 1; // 1 - Anh Viet ; 0 - Viet Anh 
    private int keyFavourite = 0; // 1 - true ; 0 - false
    private String searchText;
    private String meaning;
    Dictionary dictionary = new Dictionary();

    /**
     * Creates new form Form_1
     *
     * @param d
     */
    public LookupForm(Dictionary d) {
        initComponents();
        dictionary = d;
        SearchButton.setData(new Model_Button(new ImageIcon(getClass().getResource("/com/raven/icon/search.png")), "Tìm kiếm"));
        SwitchLanguage.setData(new Model_Button(new ImageIcon(getClass().getResource("/com/raven/icon/4.png")), "Anh - Việt"));
        favoriteWord.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        SearchText = new Component.Header();
        SearchButton = new Component.Button();
        SwitchLanguage = new Component.Button();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        meaningSearch = new javax.swing.JTextArea();
        titleSearch = new javax.swing.JLabel();
        favoriteWord = new javax.swing.JPanel();
        iconStar = new javax.swing.JLabel();
        titleSearch1 = new javax.swing.JLabel();

        SearchText.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(28, 181, 224)));
        SearchText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                SearchTextKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                SearchTextKeyTyped(evt);
            }
        });

        SearchButton.setColor1(new java.awt.Color(28, 181, 224));
        SearchButton.setColor2(new java.awt.Color(0, 0, 120));
        SearchButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SearchButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                SearchButtonMouseEntered(evt);
            }
        });
        SearchButton.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                SearchButtonKeyPressed(evt);
            }
        });

        SwitchLanguage.setColor1(new java.awt.Color(28, 181, 224));
        SwitchLanguage.setColor2(new java.awt.Color(0, 0, 120));
        SwitchLanguage.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SwitchLanguageMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(SearchText, javax.swing.GroupLayout.PREFERRED_SIZE, 475, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(SwitchLanguage, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(SearchButton, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(SearchText, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(SearchButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(SwitchLanguage, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        meaningSearch.setEditable(false);
        meaningSearch.setColumns(20);
        meaningSearch.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        meaningSearch.setRows(5);
        jScrollPane1.setViewportView(meaningSearch);

        titleSearch.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        titleSearch.setForeground(new java.awt.Color(16, 103, 158));
        titleSearch.setText("Từ khóa `  ` được dịch như sau:");

        favoriteWord.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        favoriteWord.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                favoriteWordMouseClicked(evt);
            }
        });

        iconStar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/raven/icon/star.png"))); // NOI18N

        titleSearch1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        titleSearch1.setForeground(new java.awt.Color(16, 103, 158));
        titleSearch1.setText("Yêu thích");

        javax.swing.GroupLayout favoriteWordLayout = new javax.swing.GroupLayout(favoriteWord);
        favoriteWord.setLayout(favoriteWordLayout);
        favoriteWordLayout.setHorizontalGroup(
            favoriteWordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
            .addGroup(favoriteWordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(favoriteWordLayout.createSequentialGroup()
                    .addGap(2, 2, 2)
                    .addComponent(titleSearch1, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(iconStar)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        favoriteWordLayout.setVerticalGroup(
            favoriteWordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 28, Short.MAX_VALUE)
            .addGroup(favoriteWordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(favoriteWordLayout.createSequentialGroup()
                    .addGap(2, 2, 2)
                    .addGroup(favoriteWordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(titleSearch1)
                        .addComponent(iconStar, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(titleSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(favoriteWord, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 740, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 54, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(titleSearch)
                    .addComponent(favoriteWord, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 362, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(104, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void SearchButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SearchButtonMouseEntered
        // TODO add your handling code here:

    }//GEN-LAST:event_SearchButtonMouseEntered

    private void SwitchLanguageMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SwitchLanguageMouseClicked
        // TODO add your handling code here:
        if (keyLanguage == 1) {
            keyLanguage = 0;
            SwitchLanguage.setData(new Model_Button(new ImageIcon(getClass().getResource("/com/raven/icon/4.png")), "Việt - Anh"));
            //SearchText.setHintText("Nhập từ tiếng Việt");
        } else {
            keyLanguage = 1;
            SwitchLanguage.setData(new Model_Button(new ImageIcon(getClass().getResource("/com/raven/icon/4.png")), "Anh - Việt"));
            //SearchText.setHintText("Nhập từ tiếng Anh");

        }

    }//GEN-LAST:event_SwitchLanguageMouseClicked

    private int checkFavoriteWord(int keyL, String word) {
        if (keyL == 1) {
            if (Dictionary.listFavoriteWordEnglish.checkWord(word)) {
                return 1;
            }
            return 0;
        } else {
            if (Dictionary.listFavoriteWordVietnamese.checkWord(word)) {
                return 1;
            }
            return 0;
        }
    }

    private void addRecordFavorite(int keyL, String word, String meaning) {
        HandleXMLFile handleXMLFile = new HandleXMLFile();
        if (keyL == 1) {
            Dictionary.listFavoriteWordEnglish.addRecord(word, meaning);
            handleXMLFile.writeXMLFile("favoriteEnglish", "Data/favoriteEnglish.xml", Dictionary.listFavoriteWordEnglish);

        } else {
            Dictionary.listFavoriteWordVietnamese.addRecord(word, meaning);
            handleXMLFile.writeXMLFile("favoriteVietnamese", "Data/favoriteVietnamese.xml", Dictionary.listFavoriteWordVietnamese);

        }
    }

    private void removeRecordFavorite(int keyL, String word) {
        HandleXMLFile handleXMLFile = new HandleXMLFile();
        if (keyL == 1) {
            Dictionary.listFavoriteWordEnglish.removeRecord(word);
            handleXMLFile.writeXMLFile("favoriteEnglish", "Data/favoriteEnglish.xml", Dictionary.listFavoriteWordEnglish);

        } else {
            Dictionary.listFavoriteWordVietnamese.removeRecord(word);
            handleXMLFile.writeXMLFile("favoriteVietnamese", "Data/favoriteVietnamese.xml", Dictionary.listFavoriteWordVietnamese);

        }
    }

    public String handlingString(String str) {

        str = str.toLowerCase();
        str = str.trim();
        return str;
    }

    private void SearchButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SearchButtonMouseClicked
        // TODO add your handling code here:
        searchText = SearchText.getText();
        searchText = handlingString(searchText);
        if (keyLanguage == 1) {
            RecordWord recordWord = dictionary.getAnh_Viet();
            meaning = recordWord.getMeaning(searchText);
            if (meaning == null) {
                meaningSearch.setText("Không tìm thấy !!!!!");
                favoriteWord.setVisible(false);

            } else {
                meaningSearch.setText(meaning);
                favoriteWord.setVisible(true);
                keyFavourite = checkFavoriteWord(keyLanguage, searchText);
                setColorStar(keyFavourite);
            }
            String str = "Từ khóa ``" + searchText + "`` được dịch như sau: ";
            titleSearch.setText(str);
        } else {
            RecordWord recordWord = dictionary.getViet_Anh();
            meaning = recordWord.getMeaning(searchText);
            if (meaning == null) {
                meaningSearch.setText("Không tìm thấy !!!!!");
                favoriteWord.setVisible(false);

            } else {
                meaningSearch.setText(meaning);
                favoriteWord.setVisible(true);
                keyFavourite = checkFavoriteWord(keyLanguage, searchText);
                setColorStar(keyFavourite);

            }
            String str = "Từ khóa ``" + searchText + "`` được dịch như sau: ";
            titleSearch.setText(str);
        }

    }//GEN-LAST:event_SearchButtonMouseClicked

    private void setColorStar(int keyF) {
        if (keyF == 1) {
            iconStar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/raven/icon/star_yellow.png")));

        } else {
            iconStar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/raven/icon/star.png")));

        }
    }

    private void favoriteWordMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_favoriteWordMouseClicked
        // TODO add your handling code here:
        if (keyFavourite == 0) {
            addRecordFavorite(keyLanguage, searchText, meaning);
            keyFavourite = 1;
            setColorStar(keyFavourite);
            JOptionPane.showMessageDialog(this, "Thêm vào danh sách yêu thích thành công!");

        } else {
            removeRecordFavorite(keyLanguage, searchText);
            keyFavourite = 0;
            setColorStar(keyFavourite);
            JOptionPane.showMessageDialog(this, "Đã xóa khỏi danh sách yêu thích !");
        }

    }//GEN-LAST:event_favoriteWordMouseClicked

    private void SearchButtonKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_SearchButtonKeyPressed
        // TODO add your handling code here:

    }//GEN-LAST:event_SearchButtonKeyPressed

    private void SearchTextKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_SearchTextKeyPressed
        // TODO add your handling code here:

    }//GEN-LAST:event_SearchTextKeyPressed

    private void SearchTextKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_SearchTextKeyTyped
        // TODO add your handling code here:

    }//GEN-LAST:event_SearchTextKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private Component.Button SearchButton;
    private Component.Header SearchText;
    private Component.Button SwitchLanguage;
    private javax.swing.JPanel favoriteWord;
    private javax.swing.JLabel iconStar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea meaningSearch;
    private javax.swing.JLabel titleSearch;
    private javax.swing.JLabel titleSearch1;
    // End of variables declaration//GEN-END:variables
}
