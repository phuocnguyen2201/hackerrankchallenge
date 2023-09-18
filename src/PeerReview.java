import java.util.Scanner;

public class PeerReview {

    //The app will calulate your number you enter, and then give you their 2-based form under binary.
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);

        System.out.println("Please pick a number: ");
        String data = in.nextLine();

        while(!data.matches("^[0-9]+$")){
            System.out.println("We accept numbers only 0-9: ");
            data = in.nextLine();
        }

        binaryNumbers(Integer.parseInt(data));
     }


        //Giving a 10-base number, convert it to 2-base and count the total of a consecutive group, print the maximum to the screen.
        static void binaryNumbers(int n){

            //https://www.hackerrank.com/challenges/30-binary-numbers/problem?isFullScreen=true
    
            String binaryStr = "";
    
            while(n > 0){
                binaryStr += n % 2 == 0? "0": "1";
                n = n/2;
            }
            
            System.out.println("The number in 2-based is: "+binaryStr);
            
            String[] arr = binaryStr.split("0");
            int max = arr[0].length(); 
    
            for(String item:arr){
                if(max < item.length())
                    max = item.length();
            }
            System.out.println("The maximum of a consecutive group is: "+max);
        }
}
