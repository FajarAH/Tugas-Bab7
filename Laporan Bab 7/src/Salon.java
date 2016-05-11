public abstract class Salon {
      private String nama;
    private double totaljasa;
    private double totalproduk;
    private double creambath = 50000;
    private double potong = 25000;
    private double lulur = 100000;
    private double shampoo = 20000;
    private double sabun = 15000;
    private double masker = 18000;
    public Salon(String nama) {
        this.nama = nama;
    }
    public abstract void totalJasa(int pil);
    public abstract void totalProduk(int pil, int banyak);
    public String getNama() {
        return nama;
    }
    public double getJasa() {
        return totaljasa;
    }
    public double getProduk() {
        return totalproduk;
    }
    public void setCreambath(double c) {
        creambath = c;
    }
    public void setPotong(double p) {
        potong = p;
    }
    public void setLulur(double l) {
        lulur = l;
    }
    public void setShampoo(double s) {
        shampoo = s;
    }
    public void setSabun(double sb) {
        sabun = sb;
    }
    public void setMasker(double m) {
        masker = m;
    }
    public double getCreambath() {
        return creambath;
    }
    public double getPotong() {
        return potong;
    }
    public double getLulur() {
        return lulur;
    }
    public double getShampoo() {
        return shampoo;
    }
    public double getSabun() {
        return sabun;
    }
    public double getMasker() {
        return masker;
    }
    
}
