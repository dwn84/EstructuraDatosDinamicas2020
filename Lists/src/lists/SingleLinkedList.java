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
public class SingleLinkedList<T extends Number & Comparable> implements Ilist<T> {

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
        if(isEmpty()){
            add(d);
        }else{
            Node<T> current=head;
            while(current.getNextNode()!=null){
                current = current.getNextNode();
            }
            Node<T> newNode = new Node<>(d);
            current.setNextNode(newNode);
        }
        

        
    }

    @Override
    public void addOrdered(T d) {
        /*Si la lista esta vacía, 
        o el valor del primer elemento de la lista(cabeza) 
        es mayor que el nuevo, insertar el nuevo nodo en la 
        primera posición de la lista y modificar la cabecera 
        respectivamente.
        */
        if(isEmpty() || head.getData().compareTo(d)>0){
            add(d);
        }else{
        /*
        Si no se cumple el caso anterior, buscar el lugar adecuado
        para la inserción: recorrer la lista conservando el nodo
        actual. Inicializar nodo actual con el valor de primera
        posición, y avanzar mientras el siguiente nodo no sea nulo 
        y el dato que contiene la siguiente posición sea menor 
        o igual que el dato a insertar.
        */
        
        Node<T> current = head;
        while(current.getNextNode()!=null
              && current.getNextNode().getData().compareTo(d)<0
                ){
            current = current.getNextNode();
        }        
        /*Con esto el nodo actual señala al nodo adecuado,
        a continuación insertar el nuevo nodo después de él.
        */
        Node<T> newNode = new Node<>(d);
        newNode.setNextNode(current.getNextNode());
        current.setNextNode(newNode);        
        }
        
        size++;
    }

    @Override
    public void delete() {
        if(isEmpty()){
            System.out.println("Lista vacia");
        }else{
            //apuntar la cabeza al segundo dato
            head = head.getNextNode();
        }
        size--;
        
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
            //Forma tradicional de recorrer la estructura
//            Node<T> current=head;
//            while(current!=null){
//                data += current.getData() + " ";
//                current = current.getNextNode();
//            }
            
            //for (int i = 0; i < n; i=i+1) {
            for(Node<T> i=head;i!=null;i = i.getNextNode()){
                data += i.getData() + " ";
            } 
            return data;
            
        }
    }


    
}
