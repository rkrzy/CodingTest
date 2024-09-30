import java.util.Scanner;
import java.io.*;
import java.math.BigInteger;
public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        BigInteger N = new BigInteger(str,2); //이렇게 하면 문자열을 2진수로 읽어오는게 가능하다.


        String result = N.toString(8); //이렇게 하면 8진수로 변환하는게 가능하다.

        System.out.println(result);
    }
}