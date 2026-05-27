class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int[] ans = new int[2];
        int left = 0;
        int right = numbers.length - 1;

        while (left < right) {
            if (numbers[left] + numbers[right] < target) {
                left++;
            } else if (numbers[right] + numbers[left] > target) {
                right--;
            } else if (target == numbers[left] + numbers[right]) {
                ans[0] = left + 1;
                ans[1] = right + 1;
                return ans;
            }      
        }
        return ans;
    }
}