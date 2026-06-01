class Solution {
    public int evalRPN(String[] tokens) {
        Deque<Integer> stack = new ArrayDeque<>();
        int num = 0;
        int sum = 0;
        int temp1 = 0;
        int temp2 = 0;

        for (int i = 0; i < tokens.length; i++) {
            String s = tokens[i];
            char c = s.charAt(0);

            if (Character.isDigit(c) || (s.length() > 1 && c == '-')){
            num = Integer.parseInt(tokens[i]);
            stack.push(num);
            }
            else if (c == '+') {
                temp1 = stack.pop();
                temp2 = stack.pop();
                sum = (temp2 + temp1);
                stack.push(sum);
            }
            else if (c == '-') {
                temp1 = stack.pop();
                temp2 = stack.pop();
                sum = (temp2 - temp1);
                stack.push(sum);
            }
            else if (c == '*') {
                temp1 = stack.pop();
                temp2 = stack.pop();
                sum = (temp2 * temp1);
                stack.push(sum);
            }
            else if (c == '/') {
                temp1 = stack.pop();
                temp2 = stack.pop();
                sum = (temp2 / temp1);
                stack.push(sum);
            }
        }
        return stack.pop();
    }
}
