import java.util.Arrays;

public class maximum {
    public static void main(String[] args){
        int[] arr= {8,1,2,3,3};
        int[] ans=findmax(arr);
        System.out.println(Arrays.toString(ans));
    }
    static int[] findmax(int[]arr){
        int[] arr1=new int[arr.length];
        int c=0;
        for(int i=0;i<arr.length;i++){
            c=0;
            for(int j=0;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    c+=1;
                }
            }
            arr1[i]=c;

        }

        return arr1;
    }
}
