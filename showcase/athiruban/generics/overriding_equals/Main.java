/*
 * Rules for overriding equals and hashCode methods
 * 1) If the hashCode of two objects A and B are equal, then equals() may or may not be same.
 * 2) If the equals methods of two objects A and B returns true, then their hashCode must be equal.
 */

class TestMain1{
    public static void main(String args[]){
        Integer myAge = 26;
        String myName="Athiruban SM";
        String myAlias="Athiruban SM";
        String myBrotherName="Athinivas SM";

        System.out.println(myName.toString()+" "+myName.hashCode()+" "+myAlias.hashCode());
        System.out.println(myAge.toString()+" "+myAge.hashCode());
    }
}
