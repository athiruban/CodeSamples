
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Collection;

class SortedCollection{

    public static void main(String args[]){
        /*
         * Here we explore sorted collections
         * In Java 1.5 version we have two sorted collections one for set and another for map.
         * TreeSet and HashSet
         */
        SortedSet<Integer> set = new TreeSet<Integer>();
        /*
         * SortedSet is an interface which extends 'Set' interface
         */
        List list = new LinkedList();
        addIntsToCollection(set);
        addToCollection(list);
        displayCollection(set);
        /*
         * >9, 10, 11, 29, 30,<
         */
        System.out.println("\n");
        displayCollection(list);
        /*
         * >Jackie Chan, Athiruban, Aathi, NULL value exempted, NULL value exempted,<
         */
    }

    private static void displayCollection(Collection col){
        for(Object element: col){
            if (element == null){ 
                System.out.println("NULL value exempted"); 
                continue; 
            }
            System.out.print(element.toString()+", ");
        }
    }

    private static void addToCollection(Collection col){
        col.add("Jackie Chan");
        col.add("Athiruban");
        col.add("Aathi");
        col.add(null);
        col.add(null);
    }

    private static void addIntsToCollection(Collection col){
        col.add(10);
        col.add(30);
        col.add(29);
        col.add(9);
        col.add(11);

    }
}

/*
 * Possible concrete classes in collection framework
 *  List: Vector (synchronized), ArrayList, LinkedList (can store more than one null elements)
 *  Set: HashSet, LinkedHashSet, TreeSet (can accept only a single null element)
 *  Map: HashTable (synchronized), HashMap, TreeMap (can accept single null key and multiple null values)
 */

