import java.io.*;

public class TestMain2{
    public static void main(String args[]){
        float f1 = 2.1f;
        long l1 = 2L;
        float [][] fa = {{42.0f}, {1.7f, 2.3f}, {2.7f}};
        float [] f3 = {2.7f};

        if(f3 == fa[2]) System.out.println("Yes");
        else System.out.println("No");

        new TestFinalAndCatch(new String[]{"athi"});

        Object obj = new Object();
        System.out.println(obj.toString());
    }
}

class TestFinalAndCatch {
    private int i;

    TestFinalAndCatch(String[] args) {
        try {
            i = method1();
        } catch (IOException ex) {
            //i = 0;  // error: variable i might already have been assigned
        }
    }

    static int method1() throws IOException {
        return 1;
    }
}

