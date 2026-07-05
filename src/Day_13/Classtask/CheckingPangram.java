package Day_13.Classtask;

public class CheckingPangram {
        public static void main(String[] args) {
            System.out.println(isPangram("The brown fox quickly jumps over The lazy dog"));
        }
        public static boolean isPangram(String s){
            s= s.toLowerCase();
            int letter='a';
            for(int i=0;i<=25;i++) {
                if ( s.contains(String.valueOf((char)letter++) )==false){
                    return false;
                }
            }
            return true;
        }
}