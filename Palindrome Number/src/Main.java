//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public boolean isPalindrome(int x) {
        int a = x;
        if (x < 0) {
            return false;
        }
        int rev = 0;
        while (x != 0) {
            rev = rev * 10 + x % 10;
            x /= 10;
        }
        if(a == rev){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String[] args) {
        Main m = new Main();
        System.out.println(m.isPalindrome(121));


    }
}