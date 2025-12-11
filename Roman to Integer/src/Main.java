import java.util.HashMap;
import java.util.List;
import java.util.Objects;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public int romanToInt(String s) {

        int number = 1;
        int ans = 0;

        for (int i = s.length()-1; i >= 0 ; i--) {
            switch (s.charAt(i)) {
                case 'I':
                    number = 1;
                    break;
                case 'V':
                    number = 5;
                    break;
                case 'X':
                    number = 10;
                    break;
                case 'L':
                    number = 50;
                    break;
                case 'C':
                    number = 100;
                    break;
                case 'D':
                    number = 500;
                    break;
                case 'M':
                    number = 1000;
                    break;
            }
            if ((4 * number) < ans) {
                ans -= number;
            } else {
                ans += number;
            }
        }
        return ans;
    }
    public static void main(String[] args) {


        System.out.println(new Main().romanToInt("MCMXCIV"));








    }
}
