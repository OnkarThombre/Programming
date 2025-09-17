import java.util.*;
public class Main
{
	public static void main(String[] args) {
		
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a number");
		int num = sc.nextInt();
		int fact = 1;
		for(int i = 1 ; i <= num ; i++)
		{   
		      fact = fact * i;
		}
		
		System.out.println("Factorial of " + num + " is = " + fact);
	}
}




//Factorial by using recursion 

import java.util.*;
public class Main
{
	public static void main(String[] args) {
		
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a number");
		int num = sc.nextInt();
		
		System.out.println("Factorial of " + num + " is = " + fact(num));
	}
	
	public static long fact(int num)
	{
	    
	    if(num == 1 || num == 0)
	        return 1;
	    else
	        return num * fact(num - 1);
	}
	
}
