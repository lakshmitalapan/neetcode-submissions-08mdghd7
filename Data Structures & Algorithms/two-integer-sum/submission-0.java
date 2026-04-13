class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] answers = new int[2];
        HashMap<Integer, Integer> intMap = new HashMap<>();
        int compliment = 0;
        for (int i = 0; i < nums.length; i++) {
            compliment = target - nums[i];
            if (intMap.containsKey(compliment)) {
                answers[0] = intMap.get(compliment);
                answers[1] = i;
                return answers;
            }
            intMap.put(nums[i], i);
        }
        return answers;
    }
}
