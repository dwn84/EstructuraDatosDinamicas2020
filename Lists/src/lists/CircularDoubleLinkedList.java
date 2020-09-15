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
public class CircularDoubleLinkedList<T> implements Ilist<T> {

    DoubleNode<T> head;

    public CircularDoubleLinkedList() {
        head = null;
    }

    @Override
    public boolean isEmpty() {
        return head == null;
    }

    @Override
    public void add(T d) {
        DoubleNode<T> newNode= new DoubleNode<>(d);
        if(isEmpty()){
            head= newNode;
            newNode.setNextNode(newNode);
            newNode.setPreviousNode(newNode);
        }else{
            newNode.setPreviousNode(head.getPreviousNode());
            newNode.setNextNode(head);
            head.getPreviousNode().setNextNode(newNode);
            head.setPreviousNode(newNode);
            head=newNode;
            
        }
    }

    @Override
    public void addLast(T d) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void addOrdered(T d) {
       //Agregar datos ordenados sin repetir valor
       //(si el dato ya se encuentra en la lista, no ingresarlo y mostrar advertencia).
    }

    @Override
    public void delete() {
        //Eliminar el primer dato.
    }

    @Override
    public void deleteLast() {
        //Eliminar el último dato.
    }
/**
 * Mostrar los datos de forma descendente.
 * @return LIsta de datos en orden descendente
 */
    public String showDataDesc(){
        String data = "";
        return data;
    }
    
    @Override
    public String showData() {
               if (isEmpty()) {
            return "Lista vacia";
        } else {
            String data = "";
            DoubleNode<T> tail = head.getPreviousNode();
            for (DoubleNode<T> i = head; i != tail; i = i.getNextNode()) {
                data += i.getData() + " ";
            }
            return data += tail.getData();

        }
    }

}
