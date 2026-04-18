class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> answer = new ArrayList<>();
        Arrays.sort(nums);
        int mid = 0;
        int right = 0;
        int total = 0;
        for (int left = 0; left < nums.length; left++) {
            mid = left + 1;
            right = nums.length - 1;
            while (mid < right) {
                total = nums[left] + nums[mid] + nums[right];
                if (total == 0) {
                    if (!answer.contains(Arrays.asList(nums[left], nums[mid], nums[right]))) {
                        answer.add(Arrays.asList(nums[left], nums[mid], nums[right]));
                    }
                    mid++;
                    right--;
                } else if (total < 0) {
                    mid++;
                } else {
                    right--;
                }
            }
        }
        return answer;
        
        

    }
}
