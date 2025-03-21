import java.io.*;

//남학생은 남학생끼리
//여학생은 여학생끼리
//한 방에는 같은 학년의 학생들을 배정
//한 방에는 한 명만 배정도 가능
//K : 한 방에 배정할 수 잇는 최대 인원 수
// 0 : 여학생
// 1 : 남학생
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] str = br.readLine().split(" ");

        int[] arr = new int[14];

        int n = Integer.parseInt(str[0]);
        int k = Integer.parseInt(str[1]);
        int result = 0;
        for(int i = 0;i<n;i++)
        {
            str = br.readLine().split(" ");
            int gender = Integer.parseInt(str[0]);
            int grade = Integer.parseInt(str[1]);

            arr[gender+(grade*2)]++;
        }
        for(int i = 2;i<14;i++){
            result += (arr[i]/k);
            if(arr[i]%k != 0){
                result++;
            }
        }

        System.out.println(result);

    }
}