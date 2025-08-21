
public class DuplicateEle {

    public static void main(String[] args) {
        // int arr[] = {2, 3, 5, 4, 3};
        //for this problem occurs when arr[] = {1,3,3,3,3,4}; it prints multiple time 3333

        // boolean isFound = false;
        // System.out.println("Element duplicate are");
        // for (int i = 0; i < arr.length - 1; i++) {
        //     for (int j = i + 1; j < arr.length; j++) {
        //         if (arr[i] == arr[j]) {
        //             System.out.println(arr[i]);
        //             isFound = true;
        //             break;
        //         }
        //     }
        // }
        // if (!isFound) {
        //     System.out.println("not present");
        // }
        //improved version
        // int arr[] = {2, 3, 3, 3, 3, 3, 4, 4, 2};
        // int arr[] = {};
        // System.out.println(Arrays.toString(arr));
        // System.out.println("Duplicate elements ");
        // boolean isFound = false;
        // for (int i = 0; i < arr.length - 1; i++) {
        //     boolean isPrint = false;
        //     for (int j = i + 1; j < arr.length; j++) {
        //         if (arr[i] == arr[j] && !isPrint) {
        //             System.out.println(arr[i]);
        //             isFound = true;
        //             isPrint = true;
        //             break;
        //         }
        //     }
        // }
        // if (!isFound) {
        //     System.out.println("No elements are repeat in this array");
        // }
        //super improved version
        int arr[] = {2, 3, 3, 3, 3, 3, 4, 4, 2};

        boolean isFound = false;
        System.out.println("Duplicate element ");
        for (int i = 0; i < arr.length - 1; i++) {

            boolean isPrint = false;
            for(int k = i-1 ; k >= 0 ; k--)
            {
                if(arr[i] == arr[k])
                {
                    isPrint = true;
                    break;
                }
            }
            // for (int k = 0; k < i; k++) {
            //     if (arr[i] == arr[k]) {
            //         isPrint = true;
            //         break; // for not to make or take the extra iteration
            //     }
            // }

            if (!isPrint) {
                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[i] == arr[j]) {
                        System.out.print(arr[i]+ "  ");

                        isFound = true;
                        break; // for not to print multiple times that same element 
                    }
                }
            }

        }

        if (!isFound) {
            System.out.println("Are not present");
        }

    }

}

/* to refer perfect where brek is used and why
 * public class DuplicateElementsBruteForce {
    public static void main(String[] args) {
        int[] arr = {2, 3, 3, 3, 3, 4};
        boolean found = false;

        System.out.print("Duplicate elements: ");

        for (int i = 0; i < arr.length; i++) {
            boolean isPrinted = false; // To track if we already printed this duplicate

            // Check if arr[i] was printed earlier
            for (int k = 0; k < i; k++) {
                if (arr[i] == arr[k]) {
                    isPrinted = true;
                    break;
                }
            }

            // If arr[i] was not printed before, then check if it appears later
            if (!isPrinted) {
                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[i] == arr[j]) {
                        System.out.print(arr[i] + " ");
                        found = true;
                        break; // Break inner loop to avoid printing arr[i] multiple times
                    }
                }
            }
        }

        if (!found) {
            System.out.println("No duplicates found");
        }
    }
}

 */
