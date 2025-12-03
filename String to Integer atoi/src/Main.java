//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public int myAtoi(String s) {
        if (s.length() == 0 || s == null) {
            return 0;
        }
        int i = 0;

        while (i < s.length() && s.charAt(i) == ' ') {
            i++;
        }
        if (i == s.length()) {
            return 0;
        }

        int sign = 1;
        if (s.charAt(i) == '+') {
            i++;
        } else if (s.charAt(i) == '-') {
            i++;
            sign = -1;
        }

        long res = 0;
        while (i < s.length() && Character.isDigit(s.charAt(i))) {
            int digit = s.charAt(i) - '0';
            System.out.println(digit);
            res = (res * 10) + digit;

            if (sign*res >= Integer.MAX_VALUE) {
                return Integer.MAX_VALUE;
            } else if (sign*res <= Integer.MIN_VALUE) {
                return Integer.MIN_VALUE;
            }
            i++;
        }
        return (int) (res*sign);
    }
    public static void main(String[] args) {

    }

}