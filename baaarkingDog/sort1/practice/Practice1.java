import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static int[] result;

    static void mergeSort(int[] arr1, int[] arr2, int size, int n, int m){
        int index1 = 0;
        int index2 = 0;
        int resultIndex = 0;
        while(index1 < n && index2 < m){
            if(arr1[index1] > arr2[index2]){
                result[resultIndex] = arr2[index2];
                index2++;
            }else
            {
                result[resultIndex] = arr1[index1];
                index1++;
            }
            resultIndex++;
        }
        if(index1 < n){
            while(index1 < n){
                result[resultIndex] = arr1[index1];
                resultIndex++;
                index1++;
            }
        }
        else if(index2 < m){
            while(index2 < m){
                result[resultIndex] = arr2[index2];
                resultIndex++;
                index2++;
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String[] str = br.readLine().split(" ");
        int n = Integer.parseInt(str[0]);
        int m = Integer.parseInt(str[1]);

        int[] arr1 = new int[n];
        int[] arr2 = new int[m];
        result = new int[n + m];
        arr1 = Arrays.stream(br.readLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        arr2 = Arrays.stream(br.readLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        mergeSort(arr1, arr2, n+m,n ,m);

        for(int num : result){
            sb.append(num + " ");
        }
        System.out.println(sb);
    }
}
