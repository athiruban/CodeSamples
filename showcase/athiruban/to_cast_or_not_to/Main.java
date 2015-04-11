public class Main{
    public static void main(String [] args){
        Horse h1, h2;
        h1 = new Horse();
        h1.setName("zebra");
        
        Animal a1;
        a1 = h1; /* don't require casting */
        h1 = (Horse) a1; /* this requires casting */
        
        Human hh1;
        hh1 = new Human();

        /* h1 = (Horse) hh1; this will throw compile time warning */

        //Creating a real animal and assigning to human;
        Animal aa = new Animal();
        hh1 = (Horse) aa;
    }
}

class Animal{
    private String name;
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
}

class Horse extends Animal{
    public String getColor(){
        return "Black";
    }
}

class Human extends Animal{
    public String getName(){
        return "Social Animal";
    }
}

