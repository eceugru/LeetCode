import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public int reverse(int x) {

        long reversed = 0;
        while(x!=0){
            int remainder = x%10;
            x /= 10;
            System.out.println("number : " + x);
            reversed = reversed * 10 +remainder;
            System.out.println("reversed : " + reversed);
            if(reversed< Integer.MIN_VALUE || reversed > Integer.MAX_VALUE){
                return 0;
            }
        }
        return (int) reversed;
    }

    public static void main(String[] args) {

        Main m = new Main();
        m.reverse(1534236469);


    }
}