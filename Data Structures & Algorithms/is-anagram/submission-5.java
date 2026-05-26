class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> map1 = new HashMap<>();
        HashMap<Character, Integer> map2 = new HashMap<>();

        if (s.length() != t.length()) {
            return false;
        }
        for (int i=0; i<s.length();i++) {
            int count1 = 1;
            char c = s.charAt(i);
            if (map1.containsKey(c)) {
                count1 = map1.get(c) + 1;
            }
            map1.put(c, count1);
        }
        for (int j=0; j<t.length();j++) {
            int count2 = 1;
            char k = t.charAt(j);
            if (map2.containsKey(k)) {
                count2 = map2.get(k) + 1;
            }
            map2.put(k, count2);
        }
        if (map1.equals(map2)) {
                return true;
            }

        return false;
    }
}