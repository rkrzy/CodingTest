import java.io.*;
import java.util.Stack;


public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        String[] str1 = br.readLine().split(" ");
        String[] str2 = br.readLine().split(" ");
        int t = Integer.parseInt(str2[0]);
        int p = Integer.parseInt(str2[1]);

        int resultT = 0;
        int resultP = 0;
        int resultOne = 0;

        int[] arr = new int[6];
        for (int i = 0; i < 6; i++) {
            arr[i] = Integer.parseInt(str1[i]);
            resultT += arr[i]/t;
            if(arr[i]%t != 0){
                resultT++;
            }
        }
        resultP = n/p;
        resultOne = n%p;

        System.out.println(resultT);
        System.out.print(resultP +" "+resultOne);
    }
}