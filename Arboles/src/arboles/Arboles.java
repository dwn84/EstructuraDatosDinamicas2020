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
public class Arboles {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArbolBinario navidad = new ArbolBinario();
//        navidad.getRaiz().setDerecha(new NodoBinario((55)));
//        navidad.getRaiz().setIzquierda(new NodoBinario((11)));
//        navidad.getRaiz().getDerecha().setIzquierda(new NodoBinario((44)));
//        navidad.getRaiz().getDerecha().setDerecha(new NodoBinario((22)));
        navidad.AgregarDato(33);
        navidad.AgregarDato(12);
        navidad.AgregarDato(5);
        navidad.AgregarDato(44);
        navidad.AgregarDato(7);
        navidad.AgregarDato(14);
        navidad.AgregarDato(13);
        navidad.AgregarDato(15);
                
        System.out.println("Datos del arbol en InOrden");
        navidad.InOrden();
        System.out.println("Datos del arbol en PostOrden");
        navidad.PostOrden();
        System.out.println("Datos del arbol en PreOrden");
        navidad.PreOrden();
        String resultado = (navidad.Buscar(33)==null)?"NO lo encontro":"Dato encontrado";
        System.out.println(resultado);
        //validar el padre de un nodo buscado
        System.out.println("El padre del nodo buscado: " +navidad.getPadre().getDato());
        
        navidad.Borrar(33);
        resultado = (navidad.Buscar(33)==null)?"NO lo encontro":"Dato encontrado";
        System.out.println(resultado);
    }
    
}

