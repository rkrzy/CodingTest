import java.io.*;



public class Main {

    public static void main(String[] args) throws IOException {

       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

       int N = Integer.parseInt(br.readLine());
       long[] arr = new long[N+1];
       long num0 = 1;
       long num1 = 1;
       long temp = 0;
       arr[1] = 1;
       if(N >=2)
       {
           arr[2] = 1;
       }
       for(int i = 3;i<=N;i++)
       {
           arr[i] = num0 + num1;
           temp = num0;
           num0 = num0 + num1;
           num1 = temp;

       }
       System.out.println(arr[N]);
    }
}