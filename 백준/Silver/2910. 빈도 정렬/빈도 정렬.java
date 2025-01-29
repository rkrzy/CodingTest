import java.io.*;
import java.util.*;
import java.util.stream.Collectors;


public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split(" ");
        int n = Integer.parseInt(str[0]);
        int s = Integer.parseInt(str[1]);
        str = br.readLine().split(" ");

        Map<String, Integer> map = new LinkedHashMap<>();

        for(int i = 0; i < n; i++){
            if(map.containsKey(str[i]))
            {
                map.put(str[i], map.get(str[i]) + 1);
            }
            else
            {
                map.put(str[i], 1);
            }
        }
        Map<String, Integer> sortMap = map.entrySet()
                .stream()
                .sorted(Map.Entry.<String, Integer>comparingByValue().reversed())
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (e1, e2) -> e1,
                        LinkedHashMap::new
                ));
        for(String key : sortMap.keySet()){
            for(int i = 0; i < sortMap.get(key); i++){
                System.out.print(key + " ");
            }
        }
    }
}
