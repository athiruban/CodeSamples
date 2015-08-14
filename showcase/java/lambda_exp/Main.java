
class MyApp{
    public static void main(String args[]){
        char c = 'c';
        c = (char) (c + 1);
        char cd = '\'';
        cd = '\r';

        System.out.println(cd);
        System.out.print("Athi");
        System.out.print(cd);
        int iarray[] = {};
        Object oarray[] = {new Object(), new MyApp()};
        System.out.println(iarray.length+ "-"+oarray.length);
    }
}

