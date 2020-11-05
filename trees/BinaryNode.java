package trees;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author samaniw
 */
public class BinaryNode {

    private int data;
    private BinaryNode left;
    private BinaryNode right;
    private boolean childPosition;

    public BinaryNode(int data) {
        setData(data);
        setRight(null);
        setLeft(null);
    }

    public boolean isLeaf() {
        return (left == null && right == null) ? true : false;
    }

    public boolean hasOneChild() {
        if (left != null && right == null) {
            childPosition = false;
            return true;
        } else if (left == null && right != null) {
            childPosition = true;
            return true;
        }else{
            return false;
        }
    }

    /**
     * @return the data
     */
    public int getData() {
        return data;
    }

    /**
     * @param data the data to set
     */
    public void setData(int data) {
        this.data = data;
    }

    /**
     * @return the left
     */
    public BinaryNode getLeft() {
        return left;
    }

    /**
     * @param left the left to set
     */
    public void setLeft(BinaryNode left) {
        this.left = left;
    }

    /**
     * @return the right
     */
    public BinaryNode getRight() {
        return right;
    }

    /**
     * @param right the right to set
     */
    public void setRight(BinaryNode right) {
        this.right = right;
    }

    /**
     * Determinar si el hijo se encuentra a la derecha o izquierda
     *
     * @return the ChildPosition: True a la derecha, False a la izquierda
     */
    public boolean isChildPosition() {
        return childPosition;
    }

}
