package datastructure;

import java.util.ArrayList;
import java.util.Iterator;

public class UseArrayList {

    private static Object Arrays;

    public static void main(String[] args) {
        /*
         * Demonstrate how to use ArrayList that includes using the add, peek, remove & retrieve methods.
         * Use For-Each loop and While-loop with Iterator to retrieve data.
         *
         * Store and retrieve data from/to a database table.
         */


  Array<String> iceCream = new Array<String>();


            iceCream.add("Coffee Ice-Cream");
            iceCream.add("Raspberry Ice-Cream");
            iceCream.add("Caramel Ice-Cream");
            iceCream.add("Bubble Gum Ice-Cream");
            iceCream.add("Sea Salt Ice-Cream");
            iceCream.add("Strawberry Ice-Cream");



        System.out.println(" The first queue is : " + iceCream);



   ArrayList<String> arrayList=  new ArrayList<String>();

            while (arrayList()) {
        System.out.println(arrayList);

    }
            for (String str : arrayList){
        System.out.println(str);

    }
            iceCream.poll();
        System.out.println("\n Queue after poll "+iceCream);
        iceCream.remove();
        System.out.println("\n Queue after remove "+iceCream);
        iceCream.peek();
        System.out.println("\n Peek method display "+iceCream);
        iceCream.element();
       // System.out.println("Does the queue contain this element? "+iceCream.contains("Raspberry Ice-Cream"));




}

    private static boolean arrayList() {
        return false;
    }

    private static class Array<T> {
        public void add(T s) {
        }

        public Iterator<String> iterator() {
            return null;
        }

        public void poll() {
        }

        public void remove() {
        }

        public void peek() {
        }

        public void element() {
        }

        public void contains(T s) {
        }

    }
}


