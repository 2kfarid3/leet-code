import java.util.*;

public class RomanToInteger {
    public static void main(String[] args) {
        int result = romanToInt("III");
        System.out.println(result);
    }

    public static int romanToInt(String s) {
        Map<String, Integer> roman_integer = new HashMap<>();
        roman_integer.put("I", 1);
        roman_integer.put("V", 5);
        roman_integer.put("X", 10);
        roman_integer.put("L", 50);
        roman_integer.put("C", 100);
        roman_integer.put("D", 500);
        roman_integer.put("M", 1000);

        List<String> letters = Arrays.asList(s.split(""));

        List<Integer> numbers = new ArrayList<>();

        for (int i = 0; i < letters.size(); i++) {
            String currentLetter = letters.get(i);
            int currentValue = roman_integer.get(currentLetter);

            if (i + 1 < letters.size()) {
                String nextLetter = letters.get(i + 1);
                int nextValue = roman_integer.get(nextLetter);

                if (currentValue < nextValue) {
                    currentValue = -currentValue;
                }
            }

            numbers.add(currentValue);
        }

        int result = numbers.stream().reduce(0, Integer::sum);
        return result;
    }
}
