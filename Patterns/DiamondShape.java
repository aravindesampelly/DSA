import java.util.Scanner;

public class DiamondShape {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int height = sc.nextInt();
            for (int i = 1; i <= height; i++) {
                for (int space = height; space > i; space--) {
                    System.out.print(" ");
                }
                for (int j = 1; j <= i; j++) {
                    System.out.print("* ");
                }
                System.out.println();
            }
            for (int i = 1; i <= height - 1; i++) {
                for (int space = 1; space <= i; space++) {
                    System.out.print(" ");
                }
                for (int j = height - 1; j >= i; j--) {
                    System.out.print("* ");
                }
                System.out.println();

            }
        }
    }
}
