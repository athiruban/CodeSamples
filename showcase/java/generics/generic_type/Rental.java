import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;

class Rental<E> {
    private List<E> rentalPool;
    private int maxNum;

    // public Rental(int maxNum) {
    //     this.maxNum = maxNum;
    //     this.rentalPool = new ArrayList<E>();
    // }

    public Rental(E a) {
        // is it possible to declare like this?
        // offcourse not!
        this.maxNum = 10;
        this.rentalPool = new ArrayList<E>();

    }

    public E getRental() {
        return rentalPool.get(0);
    }

    public void returnRental(E o) {
        //Integer ic = (Integer) o;
        rentalPool.add(o);
    }

    public E returnMe(E o) {
        return o;
    }
}

class TestMain1 {
    public static void main(String args[]) {
        Rental<Integer> intRental = new Rental<Integer>(10);
        intRental.returnRental(new Integer(100));
        System.out.println(intRental.getRental());
        
        /*
         * Idhu oru nalla idea illa
         */
        
         //NonGenericClass nonGenericClass = new NonGenericClass<Object>();
         IntNode intnode = new IntNode<Integer>();

         List<? extends String> mylist = new LinkedList<String>();
        
         /*
          * Compiler error!
          */
        
         //mylist.add("mepco"); 
        
         List mylist2 = new LinkedList<String>();
         mylist2.add("athiruban");
        
         Rental ngo = new Rental(2);
         ngo.returnRental("Indigo");
         //ngo.returnRental(2);
         ngo.returnMe(1);
         ngo.returnMe("aasdfdfsdf");
    }
}

class NonGenericClass {
    private int dummy;
    public void foo() {}
    public void bar() {}
}

class AbstractNode {}

class SimpleNode<E> extends AbstractNode {}

class IntNode<E> extends SimpleNode<E> {}

interface FooBar<T> {
    public void setBar(T ref);
}

class BiNode<E,T> extends SimpleNode<E> implements FooBar<T> {
    public void setBar(T ref) { }
}