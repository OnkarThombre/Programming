

public class CountVowelsConsonent {
    
    public static int[] countConsoVowo(String str) {

        str = str.toLowerCase();
        int consoCount = 0 , vowoCount = 0;

        // char arr[] = str.toCharArray();

        // for (int i = 0; i < arr.length; i++) {
        //     if(arr[i] == 'a' || arr[i] == 'e' || arr[i] == 'i' ||  arr[i] == 'o' ||arr[i]  == 'u')
        //     {
        //         vowoCount ++;
        //     }
        //     else{ 
        //         consoCount ++;  //Right now, we are counting everything that is not a vowel as a consonant:  
        //     } // for java it does great job but for java8 it counts 8 as consonent
        // }

        for (char ch : str.toCharArray()) {
            if(ch >= 'a' && ch <= 'z')
            {
                if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
                {
                    vowoCount ++;
                }
                else{
                    consoCount ++;
                }
            }
        }

        return new int[]{vowoCount , consoCount};
    }
    
    public static void main(String[] args) {
        String str = "Java8";
        int res[] = countConsoVowo(str);
        // System.out.println(Arrays.toString(res));
        System.out.println("Consonents count is : " + res[1] + " \nVowel count is :" + res[0]);
    }
}
