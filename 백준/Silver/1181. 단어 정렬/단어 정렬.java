import java.io.*;
import java.util.*;


public class Main {


    static List<String>[] list = new ArrayList[51];
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        String[] arr = new String[n];
        for(int i = 0; i < 51; i++){
            list[i] = new ArrayList<>();
        }
        scanner.nextLine();
        for(int i = 0; i < n; i++){
            arr[i] = scanner.nextLine();
        }
        Arrays.sort(arr);
        for(String str : arr){
            if(!list[str.length()].contains(str))
            list[str.length()].add(str);
        }
        for(List<String> l : list){
            for(int i = 0; i < l.size(); i++){
                System.out.println(l.get(i));
            }
        }
    }
}
