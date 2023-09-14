import java.util.Scanner;

public class App {

    public static void main(String[] args) throws Exception {
       // Scanner in = new Scanner(System.in);
       // int t = in.nextInt();
       Scanner in = new Scanner(System.in);
       int c = in.nextInt();
       try{
           for(int i = 0; i < c; i ++){
               int n = in.nextInt();
               int p = in.nextInt();
               Calculator(n, p);
           }
       }
        catch(Exception e){
           System.out.println(e.getMessage());
       }
    }

    static void Calculator(int n, int p) throws Exception{
        if(n > 0 && p >0){
            System.out.println((int)Math.pow(n, p));
        }
        else{
           //System.out.println("n and p should be non-negative");
            throw new Exception("n and p should be non-negative");
        }
    }

    //Exception handling
    static void parseStringToInt(String data){
        //https://www.hackerrank.com/challenges/30-exceptions-string-to-integer/problem?isFullScreen=true
        try{
            String S = "sdsd";
            System.out.println(Integer.parseInt(S));
        }
        catch(NumberFormatException ex){
            System.out.println("Bad String");
        }
    }
    //Giving a 10-base number, convert it to 2-base and count the total of a consecutive group, print the maximum to the screen.
    static void binaryNumbers(){

        //https://www.hackerrank.com/challenges/30-binary-numbers/problem?isFullScreen=true

        int n = 439;
        String binaryStr = "";

        while(n > 0){
            binaryStr += n % 2 == 0? "0": "1";
            n = n/2;
        }

        String[] arr = binaryStr.split("0");
        int max = arr[0].length(); 

        for(String item:arr){
            if(max < item.length())
                max = item.length();
        }
        System.out.println(max);
    }
}
