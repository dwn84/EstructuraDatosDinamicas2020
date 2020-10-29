 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graphs;

import java.util.HashMap;
import java.util.Iterator;
import java.util.PriorityQueue;

/**
 *
 * @author samaniw
 */
public class Graphs {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        /*
//prueba de cola priorizada
        PriorityQueue<EdgeNode> PQ = new PriorityQueue();
        PQ.add(new EdgeNode("A", 5));
        PQ.add(new EdgeNode("B", 3));
        PQ.add(new EdgeNode("C", 11));
        PQ.add(new EdgeNode("X", 7));
        System.out.println("Cola priorizada");
        System.out.println(PQ);
        System.out.println("nodo a la cabeza de la cola");
        System.out.println(PQ.peek().getDestinationNode());
        PQ.remove();
        System.out.println(PQ);
        System.out.println("nodo a la cabeza de la cola");
        System.out.println(PQ.peek().getDestinationNode());
       
         */
 /*
        //Prueba de almacenamiento de datos en mapa de recorrido
        HashMap<String, EdgeNode> map = new HashMap<>();
        map.putIfAbsent("A", new EdgeNode("B", 2));
        map.putIfAbsent("B", new EdgeNode("C", 4));

        for (String mykeys : map.keySet()) {
            System.out.print(map.get(mykeys).getDestinationNode()+ " ");
            System.out.print(map.get(mykeys).getWeight()+ " ");
            System.out.print(mykeys);
            System.out.println("");
        }
         */
        DynamicGraph superGrafo = new DynamicGraph();
        superGrafo.addNode("A");
        superGrafo.addNode("B");
        superGrafo.addNode("C");
        superGrafo.addNode("D");
        superGrafo.addNode("E");
        superGrafo.addNode("F");
        superGrafo.addNode("G");
        superGrafo.addEgde("A", "B", 2);
        superGrafo.addEgde("A", "C", 5);
        superGrafo.addEgde("A", "D", 1);
        superGrafo.addEgde("C", "E", 3);
        superGrafo.addEgde("D", "G", 3);
        superGrafo.addEgde("E", "F", 2);
        superGrafo.addEgde("F", "G", 1);
        superGrafo.showAList();

        HashMap<String, EdgeNode> mapita = superGrafo.Dijkstra("A");

        for (String mykeys : mapita.keySet()) {
            System.out.print(mykeys + " ");
            System.out.print(mapita.get(mykeys).getWeight() + " ");
            System.out.print(mapita.get(mykeys).getDestinationNode() + " ");

            System.out.println("");
        }
        Graph grafito = new Graph(7);
        grafito.addEdge(0, 1);
        grafito.addEdge(0, 2);
        grafito.addEdge(2, 1);
        grafito.addEdge(1, 3);
        grafito.addEdge(3, 2);
        grafito.addEdge(3, 4);
        grafito.addEdge(3, 5);
        grafito.addEdge(5, 6);
        grafito.addEdge(6, 4);
        //validación de puntos del taller
        System.out.println("Mostrar arcos");
        System.out.println(grafito.showEdges());
        //validar si entradas y salidas son iguales para todos los nodos
        System.out.println("Validar In - Out:" + grafito.validateInOut());
        System.out.println("matriz de adyacencia:");
        System.out.println(grafito.showAMatrix());

        System.out.println("lista de adyacencia:");
        System.out.println(grafito.showAList());

        try {
//            grafito.deleteEdge(0, 1);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

//        System.out.println("matriz de adyacencia:");
//        System.out.println(grafito.showAMatrix());
//
//        System.out.println("lista de adyacencia:");
//        System.out.println(grafito.showAList());
        //mostrar recorrido en anchura:BFS
        System.out.print("BFS:");
        grafito.BFS(0);
        System.out.println("");
        System.out.print("DFS:");
        //mostrar recorrido en profundidad: DFS
        grafito.DFS(0);
        System.out.println("");

    }

}
