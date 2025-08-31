
public class LongestSubString {

    public static int fun(String s) {
        // String arr[] = new String[s.length()];
        int count = s.length();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'u') {
                count--;
            }
        }
        return  count;
    }

    public static void main(String[] args) {
        String s = "abcdaeiou";
        System.out.println("LONGEST IS " + fun(s));
    }
}
