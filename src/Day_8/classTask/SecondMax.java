package Day_8.classTask;
import java.util.Arrays;
public class SecondMax {
    public static void main(String [] args){
        int [] num={1,2,4,3,5};
        int max=0;
        int smax=0;
        for(int i=0;i<num.length;i++){
            if(num[i]>max){
                smax=max;
                max=num[i];
            }
        }
        System.out.println("First Max: "+max);
        System.out.println("Second Max: "+smax);
    }

}
