
import java.util.Arrays;
import java.util.Scanner;

public class Bubble_sort {

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6};
        System.out.println("Before sort ");
        System.out.println(Arrays.toString(arr));

        Scanner sc = new Scanner(System.in);

        binary_Sort(arr);

        System.out.println("After sor :-");
        System.out.println(Arrays.toString(arr));
    }

    public static void binary_Sort(int arr[]) {
        boolean isSwap = false;
        // int icount =0,jcount= 0;
        for (int i = 0; i < arr.length - 1; i++) {
            // icount ++;
            for (int j = 0; j < arr.length - 1 - i; j++) {
                // jcount ++;
                if (arr[j] > arr[j + 1]) {

                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    isSwap = true;
                }
            }
            if (!isSwap) {
                // System.out.println("Array is alredy sorted ");
                break;
            }

        }
        // System.out.println(icount + "  " + jcount);

    }
}
