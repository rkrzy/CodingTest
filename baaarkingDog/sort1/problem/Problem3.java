import java.io.*;


public class Main {
    static int[] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        int temp = 0;
        arr = new int[10001];

        for(int i = 0;i < N;i++){
            temp = Integer.parseInt(br.readLine());
            arr[temp]++;
        }
        for(int i = 0; i < 10001;i++){
            if(arr[i] != 0)
            {
                for(int j = 0; j < arr[i]; j++){
                    bw.append(i + "\n");
                }
            }
        }
        bw.flush();

        br.close();
        bw.close();


    }
}
