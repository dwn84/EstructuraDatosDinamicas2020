/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recursividad;

/**
 *
 * @author samaniw
 */
public class Recursividad {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Recur r = new Recur();
        //r.recursividad(10);
//        System.out.println(r.sumatoria(5));
//        System.out.println(r.factorial(6));
//        for (int i = 0; i < 5; i++) {
//            System.out.println("Elemento fibonacci:"+r.fibonacci1(i));
//        }
            System.out.println(r.fibonacci1(10));
                r.fibonacci0(10);

    }

}
