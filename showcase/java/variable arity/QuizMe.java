
class ABC {
	void foobar(Integer a) {
		System.out.println("Integer");
	}
	// void foobar(Integer [] a) {
	// 	System.out.println("Integer[]");
	// }
	void foobar(Integer... a) {
		System.out.println("Integer...");
	}
}

class XYZ {
	static void printFirst(Integer ... ints){
		System.out.println("Integer... ");
	}
	static void printFirst(Number ... nums) {
		System.out.println("Number ...");
	}
	static void printFirst(Object ... objs) {
		System.out.println("Object ...");
	}
}

class QuizMe {
	public static void main(String args[]) {
		ABC obj = new ABC();
		// obj.foobar(1); // autobox and match
		// obj.foobar(1, 2);

		XYZ.printFirst(1);
		XYZ.printFirst((short) 1);
		XYZ.printFirst("Hi");
		XYZ.printFirst('A');
		XYZ.printFirst((short) 1, 1);

	}
}

class FinalQuiz {
	static String compute(long... ls) {return "ONE";}
	static String compute(Long... ls) {return "TWO";}
	static String compute(Integer i1, Integer i2) {return "THREE";}
	static String compute(Long l1, Long l2) {return "FOUR";}
	static String compute(Number n1, Number n2) {return "FIVE";}

	public static void main(String args[]) {
		System.out.println(compute((byte)5, (byte)10) + " " + compute(5, 10));
		System.out.println(compute(5L, 10) + " " + compute(5L, 10L));
	}
}