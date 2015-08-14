
import java.io.IOException;
import java.io.Console;
import java.io.PrintWriter;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;

import java.util.Scanner;

class Parent {
	public void troubleCode() throws IOException {
		throw new IOException();
	}
}

class Child extends Parent {
	@Override
	public void troubleCode() throws RuntimeException {
		throw new RuntimeException();
	}
}

class NFE {
	public static void main(String args[]) {
		int salary = Integer.parseInt("1000.0");
	}
}

class ConsoleExample {
	/*
	 * One more example with format method of Console object.
	 */
	public static void main(String args[]) {
		Console console;
		console = System.console();
		
		String fspecifier = "%s %d \n";
		
		console.format(fspecifier, "Athiruban", 25);
		console.printf(fspecifier, "Athiruban", 25);
		
		System.out.println(fspecifier);
	}
}

// class PrintWriterExample {
// 	public static void main(String args[]) {
// 		/*
// 		 * 	Writer > BufferedWriter > PrintWriter
// 		 */
// 		// Use printwriter class to format the strings from the input dump
// 		File inputfile = new File("DFEB22.CSV");
// 		FileInputStream fis = new FileInputStream(inputfile);
// 		InputStreamReader isr = new InputStreamReader(inputfile, "UTF-8");

// 		String temp = null;

// 		while ((temp = isr.readLine() != null)) {
// 			showReport(temp);
// 		}
// 		isr.close();
// 	}

// 	private static void showReport(String lineoftext) {
// 		/*
// 		 * Slice the string into pieces based on the blank
// 		 */
// 		 String fspecifer = "%-10s %10s %td";
// 		 System.out.printf(fspecifer, "Account", "Benopt", "Effective Date");
// 		 Scanner textscanner = new Scanner(lineoftext);

// 		 textscanner.split("(\\w)+");
		 
// 		 String account = textscanner.next();
// 		 String benopt = textscanner.next();
// 		 String effdate = textscanner.next();

// 		 System.out.format(fspecifer, account, benopt, effdate);
// 	}
// }


class TestMain{
    public static void main(String args[]) {
    	/*
    	 * Let's catch the new arithmetic exception thrown by the rating method
    	 */ 
    	try {
    		System.out.println("Expected value is 1: " + getRating());
    		System.out.println("This statement wont be executed!");
    	}
    	catch (ArithmeticException ae){
    		System.out.println("Inside main catch block");
    	}
    }

    public static int getRating() {
    	try {
    		throw new RuntimeException();
    	}
    	catch(RuntimeException e) {
    		System.out.println("Inside catch block");
    		int a = 0; 
    		a = 9 / a; // has no effect!!!!!!!!!
    		//return -1;
    	}
    	// finally {
    	// 	System.out.println("Inside Finally");
    	// 	return 1;
    	// }
    	return 1; // deadcode compiler error!
    	//return 1;
    }

    /*
     * Finally block is catching the exception generated inside catch block. if we dont have finally block only then the generated 
     * exception will reach main method. Otherwise it wont.
     */
}
