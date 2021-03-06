/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

/**
 *
 * @author PC
 */
public class PnHomePage extends javax.swing.JPanel {

    /**
     * Creates new form PnHomePage
     */
    public PnHomePage() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollBar1 = new javax.swing.JScrollBar();
        pnHome = new javax.swing.JPanel();
        pnCourseHint = new javax.swing.JPanel();
        lbCourseIcon = new javax.swing.JLabel();
        lbCourseInfo = new javax.swing.JLabel();
        lbCourseQty = new javax.swing.JLabel();
        pnStudentHint = new javax.swing.JPanel();
        lbStudentIcon = new javax.swing.JLabel();
        lbStudentInfo = new javax.swing.JLabel();
        lbStudentQty = new javax.swing.JLabel();
        pnMailBox = new javax.swing.JPanel();
        lbMailBoxIcon = new javax.swing.JLabel();
        lbMailBoxInfo = new javax.swing.JLabel();
        lbMailBoxQty = new javax.swing.JLabel();

        pnHome.setBackground(new java.awt.Color(255, 204, 204));
        pnHome.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 5, 10));

        pnCourseHint.setBackground(new java.awt.Color(255, 51, 0));
        pnCourseHint.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));

        lbCourseIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icon_trangchu1_white_24dp.png"))); // NOI18N

        lbCourseInfo.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lbCourseInfo.setForeground(new java.awt.Color(255, 255, 255));
        lbCourseInfo.setText("Khóa Học");

        lbCourseQty.setBackground(new java.awt.Color(255, 255, 255));
        lbCourseQty.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lbCourseQty.setForeground(new java.awt.Color(255, 255, 255));
        lbCourseQty.setText("100");

        javax.swing.GroupLayout pnCourseHintLayout = new javax.swing.GroupLayout(pnCourseHint);
        pnCourseHint.setLayout(pnCourseHintLayout);
        pnCourseHintLayout.setHorizontalGroup(
            pnCourseHintLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnCourseHintLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnCourseHintLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pnCourseHintLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(lbCourseQty)
                        .addGap(45, 45, 45))
                    .addGroup(pnCourseHintLayout.createSequentialGroup()
                        .addComponent(lbCourseIcon)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                        .addComponent(lbCourseInfo)
                        .addGap(25, 25, 25))))
        );
        pnCourseHintLayout.setVerticalGroup(
            pnCourseHintLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnCourseHintLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(lbCourseQty)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                .addGroup(pnCourseHintLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnCourseHintLayout.createSequentialGroup()
                        .addComponent(lbCourseIcon)
                        .addGap(20, 20, 20))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnCourseHintLayout.createSequentialGroup()
                        .addComponent(lbCourseInfo)
                        .addGap(29, 29, 29))))
        );

        pnHome.add(pnCourseHint);

        pnStudentHint.setBackground(new java.awt.Color(0, 204, 0));
        pnStudentHint.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));

        lbStudentIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icon_trangchu1_white_24dp.png"))); // NOI18N

        lbStudentInfo.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lbStudentInfo.setForeground(new java.awt.Color(255, 255, 255));
        lbStudentInfo.setText("Sinh Viên");

        lbStudentQty.setBackground(new java.awt.Color(255, 255, 255));
        lbStudentQty.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lbStudentQty.setForeground(new java.awt.Color(255, 255, 255));
        lbStudentQty.setText("100");

        javax.swing.GroupLayout pnStudentHintLayout = new javax.swing.GroupLayout(pnStudentHint);
        pnStudentHint.setLayout(pnStudentHintLayout);
        pnStudentHintLayout.setHorizontalGroup(
            pnStudentHintLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnStudentHintLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnStudentHintLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pnStudentHintLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(lbStudentQty)
                        .addGap(45, 45, 45))
                    .addGroup(pnStudentHintLayout.createSequentialGroup()
                        .addComponent(lbStudentIcon)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                        .addComponent(lbStudentInfo)
                        .addGap(25, 25, 25))))
        );
        pnStudentHintLayout.setVerticalGroup(
            pnStudentHintLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnStudentHintLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(lbStudentQty)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                .addGroup(pnStudentHintLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnStudentHintLayout.createSequentialGroup()
                        .addComponent(lbStudentIcon)
                        .addGap(20, 20, 20))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnStudentHintLayout.createSequentialGroup()
                        .addComponent(lbStudentInfo)
                        .addGap(29, 29, 29))))
        );

        pnHome.add(pnStudentHint);

        pnMailBox.setBackground(new java.awt.Color(0, 204, 204));
        pnMailBox.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));

        lbMailBoxIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icon_trangchu1_white_24dp.png"))); // NOI18N

        lbMailBoxInfo.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lbMailBoxInfo.setForeground(new java.awt.Color(255, 255, 255));
        lbMailBoxInfo.setText("Hộp Thư");

        lbMailBoxQty.setBackground(new java.awt.Color(255, 255, 255));
        lbMailBoxQty.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lbMailBoxQty.setForeground(new java.awt.Color(255, 255, 255));
        lbMailBoxQty.setText("100");

        javax.swing.GroupLayout pnMailBoxLayout = new javax.swing.GroupLayout(pnMailBox);
        pnMailBox.setLayout(pnMailBoxLayout);
        pnMailBoxLayout.setHorizontalGroup(
            pnMailBoxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnMailBoxLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnMailBoxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pnMailBoxLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(lbMailBoxQty)
                        .addGap(45, 45, 45))
                    .addGroup(pnMailBoxLayout.createSequentialGroup()
                        .addComponent(lbMailBoxIcon)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                        .addComponent(lbMailBoxInfo)
                        .addGap(25, 25, 25))))
        );
        pnMailBoxLayout.setVerticalGroup(
            pnMailBoxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnMailBoxLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(lbMailBoxQty)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                .addGroup(pnMailBoxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnMailBoxLayout.createSequentialGroup()
                        .addComponent(lbMailBoxIcon)
                        .addGap(20, 20, 20))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnMailBoxLayout.createSequentialGroup()
                        .addComponent(lbMailBoxInfo)
                        .addGap(29, 29, 29))))
        );

        pnHome.add(pnMailBox);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnHome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnHome, javax.swing.GroupLayout.DEFAULT_SIZE, 469, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollBar jScrollBar1;
    private javax.swing.JLabel lbCourseIcon;
    private javax.swing.JLabel lbCourseInfo;
    private javax.swing.JLabel lbCourseQty;
    private javax.swing.JLabel lbMailBoxIcon;
    private javax.swing.JLabel lbMailBoxInfo;
    private javax.swing.JLabel lbMailBoxQty;
    private javax.swing.JLabel lbStudentIcon;
    private javax.swing.JLabel lbStudentInfo;
    private javax.swing.JLabel lbStudentQty;
    private javax.swing.JPanel pnCourseHint;
    private javax.swing.JPanel pnHome;
    private javax.swing.JPanel pnMailBox;
    private javax.swing.JPanel pnStudentHint;
    // End of variables declaration//GEN-END:variables
}
