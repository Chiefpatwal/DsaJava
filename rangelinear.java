public class rangelinear {
    public static void main(String[] args) {
        int[] arr={12,11,14,15,16};
        int search =14;
        int start=1;
        int end = 3;
        System.out.println(rangecheck(arr,search,start, end));
    }
    static int rangecheck(int[] arr,int target,int start,int end){
        if(arr.length==0){
            return -1;
        }
        for(int index=start;index<=end;index++){
            if(arr[index]==target){
                return index;
            }
        }
        return -1;
    }
}
