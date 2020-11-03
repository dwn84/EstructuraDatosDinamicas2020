/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arboles;

/**
 *
 * @author samaniw
 */
public class NodoBinario {
   private int dato;
   private NodoBinario derecha;
   private NodoBinario izquierda;
   private boolean desplazarIzquierda;

    public NodoBinario(int dato) {
        setDato(dato);
        setDerecha(null);
        setIzquierda(null);
    }
    
    public boolean verificarHoja(){
        //operador ternario
        //variable = condición ? valor si cierto : valor si falso
        return ((derecha==null) && (izquierda==null))?true:false;
        /*
        if(derecha==null && izquierda==null){
            return true;
        }else{
            return false;
        }
        */
        
    }
    /**
     * Validar si el nodo actual tiene un solo hijo
     * @return Verdadero si tiene un solo hijo
     */
    public boolean verificarUnSoloHijo(){
        if(izquierda == null && derecha != null){
            desplazarIzquierda = false;//indicar que se puede realizar un desplazamineto a la derecha;
            return true;
        }else if(izquierda != null && derecha == null){
            desplazarIzquierda = true;//indicar que se puede realizar un desplazamineto a la izquierda;
            return true;
        }else{
            return false;//se concluye entonces que el nodo tiene dos hijos
        }
    }

   
   
    /**
     * @return the dato
     */
    public int getDato() {
        return dato;
    }

    /**
     * @param dato the dato to set
     */
    public void setDato(int dato) {
        this.dato = dato;
    }

    /**
     * @return the derecha
     */
    public NodoBinario getDerecha() {
        return derecha;
    }

    /**
     * @param derecha the derecha to set
     */
    public void setDerecha(NodoBinario derecha) {
        this.derecha = derecha;
    }

    /**
     * @return the izquierda
     */
    public NodoBinario getIzquierda() {
        return izquierda;
    }

    /**
     * @param izquierda the izquierda to set
     */
    public void setIzquierda(NodoBinario izquierda) {
        this.izquierda = izquierda;
    }

    /**
     * @return the desplazarIzquierda
     */
    public boolean isDesplazarIzquierda() {
        return desplazarIzquierda;
    }
   
}
