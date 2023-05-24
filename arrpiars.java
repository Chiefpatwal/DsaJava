import java.util.Arrays;

public class arrpiars {
    public static void main(String[] args){
        int[] arr={1,1,1,1};
        int ans=pairs(arr);
        System.out.println(ans);
    }
    static int pairs(int[] arr){
        int c=0;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    c+=1;
                }
            }

        }
        return c;
    }
}

