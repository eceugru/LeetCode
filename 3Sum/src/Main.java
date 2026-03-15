import java.util.*;

public class Main {

    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> threeSumList = new ArrayList<>();

        Arrays.sort(nums);

        for(int i = 0; i < nums.length - 2; i++){
            int left = i+1;
            int right = nums.length-1;
            while (left < right){
                if(nums[i]+nums[left]+nums[right]<0){
                    left++;
                }
                else if(nums[i]+nums[left]+nums[right]>0){
                    right--;

                } else if (nums[i]+nums[left]+nums[right]==0) {
                    List<Integer> list = new ArrayList<>();
                    list.add(nums[i]);
                    list.add(nums[left]);
                    list.add(nums[right]);
                    threeSumList.add(list);
                    left++;
                    right--;

                }
            }


        }
        Set<List<Integer>>  set = new HashSet<>();
        threeSumList.stream().forEach(l -> set.add(l));

        List<List<Integer>> resultList = new ArrayList<>(set);
        return resultList;
    }
    public static void main(String[] args) {
        int[] nums = {-1, 0, 1, 2, -1, -4};


        Main obj = new Main();
        System.out.println(obj.threeSum(nums));


    }
}