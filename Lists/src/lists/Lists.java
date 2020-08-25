/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lists;

/**
 *
 * @author samaniw
 */
public class Lists {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Node<Integer> vagon1 = new Node<>(11);
        Node<Integer> vagon2 = new Node<>(12);
        Node<Integer> vagon3 = new Node<>(13);
        Node<Integer> vagon4 = new Node<>(14);
        Node<Integer> vagon5 = new Node<>(15);
        
        vagon1.setNextNode(vagon2);
        vagon2.setNextNode(vagon3);
        vagon3.setNextNode(vagon4);
        vagon4.setNextNode(vagon5);
        System.out.println(vagon1.getNextNode().getNextNode().getNextNode().getData());       
        System.out.println("");
    }
    
}
