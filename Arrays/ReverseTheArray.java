import java.util.Scanner;

public class ReverseTheArray {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the size of the array: ");
            int size = sc.nextInt();
            System.out.println("Enter the values:");
            int arr[] = new int[size];
            for (int i = 0; i <= size - 1; i++) {
                arr[i] = sc.nextInt();
            }
            int arr2[] = new int[size];
            for (int i = 0; i <= size - 1; i++) {
                arr2[(size - 1) - i] = arr[i];
            }
            System.out.println("Reversed array is :");
            for (int i = 0; i <= size - 1; i++) {
                System.out.print(arr2[i] + " ");
            }
        }
    }
}