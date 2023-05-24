public class binaryto {
    public static void main(String[] args) {
        int[] arr = {1, 3, 6, 9, 12, 17, 18};
        int search = 2;
        int start = 0;
        int end = 0;
        System.out.println(binary(arr, search));
    }

    static int binary(int[] arr, int search) {
        int start = 0;
        int mid = 0;
        int end = arr.length - 1;
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


