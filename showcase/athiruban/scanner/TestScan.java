
import java.util.Scanner;

class TestScan{
    public static void main(String args[]){
        String input = "athiruban, athinivas, banupriya, senthil, athipathy, paramesh, true false end";
        Scanner scanner = new Scanner(input);
        scanner.useDelimiter(" ");
        while(scanner.hasNext()){
            if(scanner.hasNextBoolean())
                System.out.println("Boolean value: "+scanner.nextBoolean());
            else
                System.out.println(scanner.next());
        }
    }

}

File
Reader can operate on File
Writer
PrintWriter
BufferedReader extends Reader
BufferedWriter extends Writer

doesfileexist(String[] directories, String filename){
    String path="";
    for(String dir:directories){
        path = <M-F5>
    }
}

