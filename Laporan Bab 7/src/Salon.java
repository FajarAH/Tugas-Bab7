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
    
}
