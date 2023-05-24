import java.util.Arrays;

//https://leetcode.com/problems/running-sum-of-1d-array/
public class arrays {
    public static void main(String[] args){
        int[] arr={1,2,3,4};
        int[] result=arrsum(arr);
        System.out.println(Arrays.toString(result));
    }
    static int[] arrsum(int[] arr){
        int sum=0;
        for(int i=0;i<=arr.length-1;i++){
            arr[i]=arr[i]+sum;
            sum=arr[i];

        }
        return arr;
    }

}
