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
public class SingleLinkedList<T> implements Ilist<T> {

    private Node<T> head;
    private int size;

    public SingleLinkedList() {
        head=null;
        size=0;
    }   
    
    @Override
    public boolean isEmpty() {
        return head==null;
        /*
        if(head==null){
            return true;
        }else{
            return false;
        }
        */
    }
    
    @Override
    public void add(T d) {
        //1. Crear el nodo
        Node<T> newNode = new Node<>(d);
        //2. Modificar el siguiente nodo del nuevo nodo para sea la cabeza
        newNode.setNextNode(head);
        //3. Modificar la cabeza de la estructura: nuevo nodo
        head = newNode;
        //4. Incrementar el tamaño
        size++;
    }

    @Override
    public void addLast(T d) {
    }

    @Override
    public void addOrdered(T d) {
    }

    @Override
    public void delete() {
    }

    @Override
    public void deleteLast() {
    }

    @Override
    public String showData() {        
        if(isEmpty()){
            return "Lista vacia";
        }else{
            String data = "";
            //for (int i = 0; i < n; i=i+1) {
            for(Node i=head;i!=null;i = i.getNextNode()){
                data += i.getData() + " ";
            } 
            return data;
            
        }
    }


    
}
