/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Hinhtron;

/**
 *
 * @author ADMIN
 */
public class hinhtron {
    private double bankinh;

    public hinhtron() {
    }
    

    public hinhtron(double bankinh) {
        this.bankinh = bankinh;
    }

    public double getBankinh() {
        return bankinh;
    }

    public void setBankinh(double bankinh) {
        this.bankinh = bankinh;
    }
    public double tinhChuVi(){
        return Math.PI*bankinh*bankinh;
    }
    public double tinhDienTich(){
        return Math.PI*2*bankinh;
    }

    @Override
    public String toString() {
        return "hinhtron{" + "bankinh=" + bankinh + '}';
    }
    
}
