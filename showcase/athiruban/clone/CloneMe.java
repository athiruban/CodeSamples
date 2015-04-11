
public class CloneMe implements Cloneable{
    private int rank;
    /* 
     * Non-static initialization block
     * called in the order of declaration
     */
    { 
      rank = 0;
      System.out.println("Rank value has been initialized!"); // 1
    }
    
    public void setRank(int rank){
        this.rank = rank;
    }

    public int getRank(){
        return rank;
    }

    public CloneMe(){
        System.out.println("Default Constructor called");  // 2
    }

    /*
     * Beware the return type is 'protected'!
     */
    protected Object clone() throws CloneNotSupportedException{
        return super.clone();
    }

    public static void main(String args[]) throws CloneNotSupportedException{
        
        CloneMe original = new CloneMe();
        CloneMe duplicate = (CloneMe) original.clone();
        
        duplicate.setRank(20);
        System.out.println(original.getRank());
        /*
         * >0<
         * Original object wont be affected
         */
        TestSub sub = new TestSub();
        sub.doStuff();

        original.doCheck();
    }

    public void doCheck(){
 
        final Object aobj;
        /*
         * The final variables can be initialized atmost once
         */
        aobj = new Object();
        
        Object anotherobj = new Object(){
            public String toString(){
                return aobj.toString();
            }
        };

        System.out.println(anotherobj.toString());
    }
}

abstract class TestBase{
    protected void doStuff(){
        System.out.println("Inside doStuff");
    }
    /*
     * It is not necessary for a abstract class to have atleast one abstract method!
     */
}

class TestSub extends TestBase{
    /*
     * As per inheritance law the above 'doStuff' method will be inherited in 'TestSub'
     */
}

class TestMain1{
    public static void main(String args[]){
    
        int ia1[] = {1,2};
        int ia2[] = (int [])ia1.clone();
        /*
         * Arrays are first class objects so they have all the methods of 'Object' and some special properties like 'length'
         */
        int length = ia1.length;
        System.out.println(length);
        /*
         * >2<
         */
    }
}

class Outer{
    /*
     * The inner class is declared in default scope
     * The below inner class is an example for perfect non-static inner class
     * and it can access all the members just like any other member.
     */ 
    class Inner{
        
        private int a;
        
        Inner(){
            this(0);
        }
        
        Inner(int num){
            a = num;
        }
        
        public int get(){
            return a;
        }
    }
    
    public void showInner(){
        Inner in = new Inner();
        System.out.println(in.get());    
    }
    
    public static void main(String args[]){
        Outer out = new Outer();
        /*
         * 'new' is an operator
         */
        Outer.Inner in = out.new Inner();
        out.showInner();
    }
}
