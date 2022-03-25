import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

    public class SortKey {
        static Map<String, Integer> map = new HashMap<>();

        public static void sortbykey()
        {
            TreeMap<String, Integer> sorted = new TreeMap<>();
            sorted.putAll(map);
            for (Map.Entry<String, Integer> entry : sorted.entrySet())
                System.out.println("Key = " + entry.getKey() +
                        ", Value = " + entry.getValue());
        }
        public static void main(String args[])
        {

            map.put("Srushti", 80);
            map.put("Sarthak", 90);
            map.put("Aman", 80);
            map.put("Amit", 75);
            map.put("badal", 40);


            sortbykey();
        }
    }



