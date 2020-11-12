/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trees;

/**
 *
 * @author samaniw
 */
public class Trees {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        BinarySearchTree navidad = new BinarySearchTree();
        navidad.add(1);
        navidad.add(2);
        navidad.add(3);
        navidad.add(5);
        navidad.add(4);
        navidad.add(7);
        navidad.add(6);
        navidad.add(9);
        System.out.println("");
        System.out.println("Recorrido en PreOrden:");
        navidad.PreOrden();
        System.out.println("");
        System.out.println("Recorrido en PostOrden:");
        navidad.PostOrden();
        System.out.println("");
        System.out.println("Recorrido en InOrden:");
        navidad.InOrden();
        System.out.println("");
//        navidad.root.setLeft(new BinaryNode((2)));
//        navidad.root.getLeft().setLeft(new BinaryNode((4)));
//        navidad.root.setRight(new BinaryNode(3));

        navidad.search(7);
        System.out.println("El padre es: " + navidad.father.getData());

        System.out.println("búsqueda de dato:");
        navidad.Delete(5);
//        navidad.Delete(2);
//        navidad.Delete(3);
        String resultado = (navidad.search(5) != null) ? "Dato encontrado!" : "No se encuentra el dato";
//        System.out.println("El padre encuentra a su hijo por la: ");
//        System.out.println(navidad.fatherposition?"Derecha":"Izquierda");
        System.out.println(resultado);
        navidad.search(7);
        System.out.println("El padre es: " + navidad.father.getData());

    }

}
