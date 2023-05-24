public class findinmountain {
    public static void main(String[] args){
        int [] arr={3,4,5,6,9,2,1,0};
        int target=4;
        System.out.println(findPeakElement(arr,target));

    }
    static int findPeakElement(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
//            start is not equal to end because in that case the loop will return the greatest element
            int mid = start + (end - start) / 2;
            if (arr[mid] > arr[mid + 1] || arr[mid]< arr[mid-1]) {
                end = start;
//                end == mid because it is a potential answer
            } else {
                start = mid + 1;
            }
        }
        if (arr[start] != target) {
            int secondhalf = 0;
            int firsthalf = binary(arr, target, 0, start - 1);
            if (firsthalf == -1) {
                secondhalf = binary(arr, target,start+1 , arr.length-1);
                return secondhalf;
           }
            return firsthalf;        }
        return start;
    }

//the secondhalf binary search is in descending order cant be done this way though approach is same thus correction and optimization is required
    static int binary(int[] arr, int search,int start ,int end) {
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
