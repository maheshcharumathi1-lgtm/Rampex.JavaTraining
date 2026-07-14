package Day_20.Classwork;


import java.util.stream.Stream;
public class MaxStream {
    public static void main(String [] args){
        Stream<String> s=Stream.of("sarvin","sarumathi","maheshwari","selvaraj");
        System.out.println(s.map(n->n.length()).reduce(0,(a,b)->a>b?a:b));
    }
}
