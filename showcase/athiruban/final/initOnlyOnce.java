class A{
    final int a;
	int n;
	    
    /*
    A(){ 
	    a = 1; 
	}
    */

    A(int b){ 
	    n = b; 
	}

	/*
	 * The variables which got left out in the above constructor will be initialized by the compiler itself 
	 * so at the end we have all variables initialized either by our constructor code or by the compiler inserted code!
	 */

    public void setA(int b){
        a = b;
    }
}

class TestMain{
    public static void main(String args[]){
        A obj = new A(1);
        obj.setA(10);
        /*
         * If we don't have any constructor the compiler will create a default constructor which will initialize all the member variables
         * to their default value
         *>cannot assign a value to final variable a<
         */
    }
}
