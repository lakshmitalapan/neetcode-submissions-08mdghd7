class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int[] result = new int[temperatures.length];
        Stack<Temperature> stack = new Stack<>();
        for (int i = 0; i < temperatures.length; i++) {
            while (!stack.isEmpty() && (stack.peek().temp < temperatures[i])) {
                Temperature waiting = stack.pop();
                result[waiting.index] = i - waiting.index;
            }
            stack.push(new Temperature(temperatures[i], i));
        }
        return result;
        
    }
}

class Temperature {
    int temp;
    int index;
    public Temperature (int temp, int index) {
        this.temp = temp;
        this.index = index;
    }
}
