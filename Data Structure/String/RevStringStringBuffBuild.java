
public class RevStringStringBuffBuild {

    // way 1 Using a for Loop
    public static void main1(String[] args) {

        String str = "Onkar";
        String rev = "";
        for (int i = str.length() - 1;i >= 0; i--)
        {
            rev += str.charAt(i); // here string's are immutable but i did string concatination
        }

        System.out.println(rev);
    }


    //ToCharArray()
    public static void main2(String[] args) {
        String str ="Onkar";
        char arr[] = str.toCharArray();

        // simply array is printed in reverse manner

        for (int i = arr.length -1 ; i >= 0 ; i--) {
            System.out.print(arr[i]);
        }
    }

    public static void main3(String[] args) {
        String str ="Onkar";
        StringBuffer sb = new StringBuffer(str);
        sb.reverse();

        // System.out.println("printed using Strinbuffer");
        System.out.println(sb);
    }

     public static void main(String[] args) {
        String str ="Onkar0010";
        StringBuilder sb = new StringBuilder(str);
        sb.reverse();

        // System.out.println("printed using Strinbuilder");
        System.out.println(sb);
    }
}
