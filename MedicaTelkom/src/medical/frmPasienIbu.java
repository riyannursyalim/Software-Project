/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package medical;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.view.JasperViewer;
import javax.swing.JOptionPane;

/**
 *
 * @author ZOMBIE
 */
public class frmPasienIbu extends javax.swing.JDialog {
DefaultTableModel tabmode;
    public frmPasienIbu(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        String[] judul={"No Rm Ibu","Nama Pasien","Suami","Umur","Alergi Obat","Status Ingin","Alamat","Gol Darah","Pekerjaan","Agama","Tgl Daftar","Diagnosa Awal","Pendidikan","Status Nikah","No Telp"};
        setLocationRelativeTo(null);
        tabmode=new DefaultTableModel(judul,0);
        tabelPasienIbu.setModel(tabmode);
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
        txtrmIbu = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtNamaPasien = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtSuami = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtUmur = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtAlergiObat = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        txtNoTelp = new javax.swing.JTextField();
        txtAlamat = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtAgama = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtPekerjaan = new javax.swing.JTextField();
        cmbGolDrh = new javax.swing.JComboBox();
        jLabel8 = new javax.swing.JLabel();
        tbHapus = new javax.swing.JButton();
        tbCetak = new javax.swing.JButton();
        tbKeluar = new javax.swing.JButton();
        tbEdit = new javax.swing.JButton();
        tbSimpan = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelPasienIbu = new javax.swing.JTable();
        cmbIngin = new javax.swing.JComboBox();
        CmbPend = new javax.swing.JComboBox();
        jLabel15 = new javax.swing.JLabel();
        txtDiagnosaAwal1 = new javax.swing.JTextField();
        CmbStatusNikah = new javax.swing.JComboBox();
        jLabel16 = new javax.swing.JLabel();
        tbbaru = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        TxtCari = new javax.swing.JTextField();
        TglDaftar = new uz.ncipro.calendar.JDateTimePicker();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("DATA PASIEN IBU");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));
        getContentPane().add(txtrmIbu, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 63, 176, -1));

        jLabel2.setText("No.rm_Ibu :");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 66, -1, -1));

        jLabel3.setText("Nama Pasien :");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 104, -1, -1));
        getContentPane().add(txtNamaPasien, new org.netbeans.lib.awtextra.AbsoluteConstraints(82, 101, 178, -1));

        jLabel5.setText("Suami :");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(39, 142, -1, -1));

        txtSuami.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSuamiActionPerformed(evt);
            }
        });
        getContentPane().add(txtSuami, new org.netbeans.lib.awtextra.AbsoluteConstraints(84, 139, 176, -1));

        jLabel4.setText("Umur :");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(42, 177, -1, -1));
        getContentPane().add(txtUmur, new org.netbeans.lib.awtextra.AbsoluteConstraints(84, 177, 176, -1));

        jLabel6.setText("Alergi Obat :");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(306, 63, -1, -1));
        getContentPane().add(txtAlergiObat, new org.netbeans.lib.awtextra.AbsoluteConstraints(377, 63, 176, -1));

        jLabel7.setText("Status Ingin :");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(302, 104, -1, -1));

        jLabel14.setText("Alamat :");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(327, 142, -1, -1));
        getContentPane().add(txtNoTelp, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 220, 180, -1));
        getContentPane().add(txtAlamat, new org.netbeans.lib.awtextra.AbsoluteConstraints(377, 139, 176, -1));

        jLabel13.setText("Diagnosa Awal :");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(601, 180, -1, -1));

        jLabel12.setText("Tanggal Daftar :");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(598, 142, -1, -1));

        jLabel11.setText("Pendidikan :");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, -1, -1));

        jLabel10.setText("Agama :");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(637, 104, -1, -1));
        getContentPane().add(txtAgama, new org.netbeans.lib.awtextra.AbsoluteConstraints(687, 101, 176, -1));

        jLabel9.setText("Pekerjaan :");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(622, 66, -1, -1));
        getContentPane().add(txtPekerjaan, new org.netbeans.lib.awtextra.AbsoluteConstraints(687, 63, 176, -1));

        cmbGolDrh.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "A", "B", "O", "AB", "-" }));
        getContentPane().add(cmbGolDrh, new org.netbeans.lib.awtextra.AbsoluteConstraints(377, 177, 176, -1));

        jLabel8.setText("Gol.Darah :");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(312, 180, -1, -1));

        tbHapus.setText("Hapus");
        tbHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbHapusActionPerformed(evt);
            }
        });
        getContentPane().add(tbHapus, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 280, -1, -1));

        tbCetak.setText("Cetak");
        tbCetak.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbCetakActionPerformed(evt);
            }
        });
        getContentPane().add(tbCetak, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 280, -1, -1));

        tbKeluar.setText("Keluar");
        tbKeluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbKeluarActionPerformed(evt);
            }
        });
        getContentPane().add(tbKeluar, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 280, -1, -1));

        tbEdit.setText("Edit");
        tbEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbEditActionPerformed(evt);
            }
        });
        getContentPane().add(tbEdit, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 280, 63, -1));

        tbSimpan.setText("Simpan");
        tbSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbSimpanActionPerformed(evt);
            }
        });
        getContentPane().add(tbSimpan, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 280, -1, -1));

        tabelPasienIbu.setModel(new javax.swing.table.DefaultTableModel(
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
        tabelPasienIbu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelPasienIbuMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabelPasienIbu);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 340, 840, 210));

        cmbIngin.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Ingin Anak", "Tidak" }));
        getContentPane().add(cmbIngin, new org.netbeans.lib.awtextra.AbsoluteConstraints(377, 101, 176, -1));

        CmbPend.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "TS", "SD", "SMP", "SMA", "SMK", "D1", "D2", "D3", "D4", "S1", "S2", "S3", "-" }));
        getContentPane().add(CmbPend, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 220, 173, -1));

        jLabel15.setText("Status Nikah :");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(609, 218, -1, -1));
        getContentPane().add(txtDiagnosaAwal1, new org.netbeans.lib.awtextra.AbsoluteConstraints(688, 177, 176, -1));

        CmbStatusNikah.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Singgle", "Menikah", "Janda" }));
        getContentPane().add(CmbStatusNikah, new org.netbeans.lib.awtextra.AbsoluteConstraints(686, 215, 178, -1));

        jLabel16.setText("No.Telp :");
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 220, -1, -1));

        tbbaru.setText("Baru");
        tbbaru.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbbaruActionPerformed(evt);
            }
        });
        getContentPane().add(tbbaru, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 280, -1, -1));

        jButton1.setText("Cari");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 280, -1, -1));

        jLabel17.setText("Keyword :");
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 280, -1, -1));
        getContentPane().add(TxtCari, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 280, 143, -1));

        TglDaftar.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "26/12/2014" }));
        TglDaftar.setDisplayFormat("dd/MM/yyyy");
        getContentPane().add(TglDaftar, new org.netbeans.lib.awtextra.AbsoluteConstraints(687, 139, 87, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtSuamiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSuamiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSuamiActionPerformed

    private void tbbaruActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbbaruActionPerformed
        txtAgama.setText("");
        txtAlamat.setText("");
        cmbGolDrh.setSelectedIndex(0);
        txtAlergiObat.setText("");
        cmbIngin.setSelectedIndex(0);
        txtDiagnosaAwal1.setText("");
        CmbPend.setSelectedIndex(0);
        CmbStatusNikah.setSelectedIndex(0);
        txtNamaPasien.setText("");
        txtNoTelp.setText("");
        txtPekerjaan.setText("");
        txtSuami.setText("");
        txtUmur.setText("");
        txtrmIbu.setText("");
}//GEN-LAST:event_tbbaruActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            int row=tabmode.getRowCount();
            for (int i=0;i<row;i++){
                tabmode.removeRow(0);
            }
            Connection koneksi=DriverManager.getConnection("jdbc:mysql://localhost:3306/medica","root","");
            ResultSet rs=koneksi.createStatement().executeQuery("select * from pasien_ibu where no_rm_ibu like '%"+
                    TxtCari.getText()+"%' or nm_pasien like '%"+
                    TxtCari.getText()+"%' or suami like '%"+
                    TxtCari.getText()+"%' or umur like '%"+
                    TxtCari.getText()+"%' or alergi_obat like '%"+
                    TxtCari.getText()+"%' or stts_ingin like '%"+
                    TxtCari.getText()+"%' or alamat like '%"+
                    TxtCari.getText()+"%' or gol_drh like '%"+
                    TxtCari.getText()+"%' or pekerjaan like '%"+
                    TxtCari.getText()+"%' or agama like '%"+
                    TxtCari.getText()+"%' or tgl_daftar like '%"+
                    TxtCari.getText()+"%' or diagnosa_awal like '%"+
                    TxtCari.getText()+"%' or pnddkn like '%"+
                    TxtCari.getText()+"%' or stts_nikah like '%"+
                    TxtCari.getText()+"%' or no_telp like '%"+
                    TxtCari.getText()+"%'");
            while (rs.next()){
                String[] data={rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7), rs.getString(8), rs.getString(9), rs.getString(10), rs.getString(11), rs.getString(12), rs.getString(13), rs.getString(14), rs.getString(15)};
                tabmode.addRow(data);
            }
        } catch (SQLException ex) {
            System.out.println(ex);
        }
            
        
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void tbSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbSimpanActionPerformed
        try {
            Connection koneksi=DriverManager.getConnection("jdbc:mysql://localhost:3306/medica","root","");
            TglDaftar.setDisplayFormat("yyyy-MM-dd");
            koneksi.createStatement().executeUpdate("insert into pasien_ibu values"+
                        "('"+txtrmIbu.getText()+
                        "','"+txtNamaPasien.getText()+
                        "','"+txtSuami.getText()+
                        "','"+txtUmur.getText()+
                        "','"+txtAlergiObat.getText()+
                        "','"+cmbIngin.getSelectedItem()+
                        "','"+txtAlamat.getText()+
                        "','"+cmbGolDrh.getSelectedItem()+
                        "','"+txtPekerjaan.getText()+
                        "','"+txtAgama.getText()+
                        "','"+TglDaftar.getSelectedItem()+
                        "','"+txtDiagnosaAwal1.getText()+
                        "','"+CmbPend.getSelectedItem()+
                        "','"+CmbStatusNikah.getSelectedItem()+
                        "','"+txtNoTelp.getText()+"')");
            TglDaftar.setDisplayFormat("dd/MM/yyyy");
            tampil();
            JOptionPane.showMessageDialog(rootPane, "Data Pasien Ibu berhasil Di Simpan");
        } catch (SQLException ex) {
            System.out.println(ex);
        }
            
    }//GEN-LAST:event_tbSimpanActionPerformed

    private void tbEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbEditActionPerformed
        try {
            Connection koneksi=DriverManager.getConnection("jdbc:mysql://localhost:3306/medica","root","");
            TglDaftar.setDisplayFormat("yyyy-MM-dd");
            Statement rs=koneksi.createStatement();
            rs.execute("update pasien_ibu set nm_pasien= '" +
                txtNamaPasien.getText() + "' ,suami='" +
                txtSuami.getText() + "' ,umur='" +
                txtUmur.getText() + "' ,alergi_obat='" +
                txtAlergiObat.getText() + "' ,stts_ingin='" +
                cmbIngin.getSelectedItem() + "' ,alamat='" +
                txtAlamat.getText() + "' ,gol_drh='" +
                cmbGolDrh.getSelectedItem() + "' ,pekerjaan='" +
                txtPekerjaan.getText() + "' ,agama='" +
                txtAgama.getText() + "' ,tgl_daftar='" +
                TglDaftar.getSelectedItem() + "' ,diagnosa_awal='" +
                txtDiagnosaAwal1.getText() + "' ,pnddkn='" +
                CmbPend.getSelectedItem() + "' ,stts_nikah='" +
                CmbStatusNikah.getSelectedItem() + "' ,no_telp='" +
                txtNoTelp.getText() + "' where no_rm_ibu= '" +
                txtrmIbu.getText() + "'");
            TglDaftar.setDisplayFormat("dd/MM/yyyy");
            tampil();
            JOptionPane.showMessageDialog(rootPane, "Data Pasien Ibu berhasil Di Edit");
        } catch (SQLException ex) {
            System.out.println(ex);
        }
            
    }//GEN-LAST:event_tbEditActionPerformed

    private void tbHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbHapusActionPerformed
        try {
            Connection koneksi=DriverManager.getConnection("jdbc:mysql://localhost:3306/medica","root","");
            koneksi.createStatement().execute("delete from pasien_ibu where no_rm_ibu= '" +
                    txtrmIbu.getText()+"'");
            tampil();
            JOptionPane.showMessageDialog(rootPane, "Data Pasien Bayi berhasil Di Hapus");
        } catch (SQLException ex) {
            System.out.println(ex);
        }
            
    }//GEN-LAST:event_tbHapusActionPerformed

    private void tbKeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbKeluarActionPerformed
        dispose();
    }//GEN-LAST:event_tbKeluarActionPerformed

    private void tabelPasienIbuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelPasienIbuMouseClicked
        int i=tabelPasienIbu.getSelectedRow();
        if (i>-1){
        txtrmIbu.setText(tabmode.getValueAt(i, 0). toString());
        txtNamaPasien.setText(tabmode.getValueAt(i, 1). toString());
        txtSuami.setText(tabmode.getValueAt(i, 2). toString());
        txtUmur.setText(tabmode.getValueAt(i, 3). toString());
        txtAlergiObat.setText(tabmode.getValueAt(i, 4). toString());
        cmbIngin.setSelectedItem(tabmode.getValueAt(i, 5). toString());
        txtAlamat.setText(tabmode.getValueAt(i, 6). toString());
        cmbGolDrh.setSelectedItem(tabmode.getValueAt(i, 7). toString());
        txtPekerjaan.setText(tabmode.getValueAt(i, 8). toString());
        txtAgama.setText(tabmode.getValueAt(i, 9). toString());
        //TglDaftar.setText(tabmode.getValueAt(i, 10). toString());
        txtDiagnosaAwal1.setText(tabmode.getValueAt(i, 11). toString());
        CmbPend.setSelectedItem(tabmode.getValueAt(i, 12). toString());
        CmbStatusNikah.setSelectedItem(tabmode.getValueAt(i, 13). toString());
        txtNoTelp.setText(tabmode.getValueAt(i, 14). toString());
        }
        try {
            TglDaftar.setDisplayFormat("yyyy-MM-dd");
            Date dtpa = new SimpleDateFormat("yyyy-MM-dd").parse(tabmode.getValueAt(i,10).toString());
            TglDaftar.setDate(dtpa);
            TglDaftar.setDisplayFormat("dd/MM/yyyy");
        } catch (ParseException ex) {
            Logger.getLogger(frmDokter.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_tabelPasienIbuMouseClicked

    private void tbCetakActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbCetakActionPerformed
        try {
            Connection koneksi=DriverManager.getConnection("jdbc:mysql://localhost:3306/medica","root","");
                JasperReport Jrpt=JasperCompileManager.compileReport("./report/ReportPasienIbu.jrxml");
                JasperPrint jsp=JasperFillManager.fillReport(Jrpt, new HashMap<Object, Object>(),koneksi);
                JasperViewer view=new JasperViewer(jsp,false);
                view.setFitPageZoomRatio();
                view.setVisible(true);
        } catch (JRException ex) {
            Logger.getLogger(frmPasienIbu.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(frmPasienIbu.class.getName()).log(Level.SEVERE, null, ex);
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
            java.util.logging.Logger.getLogger(frmPasienIbu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmPasienIbu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmPasienIbu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmPasienIbu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                frmPasienIbu dialog = new frmPasienIbu(new javax.swing.JFrame(), true);
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
    private javax.swing.JComboBox CmbPend;
    private javax.swing.JComboBox CmbStatusNikah;
    private uz.ncipro.calendar.JDateTimePicker TglDaftar;
    private javax.swing.JTextField TxtCari;
    private javax.swing.JComboBox cmbGolDrh;
    private javax.swing.JComboBox cmbIngin;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabelPasienIbu;
    private javax.swing.JButton tbCetak;
    private javax.swing.JButton tbEdit;
    private javax.swing.JButton tbHapus;
    private javax.swing.JButton tbKeluar;
    private javax.swing.JButton tbSimpan;
    private javax.swing.JButton tbbaru;
    private javax.swing.JTextField txtAgama;
    private javax.swing.JTextField txtAlamat;
    private javax.swing.JTextField txtAlergiObat;
    private javax.swing.JTextField txtDiagnosaAwal1;
    private javax.swing.JTextField txtNamaPasien;
    private javax.swing.JTextField txtNoTelp;
    private javax.swing.JTextField txtPekerjaan;
    private javax.swing.JTextField txtSuami;
    private javax.swing.JTextField txtUmur;
    private javax.swing.JTextField txtrmIbu;
    // End of variables declaration//GEN-END:variables

    private void tampil() {
        int row=tabmode.getRowCount();
        for (int i=0;i<row;i++){
            tabmode.removeRow(0);
        }
        try {
            Connection koneksi=DriverManager.getConnection("jdbc:mysql://localhost:3306/medica","root","");
            ResultSet rs=koneksi.createStatement().executeQuery("select * from pasien_ibu");
            while(rs.next()){
            String[] data={rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7),rs.getString(8),rs.getString(9),rs.getString(10),rs.getString(11),rs.getString(12),rs.getString(13),rs.getString(14),rs.getString(15)};
            tabmode.addRow(data);
            }
        } catch (SQLException ex) {
            System.out.println(ex);
        }
    
    }
    public JTable getData(){
        return tabelPasienIbu;
    }
    public DefaultTableModel getMode() {
        return tabmode;
    }
}
