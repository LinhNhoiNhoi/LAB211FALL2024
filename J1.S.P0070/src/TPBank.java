/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Admin
 */
public class TPBank {
    String AccNum;
    String Password;
    String Capcha;

    public TPBank() {
    }

    public TPBank(String AccNum, String Password, String Capcha) {
        this.AccNum = AccNum;
        this.Password = Password;
        this.Capcha = Capcha;
    }

    public String getAccNum() {
        return AccNum;
    }

    public void setAccNum(String AccNum) {
        this.AccNum = AccNum;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    public String getCapcha() {
        return Capcha;
    }

    public void setCapcha(String Capcha) {
        this.Capcha = Capcha;
    }

    @Override
    public String toString() {
        return  "AccNum=" + AccNum + ", Password=" + Password + ", Capcha=" + Capcha ;
    }
    
    
}
