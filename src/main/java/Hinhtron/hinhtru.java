/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Hinhtron;

/**
 *
 * @author ADMIN
 */
public class hinhtru extends hinhtron {
    private double chieucao;
    
    public hinhtru(){
        super();
        chieucao=1.0;
    }

    public hinhtru(double chieucao, double bankinh) {
        super(bankinh);
        this.chieucao = chieucao;
    }

    public double getChieucao() {
        return chieucao;
    }

    public void setChieucao(double chieucao) {
        this.chieucao = chieucao;
    }
    
     public double tinhthetich(){
         return super.tinhDienTich()*chieucao;
     }
     public double tinhdienhtich(){
         return 2*super.tinhDienTich()+super.tinhChuVi()+chieucao;
     }
}
