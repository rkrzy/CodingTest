import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;


public class Main {

    static class Pair{
        int start;
        int end;
        Pair(int start, int end){
            this.start = start;
            this.end = end;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int start = 0;
        int end = 0;
        int result = 0;
        List<Pair> list = new ArrayList();
        int N = Integer.parseInt(br.readLine());
        for(int i = 0; i < N; i++){
            String[] str = br.readLine().split(" ");
            Pair pair = new Pair(Integer.parseInt(str[0]), Integer.parseInt(str[1]));
            list.add(pair);
        }
        list.sort(Comparator.comparingInt((Pair p) -> p.start)
                .thenComparing(p -> p.end));
        start = list.get(0).start;
        end = list.get(0).end;
        for(int i = 1; i < list.size(); i++){
                if(end >= list.get(i).start){
                    if(end < list.get(i).end){
                        end = list.get(i).end;
                    }
                }else{
                    result += (end - start);
                    start = list.get(i).start;
                    end = list.get(i).end;
                }
        }
        result += (end - start);
        System.out.println(result);

    }
}
