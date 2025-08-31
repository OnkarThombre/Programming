
import java.util.Arrays;

public class ArrayTwist {
    public static int[] arrMethod(int arr[])
    {
        int product ;
        int result[] = new int[arr.length];
        for(int i  = 0; i < arr.length ; i++)
        {
            product = 1;
            for(int j = 0; j < arr.length ; j++)
            {
                if(i!=j)
                {
                    product = product * arr[j];
                }
            }
            result[i] = product;
        }

        return result;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,4,5}; 
        int resarr[] = arrMethod(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(resarr));


    }
}
// [1, 2, 4, 5]
// [40, 20, 10, 8]