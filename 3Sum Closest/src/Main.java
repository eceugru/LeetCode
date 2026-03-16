import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);

        int closest = nums[0] + nums[1] + nums[2];

        for(int i = 0; i < nums.length - 2; i++) {

            int left = i + 1;
            int right = nums.length - 1;
            while(left < right) {
                int sum = nums[i] + nums[left] + nums[right];

                if(Math.abs(sum-target)<Math.abs(closest-target)) {
                    closest = sum;
                }
                if(sum>target) {
                    right--;
                }else if(sum<target) {
                    left++;
                }else{
                    return sum;
                }
            }
        }
        return closest;
    }

    public static void main(String[] args) {

        int[] nums = {2, 5, 6, 7};
        int target = 16;

        Main m = new Main();
        System.out.println(m.threeSumClosest(nums, target));


    }
}