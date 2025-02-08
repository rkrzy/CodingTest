import java.io.*;
import java.util.Arrays;


public class Main {


    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split(" ");

        int a = Integer.parseInt(str[0]);
        int b = Integer.parseInt(str[1]);
        int currentA = 0;
        int currentB = 0;
        int result = 0;
        int[] arrA = new int[a];
        int[] arrB = new int[b];

        for (String s : br.readLine().split(" ")) {
            arrA[currentA++] = Integer.parseInt(s);
        }
        for (String s : br.readLine().split(" ")) {
            arrB[currentB++] = Integer.parseInt(s);
        }
        Arrays.sort(arrA);
        Arrays.sort(arrB);
        currentA = currentB = 0;
        while((currentA < arrA.length) && (currentB < arrB.length))
        {
            if(arrA[currentA] < arrB[currentB]){
                currentA++;
                result++;
            }
            else if(arrA[currentA] > arrB[currentB]){
                currentB++;
                result++;
            }
            else
            {
                currentA++;
                currentB++;
            }
        }
        if(arrA.length > currentA){
            result = result + arrA.length-currentA;
        }
        else if(arrB.length > currentB){
            result = result + arrB.length-currentB;
        }
        System.out.println(result);
    }
}
