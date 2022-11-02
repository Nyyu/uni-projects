package screens;

import java.util.Arrays;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import utils.Utility;
import static utils.Utility.aiIcon;
import static utils.Utility.userIcon;

public class Main extends javax.swing.JFrame {

    public static int field[][] = {{-1, -1, -1}, {-1, -1, -1}, {-1, -1, -1}};

    public Main() {
        initComponents();
    }

    public static void setField(int[][] field) {
        Main.field = field;
    }

    public JLabel wichButton(String rowCol) {
        System.out.println("Pos [row | col] " + rowCol);
        switch (rowCol) {
            case "00" -> {
                return block00;
            }
            case "01" -> {
                return block01;
            }
            case "02" -> {
                return block02;
            }
            case "10" -> {
                return block10;
            }
            case "11" -> {
                return block11;
            }
            case "12" -> {
                return block12;
            }
            case "20" -> {
                return block20;
            }
            case "21" -> {
                return block21;
            }
            case "22" -> {
                return block22;
            }
            default ->
                throw new AssertionError();
        }
    }

    public void makeMove(JLabel label, int[] pos) {
        // Are all of 'em filled?
        if (field[0][0] != -1 && field[0][1] != -1
                && field[0][2] != -1 && field[1][0] != -1
                && field[1][1] != -1 && field[1][2] != -1
                && field[2][0] != -1 && field[2][1] != -1
                && field[2][2] != -1) {
            return;
        }

        // Does it have a number that differs from -1
        if (field[pos[0]][pos[1]] == 0 || field[pos[0]][pos[1]] == 1) {
            return;
        }

        boolean isItAvailable = field[pos[0]][pos[1]] == -1 ? true : false;

        // Update field selected by the user
        field[pos[0]][pos[1]] = 0;

        System.out.println("pos choosen " + pos[0] + pos[1] + "\n"
                + "is it available? " + isItAvailable);

        // Update background
        Utility.changeBackground(label, userIcon);

        int numTimeout = -1;

        // "A.I." position
        int posRow = Utility.getRandomField();
        int posCol = Utility.getRandomField();

        // Dont update if it has a number different from -1
        while (field[posRow][posCol] != -1) {
            System.out.println("update AI pos" + posRow + posCol);
            posRow = Utility.getRandomField();
            posCol = Utility.getRandomField();

            if (numTimeout > 100) {
                break;
            }
            numTimeout++;

        }

        field[posRow][posCol] = 1;

        JLabel AI = wichButton("" + posRow + "" + posCol);
        Utility.changeBackground(AI, aiIcon);

        int isThereAWinner = Utility.checkWinner(field);
        System.out.println("is there a winner? " + isThereAWinner);

        if (isThereAWinner != -1) {
            String whichPlayer = isThereAWinner == 0 ? "USER" : "A.I.";
            JOptionPane.showMessageDialog(rootPane, "Wait... di- did someone win? HOLY FUCK IT ACTUALLY WORKS! CUZ THE (" + whichPlayer + ") SOMEHOW WON THE GAME");
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        block21 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        block20 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        block22 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        block01 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        block00 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        block02 = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        block11 = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        block10 = new javax.swing.JLabel();
        jPanel13 = new javax.swing.JPanel();
        block12 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        ResetButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Jogo da velha");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jPanel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(18, 18, 20), 2, true));
        jPanel2.setPreferredSize(new java.awt.Dimension(150, 150));

        block21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        block21.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                block21MousePressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(block21, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 146, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(block21, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 146, Short.MAX_VALUE)
        );

        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(18, 18, 20), 2, true));
        jPanel1.setPreferredSize(new java.awt.Dimension(150, 150));

        block20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        block20.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                block20MousePressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(block20, javax.swing.GroupLayout.DEFAULT_SIZE, 146, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(block20, javax.swing.GroupLayout.DEFAULT_SIZE, 146, Short.MAX_VALUE)
        );

        jPanel3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(18, 18, 20), 2, true));
        jPanel3.setPreferredSize(new java.awt.Dimension(150, 150));

        block22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        block22.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                block22MousePressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(block22, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 146, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(block22, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 146, Short.MAX_VALUE)
        );

        jPanel6.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(18, 18, 20), 2, true));
        jPanel6.setPreferredSize(new java.awt.Dimension(150, 150));

        block01.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        block01.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                block01MousePressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(block01, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 146, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(block01, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 146, Short.MAX_VALUE)
        );

        jPanel7.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(18, 18, 20), 2, true));
        jPanel7.setPreferredSize(new java.awt.Dimension(150, 150));

        block00.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        block00.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                block00MousePressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(block00, javax.swing.GroupLayout.DEFAULT_SIZE, 146, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(block00, javax.swing.GroupLayout.DEFAULT_SIZE, 146, Short.MAX_VALUE)
        );

        jPanel8.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(18, 18, 20), 2, true));
        jPanel8.setPreferredSize(new java.awt.Dimension(150, 150));

        block02.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        block02.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                block02MousePressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(block02, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 146, Short.MAX_VALUE)
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(block02, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 146, Short.MAX_VALUE)
        );

        jPanel11.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(18, 18, 20), 2, true));
        jPanel11.setPreferredSize(new java.awt.Dimension(150, 150));

        block11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        block11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                block11MousePressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(block11, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 146, Short.MAX_VALUE)
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(block11, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 146, Short.MAX_VALUE)
        );

        jPanel12.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(18, 18, 20), 2, true));
        jPanel12.setPreferredSize(new java.awt.Dimension(150, 150));

        block10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        block10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                block10MousePressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(block10, javax.swing.GroupLayout.DEFAULT_SIZE, 146, Short.MAX_VALUE)
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(block10, javax.swing.GroupLayout.DEFAULT_SIZE, 146, Short.MAX_VALUE)
        );

        jPanel13.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(18, 18, 20), 2, true));
        jPanel13.setPreferredSize(new java.awt.Dimension(150, 150));

        block12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        block12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                block12MousePressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(block12, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 146, Short.MAX_VALUE)
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(block12, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 146, Short.MAX_VALUE)
        );

        jLabel14.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("JOGO DA VELHA");

        ResetButton.setText("Reset");
        ResetButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResetButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(ResetButton, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ResetButton, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void block00MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_block00MousePressed
        int pos[] = {0, 0};
        makeMove(block00, pos);
    }//GEN-LAST:event_block00MousePressed

    private void block01MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_block01MousePressed
        int pos[] = {0, 1};
        makeMove(block01, pos);
    }//GEN-LAST:event_block01MousePressed

    private void block02MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_block02MousePressed
        int pos[] = {0, 2};
        makeMove(block02, pos);
    }//GEN-LAST:event_block02MousePressed

    private void block10MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_block10MousePressed
        int pos[] = {1, 0};
        makeMove(block10, pos);
    }//GEN-LAST:event_block10MousePressed

    private void block11MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_block11MousePressed
        int pos[] = {1, 1};
        makeMove(block11, pos);
    }//GEN-LAST:event_block11MousePressed

    private void block12MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_block12MousePressed
        int pos[] = {1, 2};
        makeMove(block12, pos);
    }//GEN-LAST:event_block12MousePressed

    private void block20MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_block20MousePressed
        int pos[] = {2, 0};
        makeMove(block20, pos);
    }//GEN-LAST:event_block20MousePressed

    private void block21MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_block21MousePressed
        int pos[] = {2, 1};
        makeMove(block21, pos);
    }//GEN-LAST:event_block21MousePressed

    private void block22MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_block22MousePressed
        int pos[] = {2, 2};
        makeMove(block22, pos);
    }//GEN-LAST:event_block22MousePressed

    private void ResetButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResetButtonActionPerformed
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                String field = "" + j + i;
                JLabel label = wichButton(field);

                Utility.changeBackground(label, "reset");
            }
        }
        int newField[][] = {{-1, -1, -1}, {-1, -1, -1}, {-1, -1, -1}};
        setField(newField);
    }//GEN-LAST:event_ResetButtonActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ResetButton;
    private javax.swing.JLabel block00;
    private javax.swing.JLabel block01;
    private javax.swing.JLabel block02;
    private javax.swing.JLabel block10;
    private javax.swing.JLabel block11;
    private javax.swing.JLabel block12;
    private javax.swing.JLabel block20;
    private javax.swing.JLabel block21;
    private javax.swing.JLabel block22;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    // End of variables declaration//GEN-END:variables
}
