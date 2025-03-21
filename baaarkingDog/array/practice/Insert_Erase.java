
public class Main {

    public static int insert(int idx,int num, int arr[], int len){
        if (idx < len) {
            for (int i = len; i >= idx; i--) {
                arr[i+1] = arr[i];
            }
        }
        arr[idx] = num;
        return len+1;
    }
    static int erase(int idx, int arr[], int len)
    {
            for(int i = idx; i <len; i++)
            {
                arr[i] = arr[i+1];
            }
        return len-1;
    }
    static void printArr(int arr[], int len)
    {
        for(int i = 0;i<len;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    static void insert_test(){
        int[] arr = new int[10];
        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;

        int len = 3;
        len = insert(3, 40, arr, len); // 10 20 30 40
        printArr(arr, len);
        len = insert(1, 50, arr, len); // 10 50 20 30 40
        printArr(arr, len);
        len = insert(0, 15, arr, len); // 15 10 50 20 30 40
        printArr(arr, len);
    }
    static void erase_test(){
        int[] arr = new int[10];
        arr[0] = 10;
        arr[1] = 50;
        arr[2] = 40;
        arr[3] = 30;
        arr[4] = 70;
        arr[5] = 20;
        int len = 6;
        len = erase(4, arr, len); // 10 50 40 30 20
        printArr(arr, len);
        len = erase(1, arr, len); // 10 40 30 20
        printArr(arr, len);
        len = erase(3, arr, len); // 10 40 30
        printArr(arr, len);
    }
    public static void main(String[] args) {
        insert_test();
        erase_test();
    }
}