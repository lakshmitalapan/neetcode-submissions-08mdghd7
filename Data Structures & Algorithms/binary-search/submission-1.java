class Solution {
    public int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {
            int between = (left + right) / 2;
            if (nums[between] == target) {
                return between;
            } else if (nums[between] < target) {
                left = between + 1;
            } else {
                right = between - 1;
            }
        }
        return -1;
    }


}
