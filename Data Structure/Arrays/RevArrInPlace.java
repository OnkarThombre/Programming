
import java.util.Arrays;

public class RevArrInPlace {

    public static void main(String[] args) {
        int arr[] = {40, 50, 60, 10, 20, 30};

        int left = 0, right = arr.length - 1;
        System.out.println("Before sorted " + Arrays.toString(arr));
        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }

        for (int ele : arr) {
            System.out.print(ele + ", ");
        }
    }
}

/*
 * Time Complexity: O(n) (you touch each element once).
 * Space Complexity: O(1) (just swapping in place, no extra storage).
 */
