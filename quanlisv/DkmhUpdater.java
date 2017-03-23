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
public class DkmhUpdater {
    public boolean add(String ten_mh, String ma_lop_hoc, int maso_sv, String ten_sv){
        String sql="INSERT INTO dangki(ten_mh,ma_lop_hoc,maso_sv,ten_sv) VALUES('"+ten_mh+"','"+ma_lop_hoc+"','"+maso_sv+"','"+ten_sv+"')";
        try {
            Connection con=MySQLConnect.connectDB();
            Statement stm=con.prepareStatement(sql);
            stm.execute(sql);
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(DkmhUpdater.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    public boolean delete(int maso_sv, String ma_lop_hoc){
        String sql="DELETE FROM dangki WHERE maso_sv='"+maso_sv+"' AND ma_lop_hoc='"+ma_lop_hoc+"'";
        Connection con;
        try {
            con = MySQLConnect.connectDB();
            Statement stm=con.prepareStatement(sql);
            stm.execute(sql);
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(DkmhUpdater.class.getName()).log(Level.SEVERE, null, ex);
        }
         
        return false;
    }
}
