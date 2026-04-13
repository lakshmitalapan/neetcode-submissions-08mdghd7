class Solution {
    public boolean hasDuplicate(int[] nums) {
        ArrayList<Integer> store = new ArrayList<Integer>();
        for (int i = 0; i < nums.length; i++){
            if (store.contains(nums[i])) {
                return true;
            }
            store.add(nums[i]);
        }
        return false;
    }
}