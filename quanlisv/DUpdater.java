/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quanlisv;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
/**
 *
 * @author virus
 */
public class DUpdater {
//    public boolean add1(String ma_lop_hoc, int maso_sv, int sobuoinghi){
//        String sql="INSERT INTO dangki(so_buoi_nghi) VALUES('"+sobuoinghi+"') WHERE (ma_lop_hoc='"+ma_lop_hoc+"' AND maso_sv='"+maso_sv+"' AND tuan_nghi IS NULL)";
//        try {
//            Connection con=MySQLConnect.connectDB();
//            Statement stm=con.prepareStatement(sql);
//            stm.execute(sql);
//            return true;
//        } catch (SQLException ex) {
//            Logger.getLogger(DUpdater.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        
//        return false;
//    }
    public boolean  update(String ma_lop_hoc, int maso_sv, int sobuoinghi, float diem_giua_ki, float diem_cuoi_ki, float diem_tong_ket){
        String sql="UPDATE dangki SET so_buoi_nghi='"+sobuoinghi+"', diem_giua_ki='"+diem_giua_ki+"', diem_cuoi_ki='"+diem_cuoi_ki+"', diem_tong_ket='"+diem_tong_ket+"' WHERE (ma_lop_hoc='"+ma_lop_hoc+"' AND maso_sv='"+maso_sv+"' AND tuan_nghi IS NULL)";
        try {
            Connection con=MySQLConnect.connectDB();
            Statement stm=con.prepareStatement(sql);
            stm.execute(sql);
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(DUpdater.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
}
