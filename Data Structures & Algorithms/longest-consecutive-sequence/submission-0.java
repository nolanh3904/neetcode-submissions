class Solution {
    public int longestConsecutive(int[] nums) {
        ArrayList<Integer> sorted = new ArrayList<>();
        int counter = 1;
        int max = 1;

        if (nums.length == 0) {
            return 0;
        }
        if (nums.length == 1) {
            return 1;
        }

        for (int i = 0; i < nums.length; i++) {
            sorted.add(nums[i]);
        }
        Collections.sort(sorted);
        System.out.print(sorted);

        for (int i = 0; i < nums.length - 1; i++) {
            if (sorted.get(i).equals(sorted.get(i + 1) - 1)) {
                counter++;
                if (counter >= max) {
                max = counter;
                }
            } else if (sorted.get(i).equals(sorted.get(i+1))){
            continue;
            } else {
                counter = 1;
            }
        }

        return max;
    }
}