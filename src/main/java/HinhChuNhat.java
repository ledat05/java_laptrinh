public class HinhChuNhat {
    private double chieudai;
    private double chieurong;
    
    public HinhChuNhat(){
    chieudai = 1;
    chieurong = 1;
    
    }

    public HinhChuNhat(double chieudai, double chieurong) {
        this.chieudai = chieudai;
        this.chieurong = chieurong;
    }

    public double getChieudai() {
        return chieudai;
    }

    public void setChieudai(double chieudai) {
        this.chieudai = chieudai;
    }

    public double getChieurong() {
        return chieurong;
    }

    public void setChieurong(double chieurong) {
        this.chieurong = chieurong;
    }
    public double tinhchuvi(){
        return (chieudai+chieurong)*2;
    }
    public double dientich(){
        return chieudai+chieurong;
    }

    @Override
    public String toString() {
        return "HinhChuNhat" + "chieudai=" + chieudai + ", chieurong=" + chieurong + " chu vi=" + tinhchuvi()+" dien tich+" + dientich() ;
    }    
}
    
