import java.util.Scanner;
public class MainSalon {
     public static void main(String[] args) {
        int pil = 0, pilih = 0, pilihan = 0, pilJasa = 0, pilProduk = 0, banyak = 0;
        Scanner in = new Scanner(System.in);
        System.out.println("==============================================");
        System.out.println("\t Selamat Datang di Salon FORZA");
        System.out.println("==============================================");
        System.out.print("Masukkan Nama\t: ");
        String nama = in.nextLine();
        System.out.println("");
        do {
            System.out.println("Daftar Member");
            System.out.println("1. Premium");
            System.out.println("2. Gold");
            System.out.println("3. Silver");
            System.out.println("4. Non Member");
            System.out.print("Masukkan pilihan\t: ");
            pil = in.nextInt();
            if (pil != 1 && pil != 2 && pil != 3 && pil != 4) {
                System.out.println("Pilihan Tidak Tersedia");
            }
        } while (pil != 1 && pil != 2 && pil != 3 && pil != 4);
        switch (pil) {
            case 1:
                Salon pelanggan = new Premium(nama);
                do {
                    System.out.println("1. Jasa");
                    System.out.println("2. Produk");
                    System.out.print("Masukkan pilihan\t: ");
                    pilihan = in.nextInt();
                    if (pilihan == 1) {
                        pelanggan.displayJasa();
                        do {
                            System.out.print("Masukkan pilihan\t: ");
                            pilJasa = in.nextInt();
                            if (pilJasa != 1 && pilJasa != 2 && pilJasa != 3) {
                                System.out.println("Pilihan Tidak Tersedia");
                            }
                        } while (pilJasa != 1 && pilJasa != 2 && pilJasa != 3);
                        pelanggan.totalJasa(pilJasa);
                    } else if (pilihan == 2) {
                        pelanggan.displayProduk();
                        do {
                            System.out.print("Masukkan pilihan\t: ");
                            pilProduk = in.nextInt();
                            if (pilProduk != 1 && pilProduk != 2 && pilProduk != 3) {
                                System.out.println("Pilihan Tidak Tersedia");
                            }
                        } while (pilProduk != 1 && pilProduk != 2 && pilProduk != 3);
                        System.out.print("Masukkan jumlah\t: ");
                        banyak = in.nextInt();
                        pelanggan.totalProduk(pilProduk, banyak);
                    } else {
                        System.out.println("Pilihan Tidak Tersedia");
                    }
                    System.out.println("Ada perlu lagi?");
                    System.out.println("1. Ya");
                    System.out.println("2. No");
                    System.out.print("Masukkan pilihan\t: ");
                    pilih = in.nextInt();
                } while (pilih != 2 && pilih == 1);
                ((Premium) pelanggan).totalHarga();
                break;
            case 2:
                pelanggan = new Gold(nama);
                do {
                    System.out.println("1. Jasa");
                    System.out.println("2. Produk");
                    System.out.print("Masukkan pilihan\t: ");
                    pilihan = in.nextInt();
                    if (pilihan == 1) {
                        pelanggan.displayJasa();
                        do {
                            System.out.print("Masukkan pilihan\t: ");
                            pilJasa = in.nextInt();
                            if (pilJasa != 1 && pilJasa != 2 && pilJasa != 3) {
                                System.out.println("Pilihan Tidak Tersedia");
                            }
                        } while (pilJasa != 1 && pilJasa != 2 && pilJasa != 3);
                        pelanggan.totalJasa(pilJasa);
                    } else if (pilihan == 2) {
                        pelanggan.displayProduk();
                        do {
                            System.out.print("Masukkan pilihan\t: ");
                            pilProduk = in.nextInt();
                            if (pilProduk != 1 && pilProduk != 2 && pilProduk != 3) {
                                System.out.println("Pilihan Tidak Tersedia");
                            }
                        } while (pilProduk != 1 && pilProduk != 2 && pilProduk != 3);
                        System.out.print("Masukkan jumlah\t: ");
                        banyak = in.nextInt();
                        pelanggan.totalProduk(pilProduk, banyak);
                    } else {
                        System.out.println("Pilihan Tidak Tersedia");
                    }
                    System.out.println("Ada perlu lagi?");
                    System.out.println("1. Ya");
                    System.out.println("2. No");
                    System.out.print("Masukkan pilihan\t: ");
                    pilih = in.nextInt();
                } while (pilih != 2 && pilih == 1);
                ((Gold) pelanggan).totalHarga();
                break;
            case 3:
                pelanggan = new Silver(nama);
                do {
                    System.out.println("1. Jasa");
                    System.out.println("2. Produk");
                    System.out.print("Masukkan pilihan\t: ");
                    pilihan = in.nextInt();
                    if (pilihan == 1) {
                        pelanggan.displayJasa();
                        do {
                            System.out.print("Masukkan pilihan\t: ");
                            pilJasa = in.nextInt();
                            if (pilJasa != 1 && pilJasa != 2 && pilJasa != 3) {
                                System.out.println("Pilihan Tidak Tersedia");
                            }
                        } while (pilJasa != 1 && pilJasa != 2 && pilJasa != 3);
                        pelanggan.totalJasa(pilJasa);
                    } else if (pilihan == 2) {
                        pelanggan.displayProduk();
                        do {
                            System.out.print("Masukkan pilihan\t: ");
                            pilProduk = in.nextInt();
                            if (pilProduk != 1 && pilProduk != 2 && pilProduk != 3) {
                                System.out.println("Pilihan Tidak Tersedia");
                            }
                        } while (pilProduk != 1 && pilProduk != 2 && pilProduk != 3);
                        System.out.print("Masukkan jumlah\t: ");
                        banyak = in.nextInt();
                        pelanggan.totalProduk(pilProduk, banyak);
                    } else {
                        System.out.println("Pilihan Tidak Tersedia");
                    }
                    System.out.println("Ada perlu lagi?");
                    System.out.println("1. Ya");
                    System.out.println("2. No");
                    System.out.print("Masukkan pilihan\t: ");
                    pilih = in.nextInt();
                } while (pilih != 2 && pilih == 1);
                ((Silver) pelanggan).totalHarga();
                break;
            case 4:
                pelanggan = new NonMember(nama);
                do {
                    System.out.println("1. Jasa");
                    System.out.println("2. Produk");
                    System.out.print("Masukkan pilihan\t: ");
                    pilihan = in.nextInt();
                    if (pilihan == 1) {
                        pelanggan.displayJasa();
                        do {
                            System.out.print("Masukkan pilihan\t: ");
                            pilJasa = in.nextInt();
                            if (pilJasa != 1 && pilJasa != 2 && pilJasa != 3) {
                                System.out.println("Pilihan Tidak Tersedia");
                            }
                        } while (pilJasa != 1 && pilJasa != 2 && pilJasa != 3);
                        pelanggan.totalJasa(pilJasa);
                    } else if (pilihan == 2) {
                        pelanggan.displayProduk();
                        do {
                            System.out.print("Masukkan pilihan\t: ");
                            pilProduk = in.nextInt();
                            if (pilProduk != 1 && pilProduk != 2 && pilProduk != 3) {
                                System.out.println("Pilihan Tidak Tersedia");
                            }
                        } while (pilProduk != 1 && pilProduk != 2 && pilProduk != 3);
                        System.out.print("Masukkan jumlah\t: ");
                        banyak = in.nextInt();
                        pelanggan.totalProduk(pilProduk, banyak);
                    } else {
                        System.out.println("Pilihan Tidak Tersedia");
                    }
                    System.out.println("Ada perlu lagi?");
                    System.out.println("1. Ya");
                    System.out.println("2. No");
                    System.out.print("Masukkan pilihan\t: ");
                    pilih = in.nextInt();
                } while (pilih != 2 && pilih == 1);
                ((NonMember) pelanggan).totalHarga();
                break;
        }
        System.out.println("");
    }
}
