package datastructure;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class UseQueue {

    private static String[] queue;

    public static void main(String[] args) {
        /*
         * Demonstrate how to use Queue that includes add, peek, remove & poll elements.
         * Use For-Each loop and While-Loop with Iterator to retrieve data.
         *
         * Store and retrieve data from/to a database table.
         */


        Queue<String> iceCream = new LinkedList<>();


            iceCream.add("Coffee Ice-Cream");
            iceCream.add("Raspberry Ice-Cream");
            iceCream.add("Caramel Ice-Cream");
            iceCream.add("Bubble Gum Ice-Cream");
            iceCream.add("Sea Salt Ice-Cream");
            iceCream.add("Strawberry Ice-Cream");



        System.out.println(" The first queue is : " + iceCream);



            Iterator<String> iterator= iceCream.iterator();

            while (iterator.hasNext()) {
                System.out.println(iterator.hasNext());


            }

            for (String eatIceCream :queue){
                System.out.println(eatIceCream);
                
        }
            iceCream.poll();
        System.out.println("\n Queue after poll "+iceCream);
        iceCream.remove();
        System.out.println("\n Queue after remove "+iceCream);
        iceCream.peek();
        System.out.println("\n Peek method display "+iceCream);
        iceCream.element();
        System.out.println("Does the queue contain this element? "+iceCream.contains("Raspberry Ice-Cream"));




        }
    }




