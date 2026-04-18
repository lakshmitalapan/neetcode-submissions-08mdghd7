class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if (s1.length() > s2.length()) {
            return false;
        }
        char[] s1Char = s1.toCharArray();
        char[] s2Char = s2.toCharArray();
        Arrays.sort(s1Char);
        char[] sub = new char[s1Char.length];
        int right = 0;
        for (int left = 0; left <= (s2Char.length - s1Char.length); left++) {
            right = left + s1Char.length;
            sub = s2.substring(left, right).toCharArray();
            Arrays.sort(sub);
            if (Arrays.equals(sub, s1Char)) {
                return true;
            }
        }
        return false;
        
    }
}
