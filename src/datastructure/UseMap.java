package datastructure;

import java.util.HashMap;

public class UseMap {


    public static <string> void main(String[] args) {
        /*
         * Demonstrate how to use Map that includes storing and retrieving elements.
         * Add List<String> into a Map. Like, Map<String, List<string>> list = new HashMap<String, List<String>>();
         * Use For-Each loop and While-loop with Iterator to retrieve data.
         *
         * Store and retrieve data from/to a database table.
         */
        HashMap<String, Integer> map = new HashMap<>();

        map.put("Azi",30);
        map.put("Neda",20);
        map.put("Arezoo",10);

        System.out.println("Size of map is:- "
                + map.size());
        System.out.println(map);


        if (map.containsKey("Azi")){
            Integer a=map.get("Azi");
            System.out.println("Value for key "+"\"Azi\" is :- "+a);
        }




    }

}
