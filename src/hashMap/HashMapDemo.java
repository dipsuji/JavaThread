package hashMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.TreeMap;

/**
 * Java HashMap class contains values based on the key.
 * Java HashMap class contains only unique keys.
 * Java HashMap class may have one null key and multiple null values.
 * Java HashMap class is non synchronized.
 * Java HashMap class maintains no order.
 */
class HashMapDemo {
    public static void main(String[] args) {

//        Create and add objects in HashMap
        HashMap<Integer, String> hm1 = new HashMap<Integer, String>();
        System.out.println("list of elements: " + hm1);
//    adding the key and value in hash map by put() method
        hm1.put(10, "John");
        hm1.put(12, "Dipu");
        hm1.put(100, "Alex");

        System.out.println("After putting the key and value in hash map by put() method ");
        for (Entry m : hm1.entrySet()) {
            System.out.println(m.getKey() + ", " + m.getValue());
        }
        //way to get value from HashMap is by iterating over the whole Map
        Iterator<Integer> keySetIterator = hm1.keySet().iterator();

        while(keySetIterator.hasNext()){
            Integer key = keySetIterator.next();
            System.out.println("using iterating way - "+"key: " + key + " value: " + hm1.get(key));
        }

        System.out.println("Size of Map: " + hm1.size());
        hm1.clear(); //clears hashmap , removes all element
        System.out.println("Size of Map: " + hm1.size());

        hm1.put(12, "Dipu");
        Integer key = 12;
        String value = hm1.get(key);
        System.out.println("get Key: " + key +" get value: "+ value);
//        if that key is not present in hashMap then put that key , value
        hm1.putIfAbsent(12, "Arnav");
        hm1.putIfAbsent(115, "Shaumya");
        System.out.println("After apply putIfAbsent() method ");
        for (Entry m : hm1.entrySet()) {
            System.out.println(m.getKey() + " " + m.getValue());
        }

//        ContainsKey and ContainsValue Example
        System.out.println("Does HashMap contains 12 as key: " + hm1.containsKey(12));
        System.out.println("Does HashMap contains 12 as value: " + hm1.containsValue(12));
        System.out.println("Does HashMap contains Arnav as value: " + hm1.containsValue("Arnav"));

//        Checking if HashMap is empty
        boolean isEmpty = hm1.isEmpty();
        System.out.println("Is HashMap is empty: " + isEmpty);

//      making another hashMap
        HashMap<Integer, String> hm2 = new HashMap<Integer, String>();
        hm2.put(110, "Kayra");
//      add all key and value in first hash map into second hashMap by put all method
        hm2.putAll(hm1);
        System.out.println("After apply putAll() method ");
        for (Entry m : hm2.entrySet()) {
            System.out.println(m.getKey() + " " + m.getValue());
        }

//         Removing Objects from HashMap

        // this remove key-value pair based
        hm2.remove(12, "Dipu");
        System.out.println("key-value pair based removal list of elements: " + hm2);

        //this remove key-based elements
        hm2.remove(100);
        System.out.println("after key-based remove list of elements: " + hm2);

        hm2.put(21, "Twenty One");
        hm2.put(31, "Thirty One");
        hm2.put(41, "Thirty One");

        System.out.println("Unsorted HashMap: " + hm2);
        TreeMap sortedHashMap = new TreeMap(hm2);
        System.out.println("after Sort HashMap: " + sortedHashMap);


    }
}  