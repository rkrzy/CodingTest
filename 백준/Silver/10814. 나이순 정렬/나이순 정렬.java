import java.io.*;

public class Main {
    static Person[] arr;
    static Person[] temp;
    static class Person{
        int id;
        int age;
        String name;
        Person(int id, int age, String name){
            this.id = id;
            this.age = age;
            this.name = name;
        }
    }
    static void merge(int start, int end)
    {
        int mid = (start + end)/2;
        int lIdx = start;
        int rIdx = mid;
        for(int i = start; i <end; i++){
            if(rIdx == end)temp[i] = arr[lIdx++];
            else if(lIdx == mid)temp[i] = arr[rIdx++];
            else if(arr[lIdx].age < arr[rIdx].age)temp[i] = arr[lIdx++];
            else if(arr[lIdx].age > arr[rIdx].age)temp[i] = arr[rIdx++];
            else {
                if(arr[lIdx].id >= arr[rIdx].id)temp[i] = arr[rIdx++];
                else temp[i] = arr[lIdx++];
            }
        }
        for(int i = start; i < end; i++) arr[i] = temp[i];
    }
    static void mergeSort(int start, int end)
    {
        if(start + 1 == end)return;
        int mid = (start + end)/2;
        mergeSort(start, mid);
        mergeSort(mid, end);
        merge(start, end);
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        String[] str;
        arr = new Person[N];
        temp = new Person[N];
        for(int i = 0; i < N;i++)
        {
            str = br.readLine().split(" ");
            arr[i] = new Person(i, Integer.parseInt(str[0]), str[1]);
        }
        mergeSort(0, N);
        for(Person person : arr){
            bw.append(person.age + " " + person.name + "\n");
        }
        bw.flush();

        br.close();
        bw.close();


    }
}
