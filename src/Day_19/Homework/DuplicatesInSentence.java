package Day_19.Homework;
import java.util.HashMap;
import java.util.ArrayList;
public class DuplicatesInSentence {
        public static void main(String[] args) {
            String sentence = "java is easy and java is powerful and java is popular";
            String[] words = sentence.split(" ");
            HashMap<String, Integer> map = new HashMap<>();
            for (String word : words) {
                if (map.containsKey(word)) {
                    map.put(word, map.get(word) + 1);
                } else {
                    map.put(word, 1);
                }
            }
            ArrayList<String> duplicates = new ArrayList<>();

            for (String word : map.keySet()) {
                if (map.get(word) > 1) {
                    duplicates.add(word);
                }
            }
            System.out.println(duplicates);
        }
}
