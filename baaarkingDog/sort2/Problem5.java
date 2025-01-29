import java.io.*;
import java.util.Arrays;


public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        String[] arr = new String[s.length()];
        for(int i = 0; i < s.length(); i++){
            arr[i] = s.substring(i);
        }
        Arrays.sort(arr);

        for(String temp : arr){
            System.out.println(temp);
        }
    }
}
