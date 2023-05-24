import java.util.Arrays;

public class arrfreval {
    public static void main(String[] args){
        int[] arr={1,1,2,3};
        int[] ans=changearr(arr);
        System.out.println(Arrays.toString(ans));
    }
    static int[] changearr(int[] arr){
        int len=0;
        for(int i=0;i<arr.length;i++){
            if(i%2==0){
                len+=arr[i];
            }
        }
        int [] arr1=new int[len];
        int j=0;
        for(int i =0;i<arr.length;i+=2){
            int var=arr[i];
            while(var!=0){
                arr1[j]=arr[i+1];
                j++;
                var=var-1;
            }

        }
        return arr1;
    }
}


