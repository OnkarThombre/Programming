
public class DuplicateEle {

    public static void main(String[] args) {
        int arr[] = {2, 3, 5, 4, 3};
        boolean isFound = false;
        System.out.println("Element duplicate are");
        for (int i = 0; i < arr.length - 1; i++) {

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    System.out.println(arr[i]);
                    isFound = true;
                }
            }

        }

        if (!isFound) {
            System.out.println("not present");
        }

    }

}
