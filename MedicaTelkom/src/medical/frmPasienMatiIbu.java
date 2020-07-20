/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package medical;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author ZOMBIE
 */
public class frmPasienMatiIbu extends javax.swing.JDialog {
DefaultTableModel tabmode;
    public frmPasienMatiIbu(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        String[] judul={"Tanggal","Jam","No Rm Ibu","Keterangan"};
        setLocationRelativeTo(null);
        tabmode=new DefaultTableModel(judul,0);
        tabelPasienMatiIbu.setModel(tabmode);
        tampil();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtrmIbu = new javax.swing.JTextField();
        txtKeterangan = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txtJam = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        tbSimpan = new javax.swing.JButton();
        tbEdit = new javax.swing.JButton();
        tbHapus = new javax.swing.JButton();
        tbCetak = new javax.swing.JButton();
        tbKeluar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelPasienMatiIbu = new javax.swing.JTable();
        tbKeluar1 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        TxtCari = new javax.swing.JTextField();
        txtTanggal = new uz.ncipro.calendar.JDateTimePicker();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("DATA PASIEN MATI IBU");

        jLabel5.setText("Tanggal :");

        jLabel2.setText("No.rm_Ibu :");

        jLabel13.setText("Keterangan :");

        jLabel4.setText("Jam :");

        tbSimpan.setText("Simpan");
        tbSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbSimpanActionPerformed(evt);
            }
        });

        tbEdit.setText("Edit");
        tbEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbEditActionPerformed(evt);
            }
        });

        tbHapus.setText("Hapus");
        tbHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbHapusActionPerformed(evt);
            }
        });

        tbCetak.setText("Cetak");
        tbCetak.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbCetakActionPerformed(evt);
            }
        });

        tbKeluar.setText("Keluar");
        tbKeluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbKeluarActionPerformed(evt);
            }
        });

        tabelPasienMatiIbu.setModel(new javax.swing.table.DefaultTableModel(
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
        tabelPasienMatiIbu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelPasienMatiIbuMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabelPasienMatiIbu);

        tbKeluar1.setText("Baru");
        tbKeluar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbKeluar1ActionPerformed(evt);
            }
        });

        jButton1.setText("Cari");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel6.setText("Keyword :");

        txtTanggal.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "09/12/2014" }));
        txtTanggal.setDisplayFormat("dd/MM/yyyy");

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(jLabel6)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(TxtCari, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 143, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(18, 18, 18)
                .add(jButton1)
                .addContainerGap(625, Short.MAX_VALUE))
            .add(layout.createSequentialGroup()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(layout.createSequentialGroup()
                        .add(15, 15, 15)
                        .add(jLabel2)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                        .add(txtrmIbu, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 176, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                    .add(layout.createSequentialGroup()
                        .add(30, 30, 30)
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                            .add(layout.createSequentialGroup()
                                .add(jLabel5)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                                .add(txtTanggal, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 176, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                            .add(layout.createSequentialGroup()
                                .add(jLabel4)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                                .add(txtJam, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 176, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                            .add(jLabel1)))
                    .add(layout.createSequentialGroup()
                        .add(21, 21, 21)
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                            .add(layout.createSequentialGroup()
                                .add(tbHapus)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .add(tbCetak))
                            .add(layout.createSequentialGroup()
                                .add(tbSimpan)
                                .add(18, 18, 18)
                                .add(tbEdit, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 63, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                        .add(18, 18, 18)
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(tbKeluar1)
                            .add(tbKeluar)))
                    .add(layout.createSequentialGroup()
                        .addContainerGap()
                        .add(jLabel13)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                        .add(txtKeterangan, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 176, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .add(jScrollPane1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 568, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(27, 27, 27))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                    .add(layout.createSequentialGroup()
                        .add(60, 60, 60)
                        .add(jScrollPane1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 279, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                    .add(org.jdesktop.layout.GroupLayout.LEADING, layout.createSequentialGroup()
                        .addContainerGap()
                        .add(jLabel1)
                        .add(27, 27, 27)
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                            .add(jLabel5)
                            .add(txtTanggal, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                        .add(18, 18, 18)
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                            .add(jLabel4)
                            .add(txtJam, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                        .add(18, 18, 18)
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                            .add(jLabel2)
                            .add(txtrmIbu, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                        .add(18, 18, 18)
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                            .add(jLabel13)
                            .add(txtKeterangan, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                        .add(27, 27, 27)
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                            .add(tbSimpan)
                            .add(tbEdit)
                            .add(tbKeluar1))
                        .add(18, 18, 18)
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                            .add(tbHapus)
                            .add(tbCetak)
                            .add(tbKeluar))
                        .add(31, 31, 31)
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                            .add(jLabel6)
                            .add(TxtCari, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(jButton1))))
                .addContainerGap(70, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tbKeluar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbKeluar1ActionPerformed
        txtTanggal.setSelectedIndex(0);
        txtJam.setText("");
        txtrmIbu.setText("");
        txtKeterangan.setText("");
}//GEN-LAST:event_tbKeluar1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            int row=tabmode.getRowCount();
            for (int i=0;i<row;i++){
                tabmode.removeRow(0);
            }
            Connection koneksi=DriverManager.getConnection("jdbc:mysql://localhost:3306/medica","root","");
            ResultSet rs=koneksi.createStatement().executeQuery("select * from pasien_mati_ibu where tanggal like '%"+
                    TxtCari.getText()+"%' or jam like '%"+
                    TxtCari.getText()+"%' or no_rm_ibu like '%"+
                    TxtCari.getText()+"%' or keterangan like '%"+
                    TxtCari.getText()+"%'");
            while (rs.next()){
                String[] data={rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4)};
                tabmode.addRow(data);
            }
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void tbSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbSimpanActionPerformed
        try {
            Connection koneksi=DriverManager.getConnection("jdbc:mysql://localhost:3306/medica","root","");
            txtTanggal.setDisplayFormat("yyyy-MM-dd");
            koneksi.createStatement().executeUpdate("insert into pasien_mati_ibu values"+
                        "('"+txtTanggal.getSelectedItem()+
                        "','"+txtJam.getText()+
                        "','"+txtrmIbu.getText()+
                        "','"+txtKeterangan.getText()+"')");
            txtTanggal.setDisplayFormat("dd/MM/yyyy");
            tampil();
            JOptionPane.showMessageDialog(rootPane, "Data Pasien Ibu mati Berhasil disimpan");
        } catch (SQLException ex) {
            System.out.println(ex);
        }
            
    }//GEN-LAST:event_tbSimpanActionPerformed

    private void tbEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbEditActionPerformed
        try {
            Connection koneksi=DriverManager.getConnection("jdbc:mysql://localhost:3306/medica","root","");
            txtTanggal.setDisplayFormat("yyyy-MM-dd");
            Statement rs=koneksi.createStatement();
            rs.execute("update pasien_mati_ibu set tanggal= '" +
                txtTanggal.getSelectedItem() + "' ,jam= '" +
                txtJam.getText() + "' ,keterangan= '" +
                txtKeterangan.getText() + "' where no_rm_ibu= '" +
                txtrmIbu.getText() + "'");
            txtTanggal.setDisplayFormat("dd/MM/yyyy");
            tampil();
            JOptionPane.showMessageDialog(rootPane, "Data Pasien Ibu Mati berhasil diedit");
        } catch (SQLException ex) {
            System.out.println(ex);
        }
            
    }//GEN-LAST:event_tbEditActionPerformed

    private void tbHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbHapusActionPerformed
        try {
            Connection koneksi=DriverManager.getConnection("jdbc:mysql://localhost:3306/medica","root","");
            koneksi.createStatement().execute("delete from pasien_mati_ibu where no_rm_ibu= '" +
                    txtrmIbu.getText()+"'");
            tampil();
            JOptionPane.showMessageDialog(rootPane, "Data Pasien Ibu Mati berhasil dihapus");
        } catch (SQLException ex) {
            System.out.println(ex);
        }
            
    }//GEN-LAST:event_tbHapusActionPerformed

    private void tbKeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbKeluarActionPerformed
        dispose();
    }//GEN-LAST:event_tbKeluarActionPerformed

    private void tabelPasienMatiIbuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelPasienMatiIbuMouseClicked
        int i=tabelPasienMatiIbu.getSelectedRow();
        if(i>-1){
        //txtTanggal.setText(tabmode.getValueAt(i, 0).toString());
        txtJam.setText(tabmode.getValueAt(i, 1).toString());
        txtrmIbu.setText(tabmode.getValueAt(i, 2).toString());
        txtKeterangan.setText(tabmode.getValueAt(i, 3).toString());
                }
        try {
            txtTanggal.setDisplayFormat("yyyy-MM-dd");
            Date dtpa = new SimpleDateFormat("yyyy-MM-dd").parse(tabmode.getValueAt(i,0).toString());
            txtTanggal.setDate(dtpa);
            txtTanggal.setDisplayFormat("dd/MM/yyyy");
        } catch (ParseException ex) {
            Logger.getLogger(frmDokter.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_tabelPasienMatiIbuMouseClicked

    private void tbCetakActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbCetakActionPerformed
        try {
            Connection koneksi=DriverManager.getConnection("jdbc:mysql://localhost:3306/medica","root","");
                JasperReport Jrpt=JasperCompileManager.compileReport("./report/ReportPasMatiIbu.jrxml");
                JasperPrint jsp=JasperFillManager.fillReport(Jrpt, new HashMap<Object, Object>(),koneksi);
                JasperViewer view=new JasperViewer(jsp,false);
                view.setFitPageZoomRatio();
                view.setVisible(true);
        } catch (JRException ex) {
            Logger.getLogger(frmPasienMatiIbu.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(frmPasienMatiIbu.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_tbCetakActionPerformed

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
            java.util.logging.Logger.getLogger(frmPasienMatiIbu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmPasienMatiIbu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmPasienMatiIbu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmPasienMatiIbu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                frmPasienMatiIbu dialog = new frmPasienMatiIbu(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField TxtCari;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabelPasienMatiIbu;
    private javax.swing.JButton tbCetak;
    private javax.swing.JButton tbEdit;
    private javax.swing.JButton tbHapus;
    private javax.swing.JButton tbKeluar;
    private javax.swing.JButton tbKeluar1;
    private javax.swing.JButton tbSimpan;
    private javax.swing.JTextField txtJam;
    private javax.swing.JTextField txtKeterangan;
    private uz.ncipro.calendar.JDateTimePicker txtTanggal;
    private javax.swing.JTextField txtrmIbu;
    // End of variables declaration//GEN-END:variables

    private void tampil() {
        int row=tabmode.getRowCount();
        for (int i=0;i<row;i++){
            tabmode.removeRow(0);
        }
        try {
            Connection koneksi=DriverManager.getConnection("jdbc:mysql://localhost:3306/medica","root","");
            ResultSet rs=koneksi.createStatement().executeQuery("select * from pasien_mati_ibu");
            while(rs.next()){
            String[] data={rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4)};
            tabmode.addRow(data);
            }
        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }
}