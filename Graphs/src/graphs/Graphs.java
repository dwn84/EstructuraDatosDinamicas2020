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

        Graph grafito = new Graph(3);
        grafito.addEdge(0, 2);
        grafito.addEdge(0, 1);
        grafito.addEdge(2, 1);
        System.out.println("matriz de adyacencia:");
        System.out.println(grafito.showAMatrix());
        try {
            grafito.deleteEdge(1, 1);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
        
        System.out.println("matriz de adyacencia:");
        System.out.println(grafito.showAMatrix()); 
        
    }

}
