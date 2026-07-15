package Day_21.Classwork;

public class FibonacciSeries {
    public static void main(String [] args) {
        System.out.println(fibo(6));
//        for(int i=0;i<7;i++) {
//            System.out.println(fibo(i) + "");
//        }
    }
    public static int fibo(int n){
        if(n==0){
            return 0;
        }
        else  if(n==1){
            return 1;
        }
        else{
            return fibo(n-1)+fibo(n-2);

        }


    }
}
