package waystomakejvmbusy;

import java.util.Date;
import java.util.List;
import java.util.ArrayList;

public class MyApp{
    public static void main(String args[]){
        Integer count;
        System.out.println("With 'count++'");
        Date today = new Date();
        //int startMin = today.getMinutes();
        //int startSec = today.getSeconds();

        //List<Object> list = new ArrayList<Object>();

        System.out.println(today);
        count = Integer.MIN_VALUE;
        while(count != Integer.MAX_VALUE) {
            //System.out.print("Hi");
            //list.add(new Object());
            count = count++;
        }

        Date tomorrow = new Date();
        System.out.println(tomorrow);
        
//        int endMin = tomorrow.getMinutes();
//        int endSec = tomorrow.getSeconds();

//        int totalMin = (endMin > startMin)? endMin - startMin : 60 + endMin - startMin;
//        int totalSec = (endSec > startSec)? endSec - startSec : 60 + endSec - startSec;

//        System.out.println("Start Min:" + startMin);
//        System.out.println("End Min  :" + endMin);
//        System.out.println("Start Sec:" + startSec);
//        System.out.println("End Sec  :" + endSec);

//        System.out.println("Max Value reached");
    }
}


















