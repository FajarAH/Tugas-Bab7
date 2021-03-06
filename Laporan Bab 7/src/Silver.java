
public class Silver extends Salon {
     private double hargaJasa;
    private double totalJasa;
    private double hargaProduk;
    private double totalProduk;
      public Silver(String nama) {
        super(nama);
    }
         @Override
    public void totalJasa(int pil) {
        if (pil == 1) {
            double c = super.getCreambath() - (super.getCreambath() * 0.1);
            hargaJasa = c;
            super.setCreambath(c);
        } else if (pil == 2) {
            double p = super.getPotong() - (super.getPotong() * 0.1);
            hargaJasa = p;
            super.setPotong(p);
        } else if (pil ==3) {
            double l = super.getLulur() - (super.getLulur() * 0.1);
            hargaJasa = l;
            super.setLulur(l);
        }
        totalJasa += hargaJasa;
    }
    @Override
    public void totalProduk(int pil, int banyak) {
        if (pil == 1) {
            double s = super.getShampoo();
            hargaProduk = s;
        } else if (pil == 2) {
            double sb = super.getSabun();
            hargaProduk = sb;
        } else if(pil == 3) {
            double m = super.getMasker();
            hargaProduk = m;
        }
        hargaProduk = hargaProduk * banyak;
        totalProduk += hargaProduk;
    }
    public void totalHarga() {
        double total = totalJasa + (totalProduk - (totalProduk * 0.1));
        System.out.println("=========================================");
        System.out.println("Nama Pelanggan\t\t: " + super.getNama());
        System.out.println("Jenis Anggota\t\t: Silver");
        System.out.println("Total Harga Jasa\t: Rp. " + totalJasa);
        System.out.println("Total Harga Produk\t: Rp. " + totalProduk);
        System.out.println("-----------------------------------------");
        System.out.println("Harga total + diskon\t: Rp. " + total);
        System.out.println("=========================================");
    }
}
