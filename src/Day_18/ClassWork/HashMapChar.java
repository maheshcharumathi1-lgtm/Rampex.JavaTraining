package Day_18.ClassWork;

import java.util.Arrays;
import java.util.HashMap;

public class  HashMapChar{
    public static void main(String [] args){
        HashMap hm=new HashMap<Character,Integer>();
        String name="sarumathi";
        char [] ch=name.toCharArray();
        System.out.println(Arrays.toString(ch));

        for(Character c :ch){
            if(hm.containsKey(c)){
                hm.put(c,(Integer)(hm.get(c))+1);
            }
            else{
                hm.put(c,1);
            }
        }
        System.out.print(hm);
    }
}
