import java.io.*;
import java.util.StringTokenizer;


public class Main {

    public static void main(String[] args) throws IOException {
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       int N;
       int i = 0;
       int indexI = 0;
       N = Integer.parseInt(br.readLine());
       StringTokenizer st = new StringTokenizer(br.readLine()," ");

       int[] arr= new int[N];
       int[] result = new int[N];
       while(st.hasMoreTokens())
       {
           arr[i] = Integer.parseInt(st.nextToken());
           i++;
       }
       result[0] = 0;
       System.out.print(result[0] + " ");
       for(int j = 1;j<N;j++)
       {
           if(arr[j] < arr[indexI])
           {
               indexI = j;
           }
           if(arr[j] - arr[indexI] > result[j-1] && indexI < j)
           {
               result[j] = arr[j] - arr[indexI];
           }
           else
           {
               result[j] = result[j-1];
           }

           System.out.print(result[j] + " ");
       }


    }
}