import java.util.ArrayList;
import java.util.List;
class FindDuplicateUsingList {
    public static List<Integer> findDuplicates(int[] nums) {
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i< nums.length - 1; i ++)
        {
            for(int j = i + 1 ; j < nums.length ; j ++)
            {
                if(nums[i] == nums[j])
                {
                    if (!list.contains(nums[i])) {
                        list.add(nums[i]);
                    }
                    // list.add(nums[i]);
                    break;
                    /*
                    if (nums[i] == nums[j] && !list.contains(nums[i])) {
                    list.add(nums[i]);
                    break;
                    }
                     */
                }
            }
        }
        return list;
    }

    public static void main(String args[])
    {
        int arr[] = {2,3,3,3,4,5,2,3};
        
        // System.out.println(findDuplicates(arr));
        List<Integer> resList = findDuplicates(arr);
        for(int num : resList )
        {
            System.out.println(num);
        }
    }
}