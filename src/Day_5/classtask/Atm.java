package Day_5.classtask;
import java.util.Scanner;
public class Atm {
        public static void main(String [] args){
            Scanner Scanner=new Scanner(System.in);
            System.out.print("Insert the card: ");
            String cardDetails=Scanner.nextLine();
            String cardInfo="Card";
            int pin=8462;


            if(cardDetails.equals(cardInfo))
            {
                System.out.print("Enter pin: ");
                int Pin=Scanner.nextInt();
            }
            else{
                System.out.print("Invalid card");
            }
        }
}
