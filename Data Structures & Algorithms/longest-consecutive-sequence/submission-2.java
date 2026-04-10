class Solution {
    public int longestConsecutive(int[] nums) {
        ArrayList<Integer> store = new ArrayList<>();
        if (nums.length == 0) {
            return 0;
        }
        for (int i = 0; i < nums.length; i++) {
            store.add(nums[i]);
        }
        store.sort((a, b) -> a - b);
        int seq = 1;
        int longest = 1;
        for (int i = 0; i < store.size() - 1; i++) {
            if (longest < seq) {
                longest = seq;
            }
            if (store.get(i).equals(store.get(i+1))) {
                continue;
            }
            if (store.get(i).equals(store.get(i+1) - 1)) {
                seq++;
            } else {
                seq = 1;
            }
        }
        return Math.max(seq, longest);
    }
}
