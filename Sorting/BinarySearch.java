public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {1, 3, 6, 9, 12, 17, 18};
        int search = 18;
        System.out.println(binary(arr, search));
    }

    static int binary(int[] arr, int search) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] < search) {
                start = mid + 1;

            } else if (arr[mid] > search) {
                end = mid - 1;
            } else {
                return mid;

            }

        }
        return start;
    }
}
