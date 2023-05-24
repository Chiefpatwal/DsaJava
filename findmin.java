public class findmin {
     public static void main(String[] args){
         int[] arr ={12,14,13,16,-9};
         System.out.println(miniest(arr));
     }
     static int miniest(int[] arr){
         int min=arr[0];
         for(int i=0;i<arr.length;i++){
             if(min>arr[i]){
                 min=arr[i];
             }

         }
         return min;

     }
}
