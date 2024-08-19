package SanPham;


public class SanPham {
    private String TenSp;
    private Double Gia;

    public SanPham(String TenSp, Double Gia) {
        this.TenSp = TenSp;
        this.Gia = Gia;
    }

    public String getTenSp() {
        return TenSp;
    }

    public void setTenSp(String TenSp) {
        this.TenSp = TenSp;
    }

    public Double getGia() {
        return Gia;
    }

    public void setGia(Double Gia) {
        this.Gia = Gia;
    }
        // Method to display product information
    @Override
    public String toString() {
        return "SanPham{" + "ten='" + TenSp + '\'' + ", gia=" + Gia + '}';
    }
    
    
}
