import java.util.Arrays;

public class rotatedarray {
    public static void main(String[] args) {
        int[] arr ={1,2};
        int k=3;
        int[] result=afterotation(arr,k);
        System.out.println(Arrays.toString(result));
    }
    static int[] afterotation(int[] arr, int k) {
            int n = arr.length;
            int[] arr1 = new int[n];
            k = k % n; // Adjust k if it is larger than array length

            for (int i = 0; i < k; i++) {
                arr1[k - i - 1] = arr[n - i - 1];
            }
            for (int i = 0; i < n - k; i++) {
                arr1[k + i] = arr[i];
            }
            for (int i = 0; i < n; i++) {
                arr[i] = arr1[i];
            }
            return arr;
        }
    }
