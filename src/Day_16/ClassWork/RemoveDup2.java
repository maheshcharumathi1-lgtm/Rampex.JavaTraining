package Day_16.ClassWork;
import java.util.Arrays;
import java.util.HashSet;
public class RemoveDup2 {
    public static void main(String []args){
        int [] arr={3,2,1,4};
        removeDup( arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void removeDup(int [] nums){
        HashSet<Integer> hs=new HashSet<>();
        for(Integer i: nums){
            hs.add(i);
        }
        int index=0;
        for(Integer i:hs){
            nums[index++]=i;


        }

    }
}
