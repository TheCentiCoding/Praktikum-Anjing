package praktikumbab3;
import java.util.Scanner;

public class Praktikum1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Masukkan nilai n = ");
        int n = in.nextInt();
        for (int i=1;i<=n;i++){
            for (int k=n-i-1;k>=0;k--) {
                System.out.print("  ");
            }
            for (int j=1;j<=i;j++) {
                System.out.print("* ");
            }
            System.out.println(" ");
        }
    }
    
}
