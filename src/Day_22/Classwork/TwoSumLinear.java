package Day_22.Classwork;
import java.util.Arrays;
public class TwoSumLinear {
    public static void main(String [] args){
        int [] arr={2,5,9,8,5,6};
        int target=7;
        int [] indices=twoSum(arr,target);
        System.out.println(Arrays.toString(indices));

    }
    public static int [] twoSum(int [] arr,int target){
        int [] result=new int[arr.length];
        for(int i=0;i<arr.length-1;i++){
            for (int j=i+1;j<arr.length;j++){
                if(arr[i]+arr[j]==target){
                    return new int []{i,j};
                }
            }
        }
        return new int[]{};
    }
}
