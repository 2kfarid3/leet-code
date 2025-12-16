public class AddBinary {
    public static void main(String[] args) {
        String a = "1010";
        String b = "1011";
        System.out.println(addBinary(a, b));
    }

    public static String addBinary(String a, String b) {

        int count = 0;
        Character[] main;
        char carry = '0';
        char temp;
        String result = "";

        // if either of strings length is less than another, create char array and
        // put 0s to the beginning of that array, because we begin from right while we are doing sum

        if (a.length() < b.length()) {

            main = new Character[b.length()];
            for (int i = b.length() - 1; i >= 0; i--) {
                if (count < a.length()) {
                    main[i] = a.charAt(a.length() - 1 - count);
                    count++;
                } else {
                    main[i] = '0';
                }
            }

            // logic: sum = bitA + bitB + carry
            for (int i = main.length - 1; i >= 0; i--) {

                temp = (char) (main[i] + b.charAt(i) + carry);

                if (Character.hashCode(temp) == 144) {          // 0+0+0
                    result = String.join("", "0", result);
                    carry = '0';
                } else if (Character.hashCode(temp) == 145) {   // 0+0+1 OR 0+1+0 OR 1+0+0
                    result = String.join("", "1", result);
                    carry = '0';
                } else if (Character.hashCode(temp) == 146) {   // 1+1+0
                    result = String.join("", "0", result);
                    carry = '1';
                } else if (Character.hashCode(temp) == 147) {   // 1+1+1
                    result = String.join("", "1", result);
                    carry = '1';
                }
            }

            if (carry == '1') {
                result = String.join("", "1", result);
            }
            return result;

        } else {

            main = new Character[a.length()];
            for (int i = a.length() - 1; i >= 0; i--) {
                if (count < b.length()) {
                    main[i] = b.charAt(b.length() - 1 - count);
                    count++;
                } else {
                    main[i] = '0';
                }
            }

            for (int i = main.length - 1; i >= 0; i--) {

                temp = (char) (main[i] + a.charAt(i) + carry);

                if (Character.hashCode(temp) == 144) {
                    result = String.join("", "0", result);
                    carry = '0';
                } else if (Character.hashCode(temp) == 145) {
                    result = String.join("", "1", result);
                    carry = '0';
                } else if (Character.hashCode(temp) == 146) {
                    result = String.join("", "0", result);
                    carry = '1';
                } else if (Character.hashCode(temp) == 147) {
                    result = String.join("", "1", result);
                    carry = '1';
                }
            }

            if (carry == '1') {
                result = String.join("", "1", result);
            }
            return result;
        }
    }
}
