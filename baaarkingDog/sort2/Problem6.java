import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;


public class Main {

    static List<Person>[] list = new ArrayList[101];
    static Person[] persons;
    static class Person{
        String name;
        int korea;
        int math;
        int english;
        public Person(String name, int korea, int english, int math){
            this.name = name;
            this.korea = korea;
            this.math = math;
            this.english = english;
        }
        public String getName(){return name;}
        public int getMath(){return math;}
        public int getKorea(){return korea;}
        public int getEnglish(){return english;}
    }
    static void listClear(){
        for(int i = 0; i < 101;i++){
            list[i].clear();
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] str;
        int n = Integer.parseInt(br.readLine());
        persons = new Person[n];
        for(int i = 0; i < 101; i++){
            list[i] = new ArrayList<>();
        }
        for(int i = 0; i < n; i++){
            str = br.readLine().split(" ");
            persons[i] = new Person(str[0], Integer.parseInt(str[1]), Integer.parseInt(str[2]), Integer.parseInt(str[3]));
        }
        for(int i = 0; i < 4; i++){
            switch(i){
                case 0:
                    Arrays.sort(persons, Comparator.comparing(Person::getName));
                    listClear();
                    break;
                case 1:
                    Arrays.sort(persons, Comparator.comparing(Person::getMath).reversed());
                    listClear();
                    break;
                case 2:
                    Arrays.sort(persons, Comparator.comparing(Person::getEnglish));
                    listClear();
                    break;
                case 3:
                    Arrays.sort(persons, Comparator.comparing(Person::getKorea).reversed());
                    listClear();
                    break;
            }
        }
        for(Person p : persons){
            System.out.println(p.name);
        }
    }
}
