public class Main{
    static double max=0;
    static String menulist=null;

    public static void main(String args[]){
        selectFood(34);
    }

public static void selectFood(double money){
    /*String[]menu={"Bandera Pizza Bread","Boston's Pizza Bread","Garlic Twist Bread","Single Order",
                "Sun-Dried Tomato Bruschetta","Three Cheese Toast","Double Order wings","Starter Size wings",
                "Cactus Nachos","Baked Ravioli Bites","Southwest Quesadilla"};
    */
    double[]itemCost={6.49,5.35,7.49,5.35,6.99,6.35,16.49,8.99,10.29,8.49,9.25};

    double max=0;
    possibilities(itemCost.length,"",itemCost,money);

    //selectFood(n,itemCost,0);
}

public static void possibilities(int length,String sofar,double[]itemCost,double money){
    if(length==0){
        //selectFood(sofar,itemCost,money,0);
        float totCost=0;

        double target=money/1.15;
        double minTip=money-target;

        char[]sofarList=sofar.toCharArray();
        for(int i=0;i<sofarList.length;i++){
            if(sofarList[i]=='1'){
                totCost+=itemCost[i];
            }

        }
        if(totCost<target && totCost>max){
            max = totCost;
            menulist = sofarList;
            /*
            System.out.println(totCost);
            for(int i=0;i<sofarList.length;i++){
                System.out.print(sofarList[i]);
            }   
            System.out.println("\n");
            */
        }

    }
    else{
        possibilities(length-1,sofar+"0",itemCost,money);
        possibilities(length-1,sofar+"1",itemCost,money);
    }
}

}

