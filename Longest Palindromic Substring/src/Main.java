import java.util.*;


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public String longestPalindrome(String s){
        int len = s.length();
        Set<String> subStr =  new HashSet<>();
        for(int i = 0; i < len; i++){
            for(int j = i; j < len; j++){
                String str = s.substring(i, j+1);
                if(isPalindrome(str)){
                    subStr.add(str);
                }
            }
        }
        String longest = subStr.stream().max(Comparator.comparingInt(String::length)).orElse(null);
        return longest;

    }

    public static boolean isPalindrome(String s){
        int i = 0, j = s.length()-1;
        while(i < j){
            if(s.charAt(i) != s.charAt(j)){
                return false;
            }
        }
        return true;
    }


    public static void main(String[] args) {


    }
}