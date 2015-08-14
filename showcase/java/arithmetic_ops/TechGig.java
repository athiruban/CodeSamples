
/*
 * Operator Precedence and Associativity Summary
 * ---------------------------------------------
 * Postfix [] . () ++ -- 
 * Prefix ++ -- Unary + - Unary Complement ~ Boolean Complement !
 * new operator
 * Binary * / %
 * Binary + -
 * Binary Shift << >> >>>
 * Relational < > <= >= 									>>>Right to Left<<<
 * Equality == !=
 * Bitwise & 
 * Bitwise ^
 * Bitwise |
 * Logical && 
 * Logical ||
 * Ternary ?:
 * Assignment = += -= *= /= %= <<= >>= >>>= &= ^= |=		>>>Right to Left<<<
 */

class OperatorPrecedence1 { 
	public static void main(String[] args) { 
		int k = 1; 
		int i = ++k + k++ + + k;
		System.out.println(i); 
		/*
		 * Precendence: Postfix, Prefix, unary and finally binary operator
		 * 
		 */
	} 
}

class ClassB{
    //int a;
    static int a;
    //int f() { return a; }
    static int f() { return a; }
}

class ClassC { 
	public static void main(String[] args) { 
		int i = 0; 
        int j = 0; 
        boolean t = true; 
        boolean r; 
		r = (t & 0 < (i+=1)); 
        System.out.println(i + " " + j);
		r = (t && 0 < (i+=2)); 
        System.out.println(i + " " + j);
		r = (t | 0 < (j+=1)); 
        System.out.println(i + " " + j);
		r = (t || 0 < (j+=2)); 
		System.out.println(i + " " + j); 
		/*
		 * The operators '&' and '|' evaluates both the operands before applying the operator
		 * however the operators '&&' and '||' are short circuit operators
		 * >1 0<
		 * >3 0<
		 * >3 1<
		 * The fourth sysout won't be executed
		 */
	} 
}

class ClassD{
    public static void main(String args[]){
        
        boolean a=true;
        boolean b=false;
        /*
         * Unicode is a 16 bit character format
         * and it can come anywhere in the program 
         */
        char c='\u0061';
        
        System.out.println(c);
        //System.out.println(a&0);
    }
}

