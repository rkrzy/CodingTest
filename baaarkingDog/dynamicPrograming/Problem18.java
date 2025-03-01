import java.io.*;

/**


 **/
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        long[] arr = new long[1000001];
        arr[0] = 0;
        arr[1] = 1;
        arr[2] = 1;
        for(int i = 3; i <= Math.abs(N); i++){
            arr[i] = (arr[i-1] + arr[i-2])%1000000000;
        }
        if(N < 0){
            if(Math.abs(N)%2 == 1){
                System.out.println(1);
                System.out.println(arr[Math.abs(N)]);
            }
            else{
                System.out.println(-1);
                System.out.println(arr[Math.abs(N)]);
            }
        }
        else if(N == 0){
            System.out.println(0);
            System.out.println(0);
        }
        else{
            System.out.println(1);
            System.out.println(arr[N]);
        }

    }

}
