
package com.michalsadel.twosum;

import java.util.concurrent.*;

public class HashSolution implements Solution {
    @Override
    public int[] twoSum(int[] nums, int target) {
        if (nums == null) {
            return null;
        }
        ConcurrentHashMap<Integer, Integer> map = new ConcurrentHashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.putIfAbsent(nums[i], i);
        }
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement) && map.get(complement) != i) {
                return new int[]{i, map.get(complement)};
            }
        }
        return null;
    }
}
