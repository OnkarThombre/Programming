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
		/*
		[10]   if arry having only one element then it will give secondmax element is Integer.MIN_VALUE
        firstMax is : = 10 SecondMax is : = -2147483648
		*/
		
        //[10, 10, 10]
        // No second maximum element exists.
		if(secondMax == Integer.MIN_VALUE)
		{
		    System.out.println("No second maximum element exists.");
		}
		else{
		    System.out.println("firstMax is : = " + firstMax + " SecondMax is : = " + secondMax);
		}
		
	}
}

// [10, -2147483648]
// firstMax is : = 10 SecondMax is : = -2147483648

// when this kind of situation occurs then i need to keep one flage if i found secondmaximum i will print it if not found .... 
// boolean foundSecond = false;
// for (int i = 0; i < arr.length; i++) {
//             if (arr[i] < firstMax && arr[i] >= secondMax) {   >= greater than and equalto is taken IMP NOTE
//                 secondMax = arr[i];
//                 foundSecond = true;
//             }
//         }
// if (!foundSecond) {
//             System.out.println("No second maximum element exists.");
//         } else {
//             System.out.println("firstMax = " + firstMax + ", secondMax = " + secondMax);
//         }
//     }
