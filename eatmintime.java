public class eatmintime {
    public static void main(String[] args) {
        int[] arr = {312884470};
        int h =3 ;
        System.out.println(findhours(arr, h));
    }

    static int findhours(int[] arr, int h) {
        int max = 0;
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            max = Math.max(max, arr[i]);
            sum += arr[i];
        }
        int start = sum / h;
        int res = kfind(arr, start, max, h);
        return res;
    }

    static int kfind(int[] arr, int start, int end, int h) {
        int result = -1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            int check = count(arr, mid);
            if (check > h) {
                start = mid + 1;
            }
            if (check < h) {
                end = mid ;
            }
            if(check==h){
                result = mid;
                return result;
            }
        }
        return result;
    }

    static int count(int[] arr, int k) {
        int count = 0;
        int cur = 0;
        for (int i = 0; i < arr.length; i++) {
            while (arr[i] > cur) {
                cur += k;
                count += 1;
            }
            cur=0;
        }
        return count;
    }
}
