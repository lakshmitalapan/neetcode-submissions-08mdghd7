class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> answer = new ArrayList<>();
        ArrayList<Integer> sortnum = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            sortnum.add(nums[i]);
        }
        sortnum.sort(null);
        int left = 0;
        int right = nums.length - 1;
        int index = 0;
        for (int middle = 1; middle < sortnum.size() - 1; middle++) {
            left = 0;
            right = nums.length - 1;
            while (left < middle && right > middle) {
                if (sortnum.get(left) + sortnum.get(middle) + sortnum.get(right) == 0) {
                    if (!answer.contains(Arrays.asList(sortnum.get(left), sortnum.get(middle), sortnum.get(right)))) {
                        answer.add(Arrays.asList(sortnum.get(left), sortnum.get(middle), sortnum.get(right)));
                    }
                    left++;
                    right--;
                    continue;
                }
                if (sortnum.get(left) + sortnum.get(middle) + sortnum.get(right) < 0) {
                    left++;
                }
                if (sortnum.get(left) + sortnum.get(middle) + sortnum.get(right) > 0) {
                    right--;
                }
            }
        }
        return answer;

    }
}
