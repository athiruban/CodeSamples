/*
 * Interface with single method!
 */

interface Device { 
    public void doIt(); 
}

/*
 * Abstract can implement interface and need not define every method
 */

abstract class Electronic implements Device { 
    public void doIt(){}
}

/*
 * Abstract class can extend either abstract or non abstract class
 */

abstract class Phone1 extends Electronic { }

/*
 * The below doIt() method need not be declared.
 */

class Phone2 extends Electronic { 
/*
    public void doIt(){ 
    } 
*/
}

/*
 * Again the method under the interface are defined in the 'Electronic' class
 * So we need not redefine it
 */

class Phone3 extends Electronic implements Device { 
/*
    public void doStuff(){ 
    } 
*/
}


class TEST{
    int _$flag;
    char a = 'A';
    Boolean [] barray[];

    public static void main(String args[]){
        new TEST().dummy();
    }
    
    void dummy(){
        for(;;){
            System.out.println("inside for loop");
            continue;
            //System.out.println("After Continue");
        }
    }
}
