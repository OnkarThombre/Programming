class PalindromeString
{
    public static void main(String[] args) {
        String str = "level";

        // Convert string into character array
        char[] arr = str.toCharArray();

        // Two pointers: start and end
        int left = 0;
        int right = arr.length - 1;

        boolean isPalindrome = true;

        // Check characters from both ends
        while (left < right) {
            if (arr[left] != arr[right]) {   // here i am checking each char of char left and right and if they are not equal then 
                                            // directly i am returning false
                isPalindrome = false;
                break;
            }
            left++;
            right--;
        }

        System.out.println("Is Palindrome: " + isPalindrome);
    }
}

//str.equals(reversed);

/*
 * public class PalindromeCheck {
    public static void main(String[] args) {
        String str = "level";

        // Reverse the string using StringBuilder
        String reversed = new StringBuilder(str).reverse().toString();

        // Compare original and reversed strings
        boolean isPalindrome = str.equals(reversed);

        System.out.println("Is Palindrome: " + isPalindrome);
    }
}

 */