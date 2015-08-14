import java.util.Map;
import java.util.PriorityQueue;
import java.util.HashMap;
import java.util.Deque;
import java.util.LinkedList;


class TestClass1{

    public static void main(String args[]){

        Deque< HashMap< String, String> > q = 
            new LinkedList< HashMap< String, String> >();

        HashMap<String, String> m1 = new HashMap<String, String>();
        HashMap<String, String> m2 = new HashMap<String, String>();
        HashMap<String, String> m3 = new HashMap<String, String>();

        m1.put("foo", "bar"); 
        m2.put("athi", "ruban"); 
        m3.put("athi", "nivas"); 
        
        /*
         * Now we have three maps and now store everything inside the queue!
         */
        
        q.add(m1);
        q.add(m2);
        q.add(m3);

        /*
         * Now traverse the elmments inside the queue one by one
         */
         Map <String, String> ref;

         while (null != (ref = q.removeFirst() ) ){
         	System.out.println( ref.keySet().get(0) );
         }
    }
}

