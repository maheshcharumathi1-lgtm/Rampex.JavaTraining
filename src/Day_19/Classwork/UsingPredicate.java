package Day_19.Classwork;
import java.util.function.Supplier;
import java.util.function.Function;
import java.util.function.Predicate;
public class UsingPredicate {
    public static void main(String [] args){
        Predicate<Integer> p=(Integer n)->n%2==0;{
            System.out.println(p.test(23));
            Supplier<String> s=()->"Hello";{
                System.out.println(s.get());
                Function<String,Integer> f=str->str.length();{
                    System.out.print(f.apply("sarumathi s"));
                }
            }
        }
    }
}
