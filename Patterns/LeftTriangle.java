import java.util.Scanner;

public class LeftTriangle {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the height of the Triangle");
            int height = sc.nextInt();
            for (int i = 1; i <= height; i++) {
                for (int space = i; space <= height; space++) {
                    System.out.print(" ");
                }
                for (int j = 1; j <= i; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }
}
