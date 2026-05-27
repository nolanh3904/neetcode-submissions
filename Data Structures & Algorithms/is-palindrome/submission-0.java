class Solution {
    public boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;

        while (left < right) {
            char leftChar = Character.toLowerCase(s.charAt(left));
            char rightChar = Character.toLowerCase(s.charAt(right));

            if (Character.isLetterOrDigit(leftChar) == false) {
                left++;
            } else if (Character.isLetterOrDigit(rightChar) == false) {
                right--;
            } else if (leftChar == rightChar) {
                left++;
                right--;
            } else {
                return false;
            }
        }
        return true;
    }
}
