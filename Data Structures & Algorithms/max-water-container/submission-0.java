class Solution {
    public int maxArea(int[] height) {
        int ans = 0;
        int area = 0;
        int dist = 0;
        int vert = 0;
        int max = 0;
        int left = 0;
        int right = height.length - 1;

        while (left < right) {
            dist = right - left;
            vert = Math.min(height[left],height[right]);
            area = dist * vert;
            if (area > max) {
                ans = area;
                max = area;
            }
            if (height[left] >= height[right]) {
                right--;
            } else if (height[left] <= height[right]) {
                left++;
            }
        }
        return ans;
    }
}