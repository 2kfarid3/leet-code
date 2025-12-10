public class FindTheIndexOfTheFirstOccurrenceInString {
    public static void main(String[] args) {
        String haystack = "leetcode";
        String needle = "leeto";
        System.out.println(strStr(haystack, needle));
    }




    public static int strStr(String haystack, String needle) {
            return haystack.indexOf(needle);
    }

    public static int strStrV2(String haystack, String needle) {
        if (needle.isEmpty()) {
            return 0;
        }

        int n = haystack.length();
        int m = needle.length();

        if (m > n) {
            return -1;
        }

        for (int i = 0; i <= n - m; i++) {
            int j = 0;
            while (j < m && haystack.charAt(i + j) == needle.charAt(j)) {
                j++;
            }
            if (j == m) {
                return i;
            }
        }

        return -1;
    }
}
