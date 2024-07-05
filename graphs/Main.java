package Graphs;

public class Main {
    public static void main(String args[]){
        Graphs g= new Graphs();
        g.addVertex("A");
        g.addVertex("C");
        g.addVertex("B");
        g.printList();
        g.addEdge("A","C");
        g.addEdge("B","A");
        g.printList();
        g.removeEdge("A","B");
        g.printList();
        g.removeVertex("C");
        g.printList();

    }


}
