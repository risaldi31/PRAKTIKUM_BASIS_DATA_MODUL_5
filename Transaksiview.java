/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.Transaksi;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Action;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;
import model.Bank_90490;
import model.Mahasiswa_90490;
import model.Pembayaran_Spp_90490;

/**
 *
 * @author Risaldi
 */
public class Transaksiview extends javax.swing.JFrame {

    /**
     * Creates new form Transaksiview
     */
    private Transaksi transaksi;
    private ArrayList<Pembayaran_Spp_90490> arrSpp;
    public Transaksiview() {
        
        initComponents();
    }
    
    public void TigaView() throws SQLException {
        initComponents();
        this.transaksi=new Transaksi();
        this.showTableJoin();
        this.setVisible(true);
    }
    
    public void showTableJoin() throws SQLException {
        DefaultTableModel dtmJoin = new DefaultTableModel(new String[]{"Npm_Mahasiswa", "Nama_Mahasiswa", "Jenis_Kelamin", "Alamat"},0);
        dtmJoin.setRowCount(0);
        for (Mahasiswa_90490 b : this.transaksi.getDataJoin()) {
            dtmJoin.addRow(new String[]{Integer.toString(b.getNpm_Mahasiswa()),b.getNama_Mahasiswa()});
        }
        this.Table.setModel(dtmJoin);
    }
    
    public void showTableMahasiswa() throws SQLException{
        DefaultTableModel dtmMahasiswa = new DefaultTableModel(new String[]{"Npm_Mahasiswa", "Nama_Mahasiswa", "Jenis_Kelamin_Mahasiswa", "Alamat"},0);
        dtmMahasiswa.setRowCount(0);
        for (Mahasiswa_90490 dp : this.transaksi.getDataMahasiswa()) {
            dtmMahasiswa.addRow(new String[]{dp.getNama_Mahasiswa(),dp.getJenis_Kelamin(),dp.getAlamat()});
        }
        this.Table.setModel(dtmMahasiswa);
    }
    
    public void showTableBank() throws SQLException{
        DefaultTableModel dtmBank = new DefaultTableModel(new String[]{"Id_Bank", "Nama_Bank"}, 0);
        dtmBank.setRowCount(0);
        for (Bank_90490 dp : this.transaksi.getDataBank()) {
            dtmBank.addRow(new String[]{dp.getNama_Bank()});
        }
        this.Table.setModel(dtmBank);
    }
    
    public void showTablePembayaranSpp() throws SQLException{
        DefaultTableModel dtmPembayaranspp = new DefaultTableModel(new String[]{"Id_spp", "Npm_Mahasiswa","Id_bank","Tanggal_Spp","Bulan_Spp","Nominal_Spp","Denda_Spp","Konfirmasi_Pembayaran_Spp"},0);
        dtmPembayaranspp.setRowCount(0);
        for (Pembayaran_Spp_90490 dp : this.transaksi.getDataPembayaran()){
            dtmPembayaranspp.addRow(new String[]{dp.getKonfirmasi()});
        }
        this.Table.setModel(dtmPembayaranspp);
    }
    
    /*public void showComboBoxNamabank() throws SQLException{
        DefaultComboBoxModel dcbmBank = new DefaultComboBoxModel();
        for (Bank_90490 p : this.transaksi.getDataBank()) {
            dcbmBank.addElement(p.getNama_Bank());
        }
        this.Namabank.setAction((Action) dcbmBank);
    }*/

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        npm1 = new javax.swing.JTextField();
        Bcari = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        npm2 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        nama = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        Alamat = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        idbank = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        idspp = new javax.swing.JTextField();
        nominal = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        denda = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        bulan = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        tanggal = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        Table = new javax.swing.JTable();
        jLabel13 = new javax.swing.JLabel();
        Btambah = new javax.swing.JButton();
        Bsimpan = new javax.swing.JButton();
        Bprint = new javax.swing.JButton();
        Bhapus = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbj = new javax.swing.JTextArea();
        jLabel15 = new javax.swing.JLabel();
        jenisk = new javax.swing.JTextField();
        Namabank = new javax.swing.JTextField();
        status = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("PEMBAYARAN SPP");

        jLabel2.setText("NPM                :");

        Bcari.setText("Cari");
        Bcari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BcariActionPerformed(evt);
            }
        });

        jLabel3.setText("NPM                :");

        jLabel4.setText("Nama              :");

        jLabel5.setText("Alamat            :");

        jLabel6.setText("ID Bank           :");

        jLabel7.setText("Nama Bank    :");

        jLabel8.setText("ID SPP           :");

        jLabel9.setText("Nominal         :");

        jLabel10.setText("Denda           :");

        jLabel11.setText("Bulan            :");

        jLabel12.setText("Tanggal           :");

        Table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID SPP", "NPM", "Nama", "Tanggal", "Nominal", "Status"
            }
        ));
        jScrollPane1.setViewportView(Table);

        jLabel13.setText("Status           :");

        Btambah.setText("Tambah");
        Btambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtambahActionPerformed(evt);
            }
        });

        Bsimpan.setText("Simpan");
        Bsimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BsimpanActionPerformed(evt);
            }
        });

        Bprint.setText("Print");

        Bhapus.setText("Hapus");
        Bhapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BhapusActionPerformed(evt);
            }
        });

        jLabel14.setText("Jenis Kelamin  :");

        tbj.setColumns(20);
        tbj.setRows(5);
        jScrollPane2.setViewportView(tbj);

        jLabel15.setText("Log");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(idbank, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                            .addComponent(jLabel5)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(Alamat, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(jLabel6)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel4)
                                            .addComponent(jLabel14))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(nama, javax.swing.GroupLayout.DEFAULT_SIZE, 159, Short.MAX_VALUE)
                                            .addComponent(jenisk))))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(jLabel11)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(bulan))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(jLabel9)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(nominal))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(jLabel8)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(idspp, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel10)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(denda, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(Bhapus, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(Bprint, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(Btambah, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(Bsimpan, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel13)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(status))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 490, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel15)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 271, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(npm1, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Bcari)))
                        .addGap(10, 10, 10))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(npm2, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Namabank, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tanggal)
                        .addContainerGap())))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(279, 279, 279))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(npm1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(Bcari))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(npm2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel7)
                    .addComponent(tanggal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12)
                    .addComponent(Namabank, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(4, 4, 4)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14)
                            .addComponent(jenisk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Alamat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addGap(9, 9, 9)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(idbank, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)
                            .addComponent(jLabel11))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel15))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(idspp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8)
                            .addComponent(jLabel13)
                            .addComponent(status, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(nominal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel9))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(denda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel10)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(Btambah)
                                    .addComponent(Bsimpan))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(Bhapus)
                                    .addComponent(Bprint))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bulan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 240, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BhapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BhapusActionPerformed
        // TODO add your handling code here:
        try{
            Pembayaran_Spp_90490 P=new Pembayaran_Spp_90490();
            P.setId_Spp(Integer.parseInt(this.idspp.getText()));
            this.transaksi.deleteTransaksi(P);
            this.showTablePembayaranSpp();
        }catch (SQLException ex){
            System.out.println(ex);
        }
    }//GEN-LAST:event_BhapusActionPerformed

    private void BtambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtambahActionPerformed
        try{
            Pembayaran_Spp_90490 pembayaran=new Pembayaran_Spp_90490();
            pembayaran.setId_Spp(Integer.parseInt(this.idspp.getText()));
            Mahasiswa_90490 mahasiswa=new Mahasiswa_90490();
            mahasiswa.setNpm_Mahasiswa(Integer.parseInt(this.npm2.getText()));
            mahasiswa.setNama_Mahasiswa(this.nama.getText());
            mahasiswa.setJenis_Kelamin(this.jenisk.getText());
            mahasiswa.setAlamat(this.Alamat.getText());
            pembayaran.setMahasiswa(mahasiswa);       
            Bank_90490 bank=new Bank_90490();
            bank.setId_Bank(Integer.parseInt(this.idbank.getText()));
            bank.setNama_Bank(this.Namabank.getText());
            pembayaran.setBank(bank);
            pembayaran.setNominal_Spp(Integer.parseInt(this.nominal.getText()));
            pembayaran.setDenda_Spp(Integer.parseInt(this.denda.getText()));
            pembayaran.setTanggal_Spp((java.sql.Date) new SimpleDateFormat("dd/MM/yyyy").parse(this.tanggal.getText()));
            pembayaran.setKonfirmasi(this.status.getText());
            
            this.transaksi.insertTransaksi(pembayaran);
            this.showTablePembayaranSpp();
            this.showTabel();
            
        } catch (SQLException ex) {
            System.out.println(ex);
        } catch (ParseException ex) {
            Logger.getLogger(Transaksiview.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_BtambahActionPerformed

    private void BsimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BsimpanActionPerformed
    try{    
        Pembayaran_Spp_90490 pembayaranspp = new Pembayaran_Spp_90490();
        pembayaranspp.setId_Spp(Integer.parseInt(this.idspp.getText()));
        if(this.idspp.getText().equals("")){
            pembayaranspp.setId_Spp(null);
        } 
        Mahasiswa_90490 mahasiswa=new Mahasiswa_90490();
        mahasiswa.setNpm_Mahasiswa(Integer.parseInt(this.npm2.getText()));
        mahasiswa.setNama_Mahasiswa(this.nama.getText());
        mahasiswa.setJenis_Kelamin(this.jenisk.getText());
        mahasiswa.setAlamat(this.Alamat.getText());
        pembayaranspp.setMahasiswa(mahasiswa);
        if(this.npm2.getText().equals("")){
            pembayaranspp.setMahasiswa(mahasiswa);
        }
        Bank_90490 bank=new Bank_90490();
        bank.setId_Bank(Integer.parseInt(this.idbank.getText()));
        bank.setNama_Bank(this.Namabank.getText());
        pembayaranspp.setBank(bank); 
        if(this.idbank.getText().equals("")){
            pembayaranspp.setBank(bank);
        }
        
        this.transaksi.simpanTransaksi(pembayaranspp);
        this.showTablePembayaranSpp();
        } catch (SQLException ex) {
            System.out.println(ex);
        }    
    }//GEN-LAST:event_BsimpanActionPerformed

    private void BcariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BcariActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BcariActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Transaksiview().setVisible(true);
            }
        });
    }
    public void showTabel(){
        DefaultTableModel dtmTabel = new DefaultTableModel (new String[]{"Id Spp", "NPM", "Nama", "Tanggal", "Nominal", "Status"},0);
        dtmTabel.setRowCount(0);
        
        for(Pembayaran_Spp_90490 m : this.arrSpp){
            dtmTabel.addRow(new String [] {m.getId_Spp().toString(),m.getMahasiswa().getNpm_Mahasiswa().toString(),m.getMahasiswa().getNama_Mahasiswa().toString(),m.getTanggal_Spp().toString(),m.getNominal_Spp().toString(),m.getKonfirmasi().toString()});
        }
        this.Table.setModel(dtmTabel);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Alamat;
    private javax.swing.JButton Bcari;
    private javax.swing.JButton Bhapus;
    private javax.swing.JButton Bprint;
    private javax.swing.JButton Bsimpan;
    private javax.swing.JButton Btambah;
    private javax.swing.JTextField Namabank;
    private javax.swing.JTable Table;
    private javax.swing.JTextField bulan;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JTextField denda;
    private javax.swing.JTextField idbank;
    private javax.swing.JTextField idspp;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jenisk;
    private javax.swing.JTextField nama;
    private javax.swing.JTextField nominal;
    private javax.swing.JTextField npm1;
    private javax.swing.JTextField npm2;
    private javax.swing.JTextField status;
    private javax.swing.JTextField tanggal;
    private javax.swing.JTextArea tbj;
    // End of variables declaration//GEN-END:variables
}
