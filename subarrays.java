public class subarrays {
    public static void subarray(int arr[]){
        int sum=0;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            int start=i;
            for(int j=0;j<arr.length;j++){
                int end=j;
                for(int k=start ;k<=end;k++){
                    if((arr[k])%2!=0){
                        sum=sum+arr[k];
                    }

                }
                if(max<sum){
                    max=sum;
                }
                sum=0;
            }

        }
        System.out.println("max sum is"+" "+max);
    }
    public static void main(String[]args){
        int arr[]={-1,-2};
        int ele= (arr.length)*(arr.length+1)/2;
        System.out.println(ele);
        subarray(arr);

    }
}
