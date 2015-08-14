import java.util.*;

public class TestMain3{
    public static void main(String args[]){
        example1();
        class InClass{
            private int fint;
            public void set(int i) { fint = i; }
            public int  get() { return fint; }
        };
        
        final InClass obj = new InClass();
        obj.set(1);
        InClass ref = obj;
        ref.set(2);
        System.out.println(obj.get());
        //obj = new InClass(); // this will not compile

    }

    public static void example1(){

        List<String> ls = new ArrayList<String>();
        ls.add("Athiruban");
        ls.add("Java");

        List<? extends String> lus = ls;

        System.out.println("? extends String");

        List <? super String> lls = ls;

        System.out.println("Valid ? super String");

        inter1<Integer> myinteger = new inter1<Integer>(){
            public Integer sum(Integer a, Integer b){
                return a+b;
            }
            
            public Integer diff(Integer a, Integer b){
                return a-b;
            }
        };

        System.out.println("Adding two numbers using generic methods" + myinteger.sum(1,2));
        //System.out.println( new gclass<Integer>().sum(1,2)   );
    }

    /* generic method to sum any two integers extending from abstract class Number 
     * The below method will fail and there is no way we can make this to run
     */

    public <T super Integer> T sum(T a, T b){
        Integer la, lb;
        //la = a;
        //lb = b;
        return a+b;
    }

    interface inter1 <T>{
        public T sum(T a, T b);
        public T diff(T a, T b);
    }

    /* The below class is not successfull 
     */
    class gclass <T>{
        public T sum(T a, T b){
            return a+b;
        }

        public T diff(T a, T b){
            return a-b;
        }
    }
}

