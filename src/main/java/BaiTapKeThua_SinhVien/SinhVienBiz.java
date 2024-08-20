/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BaiTapKeThua_SinhVien;

/**
 *
 * @author Admin
 */
public class SinhVienBiz extends SinhVien {
    private double diemmaketing;
    private double diemSales;

    public SinhVienBiz(String hoten, double diemmaketing, double diemSales) {
        super(hoten,"IT");
        this.diemmaketing = diemmaketing;
        this.diemSales = diemSales;
    }
    
    public double getdiem(){
        return(2*diemmaketing+diemSales)/3;
    }
}
