
class ArrayTest1 {
    public static void main(String args[]) {
        
        /*
         * LEGAL declarations
         */

        int []iarray = {1,2,3};
        int []iarray2 = new int[]{1,2,3};

        /*
         * ILLEGAL declarations 

        int []illarray = {1,{},2};

        int [][]illarray2 = new int[3][] {{1,2,1},{1,3,3},{1,1,1}};

        int [][]illarray3 = new int[3][3]{1,1,1};

        */

        System.out.println("Value stored in 0th place is "+iarray[0]);
        System.out.println("Value stored in 0th place is "+iarray2[0]);
    }
}

class OperatorPrecedence1 {
    public static void main(String args[]) {
 
        /*
         * Showing the precedence of LVALUE and RVALUE
         * First the LVALUE expression will be evaluated and then followed by RVALUE
         */

        int i=1;
        int iarray[] = {1,2,3};
        iarray[++i] = i++;

        System.out.println(iarray[0]);
        System.out.println(iarray[1]);
        System.out.println(iarray[2]);

        /*
         * >1<
         * >2<
         * >2<
         */
    }
}

class SwitchClass1 {
    static class FloatSub3 {
        public static void main(String args[]) {
 
        /*
         * Illustrating various possibilities of switch statement
         * The below code won't compile
         
            float fvalue = 1.2f;
            switch(fvalue){
                case 1:
                    System.out.println("Inside Case 1");
                    break;
                case 2:
                    System.out.println("Inside Case 1");
                    break;
            }
        */
        }
    }

    static class CharSub3b {
        public static void main(String args[]) {
 
            /*
             * Valid datatypes: short, int, byte, char (anything that can be converted to integer) and enum
             * Invalid datatyes: float, double, long.
             */

            char firstChar = 65535;
            switch(firstChar){
                case 256:
                    System.out.println("You entered capital A");
                    break;
                case 97:
                    System.out.println("You entered small a");
                    break;
            }

            int zipcode = 1147483648;
            switch(zipcode){
                case 'A':
                    System.out.println("You entered 2147483648");
                    break;
                case 'B':
                    System.out.println("You entered 10147483648");
                    break;
            }
        }
    }

    static class BooleanSub4b {
        public static void main(String args[]) {
        
            /*
             * Below code wont work can't convert integer to bollean
 
            int didyoueat=0;
            switch(didyoueat){
                case true:
                    System.out.println("Yes, I ate");
                    break;
                case false:
                    System.out.println("No, I didn't eat");
                    break;
            }
            */
        }
    }
}
