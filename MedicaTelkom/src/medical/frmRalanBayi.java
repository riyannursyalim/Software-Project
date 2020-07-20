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
import javax.swing.event.MouseInputListener;
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
public class frmRalanBayi extends javax.swing.JDialog {
DefaultTableModel tabmode;
private frmPasienBayi pasienbayi=new frmPasienBayi(null, false);
private frmDokter dokter=new frmDokter(null, false);
private frmPenyakit penyakit=new frmPenyakit(null, false);
private frmTindakan tindakan=new frmTindakan(null, false);
private frmImunisasi imunisasi=new frmImunisasi(null, false);
    public frmRalanBayi(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        String[] judul={"Nomor","Tanggal","Rekam Bayi","Dokter","ICD","Tindakan","Suhu Tubuh","Tensi","Hasil","Keterangan","Imunisasi","Imun Ke-"};
        Dimension screen=Toolkit.getDefaultToolkit().getScreenSize();
        setLocationRelativeTo(null);
        tabmode=new DefaultTableModel(judul,0);
        tabelRalanBayi.setModel(tabmode);
        tampil();
        pasienbayi.getdata().addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (pasienbayi.getdata().getRowCount()!=-1){
                    txtNoRmBayi.setText(pasienbayi.getMode().getValueAt(
                            pasienbayi.getdata().getSelectedRow(),0).toString());
                    TxtCariBayi.setText(pasienbayi.getMode().getValueAt(
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
        dokter.getdata().addMouseListener(new MouseInputListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (dokter.getdata().getRowCount()!=-1){
                    txtKdDokter.setText(dokter.getMode().getValueAt(
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
            @Override
            public void mouseDragged(MouseEvent e) {}
            @Override
            public void mouseMoved(MouseEvent e) {}
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
                    txtKdTindakan.setText(tindakan.getMode().getValueAt(
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
        imunisasi.getdata().addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
               if (imunisasi.getdata().getRowCount()!=-1){
                    txtKdImunisasi.setText(imunisasi.getMode().getValueAt(
                            imunisasi.getdata().getSelectedRow(),0).toString());
                    TxtCariImunisasi.setText(imunisasi.getMode().getValueAt(
                            imunisasi.getdata().getSelectedRow(),1).toString());
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
        txtNo = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtNoRmBayi = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtKdDokter = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        Kodeicd = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtKdTindakan = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtSuhuTubuh = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtHasil = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtKeterangan = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtKdImunisasi = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txtImunke = new javax.swing.JTextField();
        tbSimpan = new javax.swing.JButton();
        tbEdit = new javax.swing.JButton();
        tbHapus = new javax.swing.JButton();
        tbCetak = new javax.swing.JButton();
        tbKeluar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelRalanBayi = new javax.swing.JTable();
        txtTensi = new javax.swing.JTextField();
        tbKeluar1 = new javax.swing.JButton();
        TxtCari = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        TxtCariBayi = new javax.swing.JTextField();
        TxtCariDokter = new javax.swing.JTextField();
        TxtCariIcd = new javax.swing.JTextField();
        TxtCariTindakan = new javax.swing.JTextField();
        TxtCariImunisasi = new javax.swing.JTextField();
        TbCrBayi = new javax.swing.JButton();
        TbCrImun = new javax.swing.JButton();
        TbCrDokter = new javax.swing.JButton();
        TbCrIcd = new javax.swing.JButton();
        TbCrTindakan = new javax.swing.JButton();
        txtTanggal = new uz.ncipro.calendar.JDateTimePicker();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("DATA RAWAT JALAN BAYI");

        jLabel2.setText("No. :");

        jLabel3.setText("Tanggal :");

        jLabel5.setText("No.rm_Bayi :");

        txtNoRmBayi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNoRmBayiActionPerformed(evt);
            }
        });

        jLabel4.setText("Kode Dokter :");

        jLabel6.setText("Kode icd :");

        jLabel7.setText("Kode Tindakan :");

        jLabel8.setText("Suhu Tubuh :");

        jLabel9.setText("Tensi :");

        jLabel10.setText("Hasil :");

        jLabel11.setText("Keterangan :");

        jLabel12.setText("Kode Imunisasi :");

        jLabel13.setText("Imun ke- :");

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

        tabelRalanBayi.setModel(new javax.swing.table.DefaultTableModel(
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
        tabelRalanBayi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelRalanBayiMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabelRalanBayi);

        tbKeluar1.setText("Baru");
        tbKeluar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbKeluar1ActionPerformed(evt);
            }
        });

        jLabel14.setText("Keyword :");

        jButton1.setText("Cari");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        TbCrBayi.setText("...");
        TbCrBayi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TbCrBayiActionPerformed(evt);
            }
        });

        TbCrImun.setText("...");
        TbCrImun.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TbCrImunActionPerformed(evt);
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

        TbCrTindakan.setText("...");
        TbCrTindakan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TbCrTindakanActionPerformed(evt);
            }
        });

        txtTanggal.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "09/12/2014" }));
        txtTanggal.setDisplayFormat("dd/MM/yyyy");

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                    .add(org.jdesktop.layout.GroupLayout.LEADING, layout.createSequentialGroup()
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(layout.createSequentialGroup()
                                .add(41, 41, 41)
                                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                                    .add(layout.createSequentialGroup()
                                        .add(jLabel7)
                                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                                        .add(txtKdTindakan, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 67, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                                    .add(layout.createSequentialGroup()
                                        .add(jLabel6)
                                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                                        .add(Kodeicd, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 67, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                                    .add(layout.createSequentialGroup()
                                        .add(jLabel4)
                                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                                        .add(txtKdDokter, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 67, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                                    .add(layout.createSequentialGroup()
                                        .add(jLabel5)
                                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                                        .add(txtNoRmBayi, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 67, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                                    .add(TxtCariBayi, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 131, Short.MAX_VALUE)
                                    .add(TxtCariDokter)
                                    .add(TxtCariIcd)
                                    .add(TxtCariTindakan)))
                            .add(layout.createSequentialGroup()
                                .add(74, 74, 74)
                                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                                    .add(jLabel2)
                                    .add(jLabel3))
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                                    .add(txtTanggal, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 203, Short.MAX_VALUE)
                                    .add(layout.createSequentialGroup()
                                        .add(txtNo, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 176, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                        .add(0, 0, Short.MAX_VALUE)))))
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(layout.createSequentialGroup()
                                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                                    .add(TbCrBayi)
                                    .add(TbCrTindakan)
                                    .add(TbCrIcd)
                                    .add(TbCrDokter))
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, 108, Short.MAX_VALUE)
                                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                                    .add(layout.createSequentialGroup()
                                        .add(jLabel12)
                                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                                        .add(txtKdImunisasi, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 60, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                        .add(TxtCariImunisasi, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 151, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                                    .add(layout.createSequentialGroup()
                                        .add(jLabel10)
                                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                                        .add(txtHasil, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 176, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                                    .add(layout.createSequentialGroup()
                                        .add(jLabel11)
                                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                                        .add(txtKeterangan, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 176, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                                    .add(layout.createSequentialGroup()
                                        .add(jLabel13)
                                        .add(18, 18, 18)
                                        .add(txtImunke, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 176, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))))
                            .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                                .add(jLabel9)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                                .add(txtTensi, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 176, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                            .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                                .add(jLabel8)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                                .add(txtSuhuTubuh, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 175, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                        .add(TbCrImun)
                        .add(10, 10, 10))
                    .add(layout.createSequentialGroup()
                        .add(106, 106, 106)
                        .add(tbEdit, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 63, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .add(18, 18, 18)
                        .add(tbHapus)
                        .add(18, 18, 18)
                        .add(tbKeluar1)
                        .add(18, 18, 18)
                        .add(tbCetak)
                        .add(18, 18, 18)
                        .add(tbKeluar)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, 107, Short.MAX_VALUE)
                        .add(jLabel14)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                        .add(TxtCari, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 143, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .add(18, 18, 18)
                        .add(jButton1)))
                .add(46, 46, 46))
            .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                .addContainerGap(372, Short.MAX_VALUE)
                .add(jLabel1)
                .add(302, 302, 302))
            .add(layout.createSequentialGroup()
                .add(21, 21, 21)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                        .add(jScrollPane1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 862, Short.MAX_VALUE)
                        .add(24, 24, 24))
                    .add(layout.createSequentialGroup()
                        .add(tbSimpan)
                        .addContainerGap(819, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(jLabel1)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(layout.createSequentialGroup()
                        .add(10, 10, 10)
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                            .add(txtNo, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(jLabel2)))
                    .add(layout.createSequentialGroup()
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                            .add(jLabel8)
                            .add(txtSuhuTubuh, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))))
                .add(20, 20, 20)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(layout.createSequentialGroup()
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                            .add(jLabel3)
                            .add(txtTanggal, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                        .add(18, 18, 18)
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                            .add(jLabel5)
                            .add(txtNoRmBayi, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(TxtCariBayi, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(TbCrBayi))
                        .add(18, 18, 18)
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                            .add(jLabel4)
                            .add(txtKdDokter, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(TxtCariDokter, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(TbCrDokter))
                        .add(18, 18, 18)
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                            .add(jLabel6)
                            .add(Kodeicd, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(TxtCariIcd, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(TbCrIcd))
                        .add(18, 18, 18)
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                            .add(jLabel7)
                            .add(txtKdTindakan, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(TxtCariTindakan, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(TbCrTindakan)))
                    .add(layout.createSequentialGroup()
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                            .add(jLabel9)
                            .add(txtTensi, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                        .add(18, 18, 18)
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                            .add(jLabel10)
                            .add(txtHasil, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                        .add(18, 18, 18)
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                            .add(jLabel11)
                            .add(txtKeterangan, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                        .add(16, 16, 16)
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                            .add(txtKdImunisasi, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(jLabel12)
                            .add(TxtCariImunisasi, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(TbCrImun))
                        .add(18, 18, 18)
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                            .add(txtImunke, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(jLabel13))))
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(layout.createSequentialGroup()
                        .add(39, 39, 39)
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                            .add(jLabel14)
                            .add(TxtCari, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(jButton1)))
                    .add(layout.createSequentialGroup()
                        .add(40, 40, 40)
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                            .add(tbSimpan)
                            .add(tbEdit)
                            .add(tbHapus)
                            .add(tbKeluar1)
                            .add(tbCetak)
                            .add(tbKeluar))))
                .add(33, 33, 33)
                .add(jScrollPane1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 170, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(98, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNoRmBayiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNoRmBayiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNoRmBayiActionPerformed

    private void tbKeluar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbKeluar1ActionPerformed
        txtNo.setText("");
        txtTanggal.setSelectedIndex(0);
        txtNoRmBayi.setText("");
        txtKdDokter.setText("");
        Kodeicd.setText("");
        txtKdTindakan.setText("");
        txtSuhuTubuh.setText("");
        txtTensi.setText("");
        txtHasil.setText("");
        txtKeterangan.setText("");
        txtKdImunisasi.setText("");
        txtImunke.setText("");
}//GEN-LAST:event_tbKeluar1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            int row=tabmode.getRowCount();
            for (int i=0;i<row;i++){
                tabmode.removeRow(0);
            }
            Connection koneksi=DriverManager.getConnection("jdbc:mysql://localhost:3306/medica","root","");
            ResultSet rs=koneksi.createStatement().executeQuery("select rawat_jl_bayi.no, rawat_jl_bayi.tanggal, pasien_bayi.no_rm_bayi, dokter.nm_dokter, penyakit.nama_penyakit, tindakan.nama_tindakan, rawat_jl_bayi.suhu_tubuh, rawat_jl_bayi.tensi, rawat_jl_bayi.hasil, rawat_jl_bayi.keterangan, imunisasi.nm_imunisasi, rawat_jl_bayi.imunke "+
            " from rawat_jl_bayi inner join pasien_bayi on rawat_jl_bayi.no_rm_bayi=pasien_bayi.no_rm_bayi inner join dokter on rawat_jl_bayi.kd_dokter=dokter.kd_dokter inner join penyakit on rawat_jl_bayi.kd_icd = penyakit.kd_icd inner join tindakan on rawat_jl_bayi.kd_tindakan = tindakan.kode_tindakan inner join imunisasi on rawat_jl_bayi.kd_imunisasi = imunisasi.kd_imunisasi where rawat_jl_bayi.no like '%"+
                    TxtCari.getText()+"%' or rawat_jl_bayi.tanggal like '%"+
                    TxtCari.getText()+"%' or no_rm_bayi like '%"+
                    TxtCari.getText()+"%' or dokter.nm_dokter like '%"+
                    TxtCari.getText()+"%' or penyakit.nama_penyakit like '%"+
                    TxtCari.getText()+"%' or tindakan.nama_tindakan like '%"+
                    TxtCari.getText()+"%' or rawat_jl_bayi.suhu_tubuh like '%"+
                    TxtCari.getText()+"%' or rawat_jl_bayi.tensi like '%"+
                    TxtCari.getText()+"%' or rawat_jl_bayi.hasil like '%"+
                    TxtCari.getText()+"%' or rawat_jl_bayi.keterangan like '%"+
                    TxtCari.getText()+"%' or imunisasi.nama_imunisasi like '%"+
                    TxtCari.getText()+"%' or rawat_jl_bayi.imunke like '%"+
                    TxtCari.getText()+"%'");
            while (rs.next()){
                String[] data={rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7), rs.getString(8), rs.getString(9), rs.getString(10), rs.getString(11), rs.getString(12)};
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
            koneksi.createStatement().executeUpdate("insert into rawat_jl_bayi values"+
                        "('"+txtNo.getText()+
                        "','"+txtTanggal.getSelectedItem()+
                        "','"+txtNoRmBayi.getText()+
                        "','"+txtKdDokter.getText()+
                        "','"+Kodeicd.getText()+
                        "','"+txtKdTindakan.getText()+
                        "','"+txtSuhuTubuh.getText()+
                        "','"+txtTensi.getText()+
                        "','"+txtHasil.getText()+
                        "','"+txtKeterangan.getText()+
                        "','"+txtKdImunisasi.getText()+
                        "','"+txtImunke.getText()+"')");
            txtTanggal.setDisplayFormat("dd/MM/yyyy");
            tampil();
            JOptionPane.showMessageDialog(rootPane, "Data Rawat jalan Bayi Berhasil di simpan");
        } catch (SQLException ex) {
            System.out.println(ex);
        }
            
    }//GEN-LAST:event_tbSimpanActionPerformed

    private void tbEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbEditActionPerformed
        try {
            Connection koneksi=DriverManager.getConnection("jdbc:mysql://localhost:3306/medica","root","");
            txtTanggal.setDisplayFormat("yyyy-MM-dd");
            Statement rs=koneksi.createStatement();
            rs.execute("update rawat_jl_bayi set tanggal= '" +
                txtTanggal.getSelectedItem() + "' ,no_rm_bayi='" +
                txtNoRmBayi.getText() + "' ,kd_dokter='" +
                txtKdDokter.getText() + "' ,kd_icd='" +
                Kodeicd.getText() + "' ,kd_tindakan='" +
                txtKdTindakan.getText() + "' ,suhu_tubuh='" +
                txtSuhuTubuh.getText() + "' ,tensi='" +
                txtTensi.getText() + "' ,hasil='" +
                txtHasil.getText() + "' ,keterangan='" +
                txtKeterangan.getText() + "' ,kd_imunisasi='" +
                txtKdImunisasi.getText() + "' ,imunke='" +
                txtImunke.getText() + "' where no= '" +
                txtNo.getText() + "'");
            txtTanggal.setDisplayFormat("dd/MM/yyyy");
            tampil();
            JOptionPane.showMessageDialog(rootPane, "Data Rawat jalan Bayi berhasil Di edit");
        } catch (SQLException ex) {
            System.out.println(ex);
        }
            
    }//GEN-LAST:event_tbEditActionPerformed

    private void tbHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbHapusActionPerformed
        try {
            Connection koneksi=DriverManager.getConnection("jdbc:mysql://localhost:3306/medica","root","");
            koneksi.createStatement().execute("delete from rawat_jl_bayi where no= '" +
                    txtNo.getText()+"'");
            tampil();
            JOptionPane.showMessageDialog(rootPane, "Data Rawat jalan bayi berhasil diHapus");
        } catch (SQLException ex) {
            System.out.println(ex);
        }
            
    }//GEN-LAST:event_tbHapusActionPerformed

    private void tbKeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbKeluarActionPerformed
        dispose();
    }//GEN-LAST:event_tbKeluarActionPerformed

    private void tabelRalanBayiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelRalanBayiMouseClicked
        int i=tabelRalanBayi.getSelectedRow();
        if (i>-1){
        txtNo.setText(tabmode.getValueAt(i, 0). toString());
        //txtTanggal.setText(tabmode.getValueAt(i, 1). toString());
        TxtCariBayi.setText(tabmode.getValueAt(i, 2). toString());
        TxtCariDokter.setText(tabmode.getValueAt(i, 3). toString());
        TxtCariIcd.setText(tabmode.getValueAt(i, 4). toString());
        TxtCariTindakan.setText(tabmode.getValueAt(i, 5). toString());
        txtSuhuTubuh.setText(tabmode.getValueAt(i, 6). toString());
        txtTensi.setText(tabmode.getValueAt(i, 7). toString());
        txtHasil.setText(tabmode.getValueAt(i, 8). toString());
        txtKeterangan.setText(tabmode.getValueAt(i, 9). toString());
        TxtCariImunisasi.setText(tabmode.getValueAt(i, 10). toString());
        txtImunke.setText(tabmode.getValueAt(i, 11). toString());
        }
        try {
            txtTanggal.setDisplayFormat("yyyy-MM-dd");
            Date dtpa = new SimpleDateFormat("yyyy-MM-dd").parse(tabmode.getValueAt(i,1).toString());
            txtTanggal.setDate(dtpa);
            txtTanggal.setDisplayFormat("dd/MM/yyyy");
        } catch (ParseException ex) {
            Logger.getLogger(frmDokter.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_tabelRalanBayiMouseClicked

    private void TbCrBayiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TbCrBayiActionPerformed
        pasienbayi.setLocationRelativeTo(null);
        pasienbayi.setVisible(true);
        JOptionPane.showMessageDialog(rootPane, "Pilih Data Bayi");
    }//GEN-LAST:event_TbCrBayiActionPerformed

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

    private void TbCrImunActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TbCrImunActionPerformed
        imunisasi.setLocationRelativeTo(null);
        imunisasi.setVisible(true);
        JOptionPane.showMessageDialog(rootPane, "Pilih Data Imunisasi");
    }//GEN-LAST:event_TbCrImunActionPerformed

    private void tbCetakActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbCetakActionPerformed
        try {
            Connection koneksi=DriverManager.getConnection("jdbc:mysql://localhost:3306/medica","root","");
                JasperReport Jrpt=JasperCompileManager.compileReport("./report/ReportRalanBayi.jrxml");
                JasperPrint jsp=JasperFillManager.fillReport(Jrpt, new HashMap<Object, Object>(),koneksi);
                JasperViewer view=new JasperViewer(jsp,false);
                view.setFitPageZoomRatio();
                view.setVisible(true);
        } catch (JRException ex) {
            Logger.getLogger(frmRalanBayi.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(frmRalanBayi.class.getName()).log(Level.SEVERE, null, ex);
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
            java.util.logging.Logger.getLogger(frmRalanBayi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmRalanBayi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmRalanBayi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmRalanBayi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                frmRalanBayi dialog = new frmRalanBayi(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton TbCrBayi;
    private javax.swing.JButton TbCrDokter;
    private javax.swing.JButton TbCrIcd;
    private javax.swing.JButton TbCrImun;
    private javax.swing.JButton TbCrTindakan;
    private javax.swing.JTextField TxtCari;
    private javax.swing.JTextField TxtCariBayi;
    private javax.swing.JTextField TxtCariDokter;
    private javax.swing.JTextField TxtCariIcd;
    private javax.swing.JTextField TxtCariImunisasi;
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
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabelRalanBayi;
    private javax.swing.JButton tbCetak;
    private javax.swing.JButton tbEdit;
    private javax.swing.JButton tbHapus;
    private javax.swing.JButton tbKeluar;
    private javax.swing.JButton tbKeluar1;
    private javax.swing.JButton tbSimpan;
    private javax.swing.JTextField txtHasil;
    private javax.swing.JTextField txtImunke;
    private javax.swing.JTextField txtKdDokter;
    private javax.swing.JTextField txtKdImunisasi;
    private javax.swing.JTextField txtKdTindakan;
    private javax.swing.JTextField txtKeterangan;
    private javax.swing.JTextField txtNo;
    private javax.swing.JTextField txtNoRmBayi;
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
            ResultSet rs=koneksi.createStatement().executeQuery("select rawat_jl_bayi.no, rawat_jl_bayi.tanggal, pasien_bayi.no_rm_bayi, dokter.nm_dokter, penyakit.nama_penyakit, tindakan.nama_tindakan, rawat_jl_bayi.suhu_tubuh, rawat_jl_bayi.tensi, rawat_jl_bayi.hasil, rawat_jl_bayi.keterangan, imunisasi.nm_imunisasi, rawat_jl_bayi.imunke "+
            " from rawat_jl_bayi inner join pasien_bayi on rawat_jl_bayi.no_rm_bayi=pasien_bayi.no_rm_bayi inner join dokter on rawat_jl_bayi.kd_dokter=dokter.kd_dokter inner join penyakit on rawat_jl_bayi.kd_icd = penyakit.kd_icd inner join tindakan on rawat_jl_bayi.kd_tindakan = tindakan.kode_tindakan inner join imunisasi on rawat_jl_bayi.kd_imunisasi = imunisasi.kd_imunisasi ");
            while(rs.next()){
            String[] data={rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7),rs.getString(8),rs.getString(9),rs.getString(10),rs.getString(11),rs.getString(12)};
            tabmode.addRow(data);
            }
        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }
}
