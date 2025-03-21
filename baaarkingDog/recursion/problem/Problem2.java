import java.io.*;


public class Main {

    public static int chanceMinus1 = 0;
    public static int chance0 = 0;
    public static int chance1 = 0;
    public static void func1(int num, int row, int col, int[][] save){
        int temp = save[row][col];
        for(int i = 0; i < num; i++){
            for(int j = 0; j < num; j++){
                if(temp != save[row + i][col + j]){
                    func1(num/3,row,col,save);
                    func1 (num/3, row, col + num/3, save);
                    func1(num/3,row, col + num/3 * 2, save);
                    func1(num/3, row + num/3, col, save);
                    func1(num/3, row + num/3, col + num/3, save);
                    func1(num/3, row + num/3, col + num/3 * 2,save);
                    func1(num/3, row + num/3 * 2, col + 0, save);
                    func1(num/3, row + num/3 * 2, col + num/3, save);
                    func1(num/3, row + num/3 * 2, col + num/3 * 2, save);
                    return;
                }
            }
        }
        if(save[row][col] == -1){++chanceMinus1;}
        else if(save[row][col] == 0){++chance0;}
        else{++chance1;}
    }
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(br.readLine());

        int[][] save = new int[num][num];

        for(int i = 0; i < num; i++){
            String[] str = br.readLine().split(" ");
            for(int j = 0; j < num; j++){
                save[i][j] = Integer.parseInt(str[j]);
            }
        }
        func1(num,0,0,save);
        System.out.println(chanceMinus1);
        System.out.println(chance0);
        System.out.println(chance1);
    }
}