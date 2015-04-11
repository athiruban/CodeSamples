
class Plant{
    String getName(){ return "Plant"; }
    //Plant getType(){ return this; }
    Flower getType(){return new Flower();}
}

class Flower extends Plant{
    //Flower getType(){ return this; }
    //Plant  getType(){ return this; }
    //Tulip  getType(){ return new Tulip(); }
}

class Tulip{

}


class Programmer {
    Programmer debug(){ return this; }
}

class SCJP extends Programmer{
    //Object debug(){ return new Object(); }
}


class Dog{ }
class Beagle extends Dog{}

class Kennel{
    public static void main(String args[]){
        Beagle b1 = new Beagle();
        Dog dog1 = new Dog();
        Dog dog2 = b1;
        Beagle b3 = (Beagle) dog1;
    }
}
