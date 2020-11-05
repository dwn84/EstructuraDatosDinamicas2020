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

    public BinaryNode search(int data) {
        return search(data, root);
    }

    private BinaryNode search(int data, BinaryNode currentNode) {
        if (currentNode == null) {
            return null;
        } else if (data == currentNode.getData()) {
            return currentNode;
        } else if (data > currentNode.getData()) {
            return search(data, currentNode.getRight());
        } else {
            return search(data, currentNode.getLeft());

        }
    }

    public void add(int data) {
        if (root == null) {
            root = new BinaryNode(data);
        } else if (search(data) != null) {
            System.out.println("No duplicate vertex allowed!");
        } else {
            add(data, root, false);
            //add(data, root)            
        }
    }

    private void add(int data, BinaryNode currentNode, boolean found) {
        if (found) {
            if (fatherposition) {
                currentNode.setRight(new BinaryNode(data));
            } else {
                currentNode.setLeft(new BinaryNode(data));
            }
        }else if (data < currentNode.getData()) {
            if (currentNode.getLeft() == null) {
                fatherposition=false;
                add(data, currentNode, true);
            } else {
                add(data, currentNode.getLeft(), false);
            }
        } else {
            if (currentNode.getRight()== null) {
                fatherposition=true;
                add(data, currentNode, true);
            } else {
                add(data, currentNode.getRight(), false);
            }        
        }
    }
    /**
     * Otra forma de agregar datos sin parámetro found
     * @param data
     * @param currentRoot 
     */
    private void Add(int data, BinaryNode currentRoot) {
        if (data < currentRoot.getData()) {
            if (currentRoot.getLeft() == null){
                currentRoot.setLeft(new BinaryNode(data));
            }else{
                Add(data, currentRoot.getLeft());
            }
        }else if (currentRoot.getRight() == null) {
            currentRoot.setRight(new BinaryNode(data));
        } else {
            Add(data, currentRoot.getRight());
        }
    }

}
