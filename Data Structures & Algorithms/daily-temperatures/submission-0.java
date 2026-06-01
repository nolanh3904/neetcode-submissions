class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Deque<Integer> stack = new ArrayDeque<>();
        int[] result = new int[temperatures.length];
        int days = 0;

        for (int i = 0; i < temperatures.length; i++) {
            if (stack.isEmpty()) {
                stack.push(i);
            }
            while(!stack.isEmpty() && temperatures[i] > temperatures[stack.peek()]) {
                days = stack.pop();
                result[days] = i - days;
            }
            stack.push(i);
        }
        return result;
    }
}
