


// for this Time complexity is O(2n)
import java.util.*;
public class Main
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
		
		int firstMax = arr[0];
		
		for(int i = 1; i< arr.length ; i++)
		{
		    if(arr[i] > firstMax)
		    {
		        firstMax = arr[i];
		    }
		    
		}
		
// 		int secondmax = arr[0];    it will give wrong output when first array element is bigger
        // ex :- [40, 10, 15, 4, 0]
        // Firstmax = 40 SECOND max = 40
        
        int secondmax = Integer.MIN_VALUE;  // this keep the minimum value of int -2147483648
		for(int i = 1 ; i < arr.length ; i++)
		{
		    if(arr[i] > secondmax && arr[i] < firstMax)
		    {
		        secondmax = arr[i];
		    }
		}
		
		System.out.println("Firstmax = " + firstMax +  " SECOND max = " + secondmax);
		
	}
}



// output

// [40, 10, 20, 4]
// Firstmax = 40 SECOND max = 20
