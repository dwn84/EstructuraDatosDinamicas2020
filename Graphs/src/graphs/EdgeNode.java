/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graphs;

/**
 *
 * @author samaniw
 */
public class EdgeNode implements Comparable<EdgeNode> {
    
    private String DestinationNode;
    private int weight;


    public EdgeNode(String DestinationNode, int weight) {
        this.DestinationNode = DestinationNode;
        this.weight = weight;
    }

    /**
     * @return the DestinationNode
     */
    public String getDestinationNode() {
        return DestinationNode;
    }

    /**
     * @param DestinationNode the DestinationNode to set
     */
    public void setDestinationNode(String DestinationNode) {
        this.DestinationNode = DestinationNode;
    }

    /**
     * @return the weight
     */
    public int getWeight() {
        return weight;
    }

    /**
     * @param weight the weight to set
     */
    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public int compareTo(EdgeNode o) {
        if(this.weight>o.weight){
            return 1;
        }else if(this.weight<o.weight){
            return -1;
        }else{
            return 0;
        }
    }

    
    
    
}
