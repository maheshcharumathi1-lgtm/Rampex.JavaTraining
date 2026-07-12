package Day_19.Homework;
import java.util.HashMap;
public class FirstNonRepeatedChar {
    public static void main(String [] args){
        HashMap<Character,Integer> hm=new HashMap<Character,Integer>();
        String str="Programming";
        for(char ch:str.toCharArray()){
            if(hm.containsKey(ch)){
                hm.put(ch,hm.get(ch)+1);
            }
            else{
                hm.put(ch,1);
            }
        }
        for(char ch:str.toCharArray()){
            if(hm.get(ch)==1){
                System.out.print("First non repeated character is "+ch);
                break;
            }
        }
    }

}
