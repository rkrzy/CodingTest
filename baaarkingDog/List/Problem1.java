import java.io.*;
import java.util.LinkedList;
import java.util.Scanner;


public class Main {
    static class Node{
        Node back;
        int data;
        Node next;
        Node(int data){
            this.data =data;
            next = null;
        }
        public Node getBack(){return back;}
        public int getData(){return data;}
        public Node getNext(){return next;}
    }
    static class linkedList{

        Node current;
        Node first;
        Node Last;
        int size;
        linkedList(){
            current = new Node(0);
            first = null;
            Last = null;
            size = 0;
        }
        public void add(int data){
            if(size == 0){
                first = new Node(data);
                Last = first;
                first.next = Last;
                current.next = first;
            }
            else
            {
                Node node = new Node(data);
                node.next = first;
                Last.next = node;
                Last = Last.next;
            }
            size++;
        }
        public void remove(int number){
            while(number > 0){
                current.next.back = current;
                current = current.next;
                number--;
            }
            System.out.print(current.getData());
            current.back.next = current.next;
            size--;
        }
        public int getSize(){return size;}
        public Node getCurrent(){return current;}
    }

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        int N;
        int K;

        N = scanner.nextInt();
        K = scanner.nextInt();

        linkedList list = new linkedList();
        for(int i = 1;i<=N; i++){
            list.add(i);
        }
        if(list.getSize() == 1){
            System.out.println("<"+ list.getCurrent().getNext().getData() + ">");
            return;
        }
        System.out.print("<");
        while(list.getSize() > 1){
            list.remove(K);
            System.out.print(", ");
        }
        System.out.println(list.getCurrent().next.getData() + ">");

    }
}