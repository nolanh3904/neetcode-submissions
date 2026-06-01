class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        Deque<Double> stack = new ArrayDeque<>();
        double time = 0;
        int[][] cars = new int[position.length][2];

for (int i = 0; i < position.length; i++) {
    cars[i][0] = position[i];
    cars[i][1] = speed[i];
        }

        Arrays.sort(cars, (a, b) -> a[0] - b[0]);

        for (int i = position.length - 1; i >= 0; i--) {
            double pos = cars[i][0];
            double spd = cars[i][1];

            time = (target - pos) / spd;

            if (stack.isEmpty()) {
                stack.push(time);
            }
            if (time > stack.peek()) {
                stack.push(time);
            }
        }
        return stack.size();
    }
}
