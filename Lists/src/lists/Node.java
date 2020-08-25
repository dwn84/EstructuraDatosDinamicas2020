/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lists;

/**
 *
 * @author samaniw
 */
public class Node<V>{
    
    private V data;
    private Node<V> nextNode;

    public Node(V data) {
        this.data = data;
        nextNode = null;
    }

    
    
    /**
     * @return the data
     */
    public V getData() {
        return data;
    }

    /**
     * @param data the data to set
     */
    public void setData(V data) {
        this.data = data;
    }

    /**
     * @return the nextNode
     */
    public Node<V> getNextNode() {
        return nextNode;
    }

    /**
     * @param nextNode the nextNode to set
     */
    public void setNextNode(Node<V> nextNode) {
        this.nextNode = nextNode;
    }
    
}
