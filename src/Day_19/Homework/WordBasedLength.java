package Day_19.Homework;
import java.util.HashMap;
import java.util.ArrayList;
public class WordBasedLength {
        public static void main(String[] args) {
            String[] words = {"Java", "API", "Spring", "Collection", "Map", "Queue"};
            HashMap<Integer, ArrayList<String>> map = new HashMap<>();
            for (String word : words) {
                int length = word.length();
                if (map.containsKey(length)) {
                    map.get(length).add(word);
                } else {
                    ArrayList<String> list = new ArrayList<>();
                    list.add(word);
                    map.put(length, list);
                }
            }
            for (int key : map.keySet()) {
                System.out.println(key + " -> " + map.get(key));
            }
        }
}
