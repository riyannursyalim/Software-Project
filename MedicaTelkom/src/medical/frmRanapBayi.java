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
public class frmRanapBayi extends javax.swing.JDialog {
DefaultTableModel tabmode;
private frmPasienBayi pasienbayi=new frmPasienBayi(null,false);
private frmKamar kamar=new frmKamar(null,false);
private frmDokter dokter=new frmDokter(null,false);
private frmPenyakit penyakit=new frmPenyakit(null,false);
private frmTindakan tindakan=new frmTindakan(null,false);
    public frmRanapBayi(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        String[] judul={"Nomor","Rekam Bayi","Tanggal Masuk","Tanggal Pulang","Lama","Kamar","ICD","Dokter","Tindakan","Suhu Tubuh","Resusitas","Hasil","Keterangan","Apgar"};
        setLocationRelativeTo(null);
        tabmode=new DefaultTableModel(judul,0);
        tabelRanapBayi.setModel(tabmode);
        tampil();
        pasienbayi.getdata().addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (pasienbayi.getdata().getRowCount()!=-1){
                    txtNoRekamBayi.setText(pasienbayi.getMode().getValueAt(
                            pasienbayi.getdata().getSelectedRow(),0).toString());
                    TxtCrRmBayi.setText(pasienbayi.getMode().getValueAt(
                            pasienbayi.getdata().getSelectedRow(),1).toString());
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
        kamar.getdata().addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (kamar.getdata().getRowCount()!=-1){
                    txtKodeKamar.setText(kamar.getMode().getValueAt(
                            kamar.getdata().getSelectedRow(),0).toString());
                    TxtCrKmr.setText(kamar.getMode().getValueAt(
                            kamar.getdata().getSelectedRow(),1).toString());
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
                    TxtCrDokter.setText(dokter.getMode().getValueAt(
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
                    txtKodeicd.setText(penyakit.getMode().getValueAt(
                            penyakit.getdata().getSelectedRow(),0).toString());
                    TxtCrIcd.setText(penyakit.getMode().getValueAt(
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
                    TxtCrTindakan.setText(penyakit.getMode().getValueAt(
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
        txtNo = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtKodeKamar = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtNoRekamBayi = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtKodeicd = new javax.swing.JTextField();
        txtKodeDokter = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtKodeTindakan = new javax.swing.JTextField();
        txtSuhuTubuh = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtLama = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txtResusitas = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        txtHasil = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        txtKeterangan = new javax.swing.JTextField();
        txtApgar = new javax.swing.JTextField();
        tbSimpan = new javax.swing.JButton();
        tbEdit = new javax.swing.JButton();
        tbHapus = new javax.swing.JButton();
        tbCetak = new javax.swing.JButton();
        tbKeluar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelRanapBayi = new javax.swing.JTable();
        tbKeluar1 = new javax.swing.JButton();
        TxtCari = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        TxtCrRmBayi = new javax.swing.JTextField();
        TxtCrKmr = new javax.swing.JTextField();
        TxtCrIcd = new javax.swing.JTextField();
        TxtCrDokter = new javax.swing.JTextField();
        TxtCrTindakan = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        txtTglMasuk = new uz.ncipro.calendar.JDateTimePicker();
        txtTglPulang = new uz.ncipro.calendar.JDateTimePicker();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("DATA RAWAT INAP BAYI");

        txtNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNoActionPerformed(evt);
            }
        });

        jLabel8.setText("Kode Kamar :");

        txtKodeKamar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtKodeKamarActionPerformed(evt);
            }
        });

        jLabel5.setText("No. :");

        jLabel3.setText("No. Rekam Bayi :");

        jLabel9.setText("Kode icd :");

        jLabel10.setText("Kode Dokter :");

        jLabel2.setText("Tanggal Masuk :");

        jLabel6.setText("Tanggal Pulang :");

        jLabel11.setText("Kode Tindakan :");

        jLabel12.setText("Suhu Tubuh :");

        jLabel4.setText("Lama :");

        jLabel13.setText("Resusitas :");

        jLabel14.setText("Hasil :");

        jLabel15.setText("Apgar :");

        jLabel16.setText("Keterangan :");

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

        tabelRanapBayi.setModel(new javax.swing.table.DefaultTableModel(
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
        tabelRanapBayi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelRanapBayiMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabelRanapBayi);

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

        jLabel17.setText("Keyword :");

        jButton3.setText("...");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("...");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText("...");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setText("...");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setText("...");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        txtTglMasuk.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "09/12/2014" }));
        txtTglMasuk.setDisplayFormat("dd/MM/yyyy");

        txtTglPulang.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "09/12/2014" }));
        txtTglPulang.setDisplayFormat("dd/MM/yyyy");

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(jScrollPane1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 915, Short.MAX_VALUE)
                .addContainerGap())
            .add(layout.createSequentialGroup()
                .add(23, 23, 23)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                    .add(org.jdesktop.layout.GroupLayout.LEADING, layout.createSequentialGroup()
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                            .add(jLabel4)
                            .add(jLabel6)
                            .add(jLabel2)
                            .add(jLabel5)
                            .add(jLabel3)
                            .add(jLabel8)
                            .add(jLabel9))
                        .add(18, 18, 18)
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(layout.createSequentialGroup()
                                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                                    .add(txtNo, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 176, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                    .add(layout.createSequentialGroup()
                                        .add(txtKodeKamar, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 66, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                        .add(TxtCrKmr))
                                    .add(layout.createSequentialGroup()
                                        .add(txtKodeicd, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 66, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                        .add(TxtCrIcd, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 139, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                                    .add(txtLama, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 176, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                                    .add(jButton6)
                                    .add(jButton7)))
                            .add(layout.createSequentialGroup()
                                .add(txtNoRekamBayi, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 67, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(TxtCrRmBayi, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 138, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(jButton4))
                            .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING, false)
                                .add(org.jdesktop.layout.GroupLayout.LEADING, txtTglPulang, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 176, Short.MAX_VALUE)
                                .add(org.jdesktop.layout.GroupLayout.LEADING, txtTglMasuk, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .add(org.jdesktop.layout.GroupLayout.LEADING, layout.createSequentialGroup()
                        .add(tbSimpan)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(tbEdit, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 63, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(tbKeluar1)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(tbHapus)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(tbCetak)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(tbKeluar))
                    .add(org.jdesktop.layout.GroupLayout.LEADING, jLabel1))
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(layout.createSequentialGroup()
                        .add(91, 91, 91)
                        .add(jLabel17)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                        .add(TxtCari, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 143, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .add(18, 18, 18)
                        .add(jButton1)
                        .addContainerGap(148, Short.MAX_VALUE))
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                        .add(99, 99, 99)
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                            .add(txtSuhuTubuh, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 176, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(txtResusitas, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 176, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(txtHasil, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 176, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(txtKeterangan, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 176, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(txtApgar, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 176, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(layout.createSequentialGroup()
                                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                                    .add(layout.createSequentialGroup()
                                        .add(jLabel10)
                                        .add(18, 18, 18)
                                        .add(txtKodeDokter, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 67, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                                    .add(layout.createSequentialGroup()
                                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                                            .add(jLabel12)
                                            .add(jLabel11)
                                            .add(jLabel13)
                                            .add(jLabel14)
                                            .add(jLabel16)
                                            .add(jLabel15))
                                        .add(18, 18, 18)
                                        .add(txtKodeTindakan, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 67, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                                    .add(TxtCrTindakan)
                                    .add(TxtCrDokter, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 133, Short.MAX_VALUE))))
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(jButton5)
                            .add(jButton3))
                        .add(59, 59, 59))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(layout.createSequentialGroup()
                        .add(51, 51, 51)
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                            .add(txtKodeDokter, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(jLabel10)
                            .add(TxtCrDokter, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(jButton5))
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                            .add(jLabel11)
                            .add(txtKodeTindakan, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(TxtCrTindakan, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(jButton3))
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                            .add(txtSuhuTubuh, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(jLabel12))
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                            .add(txtResusitas, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(jLabel13))
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                            .add(txtHasil, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(jLabel14))
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                            .add(txtKeterangan, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(jLabel16))
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                            .add(txtApgar, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(jLabel15)))
                    .add(layout.createSequentialGroup()
                        .addContainerGap()
                        .add(jLabel1)
                        .add(21, 21, 21)
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                            .add(jLabel5)
                            .add(txtNo, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                            .add(jLabel3)
                            .add(txtNoRekamBayi, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(TxtCrRmBayi, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(jButton4))
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                            .add(jLabel2)
                            .add(txtTglMasuk, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                            .add(jLabel6)
                            .add(txtTglPulang, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                            .add(jLabel4)
                            .add(txtLama, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                            .add(txtKodeKamar, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(jLabel8)
                            .add(TxtCrKmr, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(jButton6))
                        .add(17, 17, 17)
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                            .add(txtKodeicd, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(jLabel9)
                            .add(TxtCrIcd, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(jButton7))))
                .add(20, 20, 20)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(tbSimpan)
                    .add(jLabel17)
                    .add(TxtCari, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jButton1)
                    .add(tbEdit)
                    .add(tbKeluar1)
                    .add(tbHapus)
                    .add(tbCetak)
                    .add(tbKeluar))
                .add(18, 18, 18)
                .add(jScrollPane1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 167, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNoActionPerformed

    private void txtKodeKamarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtKodeKamarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtKodeKamarActionPerformed

    private void tbKeluar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbKeluar1ActionPerformed
        txtNo.setText("");
        txtNoRekamBayi.setText("");
        txtTglMasuk.setSelectedIndex(0);
        txtTglPulang.setSelectedIndex(0); 
        txtLama.setText("");
        txtKodeKamar.setText("");
        txtKodeicd.setText("");
        txtKodeDokter.setText("");
        txtKodeTindakan.setText("");
        txtSuhuTubuh.setText("");
        txtResusitas.setText("");
        txtHasil.setText("");
        txtKeterangan.setText("");
        txtApgar.setText("");
}//GEN-LAST:event_tbKeluar1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            int row=tabmode.getRowCount();
            for (int i=0;i<row;i++){
                tabmode.removeRow(0);
            }
            Connection koneksi=DriverManager.getConnection("jdbc:mysql://localhost:3306/medica","root","");
            ResultSet rs=koneksi.createStatement().executeQuery("select rawat_inap_bayi.no, pasien_bayi.no_rm_bayi, rawat_inap_bayi.tgl_masuk, rawat_inap_bayi.tgl_pulang, rawat_inap_bayi.lama, kamar.nm_kamar, penyakit.nama_penyakit, dokter.nm_dokter, tindakan.nama_tindakan, rawat_inap_bayi.suhu_tubuh, rawat_inap_bayi.resusitas, rawat_inap_bayi.hasil, rawat_inap_bayi.keterangan, rawat_inap_bayi.apgar "+
            "from rawat_inap_bayi inner join pasien_bayi on rawat_inap_bayi.no_rm_bayi=pasien_bayi.no_rm_bayi inner join kamar on rawat_inap_bayi.kd_kamar=kamar.kd_kamar inner join penyakit on rawat_inap_bayi.kd_icd = penyakit.kd_icd inner join dokter on rawat_inap_bayi.kd_dokter = dokter.kd_dokter inner join tindakan on rawat_inap_bayi.kode_tindakan = tindakan.kode_tindakan where rawat_inap_bayi.no like '%"+
                    TxtCari.getText()+"%' or pasien_bayi.no_rm_bayi like '%"+
                    TxtCari.getText()+"%' or rawat_inap_bayi.tgl_masuk like '%"+
                    TxtCari.getText()+"%' or rawat_inap_bayi.tgl_pulang like '%"+
                    TxtCari.getText()+"%' or rawat_inap_bayi.lama like '%"+
                    TxtCari.getText()+"%' or kamar.nm_kamar like '%"+
                    TxtCari.getText()+"%' or penyakit.nama_penyakit like '%"+
                    TxtCari.getText()+"%' or dokter.nm_dokter like '%"+
                    TxtCari.getText()+"%' or tindakan.nama_tindakan like '%"+
                    TxtCari.getText()+"%' or rawat_inap_bayi.suhu_tubuh like '%"+
                    TxtCari.getText()+"%' or rawat_inap_bayi.resusitas like '%"+
                    TxtCari.getText()+"%' or rawat_inap_bayi.hasil like '%"+
                    TxtCari.getText()+"%' or rawat_inap_bayi.keterangan like '%"+
                    TxtCari.getText()+"%' or rawat_inap_bayi.apgar like '%"+
                    TxtCari.getText()+"%'");
            while (rs.next()){
                String[] data={rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7), rs.getString(8), rs.getString(9), rs.getString(10), rs.getString(11), rs.getString(12), rs.getString(13), rs.getString(14)};
                tabmode.addRow(data);
            }
        } catch (SQLException ex) {
            System.out.println(ex);
        }
            
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void tbHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbHapusActionPerformed
        try {
            Connection koneksi=DriverManager.getConnection("jdbc:mysql://localhost:3306/medica","root","");
            koneksi.createStatement().execute("delete from rawat_inap_bayi where no= '" +
                    txtNo.getText()+"'");
            tampil();
            JOptionPane.showMessageDialog(rootPane, "Data Rawat Inap Bayi berhasil Dihapus");
        } catch (SQLException ex) {
            System.out.println();
        }
            
    }//GEN-LAST:event_tbHapusActionPerformed

    private void tbSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbSimpanActionPerformed
        try {
            Connection koneksi=DriverManager.getConnection("jdbc:mysql://localhost:3306/medica","root","");
            txtTglMasuk.setDisplayFormat("yyyy-MM-dd");
            txtTglPulang.setDisplayFormat("yyyy-MM-dd");
            koneksi.createStatement().executeUpdate("insert into rawat_inap_bayi values"+
                        "('"+txtNo.getText()+
                        "','"+txtNoRekamBayi.getText()+
                        "','"+txtTglMasuk.getSelectedItem()+
                        "','"+txtTglPulang.getSelectedItem()+
                        "','"+txtLama.getText()+
                        "','"+txtKodeKamar.getText()+
                        "','"+txtKodeicd.getText()+
                        "','"+txtKodeDokter.getText()+
                        "','"+txtKodeTindakan.getText()+
                        "','"+txtSuhuTubuh.getText()+
                        "','"+txtResusitas.getText()+
                        "','"+txtHasil.getText()+
                        "','"+txtKeterangan.getText()+
                        "','"+txtApgar.getText()+"')");
            txtTglMasuk.setDisplayFormat("dd/MM/yyyy");
            txtTglPulang.setDisplayFormat("dd/MM/yyyy");
            tampil();
            JOptionPane.showMessageDialog(rootPane, "Data Rawat bayi berhasil disimpasn");
        } catch (SQLException ex) {
            System.out.println(ex);
        }
            
    }//GEN-LAST:event_tbSimpanActionPerformed

    private void tbEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbEditActionPerformed
        try {
            Connection koneksi=DriverManager.getConnection("jdbc:mysql://localhost:3306/medica","root","");
            txtTglMasuk.setDisplayFormat("yyyy-MM-dd");
            txtTglPulang.setDisplayFormat("yyyy-MM-dd");
            Statement rs=koneksi.createStatement();
            rs.execute("update rawat_inap_bayi set no_rm_bayi= '" +
                txtNoRekamBayi.getText() + "' ,tgl_masuk='" +
                txtTglMasuk.getSelectedItem() + "' ,tgl_pulang='" +
                txtTglPulang.getSelectedItem() + "' ,lama='" +
                txtLama.getText() + "' ,kd_kamar='" +
                txtKodeKamar.getText() + "' ,kd_icd='" +
                txtKodeicd.getText() + "' ,kd_dokter='" +
                txtKodeDokter.getText() + "' ,kode_tindakan='" +
                txtKodeTindakan.getText() + "' ,suhu_tubuh='" +
                txtSuhuTubuh.getText() + "' ,resusitas='" +
                txtResusitas.getText() + "' ,hasil='" +
                txtHasil.getText() + "' ,keterangan='" +
                txtKeterangan.getText() + "' ,apgar='" +
                txtApgar.getText() + "' where no= '" +
                txtNo.getText() + "'");
            txtTglMasuk.setDisplayFormat("dd/MM/yyyy");
            txtTglPulang.setDisplayFormat("dd/MM/yyyy");
            tampil();
            JOptionPane.showMessageDialog(rootPane, "Data Rawat Inap Bayi berhasil di edit");
        } catch (SQLException ex) {
            System.out.println(ex);
        }
            
    }//GEN-LAST:event_tbEditActionPerformed

    private void tbKeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbKeluarActionPerformed
        dispose();
    }//GEN-LAST:event_tbKeluarActionPerformed

    private void tabelRanapBayiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelRanapBayiMouseClicked
        int i=tabelRanapBayi.getSelectedRow();
        if (i>-1){
        txtNo.setText(tabmode.getValueAt(i, 0). toString());
        TxtCrRmBayi.setText(tabmode.getValueAt(i, 1). toString());
        //txtTglMasuk.setText(tabmode.getValueAt(i, 2). toString());
        //txtTglPulang.setText(tabmode.getValueAt(i, 3). toString());
        txtLama.setText(tabmode.getValueAt(i, 4). toString());
        TxtCrKmr.setText(tabmode.getValueAt(i, 5). toString());
        TxtCrIcd.setText(tabmode.getValueAt(i, 6). toString());
        TxtCrDokter.setText(tabmode.getValueAt(i, 7). toString());
        TxtCrTindakan.setText(tabmode.getValueAt(i, 8). toString());
        txtSuhuTubuh.setText(tabmode.getValueAt(i, 9). toString());
        txtResusitas.setText(tabmode.getValueAt(i, 10). toString());
        txtHasil.setText(tabmode.getValueAt(i, 11). toString());
        txtKeterangan.setText(tabmode.getValueAt(i, 12). toString());
        txtApgar.setText(tabmode.getValueAt(i, 13). toString());
        }
        
        try {
            txtTglMasuk.setDisplayFormat("yyyy-MM-dd");
            txtTglPulang.setDisplayFormat("yyyy-MM-dd");
            Date dtpa = new SimpleDateFormat("yyyy-MM-dd").parse(tabmode.getValueAt(i,2).toString());
            Date dtpa1 = new SimpleDateFormat("yyyy-MM-dd").parse(tabmode.getValueAt(i,3).toString());
            txtTglMasuk.setDate(dtpa);
            txtTglPulang.setDate(dtpa1);
            txtTglMasuk.setDisplayFormat("dd/MM/yyyy");
            txtTglPulang.setDisplayFormat("dd/MM/yyyy");
        } catch (ParseException ex) {
            Logger.getLogger(frmDokter.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_tabelRanapBayiMouseClicked

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        pasienbayi.setLocationRelativeTo(null);
        pasienbayi.setVisible(true);
        JOptionPane.showMessageDialog(rootPane, "Pilih Data Pasien Bayi");
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        kamar.setLocationRelativeTo(null);
        kamar.setVisible(true);
        JOptionPane.showMessageDialog(rootPane, "Pilih Data Kamar");
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        penyakit.setLocationRelativeTo(null);
        penyakit.setVisible(true);
        JOptionPane.showMessageDialog(rootPane, "Pilih Data Penyakit");
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        dokter.setLocationRelativeTo(null);
        dokter.setVisible(true);
        JOptionPane.showMessageDialog(rootPane, "Pilih Data Dokter");
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        tindakan.setLocationRelativeTo(null);
        tindakan.setVisible(true);
        JOptionPane.showMessageDialog(rootPane, "Pilih Data Tindakan");
    }//GEN-LAST:event_jButton3ActionPerformed

    private void tbCetakActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbCetakActionPerformed
        try {
            Connection koneksi=DriverManager.getConnection("jdbc:mysql://localhost:3306/medica","root","");
                JasperReport Jrpt=JasperCompileManager.compileReport("./report/ReportRanapBayi.jrxml");
                JasperPrint jsp=JasperFillManager.fillReport(Jrpt, new HashMap<Object, Object>(),koneksi);
                JasperViewer view=new JasperViewer(jsp,false);
                view.setFitPageZoomRatio();
                view.setVisible(true);
        } catch (JRException ex) {
            Logger.getLogger(frmRanapBayi.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(frmRanapBayi.class.getName()).log(Level.SEVERE, null, ex);
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
            java.util.logging.Logger.getLogger(frmRanapBayi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmRanapBayi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmRanapBayi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmRanapBayi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                frmRanapBayi dialog = new frmRanapBayi(new javax.swing.JFrame(), true);
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
    private javax.swing.JTextField TxtCrDokter;
    private javax.swing.JTextField TxtCrIcd;
    private javax.swing.JTextField TxtCrKmr;
    private javax.swing.JTextField TxtCrRmBayi;
    private javax.swing.JTextField TxtCrTindakan;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
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
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabelRanapBayi;
    private javax.swing.JButton tbCetak;
    private javax.swing.JButton tbEdit;
    private javax.swing.JButton tbHapus;
    private javax.swing.JButton tbKeluar;
    private javax.swing.JButton tbKeluar1;
    private javax.swing.JButton tbSimpan;
    private javax.swing.JTextField txtApgar;
    private javax.swing.JTextField txtHasil;
    private javax.swing.JTextField txtKeterangan;
    private javax.swing.JTextField txtKodeDokter;
    private javax.swing.JTextField txtKodeKamar;
    private javax.swing.JTextField txtKodeTindakan;
    private javax.swing.JTextField txtKodeicd;
    private javax.swing.JTextField txtLama;
    private javax.swing.JTextField txtNo;
    private javax.swing.JTextField txtNoRekamBayi;
    private javax.swing.JTextField txtResusitas;
    private javax.swing.JTextField txtSuhuTubuh;
    private uz.ncipro.calendar.JDateTimePicker txtTglMasuk;
    private uz.ncipro.calendar.JDateTimePicker txtTglPulang;
    // End of variables declaration//GEN-END:variables

    private void tampil() {
        int row=tabmode.getRowCount();
        for (int i=0;i<row;i++){
            tabmode.removeRow(0);
        }
        try {
            Connection koneksi=DriverManager.getConnection("jdbc:mysql://localhost:3306/medica","root","");
            ResultSet rs=koneksi.createStatement().executeQuery("select rawat_inap_bayi.no, pasien_bayi.tgl_lahir, rawat_inap_bayi.tgl_masuk, rawat_inap_bayi.tgl_pulang, rawat_inap_bayi.lama, kamar.nm_kamar, penyakit.nama_penyakit, dokter.nm_dokter, tindakan.nama_tindakan, rawat_inap_bayi.suhu_tubuh, rawat_inap_bayi.resusitas, rawat_inap_bayi.hasil, rawat_inap_bayi.keterangan, rawat_inap_bayi.apgar "+
            " from rawat_inap_bayi inner join pasien_bayi on rawat_inap_bayi.no_rm_bayi=pasien_bayi.no_rm_bayi inner join kamar on rawat_inap_bayi.kd_kamar=kamar.kd_kamar inner join penyakit on rawat_inap_bayi.kd_icd = penyakit.kd_icd inner join dokter on rawat_inap_bayi.kd_dokter = dokter.kd_dokter inner join tindakan on rawat_inap_bayi.kode_tindakan = tindakan.kode_tindakan ");
            while(rs.next()){
            String[] data={rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7),rs.getString(8),rs.getString(9),rs.getString(10),rs.getString(11),rs.getString(12),rs.getString(13),rs.getString(14)};
            tabmode.addRow(data);
            }
        } catch (SQLException ex) {
            System.out.println(ex);
        }
            
    }

}
