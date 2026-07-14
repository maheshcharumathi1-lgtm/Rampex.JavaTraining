package Day_20.Classwork;
import java.util.stream.Stream;
public class InfiniteStream {
    public static void main(String [] args){
        Stream.iterate(0,n->n+2).limit(6).forEach(n->System.out.println(n));
    }
}
