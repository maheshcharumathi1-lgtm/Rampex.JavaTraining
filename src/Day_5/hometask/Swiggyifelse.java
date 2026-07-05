package Day_5.hometask;
import java.util.Scanner;
public class Swiggyifelse{
        public static void main(String [] args){
            Scanner Scanner=new Scanner(System.in);
            System.out.println("enter 1 to show veg items");
            System.out.println("enter 2 to show Non-veg items");
            System.out.println("enter 3 to show Sweets and deserts");
            System.out.println("enter 4 to exit");
            System.out.print("Enter a number: ");
            int num=Scanner.nextInt();
            if(num==1)
            {
                System.out.println("sambar rice,veg biriyani,curd rice,lemon rice");
            }
            else if(num==2)
            {
                System.out.println("chicken biriyani,chicken rice,mutton biriyani,chicken noodles");
            }
            else if(num==3)
            {
                System.out.println("laddu,browni,cake,jelabi");
            }
            else if(num==4)
            {
                System.out.print("Exit");
            }
            else
            {
                System.out.print("Invalid items");
            }
        }
}
