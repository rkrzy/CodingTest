import java.io.*;


public class Main {


    public static void main(String[] args) throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int N = Integer.parseInt(br.readLine());
            int M = Integer.parseInt(br.readLine());
            long[] multi = new long[41];
            int[] chair = new int[41];
            int temp = 0;
            int result = 1;
            multi[0] = 1;//VIP만 있는 경우를 대비
            multi[1] = 1;
            multi[2] = 2;
            for(int i = 3; i < 41; i++){
                multi[i] = multi[i-2] + multi[i-1];
            }
            for(int i = 0; i < M; i++){
                int num = Integer.parseInt(br.readLine());
                chair[num] = -1;
            }
            for(int i = 1; i <= N; i++){
                if(chair[i] == 0){
                    temp++;
                }
                else {
                    result *= multi[temp];
                    temp = 0;
                }
            }

            System.out.println(result * multi[temp]);//마지막에 곱해지지 않고 끝나서 한번 더 곱해준다.



    }
}
