import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {


    public static void main(String[] args) throws IOException {
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

       String str = br.readLine();

       int result1 = 0;
       int result0 = 0;
       char pre = ' ';
       char cur = ' ';
       if(str.charAt(0) == '0'){
           result0++;
       }
       else {
           result1++;
       }
       pre = str.charAt(0);
       for(int i = 1; i < str.length(); i++){
           cur = str.charAt(i);
           if(pre != cur){
               pre = cur;
               if(cur == '0'){
                   result0++;
               }
               else{
                   result1++;
               }
           }
       }

       System.out.println(result1 > result0? result0 : result1);

    }

}
