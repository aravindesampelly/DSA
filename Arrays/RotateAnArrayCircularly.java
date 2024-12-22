import java.util.Arrays;
import java.util.Scanner;

public class RotateAnArrayCircularly {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the size of an array: ");
            int size = sc.nextInt();
            int arr[] = new int[size];
            System.out.println("Enter the values into the array: ");
            for (int i = 0; i < size; i++) {
                arr[i] = sc.nextInt();
            }
            System.out.println("how many times you want to rotate the array?");
            int rotate = sc.nextInt();
            int arr2[] = new int[size];
            int k = 0;
            for (int i = rotate; i < size; i++) {
                arr2[k] = arr[i];
                k++;
            }
            for (int i = 0; i < rotate; i++) {
                arr2[k] = arr[i];
                k++;
            }
            System.out.println("" + Arrays.toString(arr2));
        }
    }
}
