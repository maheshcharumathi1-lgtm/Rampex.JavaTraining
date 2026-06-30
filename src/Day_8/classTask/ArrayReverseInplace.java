package Day_8.classTask;
import java.util.Arrays;
public class ArrayReverseInplace {
    public static void main(String [] args){
        int [] num={1,2,3,4};
        System.out.println(Arrays.toString(num));
        int temp=0;
        int n=num.length;
        for(int i=0;i<num.length/2;i++){
            temp=num[i];
            num[i]=num[n-i-1];
            num[n-i-1]=temp;
        }
        System.out.println(Arrays.toString(num));
    }
}
