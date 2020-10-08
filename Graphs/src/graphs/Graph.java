/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graphs;

import java.util.LinkedList;

/**
 *
 * @author samaniw
 */
public class Graph {

    private boolean aMatrix[][];
    private LinkedList<Integer> aList[];
    private int totalNodes;

    public Graph(int n) {
        totalNodes = n;
        aMatrix = new boolean[n][n];
        aList = new LinkedList[n];
        for (int i = 0; i < totalNodes; i++) {
            aList[i] = new LinkedList<>();
        }
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
        aList[source].add(destination);

    }

    public void deleteEdge(int source, int destination) throws Exception {
        if (!aMatrix[source][destination]) {
            throw new Exception("No existe ese arco");
        } else {
            aMatrix[source][destination] = false;
            aList[source].remove(destination);
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

    public String showAList() {
        String list = "";
        for (int i = 0; i < totalNodes; i++) {
            list += i + ": ";
            for (Integer v : aList[i]) {
                list += v + " ";
            }
            list += "\n";
        }
        return list;
    }

    public void BFS(int source) {
        boolean visited[] = new boolean[totalNodes];
        LinkedList<Integer> queue = new LinkedList<>();
        visited[source] = true;

        queue.add(source);

        while (!queue.isEmpty()) {
            source = queue.poll();
            System.out.print(source + "");
            for (Integer v : aList[source]) {
                if (!visited[v]) {
                    visited[v] = true;
                    queue.add(v);
                }
            }
        }
    }
}
