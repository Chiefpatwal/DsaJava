public class MaxWealth {
    public static void main (String[]args){
        int[][] arr={
                {2,4,5},
                {3,3,2},
                {0,4,5}

        };
        System.out.println(maxof(arr));
    }
    static int maxof(int[][] arr) {
        int max=0;
        for (int row = 0; row < arr.length; row++) {
            int sum = 0;
            for (int col = 0; col < arr[row].length; col++) {
                sum = arr[row][col] + sum;

            }
            if (max < sum) {
                max = sum;
            }

        }


        return  max;
    }
}

