import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n, r;
        int pilihan;
        do {
            System.out.println("Program Penghitung Permutasi dan Kombinasi");
            System.out.println("1. Permutasi");
            System.out.println("2. Kombinasi");
            System.out.println("3. Keluar");
            System.out.println("Masukkan pilihan Anda : ");
            pilihan = in.nextInt();
            if (pilihan == 1 || pilihan == 2) {
                System.out.print("Masukkan total objek n = ");
                n = in.nextInt();
                System.out.print("Masukkan jumlah objek yang dipilih r = ");
                r = in.nextInt();
                if (pilihan == 1) permutasi(n,r);
                if (pilihan == 2) kombinasi(n,r);
            }
            else if (pilihan == 3) System.out.println("Program dihentikan.");
            else System.out.println("Pilihan invalid!");
        } while (pilihan != 3);
    }
    
    // Faktorial
    public static int faktorial(int a){
        if (a == 1) return 1;
        else return (a*faktorial(a-1));
    }
    
    // Permutasi
    public static void permutasi(int x,int y){
        int P = faktorial(x)/faktorial(x-y);
        System.out.println("        n!");
        System.out.println("nPr = ------ = "+P);
        System.out.println("      (n-r)!");
        System.out.println("Maka hasil permutasinya adalah = "+P);
    }
    
    // Kombinasi
    public static void kombinasi(int x,int y){
        int C = faktorial(x)/(faktorial(y)*faktorial(x-y));
        System.out.println("         n!");
        System.out.println("nCr = -------- = "+C);
        System.out.println("      r!(n-r)!");
        System.out.println("Maka hasil kombinasinya adalah = "+C);
    }
}
