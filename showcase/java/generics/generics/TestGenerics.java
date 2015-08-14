/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
 
package generics;

/**
 * @author DELL
 */

import java.util.*;

class TestGenerics {
    FooBar<Object> foo = new FooBar<Object>();
    /*
     * While using generic methods if the class is having type parameter then 
     * it is necessary to give type information otherwise it will return error.
     */
    Integer iobj    = 3;
    Machine machine = foo.<Machine>foobar(new Machine());
    /*
     * Even if we leave the return type the compiler will report error!
     * Be careful while calling generic methods.
     */
    Integer retval = foo.<Integer>foobar(iobj);
    Object  objref = foo.<Integer>foobar(iobj);
}

class BaseMachine implements Comparable { 
    // if remove the Comparable interface in the above declaration then we will get compiler error!
    public int compareTo(Object dest) {return 0;} 
}

class Machine extends BaseMachine { 
    public int compareTo(Object dest) {return 0;} 
}

class FooBar<E> {
    public <T extends Comparable<? super T>> T foobar(T arg){
        /*
         * After type erasure the type parameter 'T' will be replaced by Object.
         */      
        System.out.println("I am a generic method!");
        return arg;
    }
}

class Robo extends Machine {}

class EShop {
    public static void main(String args[]) {
        // electronic shop
        List<Map<String, Integer>> itemlist         = new ArrayList<Map<String, Integer>>();

        // The type parameters should match exactly otherwise the compiler will report that as error.
        Map<String, Integer>       electric_items   = new HashMap<String, Integer>();
        electric_items.put("Fan"      , new Integer(1200));
        electric_items.put("TubeLight", new Integer(1200));
        electric_items.put("Fan"      , new Integer(120));
        electric_items.put("Light"    , new Integer(100));
        electric_items.put("SmallFan" , new Integer(1200));

        HashMap<String, Integer>   electronic_items = new HashMap<String, Integer>();

        //we have two types of items 
        itemlist.add(electric_items);
        itemlist.add(electronic_items);

        System.out.println(itemlist);

        Queue<Integer> list2 = new PriorityQueue<Integer>();
        list2.offer(122);
        list2.offer(-2);
        list2.offer(22);
        list2.offer(2);
        list2.offer(33);
        list2.offer(22);

        System.out.println(list2);

        Queue<Integer> list3 = new PriorityQueue<Integer>();
        list3.offer(122);
        list3.offer(333);
        list3.offer(22);
        list3.offer(2);
        list3.offer(33);
        list3.offer(223);

        System.out.println(list3);

        print(list3);
    }

    private static void print(Queue list3) {

        /*
         * Navigate using for each loop
         */
        Integer[] ilist = new Integer[20];
         
        list3.toArray(ilist);

        // //Arrays.toArray(tempcollection, ilist);

        System.out.println("=======BEGIN=============");
        for(Integer i : ilist) {
            System.out.print(i + ", ");
        }
        System.out.println("\n=======END==============");
        
        /*
         *Navigate a queue 
         */
         while(list3.peek() != null){
             System.out.println(list3.poll());
         }

         System.out.println(ilist);
         convertToList(ilist);
    }

    private static void convertToList(Integer[] iarray) {
        /*
         * Since every array (primitive/reference) is coverted to an object at run time we need to use "Arrays" class
         * to convert the array to list. However to covert a list to array we can directly call "toArray" method inside the list class.
         */
    List ilist = new Vector();        
        ilist = Arrays.asList(iarray);        
        
        System.out.println(ilist);
        traverseIterator(ilist);
    }

    private static void traverseIterator(Collection col) {
        Iterator iterator = col.iterator();
        System.out.println("The below elements are traversed thru iterator");

        while (iterator.hasNext()) {
            System.out.print(iterator.next() + ", ");
           //iterator.remove();
        }
        convertListToSet(col);
    }

    private static void convertListToSet(Collection col) {
    Set set = new HashSet();
        set.addAll(col);

        System.out.println("Unique elements: \n" + set);
    }

    private void powerfulIterator(Collection col) {
        ListIterator iterator = ((ArrayList)col).listIterator();
        System.out.println("The below elements are traversed thru iterator");

        while (iterator.hasNext()) {
            System.out.print(iterator.next() + ", ");
            iterator.remove();
        }
    }
}