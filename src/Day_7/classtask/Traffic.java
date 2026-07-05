package Day_7.classtask;

import java.util.Scanner;
public class Traffic {
    public static void main(String [] args){
        Scanner Scanner=new Scanner(System.in);
        System.out.print("Enter the colour");
        String colour=Scanner.nextLine();
        switch(colour){
            case "Red":
            {
                System.out.print("STOP");
                break;
            }
            case "Green":
            {
                System.out.print("GO");
                break;
            }
            case "Yellow":
            {
                System.out.print("GET READY");
                break;
            }
            default:
            {
                System.out.print("Invalid colour");
            }
        }
    }
}



