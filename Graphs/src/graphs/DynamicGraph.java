/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graphs;

import java.util.HashMap;
import java.util.LinkedList;

/**
 *
 * @author samaniw
 */
public class DynamicGraph {
    
    private HashMap<String, LinkedList<EdgeNode>> adjacencyList;

    public DynamicGraph() {
        adjacencyList = new HashMap<>();
    }
    
    public void addNode(String nodeName){
        adjacencyList.putIfAbsent(nodeName, new LinkedList<EdgeNode>());
    }
    
    public void addEgde(String source, String destination, int weight){
        adjacencyList.get(source).add(new EdgeNode(destination, weight));
    }
    
    private String getDestinations(String key){
        LinkedList<EdgeNode> data;
        data = adjacencyList.get(key);
        String d = "";
        for (EdgeNode n : data) {
            d += n.getDestinationNode()+ " ";            
        }
        return d;
    }
    
    public void showAList(){
        for (String origin: adjacencyList.keySet()) {
            System.out.println(origin+": "+getDestinations(origin));
        }
    }
    
    
    
}
