interface Dummy{
}

abstract class ABC{}

/*
 * error: enum Example extends ABC implements Dummy{ONE, TWO, THREE}
 */
enum Example implements Dummy{ONE, TWO, THREE}


/*
error: class A extends Example{
//class extending enum
}
*/

class Driver{
    public static void main(String args[]){
        if(Example.ONE == Example.ONE) System.out.println("1");
        if(Example.ONE.equals(Example.ONE)) System.out.println("2");
/*
 * error: if(Example.ONE < Example.TWO) System.out.println("3");
 */
        System.out.println(Example.ONE);
    }
}
