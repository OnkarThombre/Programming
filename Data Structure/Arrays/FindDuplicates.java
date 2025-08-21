import java.util.*;

public class FindDuplicates {
    public static List<Integer> findDuplicates(int[] nums) {
        List<Integer> result = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            int index = Math.abs(nums[i]) - 1;

            // If already negative, number is duplicate
            if (nums[index] < 0) {
                result.add(Math.abs(nums[i]));
            } else {
                nums[index] = -nums[index];  // Mark as visited
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[] nums1 = {4, 3, 2, 7, 8, 2, 3, 1};
        System.out.println(findDuplicates(nums1));  // Output: [2, 3]

        int[] nums2 = {1, 1, 2};
        System.out.println(findDuplicates(nums2));  // Output: [1]

        int[] nums3 = {1};
        System.out.println(findDuplicates(nums3));  // Output: []
    }
}


