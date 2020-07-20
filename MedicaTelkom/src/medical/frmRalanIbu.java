/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package medical;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
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
public class frmRalanIbu extends javax.swing.JDialog {
DefaultTableModel tabmode;
private frmPasienIbu pasienibu=new frmPasienIbu(null,false);
private frmDokter dokter=new frmDokter(null,false);
private frmPenyakit penyakit=new frmPenyakit(null,false);
private frmTindakan tindakan=new frmTindakan(null,false);
    public frmRalanIbu(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        String[] judul={"Nomor","Tanggal","Nama Ibu","Dokter","ICD","Tindakan","Suhu Tubuh","Tensi","Hasil","Keterangan","Biaya"};
        setLocationRelativeTo(null);
        tabmode=new DefaultTableModel(judul,0);
        tabelRalanIbu.setModel(tabmode);
        tampil();
        pasienibu.getData().addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (pasienibu.getData().getRowCount()!=-1){
                    txtNoRekamIbu.setText(pasienibu.getMode().getValueAt(
                            pasienibu.getData().getSelectedRow(),0).toString());
                    TxtCariRmIbu.setText(pasienibu.getMode().getValueAt(
                            pasienibu.getData().getSelectedRow(),1).toString());
                }
            }
            @Override
            public void mousePressed(MouseEvent e) {}
            @Override
            public void mouseReleased(MouseEvent e) {}
            @Override
            public void mouseEntered(MouseEvent e) {}
            @Override
            public void mouseExited(MouseEvent e) {}
        });
        dokter.getdata().addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (dokter.getdata().getRowCount()!=-1){
                    txtKodeDokter.setText(dokter.getMode().getValueAt(
                            dokter.getdata().getSelectedRow(),0).toString());
                    TxtCariDokter.setText(dokter.getMode().getValueAt(
                            dokter.getdata().getSelectedRow(),1).toString());
                }
            }
            @Override
            public void mousePressed(MouseEvent e) {}
            @Override
            public void mouseReleased(MouseEvent e) {}
            @Override
            public void mouseEntered(MouseEvent e) {}
            @Override
            public void mouseExited(MouseEvent e) {}
        });
        penyakit.getdata().addMouseListener(new MouseListener() {

            @Override
            public void mouseClicked(MouseEvent e) {
                if (penyakit.getdata().getRowCount()!=-1){
                    Kodeicd.setText(penyakit.getMode().getValueAt(
                            penyakit.getdata().getSelectedRow(),0).toString());
                    TxtCariIcd.setText(penyakit.getMode().getValueAt(
                            penyakit.getdata().getSelectedRow(),1).toString());
                }
            }
            @Override
            public void mousePressed(MouseEvent e) {}
            @Override
            public void mouseReleased(MouseEvent e) {}
            @Override
            public void mouseEntered(MouseEvent e) {}
            @Override
            public void mouseExited(MouseEvent e) {}
        });
        tindakan.getdata().addMouseListener(new MouseListener() {

            @Override
            public void mouseClicked(MouseEvent e) {
                if (tindakan.getdata().getRowCount()!=-1){
                    txtKodeTindakan.setText(tindakan.getMode().getValueAt(
                            tindakan.getdata().getSelectedRow(),0).toString());
                    TxtCariTindakan.setText(penyakit.getMode().getValueAt(
                            tindakan.getdata().getSelectedRow(),1).toString());
                }
            }
            @Override
            public void mousePressed(MouseEvent e) {}
            @Override
            public void mouseReleased(MouseEvent e) {}
            @Override
            public void mouseEntered(MouseEvent e) {}
            @Override
            public void mouseExited(MouseEvent e) {}
        });
        
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
        jLabel2 = new javax.swing.JLabel();
        txtKodeDokter = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtNo = new javax.swing.JTextField();
        txtNoRekamIbu = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        Kodeicd = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtKodeTindakan = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtSuhuTubuh = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtTensi = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtHasil = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtKeterangan = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txtBiaya = new javax.swing.JTextField();
        tbSimpan = new javax.swing.JButton();
        tbEdit = new javax.swing.JButton();
        tbHapus = new javax.swing.JButton();
        tbCetak = new javax.swing.JButton();
        tbKeluar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelRalanIbu = new javax.swing.JTable();
        TbBaru = new javax.swing.JButton();
        TxtCari = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        TxtCariRmIbu = new javax.swing.JTextField();
        TxtCariDokter = new javax.swing.JTextField();
        TxtCariTindakan = new javax.swing.JTextField();
        TxtCariIcd = new javax.swing.JTextField();
        TbCrRmIbu = new javax.swing.JButton();
        TbCrTindakan = new javax.swing.JButton();
        TbCrDokter = new javax.swing.JButton();
        TbCrIcd = new javax.swing.JButton();
        txtTanggal = new uz.ncipro.calendar.JDateTimePicker();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("DATA RAWAT JALAN IBU");

        jLabel2.setText("No. Rekam Ibu :");

        jLabel3.setText("Tanggal :");

        jLabel5.setText("No. :");

        txtNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNoActionPerformed(evt);
            }
        });

        jLabel4.setText("Kode icd :");

        jLabel6.setText("Kode Dokter :");

        jLabel8.setText("Kode Tindakan :");

        txtKodeTindakan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtKodeTindakanActionPerformed(evt);
            }
        });

        jLabel9.setText("Suhu Tubuh :");

        jLabel10.setText("Tensi :");

        jLabel11.setText("Hasil :");

        jLabel12.setText("Keterangan :");

        jLabel13.setText("Biaya :");

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

        tabelRalanIbu.setModel(new javax.swing.table.DefaultTableModel(
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
        tabelRalanIbu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelRalanIbuMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabelRalanIbu);

        TbBaru.setText("Baru");
        TbBaru.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TbBaruActionPerformed(evt);
            }
        });

        jLabel14.setText("Keyword :");

        jButton1.setText("Cari");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        TxtCariTindakan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtCariTindakanActionPerformed(evt);
            }
        });

        TbCrRmIbu.setText("...");
        TbCrRmIbu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TbCrRmIbuActionPerformed(evt);
            }
        });

        TbCrTindakan.setText("...");
        TbCrTindakan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TbCrTindakanActionPerformed(evt);
            }
        });

        TbCrDokter.setText("...");
        TbCrDokter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TbCrDokterActionPerformed(evt);
            }
        });

        TbCrIcd.setText("...");
        TbCrIcd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TbCrIcdActionPerformed(evt);
            }
        });

        txtTanggal.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "28/04/2016" }));
        txtTanggal.setDisplayFormat("dd/MM/yyyy");

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(layout.createSequentialGroup()
                        .addContainerGap(109, Short.MAX_VALUE)
                        .add(tbSimpan)
                        .add(18, 18, 18)
                        .add(tbEdit, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 63, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .add(18, 18, 18)
                        .add(TbBaru)
                        .add(22, 22, 22)
                        .add(tbHapus))
                    .add(layout.createSequentialGroup()
                        .add(47, 47, 47)
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                            .add(jLabel5)
                            .add(jLabel4)
                            .add(jLabel3)
                            .add(jLabel2)
                            .add(jLabel6))
                        .add(18, 18, 18)
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(layout.createSequentialGroup()
                                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING, false)
                                    .add(org.jdesktop.layout.GroupLayout.LEADING, Kodeicd)
                                    .add(org.jdesktop.layout.GroupLayout.LEADING, txtKodeDokter)
                                    .add(org.jdesktop.layout.GroupLayout.LEADING, txtNoRekamIbu, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 65, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                                    .add(TxtCariIcd, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 146, Short.MAX_VALUE)
                                    .add(TxtCariDokter, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 146, Short.MAX_VALUE)
                                    .add(org.jdesktop.layout.GroupLayout.TRAILING, TxtCariRmIbu, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 146, Short.MAX_VALUE))
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                                    .add(TbCrDokter)
                                    .add(TbCrIcd)
                                    .add(TbCrRmIbu)))
                            .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING, false)
                                .add(org.jdesktop.layout.GroupLayout.LEADING, txtTanggal, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .add(org.jdesktop.layout.GroupLayout.LEADING, txtNo, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 176, Short.MAX_VALUE)))))
                .add(18, 18, 18)
                .add(tbCetak)
                .add(18, 18, 18)
                .add(tbKeluar)
                .add(39, 39, 39)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                    .add(layout.createSequentialGroup()
                        .add(jLabel14)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                        .add(TxtCari, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 143, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .add(18, 18, 18)
                        .add(jButton1))
                    .add(layout.createSequentialGroup()
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                            .add(jLabel8)
                            .add(jLabel12)
                            .add(jLabel9)
                            .add(jLabel10)
                            .add(jLabel11)
                            .add(jLabel13))
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(txtBiaya, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 176, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(txtHasil, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 176, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(txtTensi, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 176, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(txtSuhuTubuh, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 176, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(txtKeterangan, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 176, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(layout.createSequentialGroup()
                                .add(txtKodeTindakan, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 69, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(TxtCariTindakan, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 143, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(TbCrTindakan)
                .add(70, 70, 70))
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(layout.createSequentialGroup()
                        .add(jScrollPane1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 940, Short.MAX_VALUE)
                        .add(94, 94, 94))
                    .add(layout.createSequentialGroup()
                        .add(jLabel1)
                        .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(jLabel1)
                .add(49, 49, 49)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                    .add(layout.createSequentialGroup()
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                            .add(jLabel5)
                            .add(txtNo, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                        .add(18, 18, 18)
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(jLabel3)
                            .add(txtTanggal, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                        .add(18, 18, 18)
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                            .add(txtNoRekamIbu, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(jLabel2)
                            .add(TxtCariRmIbu, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(TbCrRmIbu))
                        .add(18, 18, 18)
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(jLabel6)
                            .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                                .add(txtKodeDokter, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .add(TxtCariDokter, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .add(TbCrDokter)))
                        .add(16, 16, 16)
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                            .add(jLabel4)
                            .add(Kodeicd, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(TxtCariIcd, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(TbCrIcd))
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                                .add(tbKeluar)
                                .add(tbCetak)
                                .add(tbHapus))
                            .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                                .add(tbSimpan)
                                .add(tbEdit)
                                .add(TbBaru))))
                    .add(layout.createSequentialGroup()
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                            .add(txtKodeTindakan, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(jLabel8)
                            .add(TxtCariTindakan, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(TbCrTindakan))
                        .add(18, 18, 18)
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                            .add(jLabel9)
                            .add(txtSuhuTubuh, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                        .add(18, 18, 18)
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                            .add(txtTensi, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(jLabel10))
                        .add(18, 18, 18)
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(txtHasil, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(jLabel11))
                        .add(16, 16, 16)
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                            .add(jLabel12)
                            .add(txtKeterangan, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                        .add(18, 18, 18)
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                            .add(txtBiaya, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(jLabel13))
                        .add(29, 29, 29)
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                            .add(jLabel14)
                            .add(TxtCari, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(jButton1))))
                .add(18, 18, 18)
                .add(jScrollPane1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 154, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(97, 97, 97))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNoActionPerformed

    private void txtKodeTindakanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtKodeTindakanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtKodeTindakanActionPerformed

    private void TbBaruActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TbBaruActionPerformed
        txtNo.setText("");
        txtTanggal.setSelectedIndex(0);
        txtNoRekamIbu.setText("");
        txtKodeDokter.setText("");
        Kodeicd.setText("");
        txtKodeTindakan.setText("");
        txtSuhuTubuh.setText("");
        txtTensi.setText("");
        txtHasil.setText("");
        txtKeterangan.setText("");
        txtBiaya.setText("");
}//GEN-LAST:event_TbBaruActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            int row=tabmode.getRowCount();
            for (int i=0;i<row;i++){
                tabmode.removeRow(0);
            }
            Connection koneksi=DriverManager.getConnection("jdbc:mysql://localhost:3306/medica","root","");
            ResultSet rs=koneksi.createStatement().executeQuery("select rawat_jl_ibu.no, rawat_jl_ibu.tanggal, pasien_ibu.nm_pasien, dokter.nm_dokter, penyakit.nama_penyakit, tindakan.nama_tindakan, rawat_jl_ibu.suhu_tubuh, rawat_jl_ibu.tensi, rawat_jl_ibu.hasil, rawat_jl_ibu.keterangan, rawat_jl_ibu.biaya "+
            " from rawat_jl_ibu inner join pasien_ibu on rawat_jl_ibu.no_rm_ibu=pasien_ibu.no_rm_ibu inner join dokter on rawat_jl_ibu.kd_dokter=dokter.kd_dokter inner join penyakit on rawat_jl_ibu.kd_icd = penyakit.kd_icd inner join tindakan on rawat_jl_ibu.kode_tindakan = tindakan.kode_tindakan where rawat_jl_ibu.no like '%"+
                    TxtCari.getText()+"%' or rawat_jl_ibu.tanggal like '%"+
                    TxtCari.getText()+"%' or pasien_ibu.nm_pasien like '%"+
                    TxtCari.getText()+"%' or dokter.nm_dokter like '%"+
                    TxtCari.getText()+"%' or penyakit.nama_penyakit like '%"+
                    TxtCari.getText()+"%' or tindakan.nama_tindakan like '%"+
                    TxtCari.getText()+"%' or rawat_jl_ibu.suhu_tubuh like '%"+
                    TxtCari.getText()+"%' or rawat_jl_ibu.tensi like '%"+
                    TxtCari.getText()+"%' or rawat_jl_ibu.hasil like '%"+
                    TxtCari.getText()+"%' or rawat_jl_ibu.keterangan like '%"+
                    TxtCari.getText()+"%' or rawat_jl_ibu.biaya like '%"+
                    TxtCari.getText()+"%'");
            while (rs.next()){
                String[] data={rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7), rs.getString(8), rs.getString(9), rs.getString(10), rs.getString(11)};
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
            koneksi.createStatement().executeUpdate("insert into rawat_jl_ibu values"+
                        "('"+txtNo.getText()+
                        "','"+txtTanggal.getSelectedItem()+
                        "','"+txtNoRekamIbu.getText()+
                        "','"+txtKodeDokter.getText()+
                        "','"+Kodeicd.getText()+
                        "','"+txtKodeTindakan.getText()+
                        "','"+txtSuhuTubuh.getText()+
                        "','"+txtTensi.getText()+
                        "','"+txtHasil.getText()+
                        "','"+txtKeterangan.getText()+
                        "','"+txtBiaya.getText()+"')");
            txtTanggal.setDisplayFormat("dd/MM/yyyy");
            tampil();
            JOptionPane.showMessageDialog(rootPane, "Data Rawat jalan Ibu berhasil Disimpan");
        } catch (SQLException ex) {
            System.out.println(ex);
        }
            
    }//GEN-LAST:event_tbSimpanActionPerformed

    private void tbEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbEditActionPerformed
        try {
            Connection koneksi=DriverManager.getConnection("jdbc:mysql://localhost:3306/medica","root","");
            txtTanggal.setDisplayFormat("yyyy-MM-dd");
            Statement rs=koneksi.createStatement();
            rs.execute("update rawat_jl_ibu set tanggal= '" +
                txtTanggal.getSelectedItem() + "' ,no_rm_ibu='" +
                txtNoRekamIbu.getText() + "' ,kd_dokter='" +
                txtKodeDokter.getText() + "' ,kd_icd='" +
                Kodeicd.getText() + "' ,kode_tindakan='" +
                txtKodeTindakan.getText() + "' ,suhu_tubuh='" +
                txtSuhuTubuh.getText() + "' ,tensi='" +
                txtTensi.getText() + "' ,hasil='" +
                txtHasil.getText() + "' ,keterangan='" +
                txtKeterangan.getText() + "' ,biaya='" +
                txtBiaya.getText() +"' where no= '" +
                txtNo.getText() + "'");
            txtTanggal.setDisplayFormat("dd/MM/yyyy");
            tampil();
            JOptionPane.showMessageDialog(rootPane, "Data Rawat jalan Ibu berhasil Di edit");
        } catch (SQLException ex) {
            System.out.println(ex);
        }
            
    }//GEN-LAST:event_tbEditActionPerformed

    private void tbHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbHapusActionPerformed
        try {
            Connection koneksi=DriverManager.getConnection("jdbc:mysql://localhost:3306/medica","root","");
            koneksi.createStatement().execute("delete from rawat_jl_ibu where no= '" +
                    txtNo.getText()+"'");
            tampil();
            JOptionPane.showMessageDialog(rootPane, "Data Rawat jalan Ibu berhasil Di Hapus");
        } catch (SQLException ex) {
            System.out.println(ex);
        }
            
    }//GEN-LAST:event_tbHapusActionPerformed

    private void tbKeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbKeluarActionPerformed
        dispose();
    }//GEN-LAST:event_tbKeluarActionPerformed

    private void tabelRalanIbuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelRalanIbuMouseClicked
        int i=tabelRalanIbu.getSelectedRow();
        if (i>-1){
        txtNo.setText(tabmode.getValueAt(i, 0). toString());
        //txtTanggal.setText(tabmode.getValueAt(i, 1). toString());
        TxtCariRmIbu.setText(tabmode.getValueAt(i, 2). toString());
        TxtCariDokter.setText(tabmode.getValueAt(i, 3). toString());
        TxtCariIcd.setText(tabmode.getValueAt(i, 4). toString());
        TxtCariTindakan.setText(tabmode.getValueAt(i, 5). toString());
        txtSuhuTubuh.setText(tabmode.getValueAt(i, 6). toString());
        txtTensi.setText(tabmode.getValueAt(i, 7). toString());
        txtHasil.setText(tabmode.getValueAt(i, 8). toString());
        txtKeterangan.setText(tabmode.getValueAt(i, 9). toString());
        txtBiaya.setText(tabmode.getValueAt(i, 10). toString());
        }
        try {
            txtTanggal.setDisplayFormat("yyyy-MM-dd");
            Date dtpa = new SimpleDateFormat("yyyy-MM-dd").parse(tabmode.getValueAt(i,1).toString());
            txtTanggal.setDate(dtpa);
            txtTanggal.setDisplayFormat("dd/MM/yyyy");
        } catch (ParseException ex) {
            Logger.getLogger(frmDokter.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_tabelRalanIbuMouseClicked

    private void TbCrRmIbuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TbCrRmIbuActionPerformed
        pasienibu.setLocationRelativeTo(null);
        pasienibu.setVisible(true);
        JOptionPane.showMessageDialog(rootPane, "Pilih Data Pasien Ibu");
    }//GEN-LAST:event_TbCrRmIbuActionPerformed

    private void TbCrDokterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TbCrDokterActionPerformed
        dokter.setLocationRelativeTo(null);
        dokter.setVisible(true);
        JOptionPane.showMessageDialog(rootPane, "Pilih Data Dokter");
    }//GEN-LAST:event_TbCrDokterActionPerformed

    private void TbCrIcdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TbCrIcdActionPerformed
        penyakit.setLocationRelativeTo(null);
        penyakit.setVisible(true);
        JOptionPane.showMessageDialog(rootPane, "Pilih Data Penyakit");
    }//GEN-LAST:event_TbCrIcdActionPerformed

    private void TbCrTindakanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TbCrTindakanActionPerformed
        tindakan.setLocationRelativeTo(null);
        tindakan.setVisible(true);
        JOptionPane.showMessageDialog(rootPane, "Pilih Data Tindakan");
    }//GEN-LAST:event_TbCrTindakanActionPerformed

    private void tbCetakActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbCetakActionPerformed
        try {
            Connection koneksi=DriverManager.getConnection("jdbc:mysql://localhost:3306/medica","root","");
                JasperReport Jrpt=JasperCompileManager.compileReport("./report/ReportRalanIbu.jrxml");
                JasperPrint jsp=JasperFillManager.fillReport(Jrpt, new HashMap<Object, Object>(),koneksi);
                JasperViewer view=new JasperViewer(jsp,false);
                view.setFitPageZoomRatio();
                view.setVisible(true);
        } catch (JRException ex) {
            Logger.getLogger(frmRalanIbu.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(frmRalanIbu.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_tbCetakActionPerformed

    private void TxtCariTindakanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtCariTindakanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtCariTindakanActionPerformed

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
            java.util.logging.Logger.getLogger(frmRalanIbu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmRalanIbu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmRalanIbu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmRalanIbu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                frmRalanIbu dialog = new frmRalanIbu(new javax.swing.JFrame(), true);
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
    private javax.swing.JTextField Kodeicd;
    private javax.swing.JButton TbBaru;
    private javax.swing.JButton TbCrDokter;
    private javax.swing.JButton TbCrIcd;
    private javax.swing.JButton TbCrRmIbu;
    private javax.swing.JButton TbCrTindakan;
    private javax.swing.JTextField TxtCari;
    private javax.swing.JTextField TxtCariDokter;
    private javax.swing.JTextField TxtCariIcd;
    private javax.swing.JTextField TxtCariRmIbu;
    private javax.swing.JTextField TxtCariTindakan;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabelRalanIbu;
    private javax.swing.JButton tbCetak;
    private javax.swing.JButton tbEdit;
    private javax.swing.JButton tbHapus;
    private javax.swing.JButton tbKeluar;
    private javax.swing.JButton tbSimpan;
    private javax.swing.JTextField txtBiaya;
    private javax.swing.JTextField txtHasil;
    private javax.swing.JTextField txtKeterangan;
    private javax.swing.JTextField txtKodeDokter;
    private javax.swing.JTextField txtKodeTindakan;
    private javax.swing.JTextField txtNo;
    private javax.swing.JTextField txtNoRekamIbu;
    private javax.swing.JTextField txtSuhuTubuh;
    private uz.ncipro.calendar.JDateTimePicker txtTanggal;
    private javax.swing.JTextField txtTensi;
    // End of variables declaration//GEN-END:variables

    private void tampil() {
        int row=tabmode.getRowCount();
        for (int i=0;i<row;i++){
            tabmode.removeRow(0);
        }
        try {
            Connection koneksi=DriverManager.getConnection("jdbc:mysql://localhost:3306/medica","root","");
            ResultSet rs=koneksi.createStatement().executeQuery("select rawat_jl_ibu.no, rawat_jl_ibu.tanggal, pasien_ibu.nm_pasien, dokter.nm_dokter, penyakit.nama_penyakit, tindakan.nama_tindakan, rawat_jl_ibu.suhu_tubuh, rawat_jl_ibu.tensi, rawat_jl_ibu.hasil, rawat_jl_ibu.keterangan, rawat_jl_ibu.biaya "+
            " from rawat_jl_ibu inner join pasien_ibu on rawat_jl_ibu.no_rm_ibu=pasien_ibu.no_rm_ibu inner join dokter on rawat_jl_ibu.kd_dokter=dokter.kd_dokter inner join penyakit on rawat_jl_ibu.kd_icd = penyakit.kd_icd inner join tindakan on rawat_jl_ibu.kode_tindakan = tindakan.kode_tindakan ");
            while(rs.next()){
            String[] data={rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7),rs.getString(8),rs.getString(9),rs.getString(10),rs.getString(11)};
            tabmode.addRow(data);
            }
        } catch (SQLException ex) {
            System.out.println(ex);
        }
            
    }
}
