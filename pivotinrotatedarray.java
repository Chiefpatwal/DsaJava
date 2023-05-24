public class pivotinrotatedarray {
    public static void main(String[] args) {
        int[] arr={3,4,5,6,2};
        int target=4;
        System.out.println(search(arr,target));


    }
    static int search(int[] arr,int target) {
        int pi = pivot(arr);
        if (pi == -1) {
            return binarysearch(arr, target, 0, arr.length - 1);
        }
//            found two ascending arrays now will check in them
        if (target == arr[pi]) {
            return pi;
        }
        if (target >= arr[0]) {
            return binarysearch(arr, target, 0, pi - 1);
        }



    return binarysearch(arr,target,pi+1,arr.length-1);

}
    static int pivot(int[] arr){
        int start=0;
        int end=arr.length-1;
        while(start<=end){
        int mid=start+(end-start)/2;
        if(mid < end && arr[mid]>arr[mid+1]){
            return mid;
        }
        if(mid>start &&arr[mid]<arr[mid-1]){
            return mid-1;
        }
        if(arr[start]>=arr[mid]){
            end=mid-1;
        }else{
            start=mid+1;
        }

    }
        return -1;
}
    static int binarysearch(int[] arr,int search,int start,int end){
        while (start <= end) {
         int mid = start + (end - start) / 2;
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
