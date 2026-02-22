package javaapplication5;
import java.util.Scanner;

public class Praktikum2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.printf("%-18s %c ","Berat badan (kg)",':');
        double weight = in.nextDouble();
        System.out.printf("%-18s %c ","Tinggi badan (m)",':');
        double height = in.nextDouble();
        double imt = weight / (height*height);
        if (imt <= 18.5) {
            System.out.printf("IMT = %.2f   Termasuk kurus",imt);
        } else if (imt > 18.5 && imt <= 25) {
            System.out.printf("IMT = %.2f   Termasuk normal",imt);
        } else if (imt > 25 && imt <= 30) {
            System.out.printf("IMT = %.2f   Termasuk gemuk",imt);
        } else {
            System.out.printf("IMT = %.2f   Termasuk kegemukan",imt);
        }
    }
}
