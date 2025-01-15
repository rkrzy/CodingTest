import java.io.*;
import java.util.Scanner;


public class Main {

    public static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void func1(int num, int num2, String str, String str1, String str2, String str3, String str4,
                             String str5, String str6) throws IOException
    {
        if(num == 0){
            bw.write(str.repeat(num2) + str1);
            bw.write(str.repeat(num2) + str5);
            for(int i = num2;i >= 0;i--){
                bw.write(str.repeat(i) + str6);
            }
        }
        else
        {
            bw.write(str.repeat(num2-num) + str1);
            bw.write(str.repeat(num2-num) + str2);
            bw.write(str.repeat(num2-num) + str3);
            bw.write(str.repeat(num2-num) + str4);
            func1(num-1, num2, str, str1, str2, str3, str4, str5, str6);
        }

    }
    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);
        String str = "____";
        String str0 = "어느 한 컴퓨터공학과 학생이 유명한 교수님을 찾아가 물었다.\n";
        String str1 = "\"재귀함수가 뭔가요?\"\n";
        String str2 = "\"잘 들어보게. 옛날옛날 한 산 꼭대기에 이세상 모든 지식을 통달한 선인이 있었어.\n";
        String str3 = "마을 사람들은 모두 그 선인에게 수많은 질문을 했고, 모두 지혜롭게 대답해 주었지.\n";
        String str4 = "그의 답은 대부분 옳았다고 하네. 그런데 어느 날, 그 선인에게 한 선비가 찾아와서 물었어.\"\n";
        String str5 = "\"재귀함수는 자기 자신을 호출하는 함수라네\"\n";
        String str6 = "라고 답변하였지.\n";

        int num = scanner.nextInt();

        bw.write(str0);

        func1(num, num, str, str1, str2, str3, str4, str5, str6);

        bw.flush();

        bw.close();

    }
}