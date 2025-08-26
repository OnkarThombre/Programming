
public class PalindromeNoCode {

    public static void main(String[] args) {

    }

    public boolean isPalindrome(int x) {
        int num = x;
        int last, rev = 0;
        while (num > 0) // here -ve no is not asked to display as palindrome so i took num > 0 , instead num != 0
        {
            last = num % 10;
            rev = rev * 10 + last;
            num = num / 10;
        }
        return rev == x;
    }
}


/*
 * points to be conside depends upon the situation asked in question for negative and positive number
 * int num = x;
int rev = 0;

while(num != 0) {
    int last = num % 10;
    rev = rev * 10 + last;
    num = num / 10;
}

return rev == x;
1️⃣ What happens if x is negative, say x = -121
num = -121

num != 0 is true → enter the loop

last = num % 10 → last = -121 % 10 = -1

rev = rev * 10 + last = 0 * 10 + (-1) = -1

num = num / 10 = -121 / 10 = -12 (integer division)

Next iteration:

last = -12 % 10 = -2

rev = -1 * 10 + (-2) = -12

num = -12 / 10 = -1

Next iteration:

last = -1 % 10 = -1

rev = -12 * 10 + (-1) = -121

num = -1 / 10 = 0

Loop ends.

Now, rev = -121, x = -121 → rev == x → true

❌ But this is wrong because negative numbers are not considered palindrome according to the problem.

2️⃣ What happens if you use num > 0
java
Copy
Edit
int num = x;
while(num > 0) {
    ...
}
If x is negative (x = -121), then num > 0 → -121 > 0 is false

Loop never runs

rev = 0

Return rev == x → 0 == -121 → false, which is correct

✅ This is why num > 0 is safer when you know negative numbers should return false.

✅ Key Takeaways
Using num != 0 for negative numbers reverses the digits but keeps the negative sign, which can incorrectly evaluate a negative number as palindrome.

Using num > 0 prevents the loop from running for negatives, giving the correct result immediately.

For interview-safe code, also explicitly check:

java
Copy
Edit
if (x < 0) return false;
This makes your intent crystal clear.
 */
