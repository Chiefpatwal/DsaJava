public class searchinrotateduplicatearray {
    public static void main(String[] args) {
        int[] arr={3,4,3,5,5,6,2};
        int target=4;
        System.out.println(search(arr,target));


    }
    static boolean search(int[] arr,int target) {
        int pi = pivot(arr);
        if (pi == -1) {
            return binarysearch(arr, target, 0, arr.length - 1);
        }
//            found two ascending arrays now will check in them
        if (target == arr[pi]) {
            return true;
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
//            if elements at the start ,end,middle is equal we gonna skip them all
           if(arr[mid]==arr[end]&& arr[mid]==arr[start]){
//               skip the duplicates
               if(arr[start]>arr[start+1]){
                  return start;
               }
               start++;
               if(arr[end]<arr[end-1]){
                   return  end-1;
               }
               end--;
           } else if (arr[start]<arr[mid]||arr[start]==arr[mid]&&arr[end]<arr[mid]) {
               start=mid+1;
           }else{
               end=mid-1;
           }

        }
        return -1;
    }
    static boolean binarysearch(int[] arr,int search,int start,int end){
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] > search) {
                end = mid - 1;

            } else if (arr[mid] < search) {
                start = mid + 1;
            } else {
                return true;
            }
        }
        return false;
    }

}


