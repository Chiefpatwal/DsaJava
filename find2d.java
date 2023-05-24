public class find2d {
//    https://leetcode.com/problems/find-numbers-with-even-number-of-digits/submissions/944837717/
    static int findnumbers(int[] arr) {
        int count = 0;

        for (int num : arr) {
            if (even(num)) {
                count++;
            }
        }
        return count;
    }

    static int digits(int num) {
        if(num<0){
            num=num*-1;
        }
        int count = 0;
        while (num > 0) {
            count++;
            num = num / 10;
        }
        return count;
    }

    static boolean even(int num) {
        int numberofdigits = digits2(num);
        return numberofdigits % 2 == 0 ;
    }
    static int digits2(int num){
        return (int)(Math.log10(num))+1;
    }

    public static void main(String[] args) {
        int[] arr = {113, 345, 664, -789, 77678};
        System.out.println(findnumbers(arr));
    }
}
