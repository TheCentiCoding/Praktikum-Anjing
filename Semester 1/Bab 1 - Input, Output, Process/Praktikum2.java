package laprak;
import java.util.Scanner;

public class Praktikum2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String nama, kelurahan;
        int pawalkwh, pakhirkwh, biayabeban, ppj;
        System.out.println("Program penghitung pemakaian listrik sederhana ");
        System.out.printf("%-15s %c ","Masukan Nama",':');
        nama = input.nextLine();
        System.out.printf("%-10s %c ","Kelurahan",':');
        kelurahan = input.nextLine();
        System.out.printf("%-35s %c ","Masukkan posisi awal Kwh meter",':');
        pawalkwh = input.nextInt();
        System.out.printf("%-35s %c ","Masukkan posisi akhir Kwh meter",':');
        pakhirkwh = input.nextInt();
        System.out.printf("%-35s %c ","Masukkan biaya beban saat ini",':');
        biayabeban = input.nextInt();
        System.out.printf("%-35s %c ","Masukkan PPJ (dalam persen)",':');
        ppj = input.nextInt();
        System.out.println("===================PLN Java===================");
        System.out.printf("%-15s %c %s","Nama",':',nama);
        System.out.printf("\n%-15s %c %s","Kelurahan",':',kelurahan);
        int pbulan = pakhirkwh-pawalkwh;
        int tarif = pbulan*biayabeban;
        int tarifppj = tarif*ppj/100;
        int total = tarif+tarifppj;
        
        System.out.printf("\n%-25s %c %s %s","Pemakaian bulan ini",':',pbulan,"Kwh Meter");
        System.out.printf("\n%-15s %c %s %s","Tarif Listrik",':',"Rp",tarif,",-");
        System.out.printf("\nPPJ (%s%c%-8c%c %s %s",ppj,'%',')',':',"Rp",tarifppj,",-");
        System.out.printf("\n%-15s %c %s %s","Total Bayar",':',"Rp",total,",-");
        System.out.println("\n==============================================");
    }
}
