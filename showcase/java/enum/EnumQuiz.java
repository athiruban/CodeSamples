
class EnumTester{
 
    enum Animals{
       DOG("woof"), CAT("meow"), FISH("burble");
    protected String sound;
 
    Animals(String sound){
        this.sound = sound;
    }
    };
 
    static Animals a;
    public static void main(String args[]){
       //System.out.println(a.DOG.sound);
        Animals fish = Animals.FISH;
        System.out.println(fish.sound);

        for(Animals ani : a.values()){
            System.out.println(ani.sound);
        }    
        Animals [] array = Animals.values();
        for(Animals a : array){
            System.out.println(a.sound);
        }
        System.out.println(a.values());
    }
}

class TesterNew{
    enum Example { ONE, TWO, THREE };
    public static void main(String args[]){
        Example eobj = Example.ONE;
        if(Example.ONE < Example.TWO) System.out.println("Yes");
        else System.out.println("No");
    }
}
