import java.io.*;
import java.util.StringTokenizer;


//시작 시간은 오름차순으로 주어진다.

public class Main {

    public static void main(String[] args) throws IOException {

       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       StringTokenizer st = new StringTokenizer(br.readLine());

       BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

       int N; // 강의실 번호 수
       int M; // 요청 수

        int room;
        int startTime = 0;
        int endTime = 0;

       N = Integer.parseInt(st.nextToken());
       M = Integer.parseInt(st.nextToken());

       int[][] arr = new int[N+1][2];
       for(int i = 0;i<=N;i++)
       {
           arr[i][0] = 0;
           arr[i][1] = 0;
       }

       for(int i= 0;i<M;i++)
       {
            st = new StringTokenizer(br.readLine());
            room = Integer.parseInt(st.nextToken());
            startTime = Integer.parseInt(st.nextToken());
            endTime = Integer.parseInt(st.nextToken());
            if(arr[room][1]<=startTime)
            {
                arr[room][0] = startTime;
                arr[room][1] = endTime;
                bw.write("YES\n");
            }
            else
            {
                bw.write("NO\n");
            }
       }

        bw.flush();
        bw.close();

    }
}