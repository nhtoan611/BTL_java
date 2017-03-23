/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quanlisv;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.AbstractAction.*;
/**
 *
 * @author virus
 */
public class DsmhUpdater {
    public boolean add(int ma_mh, String ten_mh,String ma_lop_hoc, String dia_diem, int tuan_bat_dau, int tuan_ket_thuc){
        String sql="INSERT INTO monhoc(ma_mh,ten_mh,ma_lop_hoc,dia_diem,tuan_bat_dau,tuan_ket_thuc) VALUES('"+ma_mh+"','"+ten_mh+"','"+ma_lop_hoc+"','"+dia_diem+"','"+tuan_bat_dau+"','"+tuan_ket_thuc+"')";
        try {
            Connection con=MySQLConnect.connectDB();
            Statement stm=con.prepareStatement(sql);
            stm.execute(sql);
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(DsmhUpdater.class.getName()).log(Level.SEVERE, null, ex);      
        }
        return false;
    }
    
    public boolean update(int ma_mh, String ten_mh, String ma_lop_hoc, String dia_diem, int tuan_bat_dau, int tuan_ket_thuc){
        String sql="UPDATE monhoc SET ten_mh='"+ten_mh+"', ma_mh='"+ma_mh+"', dia_diem='"+dia_diem+"', tu"
                + "an_bat_dau='"+tuan_bat_dau+"', tuan_ket_thuc='"+tuan_ket_thuc+"' WHERE ma_lop_hoc='"+ma_lop_hoc+"'";
        try {
            Connection con=MySQLConnect.connectDB();
            Statement stm=con.prepareStatement(sql);
            stm.execute(sql);
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(DsmhUpdater.class.getName()).log(Level.SEVERE, null, ex); 
            return  false;
        }  
    }
    
    public boolean delete(int ma_mh){
        String sql="DELETE FROM monhoc WHERE ma_mh='"+ma_mh+"'";
        try {
            Connection con=MySQLConnect.connectDB();
            Statement stm=con.prepareStatement(sql);
            stm.execute(sql);
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(DssvUpdater.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
}
