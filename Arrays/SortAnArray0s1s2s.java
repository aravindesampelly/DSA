import java.util.Arrays;

public class SortAnArray0s1s2s {
    public static void main(String[] args) {
        int arr[] = { 0, 2, 1, 0, 2, 1, 0, 2, 1, 1, 0, 0 };
        Arrays.sort(arr);
        System.out.println("Sorted arrays of 0's, 1's, 2's : ");
        for (int i = 0; i <= arr.length - 1; i++) {
            System.out.print(arr[i]);
        }
    }
}
