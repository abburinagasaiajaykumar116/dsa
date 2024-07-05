package DoublyLinkedList;

import javax.swing.plaf.synth.SynthTextAreaUI;

public class DoublyLinkedList {
   private Node head;
   private Node tail;
   private  int length;
   class Node{
       int value;
       Node next;
       Node prev;
       Node(int value){
           this.value=value;
       }
   }
   public DoublyLinkedList(int value){
       Node newNode = new Node(value);
       head=newNode;
       tail=newNode;
       length=1;
   }
   public void getHead(){
       System.out.print("head:"+head.value);
   }
    public void getTail(){
        System.out.print("head:"+tail.value);
    }
    public void viewList(){
       Node temp=head;
       while (temp != null){
           System.out.print(temp.value);
           temp=temp.next;

       }

    }
    public void getLength(){
       System.out.print("length:"+length);
    }
    public void append(int value){
       Node newNode = new Node(value);
       if(length==0){
           head=newNode;
           tail=newNode;
           length++;
       }else {
           tail.next=newNode;
           newNode.prev=tail;
           tail=newNode;
            length++;
       }
    }
    public Node removeLast(){
       if(length==0) return null;
       if(length==1){
           head=null;
           tail=null;
       }
       Node temp=tail;
       tail=tail.prev;
       tail.next=null;
       temp.prev=null;
       length--;
       return temp;
    }
    public void prepend(int value){
       Node newNode = new Node(value);
       if(length==0) {
          head=newNode;
          tail=newNode;
       }
       newNode.next=head;
       head.prev=newNode;
       head=newNode;
       length++;

       }
       public Node removeFirst(){
        if(length==0){
            return null;
        }
        if(length==1){
            head=null;
            tail=null;
            return null;
        }
        else {
            Node temp=head;
            head=head.next;
            temp.next=null;
            head.prev=null;
            length--;
           return temp;
        }
       }
       public Node get(int index){
       Node temp=head;
       if(index<0 || index>=length){
           return null;
       }
       if(index < length/2){
           for(int i=0;i<index;i++)
               temp=temp.next;
       }else {
           temp=tail;
           for(int i=length-1;i>index;i--)
               temp=temp.prev;
       }
       return temp;
       }
       public boolean set(int index,int value){
         Node temp;
         temp=get(index);
         if(temp!=null){
             temp.value= value;
             return true;
         }
         return false;
       }
       public boolean insert(int index,int value){
          if(index<0 || index>length-1){
              return false;
          }
          if(index==0) {
              prepend(value);
              return true;
          }
          if(index == length-1){
              append(value);
              return true;
          }else {
              Node newNode = new Node(value);
              Node before=get(index-1);
              Node after=before.next;
              before.next=newNode;
              newNode.prev=before;
              newNode.next=after;
              after.prev=newNode;
              length++;
              return true;

          }
       }
       public Node remove(int index){
        if(index < 0 || index>=length)
            return null;
        if(index==0){
            return removeFirst();
        }
        if(index==length-1){
            return removeLast();
        }
        else{
            Node x=get(index);
            Node before=x.prev;
            Node after=x.next;
            before.next=after;
            x.prev=null;
            x.next=null;
            after.prev=before;
            length--;
            return x;
        }
       }
    }

