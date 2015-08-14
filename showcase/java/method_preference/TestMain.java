class Hotel {
    public static void book(Long a) {
        System.out.print("LONG ");
    }

    public static void book(Short a) {
        System.out.print("SHORT ");
    }
    
    public static void book(short a) {
        System.out.print("short ");
    }

    public static void main(String[] args) {
        short shortRoom = 1;
        int intRoom = 2;        
        book(new Short(shortRoom));
        //book(intRoom);
        BaseX bref = new ChildY();
        bref.doStuff();
        BaseX bobj = new BaseX();
        bobj.doStuff();
        System.out.println("I wont be executed!");
    }
}

class BaseX{
    public void doStuff(){
        throw new RuntimeException("Athiruban");
    }
}

class ChildY extends BaseX{
    public void doStuff(){
        System.out.println("No Exception thrown");
    }
}

class Dummy{
    synchronized public void doStuff(){
        try{
            wait();
        }
        catch (InterruptedException e){}
        notify();
    }
}

class Barn{
    public static void main(String[]... args){
        new Barn().go("hi");
        new Barn().go("hi", "world");
    }
    public void go(String... y){
        System.out.print(y[y.length-1]+" ");
    }
}

class A{ A(){} }
class B extends A{ B(int a){} }
class C extends B{ C(){super(1);} 
    public static void main(String args[]){
        new C();
    }
}

class Mystery{
    public static void parse(String str){
        try{
            float f = Float.parseFloat(str);
        }
        catch(NumberFormatException e){
            f = 0;
        } finally {
            System.out.println(f);
        }

        }
    public static void main(String [] args){ new Mystery().parse("invalid"); }
}
