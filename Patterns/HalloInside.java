import java.util.Scanner;

public class HalloInside {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int height = sc.nextInt();
            for (int i = 1; i <= height; i++) {
                for (int j = 1; j <= height; j++) {
                    if (i == 1 || i == height) {
                        System.out.print("* ");
                    } else {
                        if (j == 1 || j == height) {
                            System.out.print("* ");
                        } else {
                            System.out.print("  ");
                        }
                    }
                }
                System.out.println();
            }
        }
    }
}