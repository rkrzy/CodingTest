import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

       int[] arr1 = new int[26];
       int[] arr2 = new int[26];

       String str1 = br.readLine();
       String str2 = br.readLine();

       int result = 0;

       for(int i = 0;i<str1.length();i++){
            arr1[str1.charAt(i) - 'a']++;
       }
       for(int i = 0;i<str2.length();i++){
            arr2[str2.charAt(i) - 'a']++;
       }
       for(int i = 0;i < 26; i++){

           if(arr2[i] > arr1[i]){
               result += arr2[i] - arr1[i];
               arr2[i] = arr1[i];
           }
           else if(arr2[i] < arr1[i]){
               result += arr1[i] - arr2[i];
               arr1[i] = arr2[i];
           }

       }
       System.out.println(result);



    }
}