import java.util.HashMap;

class TwoSum {
    public int[] twoSum(int[] nums, int target) {

        if (nums.length < 2) {
            return new int[]{};
        }
        HashMap<Integer, Integer> map = new HashMap<>(nums.length);
        for (int i = 0; i < nums.length; i++) {
            int temp = target - nums[i];
            if (map.containsKey(temp)) {
                return new int[]{map.get(temp), i};
            }
            map.put(nums[i], i);
        }
        return new int[]{};
    }


}