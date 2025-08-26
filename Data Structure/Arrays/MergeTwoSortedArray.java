
import java.util.Arrays;

public class MergeTwoSortedArray {

    public static void main1(String[] args) {
        int[] arr1 = {1, 3, 5};
        int[] arr2 = {2, 4, 6};

        // Step 1: Create a new array large enough
        int[] merged = new int[arr1.length + arr2.length];

        // Step 2: Copy both arrays into merged
        for (int i = 0; i < arr1.length; i++) {
            merged[i] = arr1[i];
        }
        for (int i = 0; i < arr2.length; i++) {
            merged[arr1.length + i] = arr2[i];
        }

        // Step 3: Sort the merged array
        Arrays.sort(merged);

        // Print result
        for (int num : merged) {
            System.out.print(num + " ");
        }
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 3, 5};
        int[] arr2 = {2, 4, 6};

        // Step 1: Create a new array
        int[] merged = new int[arr1.length + arr2.length];

        // Step 2: Copy both arrays into merged
        for (int i = 0; i < arr1.length; i++) {
            merged[i] = arr1[i];
        }
        for (int i = 0; i < arr2.length; i++) {
            merged[arr1.length + i] = arr2[i];
        }

        // for (int i = arr1.length; i < arr2.length; i++) {
        //     for (int j = 0; j < arr2.length; j++) {
        //         merged[i] = arr2[j];
        //     }
                // this is false thinking
        // }

        // Step 3: Simple brute-force sort (bubble sort/selection sort)
        for (int i = 0; i < merged.length - 1; i++) {
            for (int j = i + 1; j < merged.length; j++) {
                if (merged[i] > merged[j]) {
                    int temp = merged[i];
                    merged[i] = merged[j];
                    merged[j] = temp;
                }
            }
        }

        // Step 4: Print the result
        for (int num : merged) {
            System.out.print(num + " ");
        }
    }

}
