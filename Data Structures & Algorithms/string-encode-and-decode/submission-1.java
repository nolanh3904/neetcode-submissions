class Solution {

    public String encode(List<String> strs) {
        StringBuilder encoded_string = new StringBuilder();

        for (int i = 0; i < strs.size(); i++) {
            encoded_string
            .append(strs.get(i).length())
            .append("#")
            .append(strs.get(i));
        }
        
        return encoded_string.toString();
    }

    public List<String> decode(String str) {
        List<String> decoded_strs = new ArrayList<String>();
        int i = 0;

    while (i < str.length()) {
        int j = i;
        
        while (str.charAt(j) != '#') {
            j++;
        }
        int length = Integer.parseInt(str.substring(i, j));
        String word = str.substring(j + 1, j + 1 + length);
        decoded_strs.add(word);
        i = j + 1 + length;
    }

        return decoded_strs;
    }
}
