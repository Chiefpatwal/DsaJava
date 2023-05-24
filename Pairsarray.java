import java.util.*;
public class Pairsarray {
    public static void pairs(int array[]){
        for(int i=0;i<array.length;i++){
            int cur=array[i];
            for(int j=i+1;j<array.length;j++){
                System.out.print("(" + cur+ "," + array[j]+ ")");
            }
            System.out.println();
        }

    }
    public static void main(String[] args){
        int array[]={1,4,6,8,10};
        int sum=((array.length)*(array.length-1))/2;
        System.out.println("Total Possible pattern is" +" "+sum);
        pairs(array);

    }
}
