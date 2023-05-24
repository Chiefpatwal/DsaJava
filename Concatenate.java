import java.util.Arrays;

public class Concatenate {
    public static void main (String[] args){
        int[] arr={1,73,9};
        int[] ans=addarr(arr);
        System.out.println(Arrays.toString(ans));
    }
    static int[] addarr(int[] arr){
        int len=arr.length;
        int[] result=new int[2*len];
        for(int i=0;i<=len-1;i++){
            result[i]=result[len+i]=arr[i];
        }
        return result;

    }
}
