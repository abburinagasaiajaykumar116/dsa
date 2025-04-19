package linkedlist;
import java.util.*;
public class LinkedList {
    Node head;
    Node tail;
    int length;
    class Node{
        int value;
        Node next;
        public Node(int value){
            this.value=value;
        }
    }


    public LinkedList(int value){
        Node newNode = new Node(value);
        head=newNode;
        tail=newNode;
        length=1;
    }
    public void getHead(){
        if(head==null){
            System.out.print("head:"+null);
        }else {
            System.out.print("head"+ head.value);
        }
    }
    public void viewlist(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.value+"->");
            temp=temp.next;
        }
        System.out.println(null);
    }
    public void getTail(){
        if(head==null){
            System.out.print("head:"+null);
        }else {
            System.out.print("head"+ tail.value);
        }
    }
    public void getLength(){
        System.out.print("length"+length);
    }
    public void append(int value) {
        Node newNode = new Node(value);
        if (length == 0) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;

        }
        length++;
    }
    public Node removeLast(){
        if(length==0) return null;
        Node temp=head;
        Node pre =head;
        while (temp.next!=null){
            pre=temp;
            temp=temp.next;
        }
        tail=pre;
        tail.next=null;
        length--;
        if(length==0){
            head=null;
            tail=null;
        }
        return temp;
    }
    public void prepend(int value){
        Node newNode = new Node(value);
        if(length==0){
            head=newNode;
            tail=newNode;
        }else{
            newNode.next=head;
            head=newNode;

        }
        length++;
    }
    public Node removeFirst(){
        if(length==0){

            return null;
        }else {
            Node temp = head;
            head=head.next;
            temp.next=null;
            length--;
            if(length==0){
                head=null;
                tail=null;
            }
            return temp;
        }

    }
    public Node get(int index){
        if(index < 0 || index>=length){
            return null;
        }else {
            Node temp=head;
            for(int i=0;i<index;i++){
                temp=temp.next;
            }
            return temp;
        }
    }
    public boolean set(int index,int value){
        Node temp=get(index);
        if(temp!=null){
            temp.value=value;
            return true;
        }
        return false;
    }
    public boolean insert(int index,int value){
        if(index <0 || index>length){
            return false;

        }
        if(index ==0){
            prepend(value);
            return true;
        }
        if(index == length){
            append(value);
            return true;
        }
        else {
            Node newNode = new Node(value);
            Node temp=head;
            for (int i=0;i<index;i++){
                temp=temp.next;
            }
            newNode.next=temp.next;
            temp.next=newNode;
            length++;
            return true;
        }

    }
    public Node remove(int index){
        if(index < 0 || index>=length) return null;
        if(index==0){
            return removeFirst();
        }
        if(index == length-1){
            return removeLast();
        }
        Node x=head;
        Node y=x.next;
        for (int i=0;i<index-1;i++){
            x=x.next;
            if(x.next != null) {
                y = y.next;
            }
        }
        x.next=y.next;
        y.next=null;
        length--;
        return y;


    }
    public void reverse() {
        if (head == null || head.next == null) return;

        Node temp = head;
        head = tail;
        tail = temp;

        Node before = null;
        Node after;

        for (int i = 0; i < length; i++) {
            after = temp.next;     // store next
            temp.next = before;    // reverse the link
            before = temp;         // move before forward
            temp = after;          // move temp forward
        }
    }

}
