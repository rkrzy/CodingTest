import java.io.*;



public class Main {

    //양 끝 좌석에는 컵홀더가 하나씩 더 있다.
    //커플석이 존재 = 사이에 컵홀더가 없음
    //컵홀더에 컵을 꽂을 수 있는 최대 사람의 수
    //S = 일반 좌석
    //L = 커플석 (두개의 쌍으로 주어진다)

    //목표 = 컵홀더에 놓을 수 있는 최대 사람의 수
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N;//극장의 자리 수;
        int result;
        int customer = 0;
        int holder = 0;
        String str;
        N = Integer.parseInt(br.readLine());
        str = br.readLine();

        for(int i = 0;i<str.length();i++)
        {
            if(str.charAt(i) == 'S')
            {
                customer = customer + 1;
            }
            else
            {
                customer = customer + 2;
                i++;
            }
            holder = holder + 1;
        }
        holder = holder + 1;
        if(holder > N)
        {
            result = customer;
        }
        else
        {
            result = holder;
        }
        System.out.println(result);
    }
}