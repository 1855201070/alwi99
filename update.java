/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataBaseUAS;

import javax.swing.JOptionPane;

/**
 *
 * @author Alwi
 */
public class update {

    Koneksi konek = new Koneksi();

    public void update(int nis,int tahunmasuk,String tingkatpendidikan, String nama, String alamat,String WaliSantri, String jk) {

        try {
            konek.koneksi();
            java.sql.Statement statement = konek.con.createStatement();

            String sql_nama = "update identitassantri set nama = '" + nama + "'where nis = '" + nis + "'";
            String sql_alamat = "update identitassantri set alamat = '" + alamat + "'where nis = '" + nis + "'";
            String sql_walisantri = "update identitassantri set walisantri = '" + WaliSantri + "'where nis = '" + nis + "'";
            String sql_jk = "update identitassantri set jeniskelamin = '" + jk + "'where nis = '" + nis + "'";
            String sql_tingkatpendidikan = "update identitassantri set tingkatpendidikan = '" + tingkatpendidikan + "'where nis = '" + nis + "'";
            String sql_tahunmasuk = "update identitas santri set tahunmasuk = '" + tahunmasuk + "'where nis = '" + nis + "'";
            String sql_nis1 = "update identitassantri set nis = '" + nis + "'where nama = '" + nama + "'";
            String sql_nis2 = "update identitassantri set nis = '" + nis + "'where alamat = '" + alamat + "'";

            statement.executeUpdate(sql_nis1);
            statement.executeUpdate(sql_nis2);
            statement.executeUpdate(sql_nama);
            statement.executeUpdate(sql_alamat);
            statement.executeUpdate(sql_jk);
            statement.executeUpdate(sql_walisantri);
            statement.executeUpdate(sql_tahunmasuk);
            statement.executeUpdate(sql_tingkatpendidikan);
            statement.close();

            JOptionPane.showMessageDialog(null, "Berhasil Diubah");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }
}
