package Day_16.ClassWork;
import java.util.TreeSet;
import java.util.Arrays;
public class Removedup {
    public static void main(String [] args){
        int arr []={5,3,8,1,5,3,9};
        TreeSet<Integer> ts=new TreeSet<>();
        for(Integer i:arr){
            ts.add(i);
        }
        int [] nums=new int[ts.size()];
        int index=0;
        for(Integer i:ts){
            nums[index++]=i;

        }
        System.out.println(ts);
        System.out.println(Arrays.toString(nums));
    }
}
