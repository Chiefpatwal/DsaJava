public class infinteaarr {
    public static void main(String[] args) {
        int[] arr={3,5,7,9,10,90,100,130,140,160,170};
        int target=10;
        System.out.println(ans(arr,target));

    }
    static int ans(int[] arr,int target){
//        finding range
        int start=0;
        int end=1;
//        codition to forget to lie in the range
        while (target>arr[end]){
            int news=end+1;
//            end=previous end +size*2
             end =end+(end-start+1)*2;
            start=news;
        }
        return binary(arr,target,start,end);
    }
    static int binary(int[] arr, int search,int start ,int end) {
     start = 0;
    int mid = 0;
     end = arr.length - 1;
    while (start <= end) {
        mid = start + (end - start) / 2;
        if (arr[mid] > search) {
            end = mid - 1;

        } else if (arr[mid] < search) {
            start = mid + 1;
        } else {
            return mid;
        }
    }
    return -1;
}
}



