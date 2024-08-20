/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BaiTapKeThua_SinhVien;

/**
 *
 * @author Admin
 */
public class SinhVienIT extends SinhVien{
    private double diemjava;
    private double diemcss;
    private double diemhtml;

    public SinhVienIT(String hoten, double diemjava, double diemcss, double diemhtml) {
        super(hoten,"IT");
        this.diemjava = diemjava;
        this.diemcss = diemcss;
        this.diemhtml = diemhtml;
    }

    @Override
    public double getdiem(){
        return(2*diemjava+diemhtml+diemcss)/4;
    }
}
