
class TwoSumusTwoPointer {

    public static void main(String[] args) {
        int arr[] = {4, 8, 70, 120, 500}; // for two sum using two pointer technique array ishould be sorted 

        int left = 0;
        int right = arr.length - 1;
        int target = 78;
        while (left < right) {
            int sum = arr[left] + arr[right];
            if (sum == target) {
                System.out.println("index " + left + " , " + right);
                return;
            } else if (sum < target) {
                left++; 
            }else {
                //sum > target
                right --;
            }

        }
    }
}
