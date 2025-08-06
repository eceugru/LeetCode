import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String b = "bbbbbb";
        Main main = new Main();
        System.out.println(main.lengthOfLongestSubstring(b));

    }

    public int lengthOfLongestSubstring(String s) {
        Set<Character> charSet = new HashSet<>();
        int left = 0;
        int maxLength = 0;

        for(int right = 0; right < s.length(); right++){

            char currentChar = s.charAt(right);

            while (charSet.contains(currentChar)){
                charSet.remove(s.charAt(left));
                left++;
            }
            charSet.add(currentChar);
            maxLength = Math.max(maxLength, right - left + 1);
        }
        charSet.forEach(System.out::println);

        return maxLength;
    }
}