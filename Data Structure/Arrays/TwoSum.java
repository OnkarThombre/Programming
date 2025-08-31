import java.util.Arrays;
import java.util.Scanner;
public class TwoSum {

    public static void main(String args[]) {
        // int arr[] = { 2, 7, 11, 15 };
        // int target = 9;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array elements");
        int arr[] = new int[4];
        for(int i = 0 ; i < arr.length ; i ++)
        {
            arr[i] = sc.nextInt();
        }

        System.out.println(Arrays.toString(arr));
        System.out.println("Enter target");
        int target = sc.nextInt();
        int result[] = twoSum(arr, target);
        System.out.println("indexes " + result[0] + " , " + result[1]);
    }

    public static int[] twoSum(int[] nums, int target) {

        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[] { i, j }; // returning indexes
                }
            }
        }
        return new int[] { -1, -1 };
    }
}