/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Hinhtron;

/**
 *
 * @author ADMIN
 */
public class ChuongTrinhHinhTron {

    public static void main(String[] agrs) {
        hinhtron Htr = new hinhtron(5);
        System.out.println("Hình Tròn:Bán kinh:" + Htr.getBankinh() + Htr.getBankinh() + ",Dien Tich:" + Htr.tinhDienTich() + ",Chu Vi:" + Htr.tinhChuVi());
        hinhtru Htru = new hinhtru(3, 5);
        System.out.println("Hình Trụ:Bán kinh:" + Htru.getBankinh() + Htru.getChieucao() + ",Dien Tich:" + Htru.tinhDienTich() + ",the tich:" + Htru.tinhthetich());
    }
}
