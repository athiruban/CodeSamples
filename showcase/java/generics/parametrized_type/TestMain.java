import java.util.*;

class Foo <X, String, Y>{
    X xref;
    String name;
    Y yref;

    Foo(){}

    Foo(X xref, String name, Y yref){
        this.xref = xref;
        this.name = name;
        this.yref = yref;
    }

    void display(){
        System.out.println("xref = "+this.xref);
        System.out.println("name = "+this.name);
        System.out.println("yref = "+this.yref);
    }

} 

abstract class AbsClass{}
class ConClass extends AbsClass{}

class Driver{
    public static void main(String args[]) throws InterruptedException{
        new Foo<Integer, String, Double>(1,"Athiruban",3.14).display();
        Driver [] drivers = {new Driver(), null, new Driver()};
        int [] iarray = {1, new Integer(2), 3};
        int a=1,b=2,c=3;

        int [] iarray2 = {a,b*3,c,};
        AbsClass[] absarray = {new ConClass(),};
        int [] zerodim = new int[0];
        System.out.println("length: "+zerodim.length);
        System.out.println(zerodim.hashCode());
        zerodim.wait();
    }
}

class G1{
    public void takeList(List<? extends String> list){
        // any type which is extending from String...........
        // the below code will throw error since List<E> is pointing to a single well known type...............
    list.add("Athiruban");
    Object obj = list;
    }
}
