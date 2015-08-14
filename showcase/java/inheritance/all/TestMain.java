class Mammal{
    String name = "furry ";
    
    Mammal(String name){
        //this.name = name;
    }
    
    String makeNoise(){ 
        return "generic noise"; 
    }
}

class Zebra extends Mammal{
    String name = "stripes ";
    
    Zebra(String name){
        super(name);
    }
    
    String makeNoise(){ 
        return "bray"; 
    }
}

class ZooKeeper {
    public static void main(String[] args){ 
        new ZooKeeper().go(); 
    }

    void go() {
        Mammal m = new Zebra("horse");
        System.out.println(m.name + m.makeNoise());
    }
}

class A{ 
    int a =1; 
}

class B extends A{ 
    int b =2; 
}

class C extends B{ 
    int c =3;
    
    public static void main(String args[]){
        C cobj = new C();
        System.out.println("restore"+cobj.c+cobj.b+cobj.a);
    }
}
