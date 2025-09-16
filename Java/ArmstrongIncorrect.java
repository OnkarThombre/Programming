/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

public class Main
{
	public static void main(String[] args) {
        
        // int num = 3;
        // int pow = 4;
        
        // int ans = 1;
        // for(int i = 0; i < pow ; i++)
        // {
        //     ans = ans * num;
        // }
        
        // System.out.println(num + " raised to " + pow + " is = " + ans);
        
        
        int num  = 153;
        int temp = num;
         
        int count = 0;
        while(temp > 0)
        {
            temp /= 10;
            count ++;
        }
        
        temp = num;
        int ans = 1;
        int last = 0;
        int sum = 0;
        while(temp > 0)
        {
            last = temp % 10;
            
            for(int i = 0; i < count ; i++)
            {
                ans = ans * last;
            }
            
            temp /= 10;
            sum = sum + ans;
        }
        
        
        if(num == sum)
        {
            System.out.println("it is armstronh");
        }
        
        else{
             System.out.println("NOT>>>>>>>>>>>>>>");
        }
        
	}
}




