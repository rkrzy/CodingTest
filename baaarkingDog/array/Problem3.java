import java.io.*;


public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int result = 0;
        int x = 0;
        String[] str = br.readLine().split(" ");

        x = Integer.parseInt(br.readLine());
        int[] save = new int[2000001];

        for(int i = 0;i<n;i++){
            save[Integer.parseInt(str[i])] = i + 1;
        }
        for(int i = 0; i < n;i++){
            int temp = Integer.parseInt(str[i]);
            if(x-temp > 0 && save[x-temp] > 0 && save[temp] < save[x-temp]){
                    result++;
            }
        }
        System.out.println(result);



    }
}