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
public class DoubleNode<V> {
    private V data;
    private DoubleNode<V> nextNode;
    private DoubleNode<V> previousNode;

    public DoubleNode(V data) {
        this(null,data,null);
    }
    
    public DoubleNode(DoubleNode pn,V data,DoubleNode nn){
        setPreviousNode(pn);
        setData(data);
        setNextNode(nn);       
    }

    /**
     * @return the nextNode
     */
    public DoubleNode<V> getNextNode() {
        return nextNode;
    }

    /**
     * @param nextNode the nextNode to set
     */
    public void setNextNode(DoubleNode<V> nextNode) {
        this.nextNode = nextNode;
    }

    /**
     * @return the previousNode
     */
    public DoubleNode<V> getPreviousNode() {
        return previousNode;
    }

    /**
     * @param previousNode the previousNode to set
     */
    public void setPreviousNode(DoubleNode<V> previousNode) {
        this.previousNode = previousNode;
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
    
}
