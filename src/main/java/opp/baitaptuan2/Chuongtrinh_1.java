
public class Chuongtrinh_1 {

    public static void main(String[] args) {
        TaiKhoan you, me;

        you = new TaiKhoan("AC001", "Bành Thị Pu", 130000000);

        me = new TaiKhoan("AC002", "Trần văn Chải", 2000000000);

        System.out.println("--------THONG TIN TAI KHOAN BAN DAU--------");
        System.out.println("Tài Khoản Gốc: id:" + me.getId() + "-name:" + me.getName() + "-" + me.getBlance());
        System.out.println("Tài Khoản bạn: id:" + you.getId() + "-name:" + you.getName() + "-" + you.getBlance());

        me.naptien(1000000000);
        you.ruttien(20000000);

        System.out.println("Tài Khoản Gốc: id:" + me.getId() + "-name:" + me.getName() + "-" + me.getBlance());
        System.out.println("Tài Khoản bạn: id:" + you.getId() + "-name:" + you.getName() + "-" + you.getBlance());

        // me.tranferTo(you,1000000000);
    }
}
