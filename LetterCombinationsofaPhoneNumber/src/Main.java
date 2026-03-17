import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public List<String> letterCombinations(String digits) {
        Map<String,List<String>> list = new HashMap<>();
        list.put("2",List.of("a","b","c"));
        list.put("3",List.of("d","e","f"));
        list.put("4",List.of("g","h","i"));
        list.put("5",List.of("j","k","l"));
        list.put("6",List.of("m","n","o"));
        list.put("7",List.of("p","q","r","s"));
        list.put("8",List.of("t","u","v"));
        list.put("9",List.of("w","x","y","z"));

        String[] letters = digits.split("");



        List<String> result = new ArrayList<>();
        result.addAll(list.get(letters[0]));

        for(Character c : digits.substring(1).toCharArray()){
            List<String> temp = new ArrayList<>();

            for(String s : result){
                for(String s1 : list.get(String.valueOf(c))){
                    temp.add(s + s1);
                }
            }
            result =  temp;
        }
        return result;

    }
    public static void main(String[] args) {


        String digits = "234";
        Main m = new Main();
        System.out.println(m.letterCombinations(digits));
    }
}