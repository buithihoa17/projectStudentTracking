/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.StudentController;

/**
 *
 * @author PC
 */
public class PnStudentManagers extends javax.swing.JPanel {

    /**
     * Creates new form PnStudentManagers
     */
    public PnStudentManagers() {
        initComponents();
        final StudentController studentController = new StudentController(tbStudent, tfSearch, btExport, btInsert);
        studentController.loadDataTable();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnTop = new javax.swing.JPanel();
        tfSearch = new javax.swing.JTextField();
        btExport = new javax.swing.JButton();
        btInsert = new javax.swing.JButton();
        pnCenter = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbStudent = new javax.swing.JTable();

        setBackground(new java.awt.Color(255, 204, 204));
        setLayout(new java.awt.BorderLayout());

        pnTop.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 20, 1), javax.swing.BorderFactory.createEtchedBorder()));

        btExport.setBackground(new java.awt.Color(0, 204, 51));
        btExport.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btExport.setForeground(new java.awt.Color(255, 255, 255));
        btExport.setText("Xuất báo cáo");

        btInsert.setBackground(new java.awt.Color(0, 204, 51));
        btInsert.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btInsert.setForeground(new java.awt.Color(255, 255, 255));
        btInsert.setText("+Thêm mới");

        javax.swing.GroupLayout pnTopLayout = new javax.swing.GroupLayout(pnTop);
        pnTop.setLayout(pnTopLayout);
        pnTopLayout.setHorizontalGroup(
            pnTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnTopLayout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addComponent(tfSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btExport)
                .addGap(55, 55, 55)
                .addComponent(btInsert)
                .addGap(20, 20, 20))
        );
        pnTopLayout.setVerticalGroup(
            pnTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnTopLayout.createSequentialGroup()
                .addContainerGap(28, Short.MAX_VALUE)
                .addGroup(pnTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btInsert, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btExport, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20))
        );

        pnTopLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btExport, btInsert, tfSearch});

        add(pnTop, java.awt.BorderLayout.PAGE_START);

        pnCenter.setLayout(new java.awt.BorderLayout());

        tbStudent.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153), 2));
        tbStudent.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        tbStudent.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tbStudent.setRowHeight(30);
        tbStudent.setRowMargin(4);
        jScrollPane1.setViewportView(tbStudent);

        pnCenter.add(jScrollPane1, java.awt.BorderLayout.CENTER);

        add(pnCenter, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btExport;
    private javax.swing.JButton btInsert;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel pnCenter;
    private javax.swing.JPanel pnTop;
    private javax.swing.JTable tbStudent;
    private javax.swing.JTextField tfSearch;
    // End of variables declaration//GEN-END:variables
}
