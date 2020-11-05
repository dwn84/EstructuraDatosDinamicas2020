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
        BinarySearchTree navidad = new BinarySearchTree(1);
        navidad.root.setLeft(new BinaryNode((2)));
        navidad.root.getLeft().setLeft(new BinaryNode((4)));
        navidad.root.setRight(new BinaryNode(3));
        
    }
    
}
