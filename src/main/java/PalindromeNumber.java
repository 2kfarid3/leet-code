public class PalindromeNumber {
    public static void main(String[] args) {
        System.out.println(isPalindrome(10));
    }





    public static boolean isPalindrome(int x) {

        String str = String.valueOf(x);
        int len = str.length();

        for (int i = 0; i < len; i++) {
            if (str.charAt(i) != str.charAt(len - 1 - i)) {
                return false;
            }
        }
        return true;
    }
}
