package quanlisv;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author virus
 */
public class DssvUpdater {
    //ADD data
    public boolean add(int id, String name, Date date, String sex){
        String sql="INSERT INTO sinhvien(maso_sv,ten_sv,ngay_sinh,gioi_tinh) VALUES('"+id+"','"+name+"','"+date+"','"+sex+"')";
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
    
    //retrieve  data 
    
    //update data
    public boolean update(int id, String name, String date, String sex){
        String sql="UPDATE sinhvien SET ten_sv='"+name+"', ngay_sinh='"+date+"', gioi_tinh='"+sex+"' WHERE maso_sv='"+id+"'";
        Connection con;
        try {
            con = MySQLConnect.connectDB();
            Statement stm=con.prepareStatement(sql);
            stm.execute(sql);
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(DssvUpdater.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }      
    }
    
    //delete data
    public boolean delete(int id){
        String sql="DELETE FROM sinhvien WHERE maso_sv='"+id+"'";
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
