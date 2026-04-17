
class Solution {
    public boolean isAnagram(String s, String t) {
        
        char[] sChar = s.toCharArray();
        char[] tChar = t.toCharArray();
        if (sChar.length != tChar.length) {
            return false;
        }
        HashMap<Character, Integer> mapping = new HashMap<>();
        for (int i = 0; i < sChar.length; i++) {
            mapping.put(sChar[i], mapping.getOrDefault(sChar[i], 0) + 1);
        }
        for (int i = 0; i < tChar.length; i++) {
            if (!mapping.containsKey(tChar[i])) {
                return false;
            } else {
                mapping.put(tChar[i], mapping.get(tChar[i]) - 1);
            }
        }
        for (int val : mapping.values()) {
            if (val != 0) {
                return false;
            }
        }
        return true;
    }
}
