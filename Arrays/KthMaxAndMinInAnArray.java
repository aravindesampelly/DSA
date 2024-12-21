import java.util.Arrays;
import java.util.Scanner;

public class KthMaxAndMinInAnArray {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the size of an array: ");
            int size = sc.nextInt();
            int arr[] = new int[size];
            System.out.println("Enter the values into the array: ");
            for (int i = 0; i < size; i++) {
                arr[i] = sc.nextInt();
            }
            Arrays.sort(arr);
            System.out.println("Enter which maximum value you want to know :");
            int max = sc.nextInt();
            System.out.println("Enter which minimum value you want to know :");
            int min = sc.nextInt();
            System.out.println(max + "Maximum value in a array is:" + arr[(size) - max]);
            System.out.println(min + "Minimum value in a array is:" + arr[min - 1]);
        }
    }
}
