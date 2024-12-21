import java.util.Scanner;

public class ReverseTheArrayWithoutUsingAnotherArray {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the size of an array: ");
            int size = sc.nextInt();
            int arr[] = new int[size];
            System.out.println("Enter the values into the array: ");
            for (int i = 0; i < size; i++) {
                arr[i] = sc.nextInt();
            }
            for (int i = 0; i < size / 2; i++) {
                int temp = arr[i];
                arr[i] = arr[size - i - 1];
                arr[size - i - 1] = temp;
            }
            System.out.println("Reversed array is: ");
            for (int i = 0; i < size; i++) {
                System.out.println(arr[i]);
            }
        }
    }
}
