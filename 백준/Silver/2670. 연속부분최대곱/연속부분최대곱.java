import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();

        double[] result = new double[size];
        double temp;
        double max = 0;
        result[0] = scanner.nextDouble();

        for(int i = 1;i<size;i++)
        {
            temp = scanner.nextDouble();
            result[i] = Math.max(temp, temp * result[i-1]);
            if(max < result[i]){
                max = result[i];
            }
        }
        System.out.printf("%.3f", max);
    }

}