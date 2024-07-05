package Trees;

import java.awt.*;
import java.util.ArrayList;
import java.util.Iterator;

public class Main {
    public static void main(String args[]){
        BinarySearchTree tr = new BinarySearchTree();
        tr.insert(5);
        tr.insert(4);
        tr.insert(8);
        tr.insert(9);


        System.out.println("is contains:"+tr.contains(5));
        System.out.print("bfs traversal:"+tr.bfs());
        System.out.println("dfs preorder tarversal:"+tr.dfspreorder());
        System.out.println("dfs postorder tarversal:"+tr.dfspostorder());
        System.out.println("dfs inorder tarversal:"+tr.dfsinorder());
    }

}
