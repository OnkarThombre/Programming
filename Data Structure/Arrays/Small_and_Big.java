
public class Small_and_Big {

    // public static void main(String[] args) {
    //     int arr[] = {4, 8, 7, 1, 0, 5, 10};
    //     System.out.println(Arrays.toString(arr));
    //     for (int i = 0; i < 1; i++) {
    //         for (int j = 1; j < arr.length; j++) {
    //             if (arr[i] > arr[j]) {
    //                 int temp = arr[i];
    //                 arr[i] = arr[j];
    //                 arr[j] = temp;
    //             }
    //         }
    //     }
    //     // System.out.println(Arrays.toString(arr));
    //     System.out.println("Smallest element in an array is " + arr[0]);
    // for this time complexity is o(n) and s(n) = o(1)
    // but in last array gets modified or changed 
    // }
    public static void main(String[] args) {
        int arr[] = {10, 8, 50, 4, 3, 0};
        int min = arr[0];
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("min :-" + min+ " max is " + max );
    }
}
/*
 * for this time complexity is o(n) and s(n) = o(1)
 * here array does not get modified
 */