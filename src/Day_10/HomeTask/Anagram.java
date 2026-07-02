package Day_10.HomeTask;
import java.util.Scanner;
public class Anagram {
        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            System.out.print("Enter first string: ");
            String s1 = sc.next();

            System.out.print("Enter second string: ");
            String s2 = sc.next();

            if (s1.length() != s2.length()) {
                System.out.println("false");
                return;
            }

            int count = 0;

            for (int i = 0; i < s1.length(); i++) {
                for (int j = 0; j < s2.length(); j++) {
                    if (s1.charAt(i) == s2.charAt(j)) {
                        count++;
                        break;
                    }
                }
            }

            if (count == s1.length()) {
                System.out.println("true");
            } else {
                System.out.println("false");
            }

            sc.close();
        }

}
