/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test__nominas;

import Test__nominas.Devengos.*;

/**
 *
 * @author marqu
 */
public class Contingencias {

    private static double baseCotizacionSS = 23.60;
    private static double aTeP = 1.50;
    private static double desmI = 5.50;
    private static double desmT = 6.70;
    private static boolean TempoONo;
    private static double C;
    private static double Desempleo = C;
    private static double fp = 0.60;
    private static double fogasa = 0.20;

    public static double ContSegSoc(double x) {  //s de salrarioBruto, sin las pagas extras
        return x * baseCotizacionSS / 100;

    }

    public static double ContAtEp(double x) {
        return x * aTeP / 100;

    }

    public static double ContDesempleoI(double x) {
        return x * desmI / 100;

    }

    public static double ContDesempleoT(double x) {
        return x * desmT / 100;

    }

    public static double ContFP(double x) {
        return x * fp / 100;

    }

    public static double ContFogasa(double x) {
        return x * fogasa / 100;

    }

}
