class MinStack {
    ArrayList<Integer> stack;
    Deque<Integer> minStack = new ArrayDeque<>();
    int min = Integer.MAX_VALUE;

    public MinStack() {
       stack = new ArrayList<>();
    }
    
    public void push(int val) {
        stack.add(val);

        if (minStack.isEmpty()) {
            minStack.push(val);
        } else {
        minStack.push(Math.min(val, minStack.peek()));
        }
    }
    
    public void pop() {
        stack.remove(stack.size() - 1);
        minStack.pop();
    }
    
    public int top() {
        return stack.get(stack.size() - 1);
    }
    
    public int getMin() {
        return minStack.peek();
    }
}
