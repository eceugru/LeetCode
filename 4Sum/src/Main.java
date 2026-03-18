import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public List<List<Integer>> fourSum(int[] nums, int target) {

        Arrays.sort(nums);

        List<List<Integer>>  list = new ArrayList<>();

        for (int i = 0; i < nums.length-2; i++) {
            for (int j = i + 1; j < nums.length-1; j++) {
                int left = j+1;
                int right = nums.length-1;
                while (left < right) {
                    long sum = (long) nums[i]+nums[j]+nums[left]+nums[right];
                    if(sum>target){
                        right--;
                    }
                    else if (sum<target) {
                        left++;

                    } else if(sum==target){
                        List<Integer>  list1 = new ArrayList<>();
                        list1.add(nums[i]);
                        list1.add(nums[j]);
                        list1.add(nums[left]);
                        list1.add(nums[right]);
                        list.add(list1);
                        left++;
                        right--;

                    }else{
                        list.add(new ArrayList<>());
                        left++;
                        right--;
                    }

                }

            }
        }

        Set<List<Integer>>  set = new HashSet<>();
        list.forEach(l->{set.add(l);});

        List<List<Integer>>  resultList = new ArrayList<>(set);
        return resultList;

    }



    public static void main(String[] args) {
        int[] nums1 = {1000000000,1000000000,1000000000,1000000000};
        int target = -294967296;

        Main m = new Main();
        System.out.println(m.fourSum(nums1,target));




    }
}