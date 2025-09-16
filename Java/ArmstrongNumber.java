

public class Main
{
	public static void main(String[] args) {
        
        // int num = 3;
        // int pow = 4;       // code to power of a digit
        
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
        
        int last = 0;
        int sum = 0;
        while(temp > 0)
        {
            int ans = 1;   // here this ans i need to take in while loop
            
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
            System.out.println("it is armstrong number");
        }
        else{
             System.out.println("NOT ARMSTRONG");
        }
        
	}
}



