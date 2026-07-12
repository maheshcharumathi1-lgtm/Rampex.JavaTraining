package Day_18.ClassWork;
import java.util.HashMap;
import java.util.HashSet;
public class MaxMark {
    public static void main(String [] args){
        HashMap<String,Integer> marks=new HashMap<String,Integer>();
        marks.put("Sarumathi",85);
        marks.put("Sarvin",90);
        marks.put("Kishore",70);
        marks.put("Sandhiya",80);
        int [] arr={85,90,70,80};
        int max=0;
        for(Integer mark:marks.values()){
            if(mark>max){
                max=mark;

            }
        }
        System.out.println(max);
    }
}
