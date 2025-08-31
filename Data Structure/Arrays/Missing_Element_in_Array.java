
public class Missing_Element_in_Array {

    public static int missing(int arr[]) {
        int n = arr.length + 1;
        int sumN = (n * (n + 1)) / 2;
        int arrSum = 0;
        for (int ele : arr) {
            arrSum += ele;
        }

        return sumN - arrSum;   //int missingEle = sumN - arrSum;
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6, 7 , 8 , 10};
        // int missEle = missing(arr);
        System.out.println("missing element in array is " + missing(arr));
    }
}
