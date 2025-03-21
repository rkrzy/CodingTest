import java.io.*;
import java.util.LinkedList;
import java.util.List;

public class Main {
    static int n = 15;
    static int[] arr = new int[1000001];
    static int d = 3;
    static int[] p10 = new int[3];
    static List<Integer>[] list = new LinkedList[10];
    public static int digitNum(int x, int a){
        return (x / p10[a]) % 10;
    }

    public static void main(String[] args) throws IOException {
        p10[0] = 1;
        //1부터 d의 자릿수까지 배열에 저장해준다.
        for(int i = 1; i <d; i++) p10[i] = p10[i-1] * 10;
        //List의 내용을 전부 지워준다. 이 과정을 d번 반복하는데 d의 크기에 따라서 자릿수의 비교 횟수도 늘어난다.
        for(int i = 0; i < d; i++){
            for(int j = 0; j < 10; j++) list[j].clear();
            //자릿수에 맞춰서 값을 저장해준다. 만약 i가 1이라면 10의자리 기준으로 정렬한다.
            for(int j = 0; j < n; j++)
                list[digitNum(arr[j], i)].add(arr[j]);
            //리스트에 있는 값들을 전부 배열에 저장한다.
            int aIdx = 0;
            for(int j = 0; j < 10; j++){
                for(int x : list[j]) arr[aIdx++] = x;
            }
        }
        for(int i = 0; i < n;i++) System.out.println(arr[i]);


    }
}
