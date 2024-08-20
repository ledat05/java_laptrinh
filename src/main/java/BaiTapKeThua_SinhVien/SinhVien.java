/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BaiTapKeThua_SinhVien;

/**
 *
 * @author Admin
 */
public abstract class SinhVien {

    private String hoten;
    private String nganh;

    public SinhVien(String hoten, String nganh) {
        this.hoten = hoten;
        this.nganh = nganh;
    }

    abstract public double getdiem();

    public String gethocluc() {
        String kq = "";
        double dtb = getdiem();
        if (dtb < 5) {
            kq = "yeu";
        } else if (dtb > 5 && dtb < 6.5) {
            kq = "trung binh";
        } else if (dtb > 6.5 && dtb < 7.5) {
            kq = "Kha";
        } else if (dtb > 7.5 && dtb < 9) {
            kq = "Gioi";
        } else {
            kq = "Xuat sac";
        }
        return kq;
    }

    public void xuat() {
        System.out.println("SinhVien:Hoten:" + hoten + ",Nganh:" + nganh + ",Diem:" + getdiem() + ",Hoc luc:" + gethocluc());
    }
}
