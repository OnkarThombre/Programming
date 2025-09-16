public class Main
{
	public static void main(String[] args) {
// 	System.out.println("Hello World");

    String str = "Onkar";
    int a = 10;
    
    // int ans1 = a + str;  //Compile time error TYPE SAFTY at compile time it checks that or found that incompatible types: String cannot be converted to int
    String ans1 = a + str;  // int is compatible to convert into int 
    System.out.println(ans1);
	}
}