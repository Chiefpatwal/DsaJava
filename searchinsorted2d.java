import java.util.Arrays;

public class searchinsorted2d {
    public static void main(String[] args) {
        int[][] arr={
                {1,2,3},
                {4,5,6},
                {7,8,9},
//                this is a nXn matrix thus here arr.length works but will not work it out for a non perfect square matrix
        };
        int target= 8;
        System.out.println(Arrays.toString(searchinsoted(arr,target)));

    }
    static int[] searchinsoted(int[][] arr,int target){
        int r=0;
        int c=arr.length-1;
        while(r<arr.length && c>=0){
            if(arr[r][c]==target){
                return new int[]{r,c};
            }
            if(arr[r][c]<target){
//                when the target is greater than we skip that very row else we decrement the column for vice versa case
                r++;
            }else{
                c--;
            }
        }
        return new int[]{-1,-1};


    }
}
