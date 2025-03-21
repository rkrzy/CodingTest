import java.util.List;
import java.util.Scanner;

class ListNode{
    int data;
    ListNode back;
    ListNode next;
    static int number = 0;
    public ListNode(){
        back = null;
        next = null;
        number = number +1;
    }
    public ListNode(int data){
        back = null;
        next = null;
        this.data = data;
        number = number +1;
    }

}

public class Main {

    public static void main(String[] args) {
        ListNode headListNode = new ListNode();
        ListNode listNode1 = new ListNode(13);
        ListNode listNode2 = new ListNode(65);
        ListNode listNode3 = new ListNode(21);
        ListNode listNode4 = new ListNode(17);
        headListNode.next = listNode1;
        listNode1.back = headListNode;
        listNode1.next = listNode2;
        listNode2.back = listNode1;
        listNode2.next = listNode3;
        listNode3.back = listNode2;
        listNode3.next = listNode4;
        listNode4.back = listNode3;
        listNode4.next = null;
        printAllNode(headListNode);
        insertNode(3,100,headListNode);
        printAllNode(headListNode);
        eraseNode(3,headListNode);
        printAllNode(headListNode);
    }
    static void insertNode(int addr, int data, ListNode head){
        ListNode newListNode = new ListNode(data);
        ListNode temp = head;
        for(int i = 1;i<addr;i++)
        {
            if(temp.next == null){
                break;
            }
            else
            {
                temp = temp.next;
            }
        }
        if(temp.next != null)
        {
            newListNode.back = temp;
            newListNode.next = temp.next;
            temp.next = newListNode;
        }
        else {
            newListNode.back = temp;
            newListNode.next = null;
            temp.next = newListNode;
        }
    }
    static void eraseNode(int addr, ListNode head){
        if(ListNode.number < addr){
            return;
        }
        else {
            ListNode temp = head;
            for(int i = 1; i < addr;i++)
            {
                temp = temp.next;
            }

            if(temp.next != null)
            {
                temp.back.next = temp.next;
                temp.next.back = temp.back;
            }
            else
            {
                temp.back.next = null;
            }
        }
    }
    static void printAllNode(ListNode head){
        ListNode temp = head;
        while(temp != null)
        {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
}