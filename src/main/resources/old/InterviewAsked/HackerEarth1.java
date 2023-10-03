package InterviewAsked;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


class Result {

    /*
     * Complete the 'fizzBuzz' function below.
     *
     * The function accepts INTEGER n as parameter.
     */

    public static void fizzBuzz(int n) {
    
    StringBuilder sb = new StringBuilder();
    for( int i=1; i<=n; i++){
        if(i%3==0 || i%5 == 0){
            if(i%3==0)
            sb.append("Fizz");

             if(i%5 == 0)
               sb.append("Buzz");
System.out.println(sb.toString());
        sb.setLength(0);
        }  else {
            System.out.println(i);
        }

        
        
    } 

    }

}
public class HackerEarth1 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        Result.fizzBuzz(n);

        bufferedReader.close();
    }
}
