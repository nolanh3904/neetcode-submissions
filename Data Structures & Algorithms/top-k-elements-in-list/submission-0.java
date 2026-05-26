class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int[] finArr = new int[k];

        for (int i = 0; i < nums.length; i++) {
            int counter = 1;
            if (map.containsKey(nums[i])) {
                map.put(nums[i], map.get(nums[i]) + 1);
            } else {
                map.put(nums[i], counter);
            }
        }
        for (int i = 0; i < finArr.length; i++) {
            int max = -1;
            int maxNum = 0;

            for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
                int num = entry.getKey();
                int freq = entry.getValue();

                if (freq > max) {
                    max = freq;
                    maxNum = num;
                }
            }
            finArr[i] = maxNum;
            map.remove(maxNum);
        }
        return finArr;
    }
}