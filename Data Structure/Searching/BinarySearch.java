
import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int arr[] = {11, 22, 33, 44, 55, 66};
        // System.out.println("Array elements are " + Arrays.sort(arr));
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println("enter key");
        int key = sc.nextInt();

        int index = binary_Search(arr, key);
        System.out.println("Element find at index " + index);
    }

    public static int binary_Search(int arr[], int key) {
        int l = 0;
        int r = arr.length - 1;
        int mid;
        while (l <= r) {
            mid = (l + r) / 2;
            if (arr[mid] == key) {
                return mid;
            }
            if (key < arr[mid]) {
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return -1;
    }
}
