
class ABC{
    public static void displayConfig(){
        System.out.println("Inside display config");
    }
}

class DEF extends ABC{
    public void doStuff(){
        displayConfig(); // calling static method of Base class. No need to prefix the method with Class name.
    }
}


class MyApp{
    public static void main(String args[]){
        DEF obj = new DEF();
        obj.doStuff();
    }
}
