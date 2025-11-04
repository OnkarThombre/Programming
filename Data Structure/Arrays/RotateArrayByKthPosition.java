import java.util.Arrays;

public class RotateKpos {

    public static void main(String[] args) {
        int[] arr = { 10, 20, 40, 77, 80, 40, 14, 7, 88, 20, 20 };
        int k = 2;
        int n = arr.length;
        for (int i = 0; i < k; i++) {
            // int temp = arr[n - 1];
            // arr[n - 1] = arr[n - 2];
            // arr[n - 2] = arr[n - 3];
            // arr[n - 3] = arr[n - 4];
            // arr[n - 4] = arr[n - 5];
            // arr[n - 5] = arr[n - 6];
            // arr[n - 6] = temp;
            int temp = arr[n - 1];
            for (int j = 1; j < arr.length; j++) // above commented things generalized in this for loop
            {
                arr[n - j] = arr[n - j - 1];
            }
            arr[0] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }
}
