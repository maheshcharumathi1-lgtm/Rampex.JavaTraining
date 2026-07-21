package Day_3.classtask;
import java.util.Scanner;
public class LoginDetails {
        public static void main(String[] args){
            String name = "Sarumathi";
            int id = 54321;
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the username:");
            String username = sc.nextLine();
            System.out.print("Enter the id:");
            int userid = sc.nextInt();
            if(name.equals(username)&&(id == userid)){
                System.out.println("Welcome  "+ name);
                System.out.println("Valid Credentials");
            }else{
                System.out.println("Invalid Credentials");
            }
            sc.close();
        }
}
