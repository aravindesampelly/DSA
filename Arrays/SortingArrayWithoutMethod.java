import java.util.Scanner;

public class SortingArrayWithoutMethod {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the size of an array: ");
            int size = sc.nextInt();
            int arr[] = new int[size];
            System.out.println("Enter the values for the array: ");
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
            System.out.println("Sorted array is: ");
            for (int i = 0; i < size; i++) {
                System.out.println(arr[i]);
            }
        }
    }
}
