import java.util.Scanner;

public class MinimumAndMaximumInArray {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the size of array: ");
            int size = sc.nextInt();
            int arr[] = new int[size];
            for (int i = 0; i <= size - 1; i++) {
                arr[i] = sc.nextInt();
            }
            int min = arr[0];
            int max = arr[0];
            {
                for (int i = 0; i <= size - 1; i++) {
                    if (min > arr[i]) {
                        min = arr[i];
                    }
                    if (max < arr[i]) {
                        max = arr[i];
                    }
                }
            }

            System.out.println("Minimum value in the array is: " + min);
            System.out.println("Maximum value in the array is: " + max);
        }
    }
}
