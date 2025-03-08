import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;


//1 => 상근
//2 => 창영
public class Main {

    static class Time implements Comparable<Time>{
        public int start;
        public int end;

        public Time(int start, int end){
            this.start = start;
            this.end = end;
        }
        @Override
        public int compareTo(Time time){
            if(this.start == time.start){
                return this.end - time.end;
            }
            else {
                return this.start - time.start;
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = null;
        List<Time> list = new ArrayList<>();
        for(int i = 0; i < N; i++){
            st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());
            list.add(new Time(start, end));
        }

        Collections.sort(list);

        PriorityQueue<Integer> q = new PriorityQueue<>();
        for(Time t : list){
            if(!q.isEmpty() && q.peek() <= t.start) {
                q.poll();
            }
            q.add(t.end);
        }
        System.out.println(q.size());
    }
}
