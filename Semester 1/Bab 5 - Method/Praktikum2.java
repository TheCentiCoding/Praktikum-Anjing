import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Masukkan bilangan prima : ");
        int n = in.nextInt();
        cekPrima(n);
        printPrima(100);
    }
    
    public static void cekPrima(int x) {
        if (x != 2 && x != 3 && x != 5 && x != 7){
            if (x % 2 == 0) System.out.println(x+" bukan bilangan prima");
            else if (x % 3 == 0) System.out.println(x+" bukan bilangan prima");
            else if (x % 5 == 0) System.out.println(x+" bukan bilangan prima");
            else if (x % 7 == 0) System.out.println(x+" bukan bilangan prima");
            else if (x == 1) System.out.println(x+" bukan bilangan prima");
        } else System.out.println(x+" adalah bilangan prima");
    }
    
    public static void printPrima(int s){
        for (int i = 1;i<=s;i++) {
            if (i != 2 && i != 3 && i != 5 && i != 7) {
                if (i % 2 == 0) continue;
                else if (i % 3 == 0) continue;
                else if (i % 5 == 0) continue;
                else if (i % 7 == 0) continue;
                else if (i == 1) continue;
            } System.out.print(i+" ");
        }
    }
}
