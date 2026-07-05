package Day_13.Classtask;
import java.util.Scanner;
public class ExceptionHandling {
    public static void main(String [] args){
        Scanner Sc =new Scanner(System.in);
        System.out.print("Enter the number: ");
        int a=0;
        try{
            a=Sc.nextInt();
            System.out.println(a*a);
        }
        catch(Exception e){


        }
        System.out.print("Program Ended");
    }
}
