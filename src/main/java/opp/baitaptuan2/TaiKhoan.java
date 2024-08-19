
public class TaiKhoan {
    private String id;
    private String name;
    private int  blance;

    public TaiKhoan(String id, String name, int blance) {
        this.id = id;
        this.name = name;
        this.blance = blance;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getBlance() {
        return blance;
    }
    
    public void naptien(int amount){
        blance +=amount;
    }
    public void ruttien(int amount){
        if(blance>=amount)
        {
            blance -=amount;
        }else
        {
            System.out.println("Giao dich that bai!");
        }
    }
}
