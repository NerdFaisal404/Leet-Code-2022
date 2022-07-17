package easy;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public static void main(String[] args) {
        TwoSum twoSum = new TwoSum();
        int[] nums = new int[]{2, 7, 11, 15};

        System.out.println(twoSum.twoSum(nums, 9));
    }

    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> numToIndex = new HashMap<>();

        for (int i = 0; i < nums.length; ++i) {
            int index = target - nums[i];
            if (numToIndex.containsKey(index))
                return new int[]{numToIndex.get(target - nums[i]), i};
            numToIndex.put(nums[i], i);
        }

        throw new IllegalArgumentException();
    }
}
