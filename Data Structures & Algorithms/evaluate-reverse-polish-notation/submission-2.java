class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        int counter = 0;
        int val1;
        int val2;
        char temp;
        while (counter < tokens.length) {
            temp = tokens[counter].charAt(0);
            if (tokens[counter].length() == 1 && (temp == '+' || temp == '-' || temp == '*' || temp == '/')) {
                val2 = stack.pop();
                val1 = stack.pop();
                if (temp == '+') {
                    stack.push(val1 + val2);
                } else if (temp == '-') {
                    stack.push(val1 - val2);
                } else if (temp == '*') {
                    stack.push(val1 * val2);
                } else {
                    stack.push(val1 / val2);
                }
            } else {
                stack.push(Integer.parseInt(tokens[counter]));
            }
            counter++;
        }
        return stack.pop();
    }
}
