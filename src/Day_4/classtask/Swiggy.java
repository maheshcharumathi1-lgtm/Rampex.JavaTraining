package Day_4.classtask;
import java.util.Scanner;
public class Swiggy {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            String OriginalUsername="saru";
            int OriginalPassword=1357;
            System.out.print("Enter the Username: ");
            String a = scanner.nextLine();
            System.out.print("Enter the Password: ");
            int b = scanner.nextInt();
            if(a.equals(OriginalUsername) && b==(OriginalPassword))
            {
                System.out.println("Welcome, "+a);
            }
            else
            {
                System.out.println("Invalid Credentials,please try again");
            }

            scanner.close();
        }
}
