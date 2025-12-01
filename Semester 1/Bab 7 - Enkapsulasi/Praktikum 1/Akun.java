public class Akun {
    private String ID;
    private String password;
    private String nama;
    private double saldo = 10000;
    
    Akun(String nama, String ID, String password) {
        this.nama = nama;
        this.ID = ID;
        this.password = password;
    }
    
    public void setID(String s) {
        ID = s;
    }
    
    public void setPassword(String s) {
        password = s;
    }
    
    public void setnama(String s) {
        nama = s;
    }
    
    public void setsaldo(double d) {
        saldo = d;
    }
    
    public String getID() {
        return ID;
    }
    
    public String getNama() {
        return nama;
    }
    
    public String getPassword() {
        return password;
    }
    
    public double getSaldo() {
        return saldo;
    }
    
}
