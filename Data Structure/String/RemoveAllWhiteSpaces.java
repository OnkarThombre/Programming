
public class RemoveAllWhiteSpaces {

    public static String removeSpaces(String str) {
       return str.replaceAll("\\s", "");
    }

    public static void main(String[] args) {
        String str = "i      a m a O n kar";
        String ans = removeSpaces(str);
        System.out.println(ans);
    }
}


/*
 * 
        \\s	    Each single whitespace	Simple, replaces all individually
        \\s+	One or more consecutive whitespaces	More efficient when multiple spaces occur together
 */
