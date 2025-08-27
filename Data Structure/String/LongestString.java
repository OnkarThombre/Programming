
public class LongestString {

    public static String longestString(String sarr[]) {
        int iarr[] = new int[sarr.length];
        for (int i = 0; i < sarr.length; i++) {
            iarr[i] = sarr[i].length();
        }

        int max = 0;
        for (int i = 0; i < iarr.length; i++) {
            if (iarr[i] > max) {
                max = iarr[i];
            }
        }

        for (int i = 0; i < iarr.length; i++) {
            if (iarr[i] == max) {
                return sarr[i];
            }

        }
        return null;
    }// for this time complexity become 3n

    public static void main(String[] args) {
        // String sarr[] = {"onkar", "Profakash", "SukatPhoto", "DrSatwikMBBS", "OM"};
        // String sarr[] = {"onkar" , "akash" ,"Fives"};
        // String sarr[] = {};
        String sarr[] = {""};
        System.out.println("Lomgest String is " + longestString(sarr));
    }
}
