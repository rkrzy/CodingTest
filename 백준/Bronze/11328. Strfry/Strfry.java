import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int[] chArr1 = new int[26];
        int[] chArr2 = new int[26];
        int n = Integer.parseInt(br.readLine());
        String[] str;
        for(int i = 0;i<n;i++){
            boolean flag = true;
            str = br.readLine().split(" ");
            for(int j = 0;j<str[0].length();j++){
                chArr1[str[0].charAt(j) - 'a']++;
            }
            for(int j = 0;j<str[1].length();j++){
                chArr2[str[1].charAt(j) - 'a']++;
            }
            for(int j = 0; j<26;j++){
                if(chArr1[j] != chArr2[j]){
                    bw.write("Impossible\n");
                    flag = false;
                    break;
                }
            }
            if(flag){
                bw.write("Possible\n");
            }
            for(int j = 0; j < 26; j++){
                chArr1[j] = 0;
                chArr2[j] = 0;
            }
        }

        br.close();
        bw.close();
    }
}