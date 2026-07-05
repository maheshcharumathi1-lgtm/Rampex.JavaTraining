package Day_6;
import java.util.Scanner;
public class Multiply {
        public static void main(String [] args){
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter the number: ");
            int num=sc.nextInt();
            int n=num;
            int mul=1;
            for(int i=1;i<=n;i++){
                mul=mul*i;
                System.out.println(mul);
            }
        }
}
