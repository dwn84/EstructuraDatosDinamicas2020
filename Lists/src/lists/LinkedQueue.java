/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lists;

import java.util.Collection;
import java.util.Iterator;
import java.util.Queue;

/**
 *
 * @author samaniw
 */
public class LinkedQueue implements Queue {

    private Node<Object> head;
    private Node<Object> tail;
    private int size;

    public LinkedQueue() {
        head = tail = null;
    }

    @Override
    public boolean add(Object e) {
        Node<Object> newNode = new Node<>(e);
        if (isEmpty()) {
            head = tail = newNode;
        } else {
            tail.setNextNode(newNode);
            tail = newNode;
        }
        size++;
        return true;
    }

    @Override
    public boolean offer(Object e) {
        add(e);
        size++;
        return true;
    }

    @Override
    public Object remove() {
        Object temp = head;
        if (isEmpty()) {
            throw new UnsupportedOperationException("Error: sin datos");
        } else if (head == tail) {
            head = tail = null;
        } else {
            head = head.getNextNode();
        }
        size--;
        return temp;
    }

    @Override
    public Object poll() {
        Object temp = head;
        if (isEmpty()) {
            return null;
        } else if (head == tail) {
            head = tail = null;
        } else {
            head = head.getNextNode();
        }
        size--;
        return temp;    }

    @Override
    public Object element() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object peek() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int size() {
        return this.size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public boolean contains(Object o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Iterator iterator() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object[] toArray() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object[] toArray(Object[] a) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean remove(Object o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean containsAll(Collection c) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean addAll(Collection c) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean removeAll(Collection c) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean retainAll(Collection c) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void clear() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
