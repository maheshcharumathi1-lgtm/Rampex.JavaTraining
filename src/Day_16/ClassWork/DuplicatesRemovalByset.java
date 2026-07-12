package Day_16.ClassWork;

import java.util.HashSet;
import java.util.Arrays;

public class DuplicatesRemovalByset {
        public static void main(String [] args){
           int [] arr={1,2,3,2,4,1,5,6,5};
//        HashSet<Integer> hs=new HashSet<>();
//        for(Integer i:arr){
//            hs.add(i);


//
            HashSet<Integer> hs =new HashSet<>();


            for(Integer i : arr){

                hs.add(i);

            }

            int [] nums = new int[hs.size()];
            int index =0;
            for (Integer i : hs){

                nums[index++]=i;
            }
            System.out.println(Arrays.toString(nums));

        }
    }

