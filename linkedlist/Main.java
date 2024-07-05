package linkedlist;

public class Main {
    public static void main(String args[]) {
        LinkedList linkedone = new LinkedList(4);
        linkedone.append(3);
        linkedone.append(2);
        linkedone.append(1);
       linkedone.reverse();
       System.out.println("linked list view:");
        linkedone.viewlist();


    }
}