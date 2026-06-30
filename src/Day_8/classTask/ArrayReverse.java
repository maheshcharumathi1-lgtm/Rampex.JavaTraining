package Day_8.classTask;
import java.util.Arrays;
public class ArrayReverse {
    public static void main(String [] args){
        String [] menu={"Veg","Non-veg","Sweets","Beverages"};
        String [] m1= new String[menu.length];
        for(int i=0;i<menu.length;i++){
            m1[i]=menu[menu.length-i-1];
        }
        System.out.println(Arrays.toString(m1));
    }
}
