
package javaapplication5;
import java.util.Scanner;

public class praktikum1 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Menu:");
        System.out.printf("%-4s menghitung luas dan keliling persegi panjang\n","1.");
        System.out.printf("%-4s menghitung luas dan keliling lingkaran\n","2.");
        System.out.printf("%-4s menghitung luas dan keliling segitiga\n","3.");
        System.out.print("\nPilihan Anda: ");
        int menu = in.nextInt();
        double pi = 3.14;
        double a,b,r;
        switch (menu){
            case 1 :
                System.out.print("Masukkan a: ");
                a = in.nextDouble();
                System.out.print("Masukkan b: ");
                b = in.nextDouble();
                System.out.printf("\n%-25s %d %s","Keliling persegi panjang:",(int)(2*a+2*b),"cm");
                System.out.printf("\n%-25s %d %s","Luas persegi panjang:",(int)(a*b),"cm");
                break;
            case 2 :
                System.out.print("Masukkan r: ");
                r = in.nextDouble();
                System.out.printf("\n%-20s %d %s","Keliling lingkaran:",(int)(2*r*pi),"cm");
                System.out.printf("\n%-20s %d %s","Luas lingkaran:",(int)(pi*r*r),"cm");
                break;
            case 3 :
                System.out.print("\nMasukkan a: ");
                a = in.nextDouble();
                System.out.print("Masukkan b: ");
                b = in.nextDouble();
                System.out.print("Masukkan r: ");
                r = in.nextDouble();
                System.out.printf("\n%-20s %d %s","Keliling segitiga:",(int)(a+b+r),"cm");
                System.out.printf("\n%-20s %d %s","Luas segitiga:",(int)(a*b*0.5),"cm");
                break;
            default :
                System.out.println("data tidak ditemukan, program dihentikan...");
        }
    }
}

