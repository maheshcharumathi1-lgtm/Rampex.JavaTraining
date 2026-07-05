package Day_4.classtask;
import java.util.Scanner;
public class PositiveNegative {
        public static void main(String[] args)
        {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter the number: ");
            int num=scanner.nextInt();
            if(num>0)
            {
                if(num%2==0)
                {
                    System.out.println("Positive Even");
                }
                else
                {
                    System.out.println("Positive Odd");
                }
            }else if(num<0)
            {
                if(num%2==0)
                {
                    System.out.println("Negative Even");
                }
                else{
                    System.out.println("Negative Odd");
                }
            }
            else{
                System.out.println("Neutral Number");
            }
        }

}
