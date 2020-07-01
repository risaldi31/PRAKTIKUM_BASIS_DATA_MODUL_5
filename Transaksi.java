/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import database.Koneksi;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.*;
import model.Bank_90490;
import model.Mahasiswa_90490;
import model.Pembayaran_Spp_90490;

/**
 *
 * @author Risaldi
 */
public class Transaksi {
    Koneksi koneksi;
    ArrayList<Mahasiswa_90490> arrMahasiswa;
    ArrayList<Bank_90490> arrBank;
    ArrayList<Pembayaran_Spp_90490> arrSpp;
    
    public Transaksi(){
        this.koneksi = new Koneksi();
        this.arrMahasiswa = new ArrayList<>();
        this.arrBank = new ArrayList<>();
        this.arrSpp = new ArrayList<>();
    }
    public ArrayList<Mahasiswa_90490> getDataMahasiswa() throws SQLException{
        this.arrMahasiswa.clear();
        ResultSet rs = this.koneksi.GetData("select * from mahasiswa_90490 ");
        while(rs.next()){
            Mahasiswa_90490 mahasiswa = new Mahasiswa_90490();
            mahasiswa.setNpm_Mahasiswa(rs.getInt("Npm_Mahasiswa"));
            mahasiswa.setNama_Mahasiswa(rs.getString("Nama_Mahasiswa"));
            mahasiswa.setJenis_Kelamin(rs.getString("Jenis_Kelamin_Mahasiswa"));
            mahasiswa.setAlamat(rs.getString("Alamat_Mahasiswa"));
            this.arrMahasiswa.add(mahasiswa);
        }
        return this.arrMahasiswa;
    }
    public ArrayList<Bank_90490> getDataBank() throws SQLException{
        this.arrBank.clear();
        ResultSet rs = this.koneksi.GetData("select * from bank_90490 ");
        while(rs.next()){
            Bank_90490 bank = new Bank_90490();
            bank.setId_Bank(rs.getInt("Id_Bank"));
            bank.setNama_Bank(rs.getString("Nama_Bank"));
            this.arrBank.add(bank);
        }
        return this.arrBank;
    }
    public ArrayList<Pembayaran_Spp_90490> getDataPembayaran() throws SQLException{
        this.arrSpp.clear();
        ResultSet rs = this.koneksi.GetData("select a.npm_mahasiswa, a.nama_mahasiswa, b.id_spp, b.tanggal_spp, b.npm90490_nominal_spp, b.konfirmasi_pembayaran_spp from mahasiswa_90490 a join pembayaran_spp_90490 b on a.npm_mahasiswa = b.npm_mahasiswa ");
        while(rs.next()){
            Mahasiswa_90490 mahasiswa = new Mahasiswa_90490();
            mahasiswa.setNpm_Mahasiswa(rs.getInt("Npm_Mahasiswa"));
            mahasiswa.setNama_Mahasiswa(rs.getString("Nama_Mahasiswa"));
            mahasiswa.setJenis_Kelamin(rs.getString("Jenis_Kelamin_Mahasiswa"));
            mahasiswa.setAlamat(rs.getString("Alamat_Mahasiswa"));
            
            Bank_90490 bank = new Bank_90490();
            bank.setId_Bank(rs.getInt("Id_Bank"));
            bank.setNama_Bank(rs.getString("Nama_Bank"));
            
            Pembayaran_Spp_90490 spp = new Pembayaran_Spp_90490();
            spp.setId_Spp(rs.getInt("Id_Spp"));
            spp.setMahasiswa(mahasiswa);
            spp.setBank(bank);
            spp.setTanggal_Spp(rs.getDate("Tanggal_Spp"));
            spp.setBulan_Spp(rs.getInt("Bulan_Spp"));
            spp.setNominal_Spp(rs.getInt("Nominal_Spp"));
            spp.setDenda_Spp(rs.getInt("Denda_Spp"));
            spp.setKonfirmasi(rs.getString("Konfirmasi_Pembayaran_Spp"));
            this.arrSpp.add(spp);
        }
        return this.arrSpp;
    }
    
    public ArrayList<Mahasiswa_90490> getDataJoin() throws SQLException{
        this.arrMahasiswa.clear();
        ResultSet rs = this.koneksi.GetData("SELECT * from MAHASISWA JOIN MENYIMPAN on MAHASISWA.Npm_Mahasiswa = MENYIMPAN.Npm_Mahasiswa");
        
        while(rs.next()){
            Mahasiswa_90490 M= new Mahasiswa_90490();
            M.setNpm_Mahasiswa(rs.getInt("Npm_Mahasiswa"));
            M.setNama_Mahasiswa(rs.getString("Nama_Mahasiswa"));
            
            Bank_90490 B=new Bank_90490();
            B.setId_Bank(rs.getInt("Id_Bank"));
            B.setNama_Bank(rs.getString("Nama_Bank"));
            this.arrMahasiswa.add(M);
        }
        
        return arrMahasiswa;
    }
    
    public void tambahTransaksi(Bank_90490 Bank) {
        this.koneksi.ManipulasiData("INSERT INTO Bank_90490\n"
                + "(Id_Bank, Nama_Bank)\n"
                + " VALUES('"+Bank.getId_Bank()+ "', '" + Bank.getNama_Bank()+ ")");

    }
    
    public void deleteTransaksi(Pembayaran_Spp_90490 Pembayaran) throws SQLException{
        this.koneksi.ManipulasiData("DELETE * FROM ADMIN Where Id_Spp='"+Pembayaran.getId_Spp()+"' ");
        
    }
    
    public void insertTransaksi(Pembayaran_Spp_90490 P) {
        this.koneksi.ManipulasiData("INSERT INTO PembayaranSpp_90940\n"
                + "(Id_SPP, Npm_Mahasiswa, Id_Bank, Tanggal_Spp, Bulan_Spp, Nominal_Spp, Denda_Spp, Konfirmasi_Pembayaran_Spp)\n"
                + " VALUES('"+ P.getId_Spp() + "', '" + P.getMahasiswa() + "', '" + P.getBank() + "', '"+ P.getTanggal_Spp() + "', '"+ P.getBulan_Spp() +"', '"+ P.getNominal_Spp() + "', '"+ P.getDenda_Spp() +"', '"+ P.getKonfirmasi()+")");

    }
    
    public void simpanTransaksi(Pembayaran_Spp_90490 P) {
        this.koneksi.ManipulasiData("INSERT INTO PembayaranSpp_90940\n"
                + "(Id_SPP, Npm_Mahasiswa, Id_Bank, Tanggal_Spp, Bulan_Spp, Nominal_Spp, Denda_Spp, Konfirmasi_Pembayaran_Spp)\n"
                + " VALUES('"+ P.getId_Spp() + "', '" + P.getMahasiswa() + "', '" + P.getBank() + "', '"+ P.getTanggal_Spp() + "', '"+ P.getBulan_Spp() +"', '"+ P.getNominal_Spp() + "', '"+ P.getDenda_Spp() +"', '"+ P.getKonfirmasi()+")");

    }
    
    public ArrayList<Pembayaran_Spp_90490> getViewDataBarang() throws SQLException{
        this.arrSpp.clear();
        ResultSet rs = this.koneksi.GetData("SELECT * from Id_Spp");
        
        while(rs.next()){
            Pembayaran_Spp_90490 P= new Pembayaran_Spp_90490();
            P.setId_Spp(rs.getInt("Id_barang"));
            P.setNominal_Spp(rs.getInt("Nominal_Spp"));
            P.setDenda_Spp(rs.getInt("Denda_Spp"));
            this.arrSpp.add(P);
        }
        
        return arrSpp;
    }

  }
