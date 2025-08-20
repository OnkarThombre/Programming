
import java.util.Scanner;

public class RecBinarySearch {

    public static void main(String[] args) {
        int arr[] = {11, 22, 33, 44, 55, 66};
        System.out.println("Enter key");
        Scanner sc = new Scanner(System.in);
        int key = sc.nextInt();

        int left = 0;
        int right = arr.length - 1;

        int index = recBinarySearch(arr, left, right, key);
        System.out.println(index);
    }

    public static int recBinarySearch(int[] arr, int left, int right, int key) {
        if (left > right) {
            return -1;
        }
        int mid = (left + right) / 2;
        if (arr[mid] == key) {
            return mid;
        }

        if (key < arr[mid]) {
            return recBinarySearch(arr, left, mid - 1, key); 
        }else {
            return recBinarySearch(arr, mid + 1, right, key);  // index = recBinarySearch(arr, mid + 1, right, key);
                                                                // return index; 
        }   
    }
}
