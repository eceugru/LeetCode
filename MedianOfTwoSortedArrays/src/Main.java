//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int[] nums1 = {1,3};
        int[] nums2 = {2,4};
        Main main = new Main();


        System.out.println(main.findMedianSortedArrays(nums1, nums2));

    }

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int [] result =  new int[nums1.length+nums2.length];
        int k =0, i=0, j=0;

        while(i<nums1.length && j<nums2.length){
            if(nums1[i]<nums2[j]){
                result[k++] = nums1[i++];
            }else{
                result[k++] = nums2[j++];
            }
        }
        while(i<nums1.length){
            result[k++] = nums1[i++];
        }
        while(j<nums2.length){
            result[k++] = nums2[j++];
        }
        // merge ile sıralama

        if(result.length%2==0){
            int index = (result.length/2);
            return (result[index]+result[index-1])/2.0;

        }else{
            int index = (result.length/2);
            return result[index];

        }
    }

}