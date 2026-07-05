package Day_4.classtask;
import java.util.Scanner;
public class Grade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int a = scanner.nextInt();
        if(a>90 && a<101)
        {
            System.out.println("A Grade");
        }
        else if(a>80 && a<91)
        {
            System.out.println("B Grade");
        }
        else if(a>64 && a<81)
        {
            System.out.println("C Grade");
        }
        else if(a>=0 && a<65)
        {
            System.out.println("Fail");
        }
        else
        {
            System.out.println("Invalid Input");
        }

        scanner.close();
    }
}

