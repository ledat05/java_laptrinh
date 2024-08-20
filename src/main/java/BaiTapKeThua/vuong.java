/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BaiTapKeThua;

/**
 *
 * @author Admin
 */
public class vuong extends chunhat {
    public vuong(double canh){
        super(canh, canh);
    }

    @Override
    public void xuat(){
        System.out.println("Hinh vuong = canh:"+super.dai+",dien tich:"+super.getdientich()+",Chu vi:"+super.getchuvi());
    }
    
}
