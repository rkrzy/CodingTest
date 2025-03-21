import java.io.*;


public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        String[] str = br.readLine().split(" ");

        int v = Integer.parseInt(br.readLine());

        int[] save = new int[201];

        for(int i = 0;i<n;i++){
            int temp = Integer.parseInt(str[i]);
            save[temp + 100]++;
        }
        System.out.println(save[v+ 100]);

    }
}