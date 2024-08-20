/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BaiTapKeThua_SinhVien;

/**
 *
 * @author Admin
 */
public class ChuongTrinh2_btkethua_sinhvien {
    public static void main(String[] agrs){
       SinhVienIT svit = new SinhVienIT("Le Van Thanh Dat","Cong nghe thong tin",7.5,8.0,6.5);
        svit.xuat();
        
        SinhVienBiz svbiz = new SinhVienBiz("Thanh Tu","Maketing",8.0,9.0);
        svbiz.xuat();
    }
}
