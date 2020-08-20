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
        r.tribonacci(7);
        int[] datos = new int[]{1,5,2,5,8,2,1,9};
        System.out.println(r.determinarSiExiste(datos,5));
        
        //r.recursividad(10);
//        System.out.println(r.sumatoria(5));
//        System.out.println(r.factorial(6));
//        for (int i = 0; i < 5; i++) {
//            System.out.println("Elemento fibonacci:"+r.fibonacci1(i));
//        }
//        System.out.println(r.fibonacci1(10));
//        r.fibonacci0(10);
        r.fibonacci2(10);
        System.out.println("M.C.D(2028,1992):" + r.mcd(2028, 1992));
        System.out.println("Validar número par(5): " + r.par(5));
        
    }
    
}
