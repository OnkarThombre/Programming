
import java.util.Arrays;

public class ReverseString {

    public static void main(String[] args) {
        String str = "onkar";
        
        
        // str.reverse();  cannot find symbol cte
        
        
        
        /* 
        // char left = str.charAt(0);
        // // char right = str.charAt(str.length());  StringIndexOutOfBoundsException
        // char right = str.charAt(str.length() - 1);
        // while (left < right) {
        //     char temp = str.charAt(left);
        //     str.charAt(left) = str.charAt(right);
        //     str.charAt(right) = str.charAt(left);
        // }
         */



        // char arr[] = new char[str.length()];
        // for (int i = 0; i < arr.length; i++) {
        //     arr[i] = str.charAt(i);
        // }

        char arr[] = str.toCharArray();



        // char left = arr[0]; // here i am playing with char so while doing char ++ it updates char not points to next index so take int
        // int left = arr[0];  left made value ghet ahot it;s wrong take indexes for array       

        int left = 0;
        int right = arr.length - 1;
        while (left < right) {
            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }

        System.out.println(Arrays.toString(arr));  // it is printing array 
        String reveresed = new String(arr);
        System.out.println(reveresed);
    }
}


/*
    OUTPUT
    [r, a, k, n, o]
    rakno
*/