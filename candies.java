import java.util.Arrays;

public class candies {
    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 1, 3};
        int extra = 3;
        boolean[] ans = tellcandies(arr, extra);
        System.out.println(Arrays.toString(ans));
    }

    static boolean[] tellcandies(int[] arr, int extra) {
        int max = Arrays.stream(arr).max().getAsInt();
        boolean[] highestcandies = new boolean[arr.length];
        for (int j = 0; j < arr.length; j++) {
            int totalCandies = arr[j] + extra;
            if (totalCandies >= max) {
                highestcandies[j] = true;
            }

        }
        return highestcandies;
    }
}

