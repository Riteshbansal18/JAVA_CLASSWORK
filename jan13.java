import java.util.Arrays;

public class jan13 {
    public static void main(String[] args) {
        int[] arr = {1, 5, 2, 7, 3, 10, 4};
        int targetIndex = 6;
        int target = arr[targetIndex];

        System.out.println("Original Array: " + Arrays.toString(arr));
        rearrangeArray(arr, target);
        System.out.println("Modified Array: " + Arrays.toString(arr));
    }

    public static void rearrangeArray(int[] arr, int target) {
        int left = 0; 
        int right = arr.length - 1;

        while (left <= right) {

            if (arr[left] <= target) {
                left++;
            } 
            
            else {
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                right--;
            }
        }
    }
}
