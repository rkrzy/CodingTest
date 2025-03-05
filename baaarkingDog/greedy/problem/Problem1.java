import java.io.*;
import java.util.Arrays;


public class Main {


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String input = br.readLine();
        int[] number = Arrays.stream(input.split("[+-]")).mapToInt(Integer::parseInt).toArray();
        String[] expression = input.split("\\d+");

        int result = number[0];

        boolean minus = false;

        for(int i = 1; i < expression.length; i++){
           if(expression[i].equals("-")){
               minus = true;
           }
           if(minus){
               result -= number[i];
           }
           else{
               result += number[i];
           }

        }
        System.out.println(result);
    }

}
