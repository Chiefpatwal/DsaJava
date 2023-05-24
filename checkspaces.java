import java.util.Arrays;

public class checkspaces {
    public static void main(String[] args){
        String[] arr={"lice and bob love leetcode,i and think and and so too,this is great thanks very much"};
        System.out.println(countspaces(arr));
    }
    static int countspaces(String[] arr){
        int count=0;
        int max=0;
        for(int i=0;i<arr.length;i++) {
            for (String nums : arr) {
                if (nums.contains(" ")) {
                    count += 1;

                }
            }
        }

            max=Math.max(count,max);
        if(max>0){
            max+=1;
        }
        return max;


    }
}
