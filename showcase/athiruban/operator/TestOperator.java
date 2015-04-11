class TestOperator {
	public static void main(String args[]) {
		operator1();
	}

	public static void operator1() {
		int a = 1;
		boolean isWorking = false;
		/*
		 * Test bitwise operator with two different datatypes
		 */
		//System.out.println( isWorking & a );
		/*
		 * >& operator cannot be applied to boolean, int - Compiler error!
		 */
		int salary = 25000;
		int year = 2;

		salary = a + salary + year * 2000 + ++a;
		System.out.println("Naya Salary : " + salary);
        /*
		 * >Naya Salary : 29003<
		 * The current value of variable 'a' is applied to the expression before doing any arithmetic operation on it.
		 * The updated value of the variable 'a' which is 2 is not carried forward to the beginning of the expression.
		 */
	}
}