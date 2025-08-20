
import java.util.Arrays;
import java.util.Scanner;

public class Exam {
    //my solution
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size");
        int n = sc.nextInt();
        System.out.println("Enter array elements");
        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("enter K value :-");
        int k = sc.nextInt();
        System.out.println("Array before fun");
        System.out.println(Arrays.toString(arr));
        int funArray[] = funOxen(arr, n, k);
        System.out.println("After sorted");
        System.out.println(Arrays.toString(funArray));
    }

    public static int[] funOxen(int arr[], int n, int k) {
        for (int i = 0; i < k; i++) {
            int temp = arr[n - 1];
            int j;
            for (j = 1; j < n; j++) {
                arr[n - j] = arr[n - j - 1];
            }
            arr[n - j] = temp;
        }
        return arr;
    }

}


/* 
 * chatgpt soln
 * import java.util.Arrays;

public class RotateArray {
    public static void rotate(int[] arr, int k) {
        int n = arr.length;
        k = k % n; // handle if k > n

        int[] result = new int[n];

        for (int i = 0; i < n; i++) {
            result[(i + k) % n] = arr[i];
        }

        // copy back to original array
        for (int i = 0; i < n; i++) {
            arr[i] = result[i];
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int k = 3;

        rotate(arr, k);
        System.out.println("Rotated Array: " + Arrays.toString(arr));
    }
}

 */
