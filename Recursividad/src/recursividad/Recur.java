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
            return fibonacci1(n - 1) + fibonacci1(n - 2);
        }
    }
}
