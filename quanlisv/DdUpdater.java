/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quanlisv;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author virus
 */
public class DdUpdater {
    public boolean update(String ten_mh, String ma_lop_hoc, int maso_sv, String ten_sv, int tuan_nghi){
        try {
            String sql="UPDATE dangki SET tuan_nghi='"+tuan_nghi+"' WHERE (ten_mh='"+ten_mh+"' AND ma_lop_hoc='"+ma_lop_hoc+"' AND maso_sv='"+maso_sv+"' AND ten_sv='"+ten_sv+"')";
            Connection con=MySQLConnect.connectDB();
            Statement stm=con.prepareStatement(sql);
            stm.execute(sql);
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(DdUpdater.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    public boolean add(String ten_mh, String ma_lop_hoc, int maso_sv, String ten_sv, int tuan_nghi){
        try {
            String sql="INSERT INTO dangki(ten_mh,ma_lop_hoc,maso_sv,ten_sv,tuan_nghi) VALUES('"+ten_mh+"','"+ma_lop_hoc+"','"+maso_sv+"','"+ten_sv+"','"+tuan_nghi+"')";
            Connection con=MySQLConnect.connectDB();
            Statement stm=con.prepareStatement(sql);
            stm.execute(sql);
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(DdUpdater.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
}
