import java.util.Scanner;

public class MirrorRombus {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the side value of Rombus: ");
            int side = sc.nextInt();
            for (int i = 1; i <= side; i++) {
                for (int space = i; side > space; space++) {
                    System.out.print(" ");
                }
                for (int j = 1; j <= side; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }
}
