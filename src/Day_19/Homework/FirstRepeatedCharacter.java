package Day_19.Homework;
import java.util.HashMap;
import java.util.HashSet;

public class FirstRepeatedCharacter {
    public static void main(String []args){
        HashSet<Character> hm=new HashSet<>();
        String str="programming";
        for(char ch:str.toCharArray()){
            if(hm.contains(ch)){
                System.out.print("First repeated character is "+ch);
                break;
            }
            else{
                hm.add(ch);
            }
        }
    }
}
