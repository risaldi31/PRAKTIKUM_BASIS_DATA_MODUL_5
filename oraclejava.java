/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oraclejava;

import database.Koneksi;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import view.Transaksiview;

public class oraclejava {
    public static void main(String[] args){
        new Transaksiview().show();
    }
}
