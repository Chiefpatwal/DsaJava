import java.util.Arrays;

public class bubblesorting {
    public static void main(String[] args) {
        int[] arr={3,1,5};
        System.out.println(Arrays.toString(selectionsort(arr)));
    }
    static int[] bubblesort(int [] arr){
        boolean swapped;
        for(int i=0;i<arr.length;i++){
            swapped=false;
            for(int j=0 ;j< arr.length-2-i;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    swapped=true;
                }
            }
//            if it didnot swapped for a particualr value then break the loop
            if(!swapped) {
                break;
            }
        }
        return arr;
    }
    static int[] selectionsort(int [] arr){
        for(int i=0;i<arr.length;i++){
            int last= arr.length-i-1;
            int maxIndex=getmaxindex(arr,0,last);
            swap(arr,maxIndex,last);
        }
        return arr;
    }
    static void swap(int[] arr,int first,int second){
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
     static int getmaxindex(int[] arr,int start,int end){
        int max=start;
        for(int i=start;i<=end;i++){
            if(arr[max]<arr[i]){
                max=i;
            }
        }
        return max;
    }
}
