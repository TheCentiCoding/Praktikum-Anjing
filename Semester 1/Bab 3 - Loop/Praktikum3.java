package praktikumbab3;
import java.util.Scanner;

public class Praktikum3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int pilihan;
        double x,y,z,r;
        double pi = 3.14;
        do {
          System.out.println("MENU");
          System.out.println("0. KELUAR");
          System.out.println("1. HITUNG VOLUME BALOK");
          System.out.println("2. HITUNG VOLUME BOLA");
          System.out.println("3. HITUNG VOLUME KERUCUT");
          System.out.println("4. HITUNG VOLUME SILINDER");
          System.out.println("5. HITUNG VOLUME LIMAS SEGITIGA");
          System.out.println("\nMASUKKAN PILIHAN ANDA: ");
          pilihan = in.nextInt();
          switch (pilihan) {
              case 0: 
                  System.out.println("PROGRAM DIHENTIKAN.");
                  break;
              case 1: 
                  System.out.print("MASUKKAN PANJANG: ");
                  x = in.nextDouble();
                  System.out.print("MASUKKAN LEBAR: ");
                  y = in.nextDouble();
                  System.out.print("MASUKKAN TINGGI: ");
                  z = in.nextDouble();
                  System.out.printf("\nMAKA VOLUME BALOK ADALAH %.2f\n",((x*y*z)));
                  break;
              case 2: 
                  System.out.print("MASUKKAN RADIUS: ");
                  r = in.nextDouble();
                  System.out.printf("\nMAKA VOLUME BOLA ADALAH %.2f\n",((r*r*r*pi*4/3)));
                  break;
              case 3: 
                  System.out.print("MASUKKAN RADIUS ALAS: ");
                  r = in.nextDouble();
                  System.out.print("MASUKKAN TINGGI: ");
                  z = in.nextDouble();
                  System.out.printf("\nMAKA VOLUME KERUCUT ADALAH %.2f\n",((r*r*pi*z*1/3)));
                  break;
              case 4: 
                  System.out.print("MASUKKAN RADIUS ALAS: ");
                  r = in.nextDouble();
                  System.out.print("MASUKKAN TINGGI: ");
                  z = in.nextDouble();
                  System.out.printf("\nMAKA VOLUME SILNDER ADALAH %.2f\n",((r*r*pi*z)));
                  break;
              case 5: 
                  System.out.print("MASUKKAN PANJANG ALAS: ");
                  x = in.nextDouble();
                  System.out.print("MASUKKAN TINGGI ALAS: ");
                  y = in.nextDouble();
                  System.out.print("MASUKKAN TINGGI LIMAS: ");
                  z = in.nextDouble();
                  System.out.printf("\nMAKA VOLUME LIMAS SEGITIGA ADALAH %.2f\n",((x*y*z*1/3)));
                  break;
              default: System.out.println("PILIHAN INVALID");
          }
        } while (pilihan!=0);
    }
}
