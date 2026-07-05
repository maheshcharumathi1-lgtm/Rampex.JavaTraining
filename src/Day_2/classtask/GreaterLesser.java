package Day_2.classtask;

public class GreaterLesser {
    public static void main(String[] args){
        int a=20;
        int b=15;
        int c=10;
        if(a>b && b>c)
        {
            System.out.println("a is greater");
        }
        else if(b>a && c<b)
        {
            System.out.println("b is greater");
        }
        else
        {
            System.out.println("c is greater");
        }
    }
}
