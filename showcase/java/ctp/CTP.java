package ctp;

/*
 * Understanding run time polymorphism in java
 */
class Animal{
    public void display(){
        System.out.println("Hi from animal class");
    }
}

class Human extends Animal{
    public void display(){
        System.out.println("Hi from human class");
    }
}

public class CTP{
    public static void main(String args[]){
        Animal human = new Human();
        human.display();
    }
}
