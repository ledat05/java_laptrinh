/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QLySinhVien;

/**
 *
 * @author Admin
 */
public class Qlythisinh {

    private String sobaodanh;
    private String Hoten;
    private String diachi;
    private int mucuutien;

    public Qlythisinh(String sobaodanh, String Hoten, String diachi, int mucuutien) {
        this.sobaodanh = sobaodanh;
        this.Hoten = Hoten;
        this.diachi = diachi;
        this.mucuutien = mucuutien;
    }

    public String getSobaodanh() {
        return sobaodanh;
    }

    public String getHoten() {
        return Hoten;
    }

    public String getDiachi() {
        return diachi;
    }

    public int getMucuutien() {
        return mucuutien;
    }

    public void hienthithongtin() {
        System.out.println("So Bao danh:" + sobaodanh + "Ho ten:" + Hoten + "Dia chi:" + diachi + "Muc Uu Tien:" + mucuutien);
    }

}
