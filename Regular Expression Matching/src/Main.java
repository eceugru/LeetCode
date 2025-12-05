//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public boolean isMatch(String s, String p) {
        int o = 0;
        while (o < p.length()) {
            if (p.charAt(o) == '.') {
                return true;
            }
            o++;
        }

        int i = 0;
        System.out.println(p.length());
        while(i < p.length() && p.charAt(i) != '*') {
            System.out.println(i);
            i++;
        }
        if(i == p.length() && p!=s){
            return false;
        }

        for (int k = 0; k<i; k++){
            //System.out.println(b.charAt(k));
            if(s.charAt(k)==p.charAt(k)){
                continue;
            }else {
                return false;
            }
        }
        int h = p.length()-1-i;
        //System.out.println(" d: " + h);

        for(int j = 1; j<=h; j++){
            //System.out.println("b: " + s.charAt(s.length()-j));
            if (s.charAt(s.length()-j)==p.charAt(p.length()-j)){
                continue;

            }else {
                return false;
            }

        }
        return true;

    }

    public static void main(String[] args) {

    }
}