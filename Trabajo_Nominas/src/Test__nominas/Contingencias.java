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
    private static double aTeP = 1.5;
    private static boolean TempoONo;
    private static double Desempleo = 0;
    private static double fp = 0.60;
    private static double fogasa = 0.20;

    //metodo round
    public static double ContSegSoc(double x) {  //s de salrarioBruto, sin las pagas extras
        return x * baseCotizacionSS / 100;

    }

    public static double ContAtEp(double x) {
        return x * aTeP / 100;

    }

    public static boolean ContratoTemporalONo(boolean C) {
        if (C == true) {//Contrato temporal
            Desempleo = 6.70;
        } else {//Contrato no temporal
            Desempleo = 5.50;
        }

        return C;

    }

    public static double ContDesempleo(double x) {
        return x * Desempleo / 100;

    }

    public static double ContFP(double x) {
        return x * fp / 100;

    }

    public static double ContFogasa(double x) {
        return x * fogasa / 100;

    }

}
/*
    public static void MuestraContingenciasComunes() {
        System.out.println(
                "Remuneracion mensual  \n" + salarioB
                + "Prorrata de pagas extraodinarias\n" + salarioExt
                + "Base  incapacidad temporal \n"
                + "Base de cotizacion ala S.Soc " + salario + " " + baseCotizacionSS + "% " + rest + "\n"
                + "\n");
    }

    public static void MuestraContingenciasProfesoinales() {
        System.out.println("2. Contingencias Profesionales"
                + "AT y EP  " + aTeP + "% " + aTeP * salario / 100 + "\n"
                + "Desempleo \n" + EmpleoDEterminad + "% ..........." + EmpleoDEterminad * salario / 100
                + "Formacion profesional \n" + fp + "% ..........." + fp * salario / 100
                + "Fondo Garantia Salarial \n" + fogasa + "% ..........." + fogasa * salario / 100
                + "\n"
                + "3. Cotizacion adicional horas extra"
                + "Total aportacion empresarial\n"
                + "4. Base sujeta a retencion del IRPF " + salario
                + "\n 5.Base IRPF por retrib. en espeie......." + 0);
    }

}*/
