class Solution {
    public boolean isValid(String s) {
        Deque<Character> stack = new ArrayDeque<>();

        if (s.length() == 1) {
            return false;
        }

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else if (c == ')') {
                if (stack.isEmpty() || stack.peek() != '(' ) {
                    return false;
                }
                stack.pop();
            } else if (c == '}') {
                if (stack.isEmpty() || stack.peek() != '{' ) {
                    return false;
                }
                stack.pop();
            } else if (c == ']') {
                if (stack.isEmpty() || stack.peek() != '[' ) {
                    return false;
                }
                stack.pop();
            }
        }
        return stack.isEmpty();
    }
}
