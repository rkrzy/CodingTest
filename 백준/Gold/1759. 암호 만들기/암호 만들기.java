import java.io.*;
import java.util.Arrays;

//최소 한개의 모음(a, e, i, o, u)
//두 개의 자음
//알파벳이 암호에서 증가하는 순서로 배열

public class Main {

    static int L;
    static int C;
    static String[] str;
    static char[] arr;
    static char[] temp;
    static boolean[] visit;
    static int conNum = 0;
    static int gatherNum = 0;
    static StringBuilder sb = new StringBuilder();
    static void func(int depth, int start){
        if(depth == L){
            if(conNum >= 2 && gatherNum >=1) {
                for (int i = 0; i < L; i++) {
                    sb.append(temp[i]);
                }
                sb.append("\n");
            }
            return;
        }
        for(int i = start; i < C; i++){
            if(!visit[i]) {
                if(arr[i] == 'a' || arr[i] == 'e' || arr[i] == 'i' || arr[i] == 'o' || arr[i] =='u')
                {
                    gatherNum++;
                }
                else
                {
                    conNum++;
                }
                temp[depth] = arr[i];
                visit[i] = true;
                func(depth + 1, i + 1);
                if(arr[i] == 'a' || arr[i] == 'e' || arr[i] == 'i' || arr[i] == 'o' || arr[i] =='u')
                {
                    gatherNum--;
                }
                else
                {
                    conNum--;
                }
                visit[i] = false;
            }
        }
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        str = br.readLine().split(" ");
        L = Integer.parseInt(str[0]);
        C = Integer.parseInt(str[1]);
        str = br.readLine().split(" ");
        arr = new char[C];
        for(int i = 0; i < C; i++){
            arr[i] = str[i].charAt(0);
        }
        temp = new char[L];
        visit = new boolean[C];

        Arrays.sort(arr);

        func(0, 0);
        System.out.println(sb);
    }
}
