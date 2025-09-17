import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a BASE NO.");
		int base = sc.nextInt();
        System.out.println("Enter power/raised to NO");
        int power = sc.nextInt();
        
        int ans = 1;
        for(int i = 0; i< power ; i++)
        {
            ans = ans * base;
        }
        System.out.printf(base + " raised to " + power + " is = " + ans);
	}
}
