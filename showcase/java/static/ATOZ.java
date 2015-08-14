


class Test{
    static{
        System.out.println("Inside static block");
        a = new int[3];
    }
    static final int[] a;
    static final int[] aa = new int[]{1,2};
    static final int[] b;

    public static void main(String args[]){
        a[0] = 100;
        a[0] = 990;
        //a = new int[] {10,10};
        b = new int[3];
    }
}


