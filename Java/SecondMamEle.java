Time complexity :- O(n) 

import java.util.*;
public class Main
{
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		System.out.println("Enter array size");
		int size = sc.nextInt();
		System.out.println("Enter array elements");
		int arr[] = new int[size];
		for(int i = 0; i< arr.length ; i++)
		{
		    arr[i] = sc.nextInt();
		}
		System.out.println(Arrays.toString(arr));
		
		int firstMax = Integer.MIN_VALUE;
		int secondMax = Integer.MIN_VALUE;
		
		for(int i = 0; i < arr.length ; i++)
		{
		    if(arr[i] > firstMax)
		    {
		        firstMax = arr[i];
		    } 
		}
		
		for(int i= 0; i < arr.length ; i++)
		{
		    if(arr[i] > secondMax && arr[i] < firstMax)
		    {
		        secondMax = arr[i];
		    }
		}
		System.out.println("firstMax is : = " + firstMax + " SecondMax is : = " + secondMax);
	}
}

// ->>>--->>>>>>---<<<<<<<--- 


Time complexity :- O(2n)
// finding second maximun element
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
		System.out.println("Enter array size");
		int size = sc.nextInt();
		System.out.println("Enter array elements");
		int arr[] = new int[size];
		for(int i = 0; i< arr.length ; i++)
		{
		    arr[i] = sc.nextInt();
		}
		System.out.println(Arrays.toString(arr));
		
		int firstMax = Integer.MIN_VALUE;
		int secondMax = Integer.MIN_VALUE;
		
		for(int i = 0; i < arr.length ; i++)
		{
		    if(arr[i] > firstMax)
		    {
		        secondMax = firstMax;
		        firstMax = arr[i];
		    }
		    else if(arr[i] > secondMax && arr[i] < firstMax)
		    {
		        secondMax = arr[i];
		    }
		}
		System.out.println("firstMax is : = " + firstMax + " SecondMax is : = " + secondMax);
	}
}
