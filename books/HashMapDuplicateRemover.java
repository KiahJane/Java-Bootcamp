package books;

import java.util.*;

public class HashMapDuplicateRemover {

    public HashMapDuplicateRemover() {
    }

    public static HashMap<String, String> removeDuplicates(Map<String, String> hashMap) {
        /* helper method -- removes any duplicate user inputs, returns HashMap */

        // create HastSet to store unique key-value pairs
        Set<Map.Entry<String, String>> uniquePairs = new HashSet<>(hashMap.entrySet());

        // create a new HashMap to store the unique pairs
        HashMap<String, String> uniqueMap = new HashMap<>();

        // add the uniquer pairs to the new HashMap
        for (Map.Entry<String, String> pair : uniquePairs) {
            uniqueMap.put(pair.getKey(), pair.getValue());
        }
        return uniqueMap;
    }
}
