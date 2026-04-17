class Solution {
    public int lengthOfLongestSubstring(String s) {
        char[] sChar = s.toCharArray();
        if (sChar.length == 1) {
            return 1;
        }
        ArrayList<Character> tracker = new ArrayList<>();
        int counter = 0;
        int maxCounter = 0;
        int left = 0;
        int right = 0;
        while (right < sChar.length) {
            if (!tracker.contains(sChar[right])) {
                counter++;
                maxCounter = Math.max(counter, maxCounter);
                tracker.add(sChar[right]);
                right++;
            } else {
                counter--;
                tracker.remove(0);
                left++;
            }
        }
        return maxCounter;


    }
}
