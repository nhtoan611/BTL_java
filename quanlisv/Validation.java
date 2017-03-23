/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quanlisv;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author virus
 */
public class Validation {
    public boolean diem_validation(float a){
        boolean stt=false;
        if(a>=0&&a<=10){
            stt=true;
        }
        return stt;
    }
    public boolean mssv_validation(int a){
        boolean stt=false;
        if(a>0&&a<=10000){
            stt=true;
        }
        return stt;
    }
    public boolean tensv_validation(String a){
        boolean stt=false;
        String name_pattern="^\\pL+[\\pL\\pZ\\pP]{0,}$";
        
        Pattern pattern=Pattern.compile(name_pattern);
        Matcher matcher=pattern.matcher(a);
        if(matcher.matches()){
            stt=true;
        }
        else{
            stt=false;
        }
        return stt;
    }
    public boolean sex_validation(String a){
        boolean stt=false;
        if(a.equals("nam")||a.equals("nu")||a.equals("nữ")||a.equals("Nam")||a.equals("Nu")||a.equals("Nữ")){
            stt=true;
        }
        return stt;
    }
    public boolean date_vvalidation(String a){
        boolean stt=false;
        String name_pattern="^\\d{4}-\\d{2}-\\d{2}$";
        
        Pattern pattern=Pattern.compile(name_pattern);
        Matcher matcher=pattern.matcher(a);
        if(matcher.matches()){
            stt=true;
        }
        else{
            stt=false;
        }
        return stt;
    }
    public boolean tuan_validation(int a){
        boolean stt=false;
        if(a>0&&a<=30){
            stt=true;
        }
        return stt;
    }
    public boolean tuanss_validation(int a, int b){
        boolean stt=false;
        if(a<b&&b>0&&b<=30){
            stt=true;
        }
        return stt;
    }
    public boolean mlh_validation(String a){
        boolean stt=false;
        String name_pattern="^\\d{3}$";
        
        Pattern pattern=Pattern.compile(name_pattern);
        Matcher matcher=pattern.matcher(a);
        if(matcher.matches()){
            stt=true;
        }
        else{
            stt=false;
        }
        return stt;
    }
}
