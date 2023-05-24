public class findEvendigits {
//   https://leetcode.com/problems/find-numbers-with-even-number-of-digits/submissions/944837717/
     static int findeven(int[] arr) {
         int count = 0;
         int counter=0;
         for (int num : arr) {
             counter=0;
             if (num == 0) {
               counter=1;
            }

             while (num > 0) {
                 count += 1;
                 num = num / 10;
                 if (count % 2 == 0) {
                     counter++;
             }

         }


         }

         return counter;
     }
     public static void main(String[] args){
         int arr[]={121,134,156,123};
         System.out.println(findeven(arr));
     }
}
