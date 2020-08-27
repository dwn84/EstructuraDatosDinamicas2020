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
public interface Ilist<T> {

    /**
     * Verificar si la lista esta vacía
     * @return Verdadero si esta vacía; falso si tiene por lo menos un dato
     */
    public boolean isEmpty();
    /**
     * Adicionar un dato al inicio de la lista
     *
     * @param d Dato al interior del nodo
     */
    public void add(T d);

    /**
     * Adicionar un dato al final de la lista
     *
     * @param d Dato al interior del nodo
     */
    public void addLast(T d);

    /**
     * Agregar datos manteniendo un orden ascendente
     *
     * @param d Dato al interior del nodo
     */
    public void addOrdered(T d);

    /**
     * Borrar el primer dato de la lista
     */
    public void delete();

    /**
     * Borrar el último dato de la lista
     */
    public void deleteLast();

    /**
     * Mostrar los datos de forma ascendente
     *
     * @return Cadena de texto con todos los datos
     */
    public String showData();

}
