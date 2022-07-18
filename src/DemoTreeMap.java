import java.util.*;

public class DemoTreeMap {
    public static void main(String[] args) {
        TreeMap<String, Integer> treeMap = new TreeMap<>();
        treeMap.put("a", 23);
        treeMap.put("h", 24);
        treeMap.put("s", 25);
        treeMap.put("g", 26);
        treeMap.put("f", 27);



        System.out.println("Display entries in treeMap");
        System.out.println(treeMap + "\n");

//        System.out.println("phan tu co key = 1 la: " + treeMap.get("a"));
//        System.out.println("phan tu co key = 2 la: " + treeMap.get("b"));

//        treeMap.remove("e");
//        System.out.println(treeMap);
//
//
//        for (Map.Entry<String, Integer> entry : treeMap.entrySet()) {
//            System.out.println(entry.getKey() + " - " + entry.getValue());
//        }

//         show(treeMap);
//        display(treeMap);
    }
    public static void show(TreeMap<String, Integer> treeMap) {
        Set<String> keySet = treeMap.keySet();
        for (String key : keySet) {
            System.out.println(key + " - " + treeMap.get(key));
        }
    }


    public static void display(TreeMap<String, Integer> treeMap) {
        Iterator<String> itr = treeMap.keySet().iterator();
        while (itr.hasNext()) {
            System.out.println(treeMap.get(itr.next()));
        }
    }
}
