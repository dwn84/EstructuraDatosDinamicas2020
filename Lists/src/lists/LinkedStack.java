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
public class LinkedStack<E> implements IStack<E> {

    private Node<E> head;
    private int size;

    public boolean empty() {
        return head == null;
    }

    @Override
    public E peek() {
        return head.getData();
    }

    @Override
    public E pop() throws Exception {
        if (empty()) {
            throw new NullPointerException("Pila vacia");
        } else {
            size--;
            E temp = head.getData();
            head = head.getNextNode();
            return temp;      
        }
    }

    @Override
    public E push(E item) {
        size++;
        head = new Node<E>(item, head);
        return item;
    }

    @Override
    public int search(Object o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * @return the size
     */
    public int getSize() {
        return size;
    }

}
