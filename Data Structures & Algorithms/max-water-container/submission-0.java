class Solution {
    public int maxArea(int[] heights) {
        int water = 0;
        int max = 0;
        int left = 0;
        int smaller = 0;
        int right = heights.length - 1;
        while (left < right) {
            if (heights[left] < heights[right]) {
                water = heights[left] * (right - left);
                smaller = left;
                left++;
            } else {
                smaller = right;
                water = heights[right] * (right - left);
                right--;
            }
            max = Math.max(water, max);
        }
        return max;
        

    }
}
