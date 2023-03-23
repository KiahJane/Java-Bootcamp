package books;

import java.util.*;

public class HashMapToList {

    public static List<HashMap.Entry<String, String>> createListFromHashMap(HashMap<String, String> hashmap){

        // Convert the HashMap to a list of entries
        List<HashMap.Entry<String, String>> list = new ArrayList<>(hashmap.entrySet());

        // sort the list based on the keys
        list.sort(new Comparator<HashMap.Entry<String, String>>() {
            @Override
            public int compare(HashMap.Entry<String, String> o1, HashMap.Entry<String, String> o2) {
                return o1.getKey().compareTo(o2.getKey());
            }
        });
        return list;
    }
}
