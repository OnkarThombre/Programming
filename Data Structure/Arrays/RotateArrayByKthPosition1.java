import java.util.Scanner;
class Solution {
    public static void rotate(int[] nums, int k) {
        int n = nums.length;
        int res[]= new int[n];
        for(int i = 0; i< n ; i++)
        {
            res[(k + i) % n] = nums[i];
        }
        for(int i = 0; i< n; i++)
        {
            nums[i] = res[i];
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size");
        int n = sc.nextInt();
        System.out.println("Enter array elements");
        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("enter K value :-");
        int k = sc.nextInt();
       
        rotate(arr,k);
        
    }
}

/*Input: nums = [1,2,3,4,5,6,7], k = 3
Output: [5,6,7,1,2,3,4]
Explanation:
rotate 1 steps to the right: [7,1,2,3,4,5,6]
rotate 2 steps to the right: [6,7,1,2,3,4,5]
rotate 3 steps to the right: [5,6,7,1,2,3,4]
*/
