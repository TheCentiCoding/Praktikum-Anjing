package praktikumbab4;
import java.util.Scanner;

public class Praktikum1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int menu;
        int sum = 0;
        double mean;
        int tabel[] = new int[10];
        int nilaimax = 0;
        int nilaimin = 0;
        do {
            System.out.println("1. Input Data");
            System.out.println("2. Lihat Data");
            System.out.println("3. Average");
            System.out.println("4. Sum");
            System.out.println("5. Max");
            System.out.println("6. Min");
            System.out.println("0. Keluar");
            menu = in.nextInt();
            switch (menu) {
                case 1: 
                    for (int i = 0;i<tabel.length;i++) {
                        System.out.print("Masukkan data ke-"+(i+1)+" dari 10 data = ");
                        tabel[i] = in.nextInt();
                    }
                    System.out.println("Data berhasil disimpan!");
                    break;
                case 2:
                    System.out.println("Data: ");
                    for (int i = 0;i<tabel.length;i++) {
                        System.out.printf("%-3d", tabel[i]);
                    }
                    System.out.println();
                    break;
                case 3:
                    for (int i = 0;i<tabel.length;i++) {
                        sum += tabel[i];
                    }
                    mean = (double)(sum)/(double)(tabel.length);
                    System.out.println("Rata-rata = "+mean);
                    break;
                case 4:
                    for (int i = 0;i<tabel.length;i++) {
                        sum += tabel[i];
                    }
                    System.out.println("Jumlah data = "+sum);
                    break;
                case 5:
                    for (int i = 0;i<tabel.length;i++) {
                        if (tabel[i]>nilaimax) nilaimax = tabel[i];
                    }
                    System.out.println("Nilai maximum = "+nilaimax);
                    break;
                case 6:
                    nilaimin = tabel[0];
                    for (int i = 0;i<tabel.length;i++) {
                        if (tabel[i]<nilaimin) nilaimin = tabel[i];
                    }
                    System.out.println("Nilai mininum = "+nilaimin);
                    break;
                default: System.out.println("PROGRAM DIHENTIKAN.");
            }
        } while (menu >= 1 && menu <= 6);
    }
}
