
import java.util.Arrays;






public class SelectionSort {

    public static void main(String[] args) {
        System.out.println("Onkar");
        int arr[] = {6, 4, 2, 8, 3, 1};
        selection_Sort(arr);
        System.out.println(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void selection_Sort(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

    }
    

}
