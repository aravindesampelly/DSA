import java.util.Scanner;

public class LargestSumOfContigiousArray {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the size of an array: ");
            int size = sc.nextInt();
            int arr[] = new int[size];
            System.out.println("Enter the values into the array: ");
            for (int i = 0; i < size; i++) {
                arr[i] = sc.nextInt();
            }
            for (int i = 0; i < size; i++) {
                for (int j = i + 1; j < size; j++) {
                    if (arr[i] > arr[j]) {
                        int temp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = temp;
                    }
                }
            }
            System.out.println("Sum of largest in contagious Array is: " + (arr[size - 1] + arr[size - 2]));
        }
    }
}
