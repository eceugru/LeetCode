//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public int removeElement(int[] nums, int val) {
        int index = 0;
        int temp;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == val) {
                    temp = nums
                }
            }
        }
        System.out.print(nums.length-index+ ",");
        System.out.print(" nums = [");
        for(int i = 0; i<nums.length; i++){
            System.out.print(",");
            if (nums[i] == val){
                System.out.print("_");
            }else{
                System.out.print(nums[i]);
            }
        }
        System.out.print("]");

        return nums.length-index;
    }
    public static void main(String[] args) {
        Main main = new Main();
        int[] arr = {1,2,3,4,2,2,2};

        main.removeElement(arr,2);

    }
}