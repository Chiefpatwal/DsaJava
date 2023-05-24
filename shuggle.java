import java.util.Arrays;

public class shuggle {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        int[] result = shufflearr(arr);
        System.out.println(Arrays.toString(result));
    }

    static int[] shufflearr(int[] arr) {
        int mid = arr.length / 2;
        int j = 0;
        int[] result = new int[2 * mid];
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 != 0) {
                result[i] = arr[mid];
                mid = mid + 1;
            } else {
                result[i] = arr[i];
                j += 1;
            }


        }
        return result;
    }
}
