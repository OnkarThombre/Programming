import java.util.*;
public class Main
{
	public static void main(String[] args) {
		
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a number");
		int num = sc.nextInt();
		int temp = num;
		int sum = 0;
		while(temp > 0)
		{
		    int rem = temp % 10;
		    int fact = 1;
		    for(int i = 1 ; i <= rem ; i++)
		    {   
		        fact = fact * i;
		    }    
		    temp /= 10;
		    sum = sum + fact;
		}
		
		if(sum == num)    
	    	System.out.println("It is ARMSTRONG");
	    else
	        System.out.println("NO :(  ARMSTRONG ");
	}
}


output
Enter a number
145
It is ARMSTRONG

Enter a number
14
NO :(  ARMSTRONG 
  
