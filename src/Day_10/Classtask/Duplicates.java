package Day_10.Classtask;

public class Duplicates {
    public static void main(String [] args){
        String [] names={"Saru","sarvin","Saru","Mahesh","Selvaraj"};
        for(int i=0;i<names.length;i++){
            for(int j=0;j<names.length;j++){
                if(names[i].equals(names[j]) && i!=j && i<j){
                    System.out.println(names[j]);

                }
            }
        }

    }
}
