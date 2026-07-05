package Day_2.classtask;

public class Letter {
    public static void main(String[] args)
    {
        char letter ='a';
        if(letter>=65 && letter<=91)
        {
            System.out.println(letter + " is an Uppercase");
        }
        else if(letter>=97 && letter<=122)
        {
            System.out.println(letter + " is an Lowercase");
        }
        else if(letter>=0 && letter<=9)
        {
            System.out.println(letter + "is a digit");
        }
        else
        {
            System.out.println(letter + "is a special character");
        }
    }
}
