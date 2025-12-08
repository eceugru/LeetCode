//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length-1;
        int max = 0;
        while (left < right) {
            int h = Math.min(height[left],height[right]);
            int weight = right - left;
            int area = h * weight;
            if (area > max) {
                max = area;
            }
            if(height[left] > height[right]){
                right--;
            }else if(height[left] < height[right]){
                left++;
            }
            else {
                left++;
                right--;
            }
        }
        return max;
    }
    public static void main(String[] args) {

        int [] array = new int[]{1,8,6,2,5,4,8,3,7};
        int left = 0;
        int right = array.length-1;
        int max = 0;
        while (left < right) {
            int h = Math.min(array[left],array[right]);
            int weight = right - left;
            int area = h * weight;
            if (area > max) {
                max = area;
            }
            if(array[left] > array[right]){
                right--;
                left++;
            }else {
                left++;
            }
        }

        System.out.println(max);


        Main m = new Main();


        System.out.println();

    }
}