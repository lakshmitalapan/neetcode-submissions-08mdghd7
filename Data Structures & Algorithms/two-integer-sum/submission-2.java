class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> mapping = new HashMap<>();
        int comp = 0;
        for (int i = 0; i < nums.length; i++) {
            comp = target - nums[i];
            if (mapping.containsKey(comp)) {
                return new int[]{mapping.get(comp), i};
            }
            mapping.put(nums[i], i);
        }
        return new int[]{0, 0};
    }
}
