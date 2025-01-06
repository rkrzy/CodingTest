import java.io.*;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        LinkedList<Character> charList = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);
        try{
            String str = reader.readLine();
            int chance = Integer.parseInt(reader.readLine());
            int cursor = str.length();
            String action;
            for(char temp : str.toCharArray()){
                charList.add(temp);
            }
            while(chance != 0)
            {
                action = reader.readLine();
                if(action.charAt(0) == 'L'){
                    if(cursor != 0){
                        cursor--;
                    }
                }
                else if(action.charAt(0) == 'D'){
                    if(cursor != charList.size()){
                        cursor++;
                    }
                }
                else if(action.charAt(0) == 'B'){
                    if(cursor != 0){
                        cursor--;
                        charList.remove(cursor);
                    }
                }
                else{
                    charList.add(cursor, action.charAt(2));
                    cursor++;
                }
                chance--;
            }
            for(char c : charList){
                writer.write(c);
            }
            writer.flush();
        }catch(IOException e){
            e.printStackTrace();
        }

    }

}