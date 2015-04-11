class A{
}

class B extends A{
}

class C extends B{
}

class D extends C{
}

class TestMain{

    public static void main(String args[]){

        A a = new A();
        B b = new B();
        C c = new C();
        D d = new D();

        /*
         * a is instance of type 'A'
         * 'A' is the base class for type 'B'
         * Since a reference variable can holds any type we can't determine its type during compilation
        b = (B) a;
         */
        
        /*
         * b is instance of type 'B' which is the base class for type 'C'
         * Again we can't determine the object's original type during compilation  
        c = (C) b;       
        c = (C) a;
         */
        
        /*
         * we can typecast the object to its super type however assigning super type to a sub-class reference
         * is a compile time error. Here the casting tells us the type explicitly.
        d = (A) d;
        b = (A) b;
        c = a;
         */
         
        a = (A) d; // OK
      
        /*
         * Type compability check
         */
        //AA obj = new AA();
        XYZ obj = new BB();
        System.out.println(obj instanceof XYZ1);
        /*
         * >true<
         */
        System.out.println(obj instanceof XYZ);
        /*
         * >true<
         */
        obj = new XYZ(){
            @Override
            public void doStuff(){
                System.out.println("Hi,there");
            }
        };
        
        obj.doStuff();
        /*
         * >Hi, there<
         */
    }
}

interface XYZ{
    public void doStuff();
}

interface XYZ1{
}

class AA implements XYZ, XYZ1{
    public void doStuff(){ }
}

class BB extends AA{
}
