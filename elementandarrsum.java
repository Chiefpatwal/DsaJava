public class elementandarrsum {
    public static void main(String[] args) {
        int[] arr={1,2,3,4};
        System.out.println(Math.abs(elementsum(arr)-sumarr(arr)));

    }
    static int elementsum(int []arr){
        int sum=0;
        for(int i=0;i<arr.length;i++){
            int var=arr[i];
            while(var!=0){
                int ele=var%10;
                sum+=ele;
                var=var/10;
            }


        }
        return sum;
    }
    static int sumarr(int[] arr){
        int sum=0;
        for(int i=0;i< arr.length;i++){
            sum+=arr[i];
        }
        return sum;
    }
}
