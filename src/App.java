import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        binaryNumbers();
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
