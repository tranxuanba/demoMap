package demo;

import java.util.*;

public class TestMap {
    public static void main(String[] args) {
        Map<String, Integer> linedHashMap = new LinkedHashMap<>();
        //them cap key value
        linedHashMap.put("c", 23);
        linedHashMap.put("d", 24);
        linedHashMap.put("f", 25);
        linedHashMap.put("1", 26);
        linedHashMap.put("a", 27);
        //hashMap.put("hd", 45);
        linedHashMap.put("ad", 24);

//
////        //in ra danh sach
//        System.out.println("Display entries in HashMap");
//        System.out.println(hashMap);

//      //  tim gia tri thong qua tu (key
//                System.out.println(hashMap.get("hd"));
//        System.out.println(hashMap.get("b"));

        //xoa thong qua key
        //hashMap.remove("hd");
//        System.out.println(hashMap);


//        LinkedHashMap<String, Integer> linkedHashMap = new LinkedHashMap<>();
        System.out.println("Display entries in linkedHashMap");
        System.out.println(linedHashMap);

//        for (HashMap.Entry<String, Integer> entry : hashMap.entrySet()) {
//            System.out.println(entry.getKey() + " - " + entry.getValue());
//        }

//        show(hashMap);
//        display(hashMap);
//    }
//    public static void show(HashMap<String, Integer> hashMap) {
//        Set<String> keySet = hashMap.keySet();
//        for (String key : keySet) {
//            System.out.println(key + " - " + hashMap.get(key));
//        }
//    }
//
//
//    public static void display(HashMap<String, Integer> hashMap) {
//        Iterator<String> itr = hashMap.keySet().iterator();
//        while (itr.hasNext()) {
//            System.out.println(hashMap.get(itr.next()));
//        }
//    }
}
}

