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
     public void displayJasa() {
        System.out.println("=====================================================");
        System.out.println("\t DAFTAR LAYANAN SALON FORZA");
        System.out.println("=====================================================");
        System.out.printf("|%-5s |%-30s |%-11s | \n", "No", "LAYANAN", "Harga");
        System.out.println("=====================================================");
        System.out.printf("|%-5s |%-30s |%10s | \n", "1", "CREAMBATH ", "Rp.  50.000");
        System.out.printf("|%-5s |%-30s |%10s | \n", "2", "POTONG", "Rp.  25.000");
        System.out.printf("|%-5s |%-30s |%10s | \n", "3", "LULUR", "Rp. 100.000");
        System.out.println("=====================================================");
    }
    public void displayProduk() {
        System.out.println("=====================================================");
        System.out.println("\t DAFTAR PRODUK SALON FORZA");
        System.out.println("=====================================================");
        System.out.printf("|%-5s |%-30s |%-11s | \n", "No", "PRODUK", "Harga");
        System.out.println("=====================================================");
        System.out.printf("|%-5s |%-30s |%10s | \n", "1", "SHAMPOO ", "Rp.  20.000");
        System.out.printf("|%-5s |%-30s |%10s | \n", "2", "SABUN", "Rp.  15.000");
        System.out.printf("|%-5s |%-30s |%10s | \n", "3", "MASKER", "Rp.  18.000");
        System.out.println("=====================================================");
    }
}
