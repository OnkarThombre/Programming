
public class LongestString {

    // public static String longestString(String sarr[]) {
    //     int iarr[] = new int[sarr.length];
    //     for (int i = 0; i < sarr.length; i++) {
    //         iarr[i] = sarr[i].length();
    //     }
    //     int max = 0;
    //     for (int i = 0; i < iarr.length; i++) {
    //         if (iarr[i] > max) {
    //             max = iarr[i];
    //         }
    //     }
    //     for (int i = 0; i < iarr.length; i++) {
    //         if (iarr[i] == max) {
    //             return sarr[i];
    //         }
    //     }
    //     return null;
    // }// for this time complexity become 3n
    // public static void main(String[] args) {
    //     // String sarr[] = {"onkar", "Profakash", "SukatPhoto", "DrSatwikMBBS", "OM"};
    //     // String sarr[] = {"onkar" , "akash" ,"Fives"};
    //     // String sarr[] = {};
    //     String sarr[] = {""};
    //     System.out.println("Lomgest String is " + longestString(sarr));
    // }
    public static String longestString(String sarr[]) {
        if (sarr.length == 0 || sarr == null) {
            return null;
        }

        // int max like this finding greatest element in an array
        String longest = sarr[0];  // here we are storing first element purpose fully because in int max  = 0; we store 
        // 0 but here it is String longest ig we store null then at certain case nulll pointer exception can occur
        for (int i = 1; i < sarr.length; i++) {
            if (sarr[i].length() > longest.length()) {
                longest = sarr[i];
            }
        }
        return longest;
    }  //here time complexit become n because only one loop

    public static void main(String[] args) {
        String sarr[] = {"onkar", "Profakash", "SukatPhoto", "DrSatwikMBBS", "OM"};
        // String sarr[] = {"onkar", "akash", "Fives"};
        // String sarr[] = {}; // here array lenght is 0
        // String sarr[] = {""}; // here array lenght is 1 because it has one element which is inside " " but right now it is nothing 
        // and arr[0].lenght is 0
        System.out.println("Lomgest String is " + longestString(sarr));


    }
}
