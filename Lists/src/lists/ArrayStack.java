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
public class ArrayStack implements IStack<Object> {

    private Object[] data;
    private int top;
    private int max;

    public ArrayStack(int n) {
        data = new Object[n];
        top = 0;
        max = n;
    }

    @Override
    public boolean empty() {
        return top == 0;
    }

    @Override
    public Object peek() {
        return data[top - 1];
    }

    @Override
    public Object pop(){
        if (empty()) {
            return null;
        } else {
            Object temp = data[--top];
            data[top] = null;
            return temp;
        }
    }

    @Override
    public Object push(Object item) {
        if (top == max) {
            return null;
        } else {
            data[top++] = item;
            return item;
        }
    }

    @Override
    public int search(Object o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
