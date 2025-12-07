import java.util.ArrayList;
import java.util.List;

public class LongestCommonPrefix {
    public static void main(String[] args) {

        String[] strings = new String[]{"flower", "flow", "france"};
        String result = longestCommonPrefix(strings);
        System.out.println(result);
    }


    public static String longestCommonPrefix(String[] strs) {

        List<Character> chars = new ArrayList<>();
        List<Character> mains = new ArrayList<>();
        List<String> strings = new ArrayList<>();

        for (String str : strs) {
            char prev = str.charAt(0);
            chars.add(prev);
        }

        for (int i = 0; i < chars.size(); i++) {
            if (!chars.contains(chars.get(i))) {
                chars.remove(chars.get(i));
            }
        }

        if (chars.isEmpty()) {
            return "";
        }

        char first = chars.getFirst();
        for (String str : strs) {
            if (str.charAt(0) == first) {
                strings.add(str);
            }
        }

        int min = 200;
        for (String string : strings) {
            if (string.length() < min) {
                min = string.length();
            }
        }

        for (int i = 0; i < min; i++) {
            char c = strs[0].charAt(i);
            boolean allMatch = true;

            for (int j = 1; j < strs.length; j++) {
                if (strs[j].charAt(i) != c) {
                    allMatch = false;
                    break;
                }
            }

            if (allMatch) {
                mains.add(c);
            } else {
                break;
            }
        }

        StringBuilder sb = new StringBuilder();
        for (char ch : mains) {
            sb.append(ch);
        }
        return sb.toString();
    }
}
