package Day_21.Classwork;

public class NumberPrint {
    public static void main(String[] args) {
        int a = 6;
        fun(a);

    }

    public static void fun(int a) {
        if (a == 1) {
            return;
        }
        a--;
        System.out.println(a);
        fun(a);

    }
}