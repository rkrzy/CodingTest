import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;


public class Main {



    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        List<Integer> list = new ArrayList<>();

        for(int i = 1; i <= Math.sqrt(N); i++){
            if(N%i == 0)list.add(i);
        }
        for(int j = list.size()-1; j>=0; j--){
            //16을 기준으로 최대공약수를 구할 때 4 * 4로 될수도 있기 때문에 4가 두번 들어갈 수 있어서
            if(list.get(j) * list.get(j) == N)continue;
            list.add(N/list.get(j));
        }
        for(int num : list){
            System.out.println(num);
        }
    }
}
