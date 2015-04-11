import java.util.regex.*;

strictfp class TestMain1{
    
    public static void main(String [] args){
    
        byte size=7;
        Byte sizeObj = size;
        
        System.out.println(sizeObj.toString());
        /* 
         * We don't need to type cast primitive to class type (from byte to Byte)
         * >7< 
         */

        int isize=111;
        Integer isizeObj = isize;

        System.out.println(isizeObj.toString());
        /*
         * >111<
         */
        Object obj = isize;
        int osize = (Integer) obj;

        Number nobj = 10;        
        /*
         * 
         */
        SO();
        System.out.println(harmonicOf(2));
    }

    //public static String pattern1="(\"[^(\")]*\")";
    public static String pattern1="(\"{1}.+?\"{1})";
    /*
     * () used for grouping {}  quantifies the pattern occurence 
     * . denotes any character  + quantifies one more more
     * ? after ? . + denotes non-greedy or reluctant
     */
    public static void getStrings(){
        /* 
         * Uses java.util.regex package classes
         */
        Pattern r = Pattern.compile(pattern1);
        
        Matcher m = r.matcher(
            "String string=\"welcome\"\";\n" +
            "String k=\"a\\\"welcome\";"
            );

        while(m.find()){
            System.out.println(m.start()+" "+m.group());
        }
    }

    /* 
     * Note in the above matcher we gave a string expanding two lines.
     * the character \n will be interpreted as a new line character and 
     * regex will reset itself when a new line character is encountered
     * >14 "welcome"<
     * >35 "a\" <
     * 
     * In case if we exclude the \n character in the matcher then we will get
     * >14 "welcome"<
     * >23 ";String k="<
     * >35 "a\"<
     */
    
    public static void SO(){
        getStrings();
    }

    public static int harmonicOf(int n)
    {
        if (n==1){
            return 1;
        }
        return ((1/n) + harmonicOf(n-1));
    }
}


class RegexTester{
 
    public static void main(String args[]){
        String dataset = "333744,'ACTIVE EMPLOYEE','OAPIN','OA001', \n" +
                         "123456,'RETIERE','OAPIN','OA001', \n"         +
                         "353744,'Housing Board','HMOI','OA002'"
                         ;

        /* 
         * find all the occurrence of the key OA
         */
        Pattern p = Pattern.compile("OA");
        Matcher m = p.matcher(dataset);
        displayResult(m);
        
        /* 
         * >OA<
         * >OA<
         */
        
        System.out.println("=============================================================");
        
        p = Pattern.compile("([0-9])+");
        m = p.matcher(dataset);
        displayResult(m);
        
        /* 
         * >333744<
         * >001<
         * >123456<
         */
        
        System.out.println("=============================================================");
        
        /*
         * greedy approach
         */
        
        p = Pattern.compile("'.+'");
        m = p.matcher(dataset);
        
        displayResult(m);
        
        /*
         * >'ACTIVE EMPLOYEE','OAPIN','OA001'<
         * >'RETIERE','OAPIN','OA001'<
         */

        System.out.println("=============================================================");
        
        /*
         * without greedy or reluctant approach
         */
        
        p = Pattern.compile("'.+?'");
        m = p.matcher(dataset);
 
        displayResult(m);
        
        /*
         * >'ACTIVE EMPLOYEE'<
         * >'OAPIN'<
         * >'OA001'<
         */
       System.out.println("=============================================================");
        
        /*
         * possessive approach
         */
        
        p = Pattern.compile("'.++'");
        m = p.matcher(dataset);
 
        displayResult(m);
        
        /*
         * >'ACTIVE EMPLOYEE'<
         * >'OAPIN'<
         * >'OA001'<
         */
  
    }

    private static void displayResult(Matcher m){
        while (m.find()){
            System.out.println(m.start()+" "+m.group());
        }
    }
}
