/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lists;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author samaniw
 */
public class Lists {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        LinkedStack<Integer> varta = new LinkedStack<>();
        varta.push(11);
        varta.push(22);
        System.out.println("Ultimo dato de la pila: "+varta.peek());
        varta.push(33);
        try {
            varta.pop();
            varta.pop();
            varta.pop();
            varta.pop();
            varta.pop();
            varta.pop();
            varta.pop();
            varta.pop();
            varta.pop();
        } catch (Exception ex) {
            Logger.getLogger(Lists.class.getName()).log(Level.SEVERE, null, ex);
        }

        System.out.println("");
        ArrayStack duracell = new ArrayStack(5);
        duracell.push(55);
        duracell.push(66);
        duracell.push(77);
        duracell.push(88);
        duracell.push(99);
        duracell.push(101);
        duracell.pop();
        System.out.println("Último dato de la pila: " + duracell.peek());

        CircularDoubleLinkedList<Integer> miListaCD = new CircularDoubleLinkedList<>();
        miListaCD.add(11);
        miListaCD.add(22);
        miListaCD.add(33);
        miListaCD.add(88);
        miListaCD.add(88);
        System.out.println("Datos de la lista circular doble: " + miListaCD.showData());

        CircularSingleLinkedList<String> circular1 = new CircularSingleLinkedList<>();
        circular1.add("33");
        circular1.add("22");
        circular1.add("11");
        CircularSingleLinkedList<String> circular2 = new CircularSingleLinkedList<>();
        circular2.add("99");
        circular2.add("88");
        circular2.add("77");
        //prueba de unir listas
        circular1.joinList(circular2);
        System.out.println("Listas unidas: " + circular1.showData());

        CircularSingleLinkedList<String> miListaCS = new CircularSingleLinkedList<>();
        miListaCS.add("33");
        miListaCS.add("44");
        miListaCS.add("55");
        miListaCS.add("77");
        miListaCS.add("88");
        miListaCS.add("99");
        miListaCS.add("A7");
        miListaCS.add("I7");
        System.out.println("Información de lista circular simple: " + miListaCS.showData());
        miListaCS.delete();
        miListaCS.delete();
        System.out.println("Información de lista circular simple: " + miListaCS.showData());

        //pruebas de lista enlazada doble
        DoubleLinkedList<Double> miListaD = new DoubleLinkedList<>();
//        miListaD.add(1.1);
//        miListaD.add(2.2);
//        miListaD.add(3.3);
//        miListaD.add(7.7);
//        miListaD.add(8.8);
//        miListaD.addLast(1.1);
//        miListaD.addLast(2.2);
//        miListaD.addLast(3.3);
        miListaD.addOrdered(1.1);
        miListaD.addOrdered(2.2);
        miListaD.addOrdered(3.3);
        miListaD.addOrdered(0.1);
        miListaD.addOrdered(1.7);

        System.out.println("Datos de la lista enlazada doble: "
                + miListaD.showData());

        miListaD.deleteLast();
        miListaD.deleteLast();
        miListaD.deleteLast();
        miListaD.deleteLast();
        miListaD.deleteLast();
        miListaD.deleteLast();
        miListaD.deleteLast();
        miListaD.deleteLast();

        System.out.println("Datos de la lista enlazada doble: "
                + miListaD.showData());

//        // TODO code application logic here
//        Node<Integer> vagon1 = new Node<>(11);
//        Node<Integer> vagon2 = new Node<>(12);
//        Node<Integer> vagon3 = new Node<>(13);
//        Node<Integer> vagon4 = new Node<>(14);
//        Node<Integer> vagon5 = new Node<>(15);
//        
//        vagon1.setNextNode(vagon2);
//        vagon2.setNextNode(vagon3);
//        vagon3.setNextNode(vagon4);
//        vagon4.setNextNode(vagon5);
//        System.out.println(vagon1.getNextNode().getNextNode().getNextNode().getData());       
//        String a = "z", b="z";
//        System.out.println("Resultado de la comparación: "+ a.compareTo(b));
//        System.out.println("");
//  
        SingleLinkedList<Integer> miListaS = new SingleLinkedList<>();
        miListaS.addLast(11);
        miListaS.addLast(33);
        miListaS.addLast(22);
        miListaS.addLast(44);
        miListaS.addLast(55);

//          miListaS.addOrdered(99);
//          miListaS.addOrdered(10);
//          miListaS.addOrdered(33);
//          miListaS.addOrdered(22);
//          miListaS.addOrdered(55);
//          miListaS.addOrdered(66);
//          miListaS.addOrdered(8);
//        miListaS.add(11);
//        miListaS.add(12);
//        miListaS.add(13);
//        miListaS.add(14);
//        miListaS.add(15);
//        miListaS.add(16);
//        miListaS.add(32568);
//        miListaS.add(77);
//        miListaS.add(99);
        System.out.println(miListaS.showData());
        miListaS.delete();
        miListaS.delete();

        System.out.println(miListaS.showData());

    }

}
