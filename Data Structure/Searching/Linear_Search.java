
import java.util.Scanner;

public class Linear_Search {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[6];
        System.err.println("Enter array elements ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Array elements are");
        for (int i = 0; i < arr.length; i++) {
            System.out.print("[ " + arr[i] + " ]");
        }
        Linear_Search(arr);
    }

    public static void Linear_Search(int[] arr)
    {
        
    }
}
