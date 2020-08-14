/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataBaseUAS;

import java.beans.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Alwi
 */
public class Insert {

    Koneksi konek = new Koneksi();

    public void insert(int nis, int tahunmasuk,String tingkatpendidikan, String nama, String WaliSantri, String alamat, String jk) {

        try {
            konek.koneksi();
            java.sql.Statement statement = konek.con.createStatement();
            String sql = "insert into identitassantri values('" + nis + "','" + tingkatpendidikan + "','" + tahunmasuk + "','" + nama + "','" + WaliSantri + "','" + alamat + "','"+ jk + "')";

            statement.executeUpdate(sql);
            statement.close();

            int insert = 0;
            JOptionPane.showConfirmDialog(null,"Apakah anda ingin menyimpan data tersebut?");
            if(insert == JOptionPane.YES_OPTION){
                JOptionPane.showMessageDialog(null, "Berhasil Disimpan");
            }else{
        }
          //  JOptionPane.showMessageDialog(null, "Berhasil Disimpan");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }
}
