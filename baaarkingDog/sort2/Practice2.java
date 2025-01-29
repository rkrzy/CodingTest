import java.io.*;
import java.util.*;


public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Map<Long, Integer> map = new HashMap<>();

        int N = Integer.parseInt(br.readLine());

        for(int i = 0; i < N; i++){
            Long str = Long.parseLong(br.readLine());
            if(map.containsKey(str)){
                int num = map.get(str);
                map.put(str,num +1);
            }
            else {
                map.put(str,1);
            }
        }
       List<Map.Entry<Long,Integer>> entryList = new ArrayList<>(map.entrySet());
        entryList.sort(Map.Entry.comparingByKey());
        entryList.sort((e1, e2) -> e2.getValue().compareTo(e1.getValue()));

        System.out.println(entryList.get(0).getKey());
    }
}
