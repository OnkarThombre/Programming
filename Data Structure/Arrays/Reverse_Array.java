
import java.util.Arrays;

public class Reverse_Array {
    //using extra variable or extra space
    public static void main(String[] args) {
        int arr[] = {10, 20, 30, 40,50};

        System.out.println(Arrays.toString(arr));

        int n = arr.length;
        int revArr[] = new int[n];

        for (int i = 0; i < arr.length; i++)
        {
            revArr[i] = arr[n - 1 -i];   
        }

        System.out.println(Arrays.toString(revArr));
    }
}
