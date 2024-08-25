package BaiTapKeThua_SinhVien;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class ChuongTrinh2_btkethua_sinhvien {

    public static void main(String[] args) {
        ArrayList<SinhVien> DanhSachSinhVien = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int luaChon;
        do {
            System.out.println("--------DANH SACH SINH VIEN--------");
            System.out.println("1. Nhap danh sach sinh vien");
            System.out.println("2. Xuat thong tin danh sach sinh vien");
            System.out.println("3. Xuat danh sach sinh vien co hoc luc gioi");
            System.out.println("4. Sap xep danh sach sinh vien theo diem");
            System.out.println("5. Ket thuc");
            System.out.print("Chon chuc nang: ");
            luaChon = sc.nextInt();
            sc.nextLine();
            switch (luaChon) {
                case 1:
                    NhapDanhSachSinhVien(DanhSachSinhVien, sc);
                    break;
                case 2:
                    XuatDanhSachSinhVien(DanhSachSinhVien);
                    break;
                case 3:
                    XuatSinhVienGioi(DanhSachSinhVien);
                    break;
                case 4:
                    SapXepSinhVienTheoDiem(DanhSachSinhVien);
                    break;
                case 5:
                    System.out.println("Kết thúc chương trình.");
                    break;
                default:
                    System.out.println("Chức năng không hợp lệ!");
            }
        } while (luaChon != 5);
    }

    public static void NhapDanhSachSinhVien(ArrayList<SinhVien> DanhSach, Scanner sc) {
        System.out.print("Nhap so luong sinh vien: ");
        int soluong = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < soluong; i++) {
            System.out.println("Nhap thong tin sinh vien thu " + (i + 1) + ":");
            System.out.print("Ho ten: ");
            String hoten = sc.nextLine();

            System.out.println("Chon nganh:");
            System.out.println("1. IT");
            System.out.println("2. Biz");
            int nganh = sc.nextInt();

            if (nganh == 1) {
                System.out.print("Diem Java: ");
                double diemjava = sc.nextDouble();
                System.out.print("Diem CSS: ");
                double diemcss = sc.nextDouble();
                System.out.print("Diem HTML: ");
                double diemhtml = sc.nextDouble();
                sc.nextLine();
                DanhSach.add(new SinhVienIT(hoten, diemjava, diemcss, diemhtml));
            } else if (nganh == 2) {
                System.out.print("Diem Marketing: ");
                double diemmaketing = sc.nextDouble();
                System.out.print("Diem Sales: ");
                double diemSales = sc.nextDouble();
                sc.nextLine();
                DanhSach.add(new SinhVienBiz(hoten, diemmaketing, diemSales));
            } else {
                System.out.println("Nganh khong hop le!");
            }
        }
    }

    public static void XuatDanhSachSinhVien(ArrayList<SinhVien> danhSach) {
        System.out.println("Danh sach sinh vien:");
        for (SinhVien sv : danhSach) {
            sv.xuat();
        }
    }

    public static void XuatSinhVienGioi(ArrayList<SinhVien> danhSach) {
        System.out.println("Danh sach sinh vien co học lực gioi:");
        for (SinhVien sv : danhSach) {
            if (sv.gethocluc().equals("Gioi")) {
                sv.xuat();
            } else {
                System.out.println("Khong co hoc sinh hoc luc gioi");
            }
        }
    }

    public static void SapXepSinhVienTheoDiem(ArrayList<SinhVien> danhSach) {
        Collections.sort(danhSach, new Comparator<SinhVien>() {
            @Override
            public int compare(SinhVien sv1, SinhVien sv2) {
                return Double.compare(sv2.getdiem(), sv1.getdiem());
            }
        });
        System.out.println("Danh sach sinh vien sau khi sap xep:");
        XuatDanhSachSinhVien(danhSach);
    }
}
