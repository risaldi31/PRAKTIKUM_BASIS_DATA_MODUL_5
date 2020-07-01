/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Risaldi
 */
public class Mahasiswa_90490 {
    private Integer Npm_Mahasiswa;
    private String Nama_Mahasiswa;
    private String Jenis_Kelamin_Mahasiswa;
    private String Alamat_Mahasiswa;
    
    public void setNpm_Mahasiswa(Integer Npm_Mahasiswa){
        this.Npm_Mahasiswa=Npm_Mahasiswa;
    }
    public Integer getNpm_Mahasiswa(){
        return Npm_Mahasiswa;
    }
    public void setNama_Mahasiswa(String Nama_Mahasiswa){
        this.Nama_Mahasiswa=Nama_Mahasiswa;
    }
    public String getNama_Mahasiswa(){
        return Nama_Mahasiswa;
    }
    public void setJenis_Kelamin(String Jenis_Kelamin_Mahasiswa){
        this.Jenis_Kelamin_Mahasiswa=Jenis_Kelamin_Mahasiswa;
    }
    public String getJenis_Kelamin(){
        return Jenis_Kelamin_Mahasiswa;
    }
    public void setAlamat(String Alamat_Mahasiswa){
        this.Alamat_Mahasiswa=Alamat_Mahasiswa;
    }
    public String getAlamat(){
        return Alamat_Mahasiswa;
    }
}
