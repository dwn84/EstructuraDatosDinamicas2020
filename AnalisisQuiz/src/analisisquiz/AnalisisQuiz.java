/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package analisisquiz;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 *
 * @author samaniw
 */
public class AnalisisQuiz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        NodoDoble<Integer> n1 = new NodoDoble<>(88);
        NodoDoble<Integer> n2 = new NodoDoble<>(77);
        NodoDoble<Integer> n3 = new NodoDoble<>(66);

        n1.setAnteriorNodo(n3);
        n1.setSiguienteNodo(n2);

        n2.setAnteriorNodo(n1);
        n2.setSiguienteNodo(n3);

        n3.setAnteriorNodo(n2);
        n3.setSiguienteNodo(n1);

        miListaCircularDoble<Integer> mlcd = new miListaCircularDoble<>(n1);
        System.out.println("Info de la lista circular: " + mlcd.mostrarDatos());
        mlcd.rotacionIzquierda(2);
        System.out.println("Info de la lista circular: " + mlcd.mostrarDatos());

    }

}
