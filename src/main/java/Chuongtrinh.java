import java.util.Scanner;
public class Chuongtrinh {
    public static void main(String[] args){
        HinhChuNhat hcn1;
        HinhChuNhat hcn2;
        
        hcn1= new HinhChuNhat();
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Cho biet chieu dai:");
        double dai=sc.nextDouble();
        System.out.println("cho biet chieu rong:");
        double rong=sc.nextDouble();
        
        hcn2=new HinhChuNhat(dai,rong);
        
        System.out.println("Thong tin hcn 1.");
        System.out.println("Dai:"+ hcn1.getChieudai()+"-rong:"+hcn1.getChieurong()+"-dientich:"+hcn1.dientich()+"- chuvi:"+hcn1.tinhchuvi());
        System.out.println("Thong tin hcn 2.");
         System.out.println("Dai:"+ hcn2.getChieudai()+"-rong:"+hcn2.getChieurong()+"-dientich:"+hcn2.dientich()+"- chuvi:"+hcn2.tinhchuvi());
    }
}
