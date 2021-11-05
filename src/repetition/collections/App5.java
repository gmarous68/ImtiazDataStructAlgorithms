package repetition.collections;

import java.util.Map;
import java.util.TreeMap;

public class App5 {
    public static void main(String[] args) {
        TreeMap<String, String> dict = new TreeMap<>();

        dict.put("Joy","Feeling of joy and happiness");
        dict.put("Brave","Ready to face and endure danger");
        dict.put("Confidence","Feeling certain of something");
        dict.put("Brilliant","Clever and Talented");

//        for(String key : dict.keySet()) {
//            System.out.println(key + ": " + dict.get(key));
//        }

        for(Map.Entry<String, String> entry : dict.entrySet())
            System.out.println(entry.getKey() + ": " + entry.getValue());
    }
}