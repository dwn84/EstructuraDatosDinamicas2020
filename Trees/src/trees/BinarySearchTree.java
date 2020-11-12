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

    private BinaryNode root;
    public BinaryNode father;
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
        }
        if (data == currentNode.getData()) {
            return currentNode;
        }

        father = currentNode;

        if (data > currentNode.getData()) {
            fatherposition = true;
            return search(data, currentNode.getRight());
        } else {
            fatherposition = false;
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
        } else if (data < currentNode.getData()) {
            if (currentNode.getLeft() == null) {
                fatherposition = false;
                add(data, currentNode, true);
            } else {
                add(data, currentNode.getLeft(), false);
            }
        } else if (currentNode.getRight() == null) {
            fatherposition = true;
            add(data, currentNode, true);
        } else {
            add(data, currentNode.getRight(), false);
        }
    }

    /**
     * Otra forma de agregar datos sin parámetro found
     *
     * @param data
     * @param currentRoot
     */
    private void Add(int data, BinaryNode currentRoot) {
        if (data < currentRoot.getData()) {
            if (currentRoot.getLeft() == null) {
                currentRoot.setLeft(new BinaryNode(data));
            } else {
                Add(data, currentRoot.getLeft());
            }
        } else if (currentRoot.getRight() == null) {
            currentRoot.setRight(new BinaryNode(data));
        } else {
            Add(data, currentRoot.getRight());
        }
    }

    public BinaryNode getMinor(BinaryNode subTree) {
        if (subTree.getLeft() == null) {
            return subTree;
        } else {
            return getMinor(subTree.getLeft());
        }
    }

    public BinaryNode getMayor(BinaryNode subTree) {
        if (subTree.getRight() == null) {
            return subTree;
        } else {
            return getMayor(subTree.getRight());
        }
    }

    public void Delete(int data) {
        if (root == null) {
            System.out.println("Árbol vacío");
        } else {
            DeleteR(data, root);
        }
    }

    private void DeleteR(int data, BinaryNode currentNode) {
        BinaryNode v = search(data);
        //if v is a leaf
        if (v.isLeaf()) {
            //delete leaf v
            if (fatherposition) {
                father.setRight(null);
            } else {
                father.setLeft(null);
            }//else if v has 1 child
        } else if (v.hasOneChild()) {
            //  bypass v
            if (v.isChildPosition()) {
                if (fatherposition) {
                    father.setRight(v.getRight());
                } else {
                    father.setLeft(v.getRight());
                }
            } else if (fatherposition) {
                father.setRight(v.getLeft());
            } else {
                father.setLeft(v.getLeft());
            }
            //else replace v with successor
        } else {
            //buscar sucesor y reemplazar el nodo v
            //Ubicarse en subárbol derecho y localizar el dato menor.
//            BinaryNode minimum = getMinor(v.getRight());
//            Delete(minimum.getData());
//            v.setData(minimum.getData());
            //buscar predecesor reemplazar el nodo v 
            //Ubicarse en subárbol izquierdo y localizar el dato mayor.
            BinaryNode mayor = getMayor(v.getLeft());
            Delete(mayor.getData());
            v.setData(mayor.getData());

        }

    }

    public void PreOrden() {
        PreOrdenR(root);
    }

    private void PreOrdenR(BinaryNode currentRoot) {
        if (currentRoot != null) {
            System.out.print(currentRoot.getData() + "");
            PreOrdenR(currentRoot.getLeft());
            PreOrdenR(currentRoot.getRight());
        }
    }

    public void InOrden() {
        InOrdenR(root);
    }

    private void InOrdenR(BinaryNode currentRoot) {
        if (currentRoot != null) {
            InOrdenR(currentRoot.getLeft());
            System.out.print(currentRoot.getData() + "");
            InOrdenR(currentRoot.getRight());
            
        }
    }

    public void PostOrden() {
        PostOrdenR(root);
    }

    private void PostOrdenR(BinaryNode currentRoot) {
        if (currentRoot != null) {
            PostOrdenR(currentRoot.getLeft());
            PostOrdenR(currentRoot.getRight());
            System.out.print(currentRoot.getData() + "");
        }
    }

}
