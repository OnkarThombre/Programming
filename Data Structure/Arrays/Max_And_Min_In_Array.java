
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
		{											// when you take Integer.MIN_VALUE; you have to start loop from 0 index
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







or



package dsaQ;


public class Min_Max_ele {
	public static void main1(String[] args) {
		//int arr[] = {};// = {10,5,0,3,-1,20,15,35};
		int arr[] = {10,5,0,3,-1,20,15,35};
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		
		if(arr.length == 0)
		{
			System.out.println("Array is empty");
			return;
		}
		for(int ele : arr)    // jar array empty asel and then wrchi edge condition nasel then jar normal for loop ne kelyas 
						      // exception yenar karan arr.length;
		{
			if(ele > max)
			{
				max = ele;
			}
			if(ele < min)
			{
				min = ele;
			}
		}
		
		System.out.println("Max : " + max + "\nMin : " + min);
	}
	
	public static void main(String[] args) {
		int arr[] = {10,5,0,3,-1,20,15,35};
		int max = arr[0];
		int min = arr[0];
		
		for(int i = 1 ; i < arr.length ; i++)
		{
			if(arr[i] > max)
			{
				max = arr[i];
			}
			else if(arr[i] < min)
			{
				min = arr[i];
			}
		}
		System.out.println("Max : " + max + "\nMin : " + min);
		
		
	}
}
