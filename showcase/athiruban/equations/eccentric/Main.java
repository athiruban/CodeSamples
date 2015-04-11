
/*
 * Program to find the value of eccentric number 'e'
 */

strictfp class TestMain{
    public static void main(String args[]){
        //System.out.println(getE(10));
        printTable();
    }

    public static void printTable(){
        double dValue=0.0;
        double stepValue=1.0;
        for(int i=1; i<=10; i++){
            System.out.println(dValue+stepValue);
            stepValue += 0.1;
        }
    }

    public static double getE(int precision){
        double eValue=0;
        for(int i=1; i<= precision; i++){
            eValue = eValue + (1/(double)i);
        }
        return eValue;
    }
}
