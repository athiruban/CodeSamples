
import java.awt.Button;

class Clidder {
    private final void flipper() { 
        System.out.println("Clidder"); 
    }
}

class Clidlet extends Clidder {
    void flipper() { 
        System.out.println("Clidlet"); 
    }
    
    public static void main(String [] args) {
        new Clidlet().flipper();
    } 
}

/*
cohesion - within a module (high)
coupling - between module (low)

Typecasting - converting the type from one to another.
In particular we can convert from Child to Parent however not in the reverse way

Casting errors will happen at run time.
We can't convert a parent to child it will result in ClassCastException.

*/

class X { void do1(){} }
class Y extends X { 
    void do1(){System.out.println("Inside do1");}
    void do2(){System.out.println("Inside do2");} 
}

class Chrome{
    public static void main(String args[]){
        X x1 = new Y();
        ((Y)x1).do2();
        ((X) new Y()).do1();

        new Chrome().check(new X(), new Y());
    }
    void check(X x, Y y){
    Y yy = (Y) x;
    }
}

class TestNull{
    public static void main(String args[]){
        //Object obj;
        //System.out.println("Checking null pointer exception is caught by compiler when not initialized! " + obj.toString());
        Button b;
        //b.setLabel("Athiruban");
    }
}

class VoidCons{
    /*
    VoidCons(){
        super();
    }
    */
    void VoidCons(){
        //this(0);
    }

   // void VoidCons(int a){}
}

class TestMe{
    public static void main(String args[]){
        // The position of String matters!
        //System.out.println(1+2+"1"+1+1);
        int a = (-15);
        int iarr[] = {1,2,3};
        
        System.out.println(a);
        System.out.println(iarr.length);
        System.out.println(-1+5*7/5);
/*
        XX xx = new YY();
        YY yy = new YY();
        xx.sing();
        yy.sing();
*/
    }
}

class XX{
    static String s = "";
    protected XX(){ s += "XX";
    }
    public static void sing(){System.out.println("fa");}
}

class YY extends XX{
    private YY(){ s+= "YY"; }
    public static void sing(){System.out.println("na");}
    public static void main(String args[]){
        new YY();
        System.out.println(s);
    }
}

class TESTING{
    static int s=100;
    public static void main(String args[]){
        int a = 0;
        a = (+- +1);
        System.out.println(a);
        new TESTING().go();
    }
    private void go(){
        System.out.println(this.s);
    }
}

