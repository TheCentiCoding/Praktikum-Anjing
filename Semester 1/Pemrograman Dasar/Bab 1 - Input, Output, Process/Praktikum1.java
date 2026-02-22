package laprak;
import java.util.Scanner;

public class Praktikum1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float op1, op2;
        System.out.printf("%26s%s","Masukkan operator pertama",": ");
        op1 = input.nextFloat();
        System.out.printf("%-26s%s","Masukkan operator kedua",": ");
        op2 = input.nextFloat();
        System.out.printf("%7s%-14s%s%.0f","Hasil"," penjumlahan",": ",op1+op2);
        System.out.printf("\n%7s%-14s%s%.0f","Hasil"," pengurangan",": ",op1-op2);
        System.out.printf("\n%7s%-14s%s%.0f","Hasil"," perkalian",": ",op1*op2);
        System.out.printf("\n%7s%-14s%s%.1f","Hasil"," pembagian",": ",op1/op2);
    }
}

