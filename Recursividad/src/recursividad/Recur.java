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
public class Recur {

    private int a, b, c;

    public void recursividad(int x) {

        if (x != 0) {
            System.out.println("Hello world" + x);
            recursividad(x - 1);
        }

    }

    public int sumatoria(int n) {
        //caso base
        System.out.println("");
        if (n == 1) {
            return 1;
        } else {
            return sumatoria(n - 1) + n;
        }

    }

    public double factorial(double n) {
        System.out.println("");
        if (n == 0) {
            n = 1;
        } else {
            n = factorial(n - 1) * n;
        }
        return n;
    }

    public void fibonacci0(int n) {
        fibonacci01(n, 0, 1);
    }

    private void fibonacci01(int n, int a, int b) {
        //caso base
        if (n == 0) {
            return;
        } else {
            System.out.print(a + " ");
            fibonacci01(n - 1, b, a + b);
        }

    }

    public int fibonacci1(int n) {
        System.out.println("");
        //caso base
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return fibonacci1(n - 1) + fibonacci1(n - 2) + fibonacci1(n - 3);
        }
    }

    public void fibonacci2(int n) {
        a = 0;
        b = 1;
        fibonacci21(n);
    }

    private void fibonacci21(int n) {
        //condición de llamado recursivo
        if (n >= 1) {
            c = a + b;
            System.out.print(a + " ");
            a = b;
            b = c;
            fibonacci21(--n);
        }
    }

    public int mcd(int n, int m) {
        //caso base
        if (n == m) {
            return n;
        } else if (n > m) {
            return mcd(n - m, m);
        } else {
            return mcd(n, m - n);
        }
    }

    public boolean par(int n) {
        System.out.println("");
        if (n == 0) {
            return true;
        } else {
            return impar(n - 1);
        }
    }

    private boolean impar(int n) {
        System.out.println("");
        if (n == 0) {
            return false;
        } else {
            return par(n - 1);
        }
    }
    //posible ejemplo de tribonacci

    public void tribonacci(int n) {
        tribonacci(n, 0, 0, 1);

    }

    private void tribonacci(int n, int a, int b, int c) {

        //caso base
        if (n == 0) {
            return;
        } else {
            System.out.print(a + " ");
            tribonacci(n - 1, b, c, (a + b + c));
        }

        //antes de la llamada recursiva, mostrar dato
        //tribonacci(n-1)+tribonacci(n-2)+tribonacci(n-3);
    }

    public boolean determinarSiExiste(int[] a, int d) {
        //recorrer recursivamente el arreglo
        //determinarSiExiste(a, d);
        return determinarSiExiste(a, d, 0);
    }

    private boolean determinarSiExiste(int[] a, int d, int contador) {
        if (d == a[contador]) {
            return true;
        } else if (contador == (a.length - 1)) {
            return false;
        } else {
            return determinarSiExiste(a, d, ++contador);
        }

    }

    public boolean verificarPalindromo(String s) {

        if (s.length() == 1 || s.length() == 0) {
            return true;
        } else if (s.charAt(0) != s.charAt(s.length() - 1)) {
            return false;
        } else {
            s = s.substring(1);
            s = s.substring(0, s.length() - 1);
            return verificarPalindromo(s);
        }
//        s.charAt(0);//tomar la primera letra
//        s.charAt(s.length() - 1);//ultima letra
//        s.substring(1);//eliminar la primera letra
//        verificarPalindromo(s);
//        s.toCharArray();//convertir el texto a un arreglo
//        return true;
    }
    
    public int numerologia(int n){
        if(n<10){
            return n;
        }else{
            return numerologia((n/10)+(n%10));
        }
            
    }
}
