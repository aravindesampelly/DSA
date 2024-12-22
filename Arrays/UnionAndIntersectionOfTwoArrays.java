import java.util.Scanner;

public class UnionAndIntersectionOfTwoArrays {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter size for the first array: ");
            int size = sc.nextInt();
            int arr[] = new int[size];
            System.out.println("Enter values into the first array: ");
            for (int i = 0; i < size; i++) {
                arr[i] = sc.nextInt();
            }
            System.out.println("Enter size for the second array: ");
            int size2 = sc.nextInt();
            int arr2[] = new int[size2];
            System.out.println("Enter values into the second array: ");
            for (int i = 0; i < size2; i++) {
                arr2[i] = sc.nextInt();
            }
            int arr3[] = new int[size + size2];
            int k = 0;
            for (int i = 0; i < size; i++) {
                arr3[k] = arr[i];
                k++;
            }
            for (int i = 0; i < size2; i++) {
                arr3[k] = arr2[i];
                k++;
            }
            System.out.println("Union of two arrays is :");
            for (int i = 0; i < arr3.length; i++) {
                System.out.print(arr3[i]);
            }
            int size3 = 0;
            if (size > size2) {
                size3 = size;

            } else {
                size3 = size2;

            }
            int arr4[] = new int[size3];
            System.out.println();
            System.out.println("Intersection of two arrays: ");
            for (int i = 0; i < size3; i++) {
                for (int j = 0; j < size; j++) {
                    if (arr2[i] == arr[j]) {
                        arr4[i] = arr[j];
                    }
                }
            }
            for (int i = 0; i < arr4.length; i++) {
                if (arr4[i] == 0) {

                } else {
                    System.out.println(arr4[i]);
                }

            }
        }
    }
}
