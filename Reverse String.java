class Solution {
    public String reverseWords(String s) {
        int n = s.length();
        int i = n - 1;
        StringBuilder result = new StringBuilder();

        while (i >= 0) {
            while (i >= 0 && s.charAt(i) == ' ') {
                i--;
            }
            if (i < 0) break;

            int j = i;
            while (j >= 0 && s.charAt(j) != ' ') {
                j--;
            }

            result.append(s.substring(j + 1, i + 1)).append(" ");
            i = j - 1;
        }
        return result.toString().trim();
    }
}
