class Solution {
    public boolean isValid(String s) {
        char[] charArray = s.toCharArray();
        Deque<Character> stack = new ArrayDeque<>();
        for (int i = 0; i < charArray.length; i++) {
            if (charArray[i] == '(') {
                stack.push(')');
            } else if (charArray[i] == '[') {
                stack.push(']');
            } else if (charArray[i] == '{') {
                stack.push('}');
            } else {
                if ((stack.isEmpty()) || charArray[i] != stack.pop()) {
                    return false;
                }
            }
        }
        if(stack.isEmpty()) {
            return true;
        }
        return false;
    }
}
