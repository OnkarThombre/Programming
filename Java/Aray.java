import java.util.*;
public class Main
{
	public static void main(String[] args) {
		
		int arr[] = {10,5,0,3,-1,20,15,35};   // hardcoded array elements
        
        int[] arr1 = {5,4,5,68,6464};
        
       //int[] arr2 = {5,4,5, ,68,6464}; // illegal start of expression❌
        // int[] arr2 = {5,4,5,,68,6464};  // int[] arr2 = {5,4,5, ,68,6464};❌
        
        
        // In Java, a comma means “expecting another element after it”.
        
    
        int[] arr2 = {5,4,5,68,6464, }; //✅OK
        /*
        Java allows a trailing comma in array initializers.
        The compiler treats {5, 4, 5, 68, 6464, } exactly the same as {5, 4, 5, 68, 6464}.
        It doesn’t mean there’s an extra element — the trailing comma is just ignored.
        So the array length here will be 5, not 6.
        */
        
        int[] arr3 = new int[3]; //✅OK   giving array size is compulsary
        int arr4[] = new int[4]; //✅OK
    
        // int arr5[] = new int[];  //array dimension missing ❌
                          // ^
        // int arr6[3] = new int[3];  //not a statement ❌
                 // ^
                 
        // int[3] arr6 = new int[3];    ❌    
        
        int arr7[] = new int[] {2,65,8};  //✅OK
        
        // int arr8[] = new int[3] {2,65,8};  ❌   array creation with both dimension expression and initialization is illegal
                        //  ^
                        //array size and array elements should not be at same time
	}
}
/*
public class Main
{
	public static void main(String[] args) 
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size");
		int size = sc.nextInt();
		System.out.println("Enter Array elements");
		
		int arr[] = new int[size];
		for(int i = 0 ; i < size ; i++)
		{
		    arr[i] = sc.nextInt();    //  entering array elements dynmically
		}
		
		System.out.println("Array is : ");
		
 		for(int ele : arr)							// way to print  an array
 		{                                           // for each loop
 		    System.out.print(ele+ ",");
 		}

        for(int i = 0; i< arr.length ; i++)			// way to print  an array
		{
		    System.out.println(arr[i]);
		}
	
		System.out.println(Arrays.toString(arr));   // way to print  an array 
		
	}
}
	*/	
