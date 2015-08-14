class TestModulus{
    public static void main(String args[]){
        double f = 9000000000000000000000005.14000000999999962;
        System.out.println(f%7);
    }
}

class TestSwitch{
    public static void main(String... args){
        int iarray[][] = new int[4][];
        iarray[0] = new int[10];
        iarray[1] = new int[7];
        Object obj = new Object();
        //iarray[1][0] = obj;
        System.out.println(iarray[0][0]);
        //Run time exceptions
        //iarray[10] = new int[9];
        int udemy = 65;
        switch(udemy){
            case 'A':
                break;
            case 'a':
                break;
        }
        new TestSwitch().dummy();
    }
    class X{
        int x;
        public int getX(){return x;}
        public void setX(int a){this.x=a;}
    }
    class Y extends X{
        int y;
        int x;
        public int getY(){return y;}
        public void setY(int a){this.y = a;}
        public int getSuperX(){return super.x;}
        public int getX(){return x;}
    }
    public void dummy(){
        Y yy = new Y();
        yy.setX(10);
        yy.setY(100);
        X xx = yy;
        //System.out.println(yy.x +" "+ yy.y+" "+yy.getSuperX());
        System.out.println(xx.x+" "+xx.getX()+yy.x);
    }
}


