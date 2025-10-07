package praktikumbab4;
import java.util.Scanner;

public class Praktikum2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String jenisKereta[] = {"Ekonomi","Bisnis","Eksekutif","Partiwisata"};
        int hargaKereta[] = {50000,100000,200000,300000};
        double diskonKereta[] = {0.02,0.05,0.07,0.1};
        String persenKereta[] = {"2%","5%","7%","10%"};
        String fasilKereta[][] = {{"Tidak ada","Tidak ada"},{"Ada","Tidak ada"},{"Ada","Tidak ada"},{"Ada","Ada"}};
        int pilihan = 6;
        int menu = 0;
        do {
            System.out.println("1. Melihat Daftar Kereta Api");
            System.out.println("2. Melihat Daftar Kereta Api yang ada AC");
            System.out.println("3. Melihat Daftar Kereta Api yang ada Colokan");
            System.out.println("4. Memesan Tiket Kereta Api");
            System.out.println("5. Melihat Pesanan Tiket");
            System.out.println("0. Keluar");
            System.out.print("Masukan nilai : ");
            menu = in.nextInt();
            switch (menu) {
                case 1: 
                    System.out.println("DAFTAR KERETA API");
                    System.out.printf("%-15s %-10s %-10s %-10s %-10s \n","Jenis","Harga","Diskon","AC","Colokan");
                    for (int i=0;i<4;i++) {
                        System.out.printf("%-15s %-10d %-10s %-10s %-10s \n",jenisKereta[i],hargaKereta[i],persenKereta[i],fasilKereta[i][0],fasilKereta[i][1]);
                    }
                    System.out.println();
                    break;
                case 2:
                    System.out.println("DAFTAR KERETA API YANG ADA AC");
                    System.out.printf("%-15s %-10s %-10s %-10s %-10s \n","Jenis","Harga","Diskon","AC","Colokan");
                    for (int i=0;i<4;i++) {
                        if (fasilKereta[i][0].equals("Tidak ada")) continue;
                        System.out.printf("%-15s %-10d %-10s %-10s %-10s \n",jenisKereta[i],hargaKereta[i],persenKereta[i],fasilKereta[i][0],fasilKereta[i][1]);
                    }
                    System.out.println();
                    break;
                case 3:
                    System.out.println("DAFTAR KERETA API YANG ADA COLOKAN");
                    System.out.printf("%-15s %-10s %-10s %-10s %-10s \n","Jenis","Harga","Diskon","AC","Colokan");
                    for (int i=0;i<4;i++) {
                        if (fasilKereta[i][1].equals("Tidak ada")) continue;
                        System.out.printf("%-15s %-10d %-10s %-10s %-10s \n",jenisKereta[i],hargaKereta[i],persenKereta[i],fasilKereta[i][0],fasilKereta[i][1]);
                    }
                    System.out.println();
                    break;
                case 4: 
                    System.out.println("Daftar kereta: ");
                    for (int i=0;i<4;i++) {
                        System.out.println((i+1)+". "+jenisKereta[i]);
                    }
                    System.out.print("Masukkan angka : ");
                    pilihan = in.nextInt();
                    pilihan--;
                    System.out.println("Berhasil memesan tiket"+jenisKereta[pilihan]);
                    System.out.println();
                    break;
                case 5:
                    if (pilihan == 6) System.out.println("ANDA BELUM MEMESAN TIKET.");
                    else {
                        System.out.println("Tiket yang Anda pesan:");
                        System.out.printf("%-15s %-10s %-10s %-10s %-10s \n","Jenis","Harga","Diskon","AC","Colokan");
                        System.out.printf("%-15s %-10d %-10s %-10s %-10s \n",jenisKereta[pilihan],hargaKereta[pilihan],persenKereta[pilihan],fasilKereta[pilihan][0],fasilKereta[pilihan][1]);
                    }
                    System.out.println();
                    break;
                default: System.out.println("PROGRAM DIHENTIKAN.");
            }
        } while (menu >= 1 && menu <= 5);
    }
}
