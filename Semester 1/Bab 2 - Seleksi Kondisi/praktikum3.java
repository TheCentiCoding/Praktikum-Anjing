package javaapplication5;
import java.util.Scanner;

/* Batas kerja maksimal adalah 60 jam / minggu, dengan upah Rp. 5000,-/ jam.
Kelebihan jam kerja dari batas maksimum akan dianggap sebagai lembur dengan
upah Rp. 6000,- / jam. */

/* Batas kerja minimal adalah 50 jam / minggu. Apabila pegawai mempunyai jam
kerja di bawah batas kerja minimal ini, maka akan dikenakan denda sebesar Rp.
1000, - /jam. */
public class praktikum3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.printf("%-10s : ","Jam kerja");
        int jamkerja = in.nextInt();
        int upah = 275000;
        int lembur = 6000;
        int denda = 1000;
        System.out.printf("%-8s = Rp. %d,-","Upah",upah);
        if (jamkerja > 60) lembur = jamkerja * lembur;
        else lembur = 0;
        System.out.printf("\n%-8s = Rp. %d,-","Lembur",lembur);
        if (jamkerja < 50) denda = jamkerja * denda;
        else denda = 0;
        System.out.printf("\n%-8s = Rp. %d,-","Denda",denda);
        System.out.println("\n---------------------");
        int total = upah+lembur-denda;
        System.out.printf("\n%-8s = Rp. %d,-","Total",total);
    }
}
