package Day_8.classTask;

public class NameReverse {
    public static void main(String [] args){
        String name="Sarumathi";
        String name1=new String("Sarumathi");
        int n=name.length();
        for(int i=n-1;i>=0;i--){
            System.out.print(name.charAt(i));
        }

    }
}
