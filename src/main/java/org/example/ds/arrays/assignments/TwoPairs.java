package org.example.ds.arrays.assignments;

import java.util.HashMap;
import java.util.Map;

public class TwoPairs {

    public static int[] twoSum(int[] nums, int target) {
        // TODO

        Map<Integer, Integer> map = new HashMap<>();

        for(int i=0;i<nums.length;i++)
        {
            int diff = target - nums[i];
            if(map.get(nums[i]) == null)
                map.put(diff,i);
            else
                return new int[] {map.get(nums[i]),i};
        }

     return new int[]{0};
    }


    public static void main(String[] args) {
        int a[] = {2,7,11,15};
        int target = 9;
        int b[] = twoSum(a,target);
        System.out.println(java.util.Arrays.toString(b));
    }

}
