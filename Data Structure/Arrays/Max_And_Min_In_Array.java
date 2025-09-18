
import java.util.*;
public class Max_And_Min_In_Array
{
	public static void main(String[] args) {
		
		
// 		int arr[] = {10,5,0,3,-1,20,15,35};   // hardcoded array elements

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size");
		int size = sc.nextInt();
		System.out.println("Enter Array elements");
		
		int arr[] = new int[size];
		for(int i = 0 ; i < size ; i++)
		{
		    arr[i] = sc.nextInt();    //  entering array elements dynmically
		}
		
		System.out.println(Arrays.toString(arr));   
		
		int max = arr[0];   // Integer.MIN_VALUE;  // this keep the minimum value of int -2147483648
		int min = arr[0];
		
		for(int i = 1; i< arr.length ; i++)        //for(int i = 0; i< arr.length ; i++)    //In your loop, you can start from i = 1 instead of i = 0 since you already initialized max and min with arr[0].
																								//That avoids one redundant comparison.  //avoid one extra unuseful iteration
		{
		    if(arr[i] > max)
		    {
		        max = arr[i];
		    }
		    
		    if(arr[i] < min)
		    {
		        min = arr[i];
		    }
		}
		System.out.println("max = " + max +  " min = " + min);
		
	}
}


output 
	Enter Array elements
354
56
0
-7
55
[354, 56, 0, -7, 55]
max = 354 min = -7
