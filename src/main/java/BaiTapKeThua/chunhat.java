/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BaiTapKeThua;

/**
 *
 * @author Admin
 */
public class chunhat {
    private double rong;
    double dai;

    public chunhat(double rong, double dai) {
        this.rong = rong;
        this.dai = dai;
    }

    public double getRong() {
        return rong;
    }

    public void setRong(double rong) {
        this.rong = rong;
    }

    public double getDai() {
        return dai;
    }

    public void setDai(double dai) {
        this.dai = dai;
    }
    
    public double getchuvi(){
        return(dai+rong)*2;
    }
    public double getdientich(){
        return dai*rong;
    }
    public void xuat(){
        System.out.println("Hinh chu nhat = dai:"+dai+",rong:"+rong+",dien tich:"+getdientich()+",Chu vi:"+getchuvi());
    }
}
