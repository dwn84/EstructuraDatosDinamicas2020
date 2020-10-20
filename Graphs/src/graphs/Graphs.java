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
public class Graphs {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

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
