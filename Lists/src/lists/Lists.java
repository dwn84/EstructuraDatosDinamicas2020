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
