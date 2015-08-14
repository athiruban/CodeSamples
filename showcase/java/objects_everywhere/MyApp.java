class KindA {
    KindB b;
    int num;
    String name;

    {
    b = new KindB();
    }
  // rest of the code
    public void display(){
    }

}

class KindB {
    KindA a;
    {
     a = new KindA();
    }
  // rest of the code

} 

class Main{
    public static void main(String args[]){
        KindA aobj = new KindA();
        //KindB bobj = new KindB();
        System.out.println("Program ends");
    }
}

