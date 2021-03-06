/*
 * Github: martinusdawan
 * Email: martinuz.dawan9@gmail.com
 *
 * Copyright 2018 hinha.
 */
package com.tokoroti.view;

import com.tokoroti.program.KoneksiDB;
import com.tokoroti.program.ModelPelanggan;
import com.tokoroti.program.ModelProduk;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author hinha
 */
public class TambahProduk extends javax.swing.JFrame {

    ModelProduk modelProduk;
    KoneksiDB kon = new KoneksiDB();
    
    int ID = 0;
    
    public TambahProduk() {
        initComponents();
        showData();
    }
    
    public void showData() {
        DefaultTableModel modelData = new DefaultTableModel();
        modelData.addColumn("No");
        modelData.addColumn("Nama Produk");
        modelData.addColumn("Jenis");
        modelData.addColumn("Harga");
        modelData.addColumn("Stok");
        tblProduk.setModel(modelData);
        try {
            kon.res = kon.stat.executeQuery("SELECT * FROM produk");
            while(kon.res.next()){  
                modelData.addRow(new Object[]{
                    kon.res.getInt(1),
                    kon.res.getString(2),
                    kon.res.getString(3),
                    kon.res.getInt(4),
                    kon.res.getInt(5) 
                });
            }
        } catch (SQLException ex) {
            Logger.getLogger(TambahProduk.class.getName()).log(Level.SEVERE, null, ex);
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

        lblJudulP = new javax.swing.JLabel();
        txtProduk = new javax.swing.JTextField();
        lblNamaProduk = new javax.swing.JLabel();
        txtJenis = new javax.swing.JTextField();
        lblJenis = new javax.swing.JLabel();
        txtHarga = new javax.swing.JTextField();
        lblHarga = new javax.swing.JLabel();
        lblHarga1 = new javax.swing.JLabel();
        txtJumlah = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblProduk = new javax.swing.JTable();
        btnBack = new javax.swing.JButton();
        btnBatal = new javax.swing.JButton();
        btnTambah = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        lblJudulP.setFont(new java.awt.Font("Dialog", 1, 20)); // NOI18N
        lblJudulP.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblJudulP.setText("Produk");

        lblNamaProduk.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblNamaProduk.setText("Nama Produk");

        lblJenis.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblJenis.setText("Jenis");

        lblHarga.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblHarga.setText("Harga");

        lblHarga1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblHarga1.setText("Jumlah");

        tblProduk.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "No", "Nama", "Jenis", "Harga", "Stok"
            }
        ));
        tblProduk.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblProdukMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblProduk);

        btnBack.setText("Kembali");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        btnBatal.setText("Batal");
        btnBatal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBatalActionPerformed(evt);
            }
        });

        btnTambah.setText("Tambah");
        btnTambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTambahActionPerformed(evt);
            }
        });

        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblJudulP, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblNamaProduk)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtProduk, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(lblHarga)
                                            .addGap(75, 75, 75)
                                            .addComponent(txtHarga, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(lblJenis)
                                            .addGap(84, 84, 84)
                                            .addComponent(txtJenis, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                            .addComponent(lblHarga1)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(txtJumlah, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(25, 25, 25))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnBack)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnUpdate)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnTambah)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnBatal)
                                .addGap(18, 18, 18)))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 1, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(lblJudulP)
                .addGap(61, 61, 61)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblNamaProduk)
                            .addComponent(txtProduk, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblJenis)
                            .addComponent(txtJenis, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblHarga)
                            .addComponent(txtHarga, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblHarga1)
                            .addComponent(txtJumlah, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(68, 68, 68)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnBatal, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnTambah, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnTambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTambahActionPerformed
        
        if (txtProduk.getText().equals("") || txtJenis.getText().equals("")
                || txtHarga.getText().equals("") || txtJumlah.getText().equals("")) {
            
            JOptionPane.showMessageDialog(this, "Inputan kosong");
            
        }else {
            modelProduk = new ModelProduk(txtProduk.getText(), txtJenis.getText(), 
                    Integer.parseInt(txtHarga.getText()), Integer.parseInt(txtJumlah.getText()));
            if (modelProduk.insertProduk()) {
                showData();
                JOptionPane.showMessageDialog(this, "Berhasil Ditambahkan");
                txtProduk.setText("");
                txtJenis.setText("");
                txtHarga.setText("");
                txtJumlah.setText("");
            }
            
        }
    }//GEN-LAST:event_btnTambahActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        Dashboard dashboard = new Dashboard();
        dashboard.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
         int edit = JOptionPane.showConfirmDialog(null, "Sudah benar ?" ,"Oke", 
                JOptionPane.YES_NO_OPTION);
        if (edit == JOptionPane.YES_OPTION) {
            modelProduk = new ModelProduk(txtProduk.getText(), txtJenis.getText(), Integer.parseInt(txtHarga.getText()), Integer.parseInt(txtJumlah.getText()));
            if (modelProduk.updatePelanggan(ID)) {
                showData();
                JOptionPane.showMessageDialog(null, "Data Berhasil Di Edit");
                txtProduk.setText("");
                txtJenis.setText("");
                txtHarga.setText("");
                txtJumlah.setText("");
            }
        }
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void tblProdukMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblProdukMouseClicked
        int row = tblProduk.getSelectedRow();
        ID = Integer.parseInt(tblProduk.getModel().getValueAt(row, 0).toString());
        modelProduk = new ModelProduk();
        if (modelProduk.editPelanggan(ID)) {
            txtProduk.setText(modelProduk.getNamaProduk());
            txtJenis.setText(modelProduk.getJenis());
            txtHarga.setText(String.valueOf(modelProduk.getHarga()));
            txtJumlah.setText(String.valueOf(modelProduk.getStok()));
        }
    }//GEN-LAST:event_tblProdukMouseClicked

    private void btnBatalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBatalActionPerformed
        txtProduk.setText("");
        txtJenis.setText("");
        txtHarga.setText("");
        txtJumlah.setText("");
    }//GEN-LAST:event_btnBatalActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(TambahProduk.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TambahProduk.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TambahProduk.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TambahProduk.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TambahProduk().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnBatal;
    private javax.swing.JButton btnTambah;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblHarga;
    private javax.swing.JLabel lblHarga1;
    private javax.swing.JLabel lblJenis;
    private javax.swing.JLabel lblJudulP;
    private javax.swing.JLabel lblNamaProduk;
    private javax.swing.JTable tblProduk;
    private javax.swing.JTextField txtHarga;
    private javax.swing.JTextField txtJenis;
    private javax.swing.JTextField txtJumlah;
    private javax.swing.JTextField txtProduk;
    // End of variables declaration//GEN-END:variables
}
