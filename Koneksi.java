/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Koneksi {

    private Connection connect;
    private Statement db;
    private String database = "risaldi_90490";
    
    public Koneksi(){
        try{
            Class.forName("oracle.jdbc.driver.OracleDriver");
            System.out.println("Class Driver Ditemukan");
                try{
                    connect = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","risaldi_90490","risaldi");
                    System.out.println("Koneksi Database Sukses");
                }catch(SQLException se){
                    System.out.println("Koneksi Database Gagal : "+se);
                }
        }catch(ClassNotFoundException err){
            System.out.println("Class Driver Tidak Ditemukan, Terjadi Kesalahan Pada : "+err);
        }
    }
    public ResultSet GetData(String sql){
        try{
            db = connect.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
            return db.executeQuery(sql);
        }catch(SQLException e){
            return null;
        }
    }
    
    public int ManipulasiData(String sql){
        try{
            db = connect.createStatement();
            return db.executeUpdate(sql);
        }catch(SQLException e){
            return 0;
        }
    }
}
