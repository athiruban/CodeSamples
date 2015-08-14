class Yikes{
    public static void go(long n){System.out.println("long");}
    public static void go(Short n){System.out.println("short");}
    public static void main(String args[]){
        int i = 4;
        go(i); // no match will be found; - compiler error!
    }
}



class A {
	protected void addBonus(Integer salary) {
		System.out.println ("You bonus :" + (salary+1000));
	}
}

class B extends A{
	public void addBonus(int salary) {
		System.out.println ("You bonus :" + (salary+2000));
	}
}

class MyClass {
	public static void main(String args[]) {
		A base = new B();
		base.addBonus(100); // compile time
		base.addBonus(new Integer(100)); // compile time
		/*
		 * Both called A.addBonus method
		 */
		B child = new B();
		child.addBonus(100); // compile time
		child.addBonus(new Integer(100));  // compile time
		/*
		 * The first method called B's and second one called A's addBonus
		 */
	}
}