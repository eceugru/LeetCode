//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3,0,0,0};
        int[] nums2 = {2,5,6};
        int m = 3;
        int n = 3;
        int i = 0;
        int j = 0;
        int k = 0;

        while (i<m && j<n){
            if (nums1[i] <= nums2[j]){
                nums1[k] = nums1[i];
                i++;
            }
            else{
                nums1[k] = nums2[j];
                j++;
            }
            k++;
        }

        for(int a :  nums1){
            System.out.print(a);
        }
    }

}