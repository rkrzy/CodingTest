import java.io.*;


public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] arr = new int[10];

        int num = Integer.parseInt(br.readLine());
        int maxnum = 0;
        int max3OR6 = 0;
        int result = 0;
        while(num != 0){
            int temp = num % 10;
            arr[temp]++;
            num = num/10;
        }
        for(int i = 0;i<10;i++)
        {
            if(i == 6 || i == 9)
            {
                max3OR6 = max3OR6 + arr[i];
            }
            else {
                if(maxnum < arr[i])
                {
                    maxnum = arr[i];
                }
            }
        }
        max3OR6 = max3OR6 % 2 == 0 ? max3OR6 : max3OR6 + 1;
        result = Math.max(maxnum, max3OR6/2);

        System.out.println(result);
    }
}