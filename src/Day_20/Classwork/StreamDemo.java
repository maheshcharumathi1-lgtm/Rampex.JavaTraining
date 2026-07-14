package Day_20.Classwork;
import java.util.Arrays;
public class StreamDemo {
    public static void main(String[] args) {
        int [] arr={4,6,1,9,5,7,3,10,2,8};
        Arrays.stream(arr).filter((n)->n%2==0).sorted().forEach(n->System.out.println(n));
    }
}
