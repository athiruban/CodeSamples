
class TestMain1{

    public static void main(String args[]){

        String a = new String("Athiruban");
        String b = new String("Athiruban");
        /*
         * Every string value will be kept in STRING POOL so that same strings can be reused
         * Explicit creation of String objects
         * 
         */        
        if(a == b) 
            System.out.println("Strings are equal");
        else 
            System.out.println("Strings are not equal");
    }
}

class TestMain2{

    public static void main(String args[]){

        String a = "Athiruban";
        String b = "Athiruban";
        if(a == b) 
            System.out.println("Strings are equal");
        else 
            System.out.println("Strings are not equal");
    }
}
