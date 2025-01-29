import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    static int N;
    static String[] arr;
    static List<String>[] list = new ArrayList[51];

    static boolean compareStr(String str1, String str2){
        int result1 = 0;
        int result2 = 0;
        for(char ch : str1.toCharArray()){
            if(ch >= '0' && ch <= '9')result1 = result1 + (ch - '0');
        }
        for(char ch : str2.toCharArray()){
            if(ch >= '0' && ch <= '9')result2 = result2 + (ch - '0');
        }
        return result1 > result2;
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        arr = new String[N];
        for(int i = 0; i < N; i++){
            arr[i] = br.readLine();
        }
        for(int i = 0; i < list.length ; i++){
            list[i] = new ArrayList<>();
        }
        for(int i = 0; i < 3;i++){
            switch(i){
                case 0:
                    Arrays.sort(arr);
                    break;
                case 1:
                    for(int j = 0; j < N - 1; j++){
                        for(int k = 0; k < N - 1 - j; k++){
                            if(compareStr(arr[k], arr[k+1])){
                                String temp = arr[k];
                                arr[k] = arr[k+1];
                                arr[k+1] = temp;
                            }
                        }
                    }
                    break;
                case 2:
                    for(int j = 0; j < N; j++){
                        list[arr[j].length()].add(arr[j]);
                    }
                    break;
            }
        }
        int aIdx = 0;
        for(int j = 0; j < 51; j++){
            for(String str : list[j]){
                arr[aIdx++] = str;
            }
        }
        for(String str : arr){
            System.out.println(str);
        }
    }
}
