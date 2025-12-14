public class LengthOfLastWord {
    public static void main(String[] args) {
        System.out.println(lengthOfLastWord("   fly me   to   the moon  "));
    }





    public static int lengthOfLastWord(String s) {

        int last_index = 0;
        for (int i = s.length()-1; i > 0 ; i--) {
            if (s.charAt(i) != ' ') {
                last_index = i;
                break;
            }
        }

        int count = 0;
        for (int i = last_index; i > 0 ; i--) {
            if (s.charAt(i) != ' ') {
                count++;
            } else {
                break;
            }
        }

        return count;
    }
}
