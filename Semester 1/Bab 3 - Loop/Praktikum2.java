package praktikumbab3;
public class Praktikum2 {
    public static void main(String[] args) {
        int i;
        System.out.print("  ");
        for (i=1;i<=3;i++) {
            System.out.print("C ");
        }
        for (i=1;i<=3;i++) {
            System.out.println(" ");
            System.out.print("C ");
            for (int j=1;j<=3;j++) {
                System.out.print("  ");
            }
            if (i==2) continue;
            System.out.print("C ");
        }
        System.out.print("\n  ");
        for (i=1;i<=3;i++) {
            System.out.print("C ");
        }
        System.out.println(" ");
    }
}
