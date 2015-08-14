import java.util.*;
import java.io.*;

// Ques: 1

abstract class Foo {
	/*
	 * Even the class is abstract we can declare constructor
	 */
	public Foo() {
		System.out.println ("Inside Foo Constructor");
	}

	public void message() {
		System.out.println ("Logging message from Foo");
	}
}

class Bar extends Foo {
	public Bar() {
		System.out.println ("Inside Bar Constructor");
	}
	public void message() {
		System.out.println ("Logging message from Bar");
	}
}

class TestAbstract {
	public static void main(String args[]) {
		Foo fooref = new Bar();
	}
}

// Ques:2

class ErrorClass {
	public static int iarr[];

	static {
		iarr[0] = 1;
	}

	public static void main(String args[]) {
		System.out.println("This won't be printed!");
	}
}

// Ques:3

class IteratorCheck {
	private static Iterator reverse(List<Integer> list) {
		Collections.sort(list, Collections.reverseOrder());	
		return list.iterator();
	}

	public static void main(String args[]) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(19);
		list.add(20);
		list.add(1);
		list.add(21);

		// The below code wont compile
		// for(Integer i: reverse(list)) {
		// 	System.out.println(i + ", ");
		// }
	}
}

// Ques:4

class TrickyBase {
	public static void message() {
		System.out.println("Hi, from base class");
	}

	private final void fmethod() {
		System.out.println("Private final method of Base");
	}
}

class TrickyChild extends TrickyBase {
	public void fooBar() {
		message();
	}

	public static void main(String args[]) {
	TrickyChild cobj = new TrickyChild();
		cobj.fooBar();
		cobj.fmethod();
	}

	// since the method in base class is not visible the below declaration is not a problem.
	public void fmethod() {
		System.out.println("Private final method of Child");
	}
}

// Ques:5

class ConcreteClass {
	// public abstract void methodA();
	public static synchronized void fooBar() {
		
	}
}

// Ques:6

class ThreadCall {
	class Worker implements Runnable {
		public void run() {
			System.out.println("April Fool!");
		}	
	}

	public static void main(String args[]) {
		new ThreadCall().dummy();
	}

	private void dummy() {
		Thread thread = new Thread(new Thread(new Worker()));
		thread.run();
	}
}

// Ques:7

class ExceptionTest {
	public static void main(String args[]) {
		int []a[] = { {1,2}, {3,4} };
		int [][]b = a;
		System.out.println(b[1][1]);

		try{
			throw new NullPointerException();
		}
		catch(Exception e) {
			;
		}
		// catch(NullPointerException e) {
		// 	;
		// }
	}
}
