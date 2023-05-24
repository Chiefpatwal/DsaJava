import java.util.Arrays;
//https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/submissions/955877193/
public class cyclesorting {
    public static void main(String[] args) {
        int[] arr = {3,0,1};
        cyclesort(arr);
        System.out.println(Arrays.toString(arr));
        int no = missingno(arr);
        System.out.println(no);
    }

    static void cyclesort(int[] arr) {
        int start = 0;
        while (start <arr.length) {
            if (arr[start]<arr.length &&arr[start] != arr[arr[start]]) {
                swap(arr, start, arr[start]);
            } else {
                start++;

            }
        }

    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

    static int missingno(int[] arr) {
       for(int i=0;i<arr.length;i++){
           if(arr[i]!=i){
               return i;
           }
       }
       return arr.length;
    }
}
