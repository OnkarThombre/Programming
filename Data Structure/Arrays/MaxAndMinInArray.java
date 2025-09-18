
import java.util.*;
public class MaxAndMinInArray
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
		
		int max = arr[0];
		int min = arr[0];
		
		for(int i = 0; i< arr.length ; i++)
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
