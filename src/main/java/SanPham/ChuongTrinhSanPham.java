package SanPham;

import java.util.ArrayList;
import java.util.Scanner;
public class ChuongTrinhSanPham {
    public static ArrayList<SanPham> ds;
    public static void main (String[] args){
        menu();
    } 
    private static void menu(){
        int chon;
        Scanner sc=new Scanner(System.in);
        do{
            System.out.println("-------- CHƯƠNG TRÌNH QUẢN LÝ SẢN PHẨM --------");
            System.out.println("1.Nhập danh sach san pham:");
            System.out.println("2.Xuat danh sach san pham:");
            System.out.println("3.Sap xep danh sach san pham");
            System.out.println("4.Xoa san pham theo ten");
            System.out.println("5.Tinh gia trung binh cua cac san pham");
            System.out.println("0.Thoat");
            System.out.println("-----------------------------------------------");
            System.out.println("Chọn chức năng(0-->5):");
            chon=sc.nextInt();
                    switch(chon){
                        case 1:
                            nhap();
                            break;
                        case 2:
                            xuat();
                            break;
                        case 3 :
                            sapxep();
                            break;
                        case 4 :
                            xoa();
                            break;
                        case 5 :
                            xuatgiaTb();
                            break;
                        case 0 :
                            break;
                        default:
                            System.out.println("Tạm biệt,Hẹn gặp lại vào thời gian gần nhất");
                    }
        }while(chon !=0);
    }
        private static void nhap() {
        Scanner sc = new Scanner(System.in);
        String chon = "";
        do {
            System.out.println("Nhap thong tin san pham:");
            System.out.print("Ten: ");
            String TenSp = sc.nextLine();
            System.out.print("Gia: ");
            double Gia = Double.parseDouble(sc.nextLine());

            // Thêm sản phẩm mới vào danh sách
            SanPham sp = new SanPham(TenSp, Gia);
             ds.add(sp);

            System.out.print("Tiep tuc(y/n): ");
            chon = sc.nextLine();
        } while (chon.equalsIgnoreCase("y"));
    }

        private static void xuat() {
        System.out.println("Danh sách sản phẩm:");
        for (SanPham sp : ds) {
            System.out.println(sp);
        }
    }
    private static void sapxep(){
        
    }
    private static void xoa(){
        
    }
    private static void xuatgiaTb(){
        
    }
}
