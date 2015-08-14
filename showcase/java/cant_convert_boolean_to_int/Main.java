public class Main{
    public static void main(String args[])throws InterruptedException{

        int i=1;
        int ranklist[] = new int[10];
        /*
         * Local variables are not initialized by default unlike static and non-static variables
         * however arrays are first class objects in Java! 
         */
        System.out.println(i+" "+ranklist[0]+" "+ranklist[1]+" "+ranklist[2]);
        
        ranklist[++i] = + i;
        
        System.out.println(i+" "+ranklist[0]+" "+ranklist[1]+" "+ranklist[2]);
        
        System.out.println(i + 1 + "i+1");

        boolean flag = true;
        char initial = 'A';
        /*
         * Can't convert boolean to integer and vice versa
         */
        //int iflag = (int) flag; 
        
        /*
         * Character can be converted to integer however not vice versa
         */
        int iinitial = initial;
        System.out.println(iinitial);
 
        Thread.sleep(10000);
    }

}
