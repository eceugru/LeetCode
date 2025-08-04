//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        // nums2'yi nums1'in sonuna ekle
        for(int i = 0; i < n; i++) {
            nums1[m + i] = nums2[i];
        }

        // nums1'i sıralama (toplam m+n eleman olacak)
        for(int j = 0; j < m + n; j++) {
            for(int i = j + 1; i < m + n; i++) {
                if(nums1[i] < nums1[j]) {
                    int temp = nums1[i];
                    nums1[i] = nums1[j];
                    nums1[j] = temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        Main m = new Main();
        int [] nums1 = {1,2,3,4,0,0};
        int [] nums2 = {2,6};


        m.merge(nums1, 6, nums2, 2);

    }
}