package Arrays.Logical_Building;

import java.util.*;
import java.util.HashMap;


public class DemoMap {

    static void main() {


        HashMap<String, Integer> map = new HashMap<>();

        map.put("Rahul", 21);
        map.put("Sandy",18);
        map.put("Sandy",22);
        map.put("Rishi",18);


        map.remove("Rahul");

        for(String  Name : map.keySet()) {
            System.out.println(Name+" : "+map.get(Name));
            System.out.println(map.get(Name));
        }
    }

}
