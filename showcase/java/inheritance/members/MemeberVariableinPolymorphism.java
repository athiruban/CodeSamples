
class A{
    int size;
    A(){
        size = 10;
    }
    public void display(){
        System.out.println("In A " + size);
    }
}

class B extends A{
    public void display(){
        /*
         * There is no concept of member variable overriding in Java. Only methods can be overriden.
         * Based on the access specifier the member variable of Base class will be visible under the derived class.
         * Here the variable 'size' is created in Base class 'A' and visible inside the derived class.
         */
        size++;
        System.out.println(size);
    }
}

class TestClass{
        B b = new B();
    public static void main(String args[]){
        b.display();
        /*
         * >11<
         */
        A ref = b; 
        ref.display();
        /*
         * >12<
         */
        System.out.println(ref.size);
        /*
         * >12<
         */
    }
}

