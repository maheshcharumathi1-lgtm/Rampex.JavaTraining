package Day_5.hometask;
import java.util.Scanner;
public class Swiggy {
        public static void main(String [] args){
            Scanner Scanner=new Scanner(System.in);
            System.out.println("enter 1 to show veg items");
            System.out.println("enter 2 to show Non-veg items");
            System.out.println("enter 3 to show Sweets and deserts");
            System.out.println("enter 4 to exit");
            System.out.print("Enter a number: ");
            int num=Scanner.nextInt();
            switch(num){
                case 1:
                {
                    System.out.println("sambar rice,veg biriyani,curd rice,lemon rice");
                    break;
                }
                case 2:
                {
                    System.out.println("chicken biriyani,chicken rice,mutton biriyani,chicken noodles");
                    break;
                }
                case 3:
                {
                    System.out.println("laddu,browni,cake,jelabi");
                    break;
                }
                case 4:
                {
                    System.out.print("Exit");
                    break;
                }
                default:
                {
                    System.out.print("Invalid items");
                }
            }
        }
}
