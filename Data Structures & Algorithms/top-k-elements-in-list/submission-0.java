class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> frequency = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (frequency.containsKey(nums[i])) {
                frequency.put(nums[i], frequency.get(nums[i]) + 1);
            } else {
                frequency.put(nums[i], 1);
            }
        }
        
        List<int[]> freqArr = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : frequency.entrySet()) {
            freqArr.add(new int[]{entry.getValue(), entry.getKey()});
        }

        freqArr.sort((a, b) -> b[0] - a[0]);
        
        int[] answers = new int[k];
        for (int i = 0; i < k; i++) {
            answers[i] = freqArr.get(i)[1];
        }

        return answers;
    }
}