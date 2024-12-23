import java.util.Scanner;

public class HallowPyramid {
    public static void main(String[] args) {
        System.out.println("Enter the height of the Pyramid: ");
        try (Scanner sc = new Scanner(System.in)) {
            int height = sc.nextInt();
            for (int i = 1; i <= height; i++) {
                for (int space = i; space <= height; space++) {
                    System.out.print(" ");
                }
                for (int j = 1; j <= i; j++) {

                    if (j == 1 || j == i) {
                        System.out.print("* ");
                    } else if (i == height) {
                        if (j > 1 && j < i) {
                            System.out.print("* ");
                        }
                    }

                    else {
                        System.out.print("  ");
                    }

                }
                System.out.println();
            }
        }
    }
}
