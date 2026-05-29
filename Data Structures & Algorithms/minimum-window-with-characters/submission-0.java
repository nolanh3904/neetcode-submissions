class Solution {
    public String minWindow(String s, String t) {
        HashMap<Character, Integer> window = new HashMap<>();
        HashMap<Character, Integer> freqT = new HashMap<>();
        int left = 0;
        int start = 0;
        int minLen = Integer.MAX_VALUE;
        int have = 0;

        if (s.length() < t.length()) {
            return "";
        }
        for (char c : t.toCharArray()) {
            freqT.put(c, freqT.getOrDefault(c, 0) + 1);
        }

        int need = freqT.size();
        for (int right = 0; right < s.length(); right++) {
            char c = s.charAt(right);
            window.put(c, window.getOrDefault(c, 0) + 1);
            
                if (freqT.containsKey(c) &&
                    window.get(c).equals(freqT.get(c))) {
                    have++;
                }
            while(have == need) {
                if (right - left + 1 < minLen) {
                    minLen = right - left + 1;
                    start = left;
                }
                char leftChar = s.charAt(left);
                window.put(leftChar, window.get(leftChar) - 1);
                if (freqT.containsKey(leftChar) &&
                    window.get(leftChar) < freqT.get(leftChar)) {
                    have--;
                }
                left++;
            }
        }

        if (minLen == Integer.MAX_VALUE) {
            return "";
        } else {
            return s.substring(start, start + minLen);
        }
    }
}
