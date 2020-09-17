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
public interface IStack<E> {
    /**
     * Verificar si la pila esta vacia
     * @return Verdadero si no hay datos
     */
    public boolean empty();
    /**
     * Mostrar el siguiente dato en salir
     * @return El dato
     */
    public E peek();
    /**
     * Eliminar el dato en la cabeza
     * @return el dato eliminado
     */
    public E pop()throws Exception;
    /**
     * Agregar un dato a la cabeza
     * @param item Dato a ingresar
     * @return Dato ingresado
     */
    public E push(E item);
    /**
     * Buscar un dato en la pila
     * @param o El dato a buscar
     * @return La posición en la pila o -1 si no se encuentra
     */
    public int search(Object o);
}
