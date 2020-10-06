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
public class Graph {

    private boolean aMatrix[][];
    private int totalNodes;

    public Graph(int n) {
        totalNodes = n;
        aMatrix = new boolean[n][n];
    }

    /**
     * Crear un nuevo arco
     *
     * @param source Punto de origen (0,1,2......n)
     * @param destination Punto de destino
     */
    public void addEdge(int source, int destination) {
        aMatrix[source][destination] = true;
        //aMatrix[destination][source] = true;//se habilita para un grafo sin dirección

    }

    public void deleteEdge(int source, int destination) throws Exception {
        if (!aMatrix[source][destination]) {
            throw new Exception("No existe ese arco");
        } else {
            aMatrix[source][destination] = false;
        }

    }

    public String showAMatrix() {
        String table = "";
        for (int i = 0; i < totalNodes; i++) {
            for (int j = 0; j < totalNodes; j++) {
                table += aMatrix[i][j] ? 1 : 0;
                /*
                if(aMatrix[i][j]){
                    table += 1;
                }else{
                    table += 0;
                }*/
            }
            table += "\n";
        }
        return table;
    }
}
