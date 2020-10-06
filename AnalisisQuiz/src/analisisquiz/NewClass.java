/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package analisisquiz;

/**
 *
 * @author samaniw
 */
public class NewClass {

}

class NodoDoble<T> {

    private T dato;
    private NodoDoble<T> siguienteNodo;
    private NodoDoble<T> anteriorNodo;

    public NodoDoble(T d, NodoDoble anteriorNodo, NodoDoble siguienteNodo) {
        setDato(d);
        setAnteriorNodo(anteriorNodo);
        setSiguienteNodo(siguienteNodo);
    }

    public NodoDoble(T d) {
        this(d, null, null);
    }

    public T getDato() {
        return dato;
    }

    public void setDato(T dato) {
        this.dato = dato;
    }

    public NodoDoble<T> getSiguienteNodo() {
        return siguienteNodo;
    }

    public void setSiguienteNodo(NodoDoble<T> siguienteNodo) {
        this.siguienteNodo = siguienteNodo;
    }

    public NodoDoble<T> getAnteriorNodo() {
        return anteriorNodo;
    }

    public void setAnteriorNodo(NodoDoble<T> anteriorNodo) {
        this.anteriorNodo = anteriorNodo;
    }

}

class miListaCircularDoble<T> {

    private NodoDoble<T> cabeza;

    public miListaCircularDoble() {
        cabeza = null;
    }

    public miListaCircularDoble(NodoDoble cabeza) {
        this.cabeza = cabeza;
    }

    public void setCabeza(NodoDoble cabeza) {
        this.cabeza = cabeza;
    }

    public String mostrarDatos() {
        String data = "";
        for (NodoDoble current = cabeza; current != cabeza.getAnteriorNodo(); current = current.getSiguienteNodo()) {
            data += current.getDato() + " ";
        }
        return data + cabeza.getAnteriorNodo().getDato();
    }

    public void rotacionIzquierda(int CantidadPosiciones) {
        NodoDoble current = cabeza;
        for (int i = 0; i < CantidadPosiciones; i++) {
            current = current.getSiguienteNodo();
        }        
        setCabeza(current);
    }
}
