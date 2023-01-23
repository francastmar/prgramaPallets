/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package europallets;

/**
 *
 * @author CentroNegos
 */


   
    public class Palet {

        static int altoP = 180;
        static int anchoP = 120;
        static int profundoP = 80;

        static String calcularCajasAncho(int alt, int anch, int prof) {

            int cajasXancho;
            int cajasXprof;
            int cajasXalto;

            int total;

            cajasXancho = Palet.anchoP / alt;
            cajasXalto = Palet.altoP / anch;
            cajasXprof = Palet.profundoP / prof;

            total = cajasXalto * cajasXancho * cajasXprof;
            String numCadena = Integer.toString(total);
            return numCadena;
        }

    }

