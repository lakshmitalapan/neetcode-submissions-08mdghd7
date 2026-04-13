class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] answer = new int[nums.length];
        int numzero = 0;
        int loc = 0;
        int prod = 1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                numzero++;
                loc = i;
                continue;
            }
            prod *= nums[i];
        }
        if (numzero >= 1) {
            for (int i = 0; i < nums.length; i++) {
                answer[i] = 0;
            }
            if (numzero > 1) {
                return answer;
            }
            
            answer[loc] = prod;
            return answer;
        }

        for (int i = 0; i < nums.length; i++) {
            answer[i] = prod / nums[i];
        }
        return answer;
    }
}  
