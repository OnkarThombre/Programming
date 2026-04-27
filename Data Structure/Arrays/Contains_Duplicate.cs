/*
217. Contains Duplicate
Given an integer array nums retum true if any value appears at least twice
in the array, and retum false if every element is distinct.
Example 1:
Input: nums —
Output: t rue
Explanation:
The element 1 occurs at the indices 0 and 3.
Example 2:
Input: nums —
Output: false
Explanation:
All elements are distinct.
Example 3:
Input: nums =
Output: t rue
*/

public class Solution {
    public bool ContainsDuplicate(int[] nums) {
        // bool isDuplicate = false;
        // for(int i = 0 ; i < nums.Length - 1 ; i++)
        // {
        //     for(int j = i + 1 ; j < nums.Length ; j++)
        //     {
        //         if(nums[i] == nums[j])
        //         {
        //             isDuplicate = true;
        //             break;    // u can also directly return true or false 
        //         }
        //     }
        // }
        // if(isDuplicate)
        // {
        //     return true;
        // }
        // else{
        //     return false;
        // }

        HashSet<int> set = new HashSet<int>();

        foreach(int ele in nums)
        {
            if(set.Contains(ele))
            {
                return true;
            }
            else{
                set.Add(ele);
            }
        }

        return false;
    } 
}
