import java.util.HashMap;
import java.util.Map;

public class App {
    public static void main(String[] args) throws Exception {
        Map<String, Integer> map = new HashMap<String, Integer>();

        map.put("Jean", 34);
        map.put("Paul", 20);

        map.put("Jean", 30);

        for(Map.Entry<String, Integer> entry : map.entrySet()) {
            printEntry(entry);
        }
    }

    static void printEntry(Map.Entry entry) {
        System.out.println(entry.getKey() + " -> " + entry.getValue());
    }
}
