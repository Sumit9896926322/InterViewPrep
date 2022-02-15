package misc;

import java.util.Scanner;

public class LInkedListMIsc {
    public static void insertInLL(Node head,int data) {
        Node curr = new Node(data);
        System.out.println(curr+" "+head);
        if(head == null){
            Node.head = curr;
        }else{
            Node temp = head;
           while(temp.next != null){
               temp = temp.next;
           }
           temp.next = curr;
        }

    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            insertInLL(Node.head,sc.nextInt());
        }
        Node temp = Node.head;
        System.out.println(temp.data);
        while(temp!=null){
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
}

class Node{
    int data;
    static Node head;
    Node next;

    Node(int data){
        this.data = data;
    }
}