class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        char[][] chars = new char[strs.length][];
        List<String> group = new ArrayList<>();
        HashMap<String, List<String>> map = new HashMap<>();

        for (int i = 0; i < strs.length; i++) {
            chars[i] = strs[i].toCharArray();
        }
        for (int i = 0; i < chars.length; i++) {
            Arrays.sort(chars[i]);
        }
        for (int i = 0; i < chars.length; i++) {
            String key = new String(chars[i]);
            if (!map.containsKey(key)){
            map.put(key, new ArrayList<>());
            }
            map.get(key).add(strs[i]);
        }
        return new ArrayList<>(map.values());
    }
}
