package DoublyLinkedList;

public class Main {
    public static void main(String args[]){
        DoublyLinkedList dlone =new DoublyLinkedList(4);
        dlone.append(5);
        dlone.prepend(8);
        System.out.println("removed:"+dlone.removeFirst().value);
        dlone.insert(1,9);
        System.out.println("removed:"+dlone.remove(2).value);
        dlone.viewList();

    }
}
