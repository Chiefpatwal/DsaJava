import java.util.Arrays;

public class Trappedwater {
    public static void main (String[]args){
        int[] arr= {4,2,0,6,3,2,5};
        System.out.println(water(arr));
    }
    static int water(int[] arr) {
        int[] left = new int[arr.length];
        int[] right = new int[arr.length];
        int[] result= new int[arr.length];
        int max=0;
        int maxi=0;
        int sum=0;
        if (arr.length > 2) {
            max=arr[0];
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] > max) {
                    left[i] = arr[i];
                    max=arr[i];
                }else{
                    left[i]=max;
                }
            }
            maxi=arr[arr.length-1];
            for(int j=arr.length-1; j>=0;j--){
                if(arr[j]> maxi){
                    right[j]=arr[j];
                    maxi=arr[j];
                }else{
                    right[j]=maxi;
                }
            }
            for(int i=0;i<arr.length;i++){
                result[i]=(Math.min(left[i],right[i]))-arr[i];
            }
            for(int i=0;i<arr.length-1;i++){
                sum+=result[i];
            }
        }
        return sum;
    }
}
