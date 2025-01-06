import java.io.*;
import java.util.LinkedList;
import java.util.ListIterator;


public class Main {

    public static void main(String[] args) {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        LinkedList<Character> charList = new LinkedList<>();
    try{
        String str = reader.readLine();
        int chance = Integer.parseInt(reader.readLine());
        String action;

        for(char temp : str.toCharArray()){
            charList.add(temp);
        }
        ListIterator<Character> iter = charList.listIterator();
        while(iter.hasNext()){
            iter.next();
        }
        while(chance != 0)
        {
            action = reader.readLine();
            if(action.charAt(0) == 'L'){
                if(iter.hasPrevious()){
                    iter.previous();
                }
            }
            else if(action.charAt(0) == 'D'){
                if(iter.hasNext()){
                    iter.next();
                }
            }
            else if(action.charAt(0) == 'B'){
                if(iter.hasPrevious()){
                    iter.previous();
                    iter.remove();
                }
            }
            else{
                iter.add(action.charAt(2));
            }
            chance--;
        }
        for(Character c : charList){
            writer.write(c);
        }
        writer.flush();
    }catch(IOException e){
        e.printStackTrace();
    }

    }

}