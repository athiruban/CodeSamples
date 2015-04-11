import java.util.*;

class GetlnLine{
    public static void main(String args[]){
    
        PriorityQueue<String> pq = new PriorityQueue<String>();
        /*
         * Priority Queue stores elements in its natural order
         */
        pq.add("banana");
        pq.add("pear");
        pq.add("apple");
        
        System.out.println(pq.poll()+" "+pq.size()+" "+pq.peek()+" "+pq.size());
        /*
         * poll() removes and returns the first element in the queue
         * peek() only returns the first element in the queue
         * >apple 2 banana 2<
         */
    }
}


class TestClass{
    /*
     * Below code won't work
     * It is trying to work with all possible types extending from 'String' which might create a bunch of
     * un-related class sitting in the container object (which is ridiculous!)
     *
    public void doStuff2(List <? extends String> list){
        list.add("Athiruban");
    }
    */

    /*
     * This is fine. It is working on only the type which is having the lower bound as 'String' type
     */
 
    public void doStuff(List <? super String> list){
        list.add("Athiruban");
    }
    
    public static void main(String args[]){
        new TestClass().doStuff(new LinkedList<Object>());
    }
}
