
class Hotel {
   public static void book(short a) { // prmitive type (a)
        System.out.print("short ");
    }

    public static void book(Short a) { // wrapper type (b)
        System.out.print("SHORT ");
    }

    public static void book(Long a) { // wrapper type (c)
        System.out.print("LONG ");
    }

    public static void book(long a) { // primitive type (d)
        System.out.print("long ");
    }

    public static void main(String[] args) {
        short shortRoom = 1;
        int intRoom = 2;

        book(shortRoom);  // calls (a)
        /*
         * It found an exact match with the primitive type!
         */
        book(intRoom);
        /*
         * Here it widen the integer to long and found a match.
         */
        book('A');
        /*
         * Here also it widen the character to long and found a match.
         * Conclusion:
           ----------
           Widen and match is possible however widen, box and match is not possible
         */
       
    }
}

class Conversion {

    public static void book(Long a) { // wrapper type (A)
        System.out.print("Long ");
    }

    public static void book(Short a) { // wrapper type (B)
        System.out.print("Short ");
    }

    public static void book(long a) { // primitive type (C)
        System.out.print("long ");
    }

    public static void main(String[] args) {
    	Integer iobj = Integer.parseInt("10");

        book(iobj);  // calls (C)

        /*
         * The wrapper type got unboxed to integer and then widen.
         * Conclusion:
           ----------
           Widen and match is possible however widen, box and match is not possible
         */
       
    }
}
