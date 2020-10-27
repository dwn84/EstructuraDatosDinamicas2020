/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graphs;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.PriorityQueue;

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
    
    public LinkedList<EdgeNode> getNeighbors(String current){
        return adjacencyList.get(current);
    }
    
    public HashMap<String, EdgeNode> Dijkstra(String current){
    /*
        Crear un mapa de recorrido, 
        considerando vértice de destino, 
        peso total y vértice de origen 
        donde el peso desde el origen es cero, 
        los demás son infinitos(desconocidos).
    */
    
        HashMap<String, EdgeNode> map = new HashMap<>();
    
        EdgeNode info;
        
        for (String node : adjacencyList.keySet()) {
            if(node.equals(current)){
                info = new EdgeNode(null, 0);
            }else{
                info = new EdgeNode(null,Integer.MAX_VALUE);
            }
            map.putIfAbsent(node, info);
        }
        
        /*
        Crear una cola priorizada donde 
        se almacenan vértices a donde llegar 
        y su respectivo peso.
        */
        
        PriorityQueue<EdgeNode> pq = new PriorityQueue<>();
        /*
        Definir un punto de referencia 
        (vértice actual y peso actual: cero) 
        y agregarlo a la cola priorizada. 
        */
        
        int currentWeight = 0, travelWeight;
        pq.add(new EdgeNode(current, currentWeight));
        
        /*
        Generar un arreglo de vértices visitados.
        */        
        LinkedList<String> visited = new LinkedList<>();
        
        while(!pq.isEmpty()){
        /*
        Sacar un vértice de la cola priorizada
        (el que tega menor peso 
        y que parasará a ser el nodo actual), 
        su peso será el peso actual.
        */

            EdgeNode temp = pq.poll();
            current = temp.getDestinationNode();
            currentWeight = temp.getWeight();
            
            /*
            Para el vértive actual, 
            obtener todos sus vecinos 
            y calcular el peso del recorrido
            (peso actual + peso arco) 
            para agregarlos a la cola priorizada 
            si no han sido visitados.
            */
        
            for (EdgeNode neighbor : getNeighbors(current)) {
                if(!visited.contains(neighbor.getDestinationNode())){
                    travelWeight=currentWeight + neighbor.getWeight();
                    pq.add(new EdgeNode(neighbor.getDestinationNode(), travelWeight));
                }               
            }
            /*
            Actualizar el mapa de recorrido, 
            esto es agregar el peso y el origen correspondiente
            (vértice sacado previamente) 
            si es menor al valor actual del mapa.
            */
            
            for (EdgeNode node : pq) {
                if(node.getWeight()<map.get(node.getDestinationNode()).getWeight()){
                    map.put(node.getDestinationNode(),new EdgeNode(current, node.getWeight()));
                }
            }
            
            /*
            Agregar si ya no lo está, 
            el vértice sacado de la cola al arreglo de visitados
            */
            
            if(!visited.contains(current)){
                visited.add(current);
            }
        
        }
        return map;   
    }
    
    
    
}
