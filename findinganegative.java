public class findinganegative {
    public static void main(String[] args) {
        int[][] arr = {
                {5, 1, 0},
                {-5,-5,-5},
//                {1, 1, -1, -2},
//                {-1, -1, -2, -3}
        };        System.out.println(negativeCount(arr));
    }

    static int negativeCount(int[][] arr) {
        int row = 0;
        int col = arr[0].length - 1;
        int count = 0;

        while (row < arr.length && col >= 0) {
            if (arr[row][col] < 0) {
                count += arr.length - row;
                col--;
            } else {
                row++;
            }
        }

        return count;
    }
}
