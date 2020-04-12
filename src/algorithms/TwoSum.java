package algorithms;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    /**
     * Runtime: 1 ms, faster than 99.89% of Java online submissions for Two Sum.
     * Memory Usage: 40 MB, less than 5.65% of Java online submissions for Two Sum.
     */
    public int[] twoSum(int[] nums, int target) {
        int[] output = new int[2];

        Map<Integer, Integer> numMap = new HashMap<>();

        for (int i=0; i<nums.length; i++) {
            int diff = target - nums[i];

            if (numMap.containsKey(diff)) {
                output[0] = numMap.get(diff);
                output[1] = i;
                break;
            } else {
                numMap.put(nums[i], i);
            }
        }

        return output;
    }
}
