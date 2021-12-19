/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test__nominas;

/**
 *
 * @author pablo
 */
public class deduccioneesnomina extends Devengos {

    private double fp = 0.10;
    private double cc = 4.70;
    private double desempleo = 1.55;
    private double desempleodd = 1.60;
    private double irpf = 2.00;
    private double fpcalc1;
    private double cccalc1;
    private double desempleocalc1;
    private double desempleoddcalc1;
    private double irpfcalc1;

    public double fpcalc(double x) {
        fpcalc1 = fp * x / 100;
        return fpcalc1;
    }

    public double cccalc(double x) {
        cccalc1 = cc * x / 100;
        return cccalc1;
    }

    public double desempleocalc(double x) {
        desempleocalc1 = desempleo * x / 100;
        return desempleocalc1;
    }

    public double desempleoddcalc(double x) {
        desempleoddcalc1 = desempleodd * x / 100;
        return desempleoddcalc1;
    }

    public double irpfcalc(double x) {
        irpfcalc1 = irpf * x / 100;
        return irpfcalc1;
    }

    public double sumatoriodeducciones() {
   
        double sumatoriodeducciones = irpfcalc1 + desempleocalc1 + cccalc1 + fpcalc1;
        return sumatoriodeducciones;
    }

    public double sumatoriodeduccionesdd() {
        double sumatoriodeduccionesdd = desempleoddcalc1 + irpfcalc1 + cccalc1 + fpcalc1;
        return sumatoriodeduccionesdd;
    }
}
