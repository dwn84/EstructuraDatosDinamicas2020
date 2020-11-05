/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trees;

/**
 *
 * @author samaniw
 */
public class BinarySearchTree {
    
    public BinaryNode root;
    private BinaryNode father;
    private boolean fatherposition;
    private int nodes;
    private int leafs;
    
    public BinarySearchTree() {
        root = null;
        nodes = 0;
    }
    
    public BinarySearchTree(int data) {
        root = new BinaryNode(data);
        nodes = 1;
    }
    
}
