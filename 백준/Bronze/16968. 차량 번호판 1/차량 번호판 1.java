import java.io.*;



public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int num = 10;
        int alpha = 26;
        int result = 1;
        char temp = ' ';
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'c') {
                if(temp == 'c')
                {
                    alpha = 25;
                }
                result = result * alpha;
                num = 10;
            } else {
                if(temp == 'd')
                {
                    num = 9;
                }
                result = result * num;
                alpha = 26;
            }
            temp = str.charAt(i);
        }
        System.out.println(result);
    }
}