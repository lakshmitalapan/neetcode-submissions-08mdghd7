class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> storage = new HashMap<>();

        for (int i = 0; i < strs.length; i++) {
            char[] sortedChar = strs[i].toCharArray();
            Arrays.sort(sortedChar);
            String sortedStr = new String(sortedChar);
            if (!storage.containsKey(sortedStr)) {
                storage.put(sortedStr, new ArrayList<>());
            }

            storage.get(sortedStr).add(strs[i]);
        }

        return new ArrayList<>(storage.values());
    }
}
