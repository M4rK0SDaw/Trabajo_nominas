/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test__nominas;

import Sleer1.SLeer1;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author Marek
 */
public class Test__nominas {

    private static char pc;
    private static int contrato;
    private static Empresa Emp = new Empresa();
    private static Trabajador Tbr = new Trabajador();
    private static Devengos dvs = new Devengos();
    private static Contingencias cont = new Contingencias();
    private static deduccioneesnomina deduc = new deduccioneesnomina();
    static String resp = null;

    /**
     *
     */
    public static void pideEmpresas() {

        //pideContrato();
        String pideNomEmp = SLeer1.datoString("Nombre de la  empresa: ");
        Emp.setEmpresa(pideNomEmp);
        //domicilio
        String domEmp = SLeer1.datoString("Domicilio de la empresa: ");
        Emp.setDomicilio(domEmp);
        //CCC
        int cccEmp = SLeer1.datoInt("Código cuenta de cliente  de la empresa: ");
        Emp.setCCC(cccEmp);
        SLeer1.limpiar();
        //CIF
        String cifEmp = SLeer1.datoString("C.I.F de la empresa: ");
        Emp.setCIF(cifEmp);

    }

    /**
     *
     */
    public static void PideTrabajador() {
        String nomtbr = SLeer1.datoString("Nombre del trabajador: ");
        Tbr.setTrabajador(nomtbr);

        String nifTbr = SLeer1.datoString("NIF del trabajador: ");
        Tbr.setNif(nifTbr);

        String ssTbr = SLeer1.datoString("Seguridad Social del trabajador: ");
        Tbr.setSeguridadSocial(ssTbr);

        char gptbr = SLeer1.datoChar("Grupo profesional del trabajador: ");
        char mayus = Character.toUpperCase(gptbr);
        Tbr.setGProfesional(mayus);

        while (mayus != 'A' && mayus != 'B' && mayus != 'C' && mayus != 'D' && mayus != 'E') {
            System.out.println("\nGrupo incorrecto seleccione una válido: ");
            System.out.println(" A , B , C , D o E ");
            gptbr = SLeer1.datoChar("Grupo profesional del trabajador: ");
            mayus = Character.toUpperCase(gptbr);
            Tbr.setGProfesional(mayus);
        }

        String gctbr = SLeer1.datoString("Grupo de cotización del trabajador: ");
        Tbr.setGCotizacion(gctbr);
    }

    /**
     *
     */
    public static void Devengos() {
        String per_liq = SLeer1.datoString("Escribe un periodo de liquidación: ");
        dvs.setSalario(Tbr.getGProfesional());
        dvs.setComp(Tbr.getGProfesional());
        dvs.setTotal();
        dvs.setContigC();
        dvs.setContigP();

    }

    /**
     *
     */
    public static void pideContrato1() {
        do {
            contrato = SLeer1.datoInt("Selección de tipo de contrato: \n"
                    + "1. duración indeterminada.\n"
                    + "2. duración determinada\n");

            SLeer1.limpiar();

        } while (contrato > 2 || contrato < 1);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        String guess;
//        do {
//            System.out.print("Guess my name: ");
//            guess = scanner.nextLine());
//        } while (!"DAFFY DUCK".equals(guess));
//        System.out.println("Congratulations, you guessed my name correctly!");
        do {
            pideEmpresas();
            PideTrabajador();
            pideContrato1();
            Devengos();

            System.out.println("###################################\n"
                    + "\nEMPRESA\n" //sacamos por pantalla la empresa.....
                    + "Empresa : ............. " + Emp.getEmpresa() + " \n"
                    + "Domiciolio : ............." + Emp.getDomicilio() + " \n"
                    + "CCC : ............." + Emp.getCCC() + " \n"
                    + "CIF : ............." + Emp.getCIF() + " \n"
                    + "\n"
                    + "###################################n"
                    + "\n"
                    + "TRBAJADOR\n" //sacamos por pantalla el trabajador...
                    + "Trbajador : ............. " + Tbr.getTrabajador() + " \n"
                    + "NIF : ............. " + Tbr.getNif() + " \n"
                    + "Seg.Soc. : ............. " + Tbr.getSeguridadSocial() + " \n"
                    + "Grupo profesional : ............. " + Tbr.getGProfesional() + " \n"
                    + "Grupo cotización : ............. " + Tbr.getGCotizacion() + " \n"
                    + "\n"
            );

            System.out.println("###################################\n"
                    + "\n"
                    + " DEVENGOS \n"
                    + "1. Percepciones salariales " + dvs.getSalario() + " \n"
                    + "   Complemetos salariales " + dvs.getComp() + " \n"
                    + "         A.Total devengado " + String.format("%.2f", dvs.getTotal()) + " \n"
            );

            if (contrato == 1) {
                System.out.println(""
                        + "-Deducciones-"
                        + "Contingencias comunes... 4,7 ............. " + String.format("%.2f", deduc.cccalc(dvs.getContigC())) + ".\n"
                        + "Formacion profesional... 0.10 ............. " + String.format("%.2f", deduc.fpcalc(dvs.getContigP())) + ".\n"
                        + "Desempleo indeterminado... 1.55 ............ " + String.format("%.2f", deduc.desempleocalc(dvs.getContigP())) + ".\n"
                        + "IRPF... 2% ........... " + String.format("%.2f", deduc.irpfcalc(dvs.getTotal())) + ".\n"
                        + "Total deucciones .............." + String.format("%.2f", deduc.sumatoriodeducciones()) + ".\n");
            } else {
                System.out.println(""
                        + "-Deducciones-"
                        + "Contingencias comunes... 4,7 ............. " + String.format("%.2f", deduc.cccalc(dvs.getContigC())) + ".\n"
                        + "Formacion profesional... 0.10 ............. " + String.format("%.2f", deduc.fpcalc(dvs.getContigP())) + ".\n"
                        + "Desempleo indeterminado... 1.60 ............ " + String.format("%.2f", deduc.desempleoddcalc(dvs.getContigP())) + ".\n"
                        + "IRPF... 2% ........... " + String.format("%.2f", deduc.irpfcalc(dvs.getTotal())) + ".\n"
                        + "Total deucciones .............." + String.format("%.2f", deduc.sumatoriodeduccionesdd()) + ".\n");
            }
            System.out.println("###################################\n"
                    + "\n"
                    + "1. Contingencias comunes" + " \n"
                    + "     Remuneracion mensual  " + String.format("%.2f", dvs.getTotal()) + " \n"
                    + "     Prorrata de pagas extraodinarias" + 0 + " \n"
                    + "     Base incapacidad temporal " + " \n"
                    + "     Base de cotizacion ala S.Soc " + String.format("%.2f", dvs.getTotal()) + " .... " + "23.60% ..... " + String.format("%.2f", cont.ContSegSoc(dvs.getTotal())) + " \n"
                    + "\n");

            if (contrato == 1) {

                System.out.println("2. Contingencias Profesionales" + " \n"
                        + "     AT y EP  ........  1.5%  ... " + String.format("%.2f", cont.ContAtEp(dvs.getTotal())) + " \n"
                        + "     Desempleo ........ 6.70%  ... " + String.format("%.2f", cont.ContDesempleoI(dvs.getTotal())) + " \n"
                        + "     Formación profesional ...... 0.60%  ... " + String.format("%.2f", cont.ContFP(dvs.getTotal())) + " \n"
                        + "     Fondo de Garantia Salarial ..... 0.20%  ... " + String.format("%.2f", cont.ContFogasa(dvs.getTotal())) + " \n"
                        + "\n"
                        + "3. Cotizacion adicional horas extra" + " \n"
                        + "     Total aportación empresarial" + " \n"
                        + "4. Base sujeta a retención de I.R.P.F. .... " + String.format("%.2f", dvs.getTotal()) + " \n"
                        + "5. Base I.R.P.F. por retib. en especie" + " \n\n");
            } else {
                System.out.println("2. Contingencias Profesionales" + " \n"
                        + "     AT y EP  ........ 1.5% ... " + String.format("%.2f", cont.ContAtEp(dvs.getTotal())) + " \n"
                        + "     Desempleo ........ 5.50% ... " + String.format("%.2f", cont.ContDesempleoT(dvs.getTotal())) + " \n"
                        + "     Formación profesional ......  0.60% ... " + String.format("%.2f", cont.ContFP(dvs.getTotal())) + " \n"
                        + "     Fondo de Garantia Salarial ..... 0.20% ... " + String.format("%.2f", cont.ContFogasa(dvs.getTotal())) + " \n"
                        + "\n"
                        + "3. Cotizacion adicional horas extra " + " \n"
                        + "     Total aportación empresarial ......." + 0 + " \n"
                        + "4. Base sujeta a retención de I.R.P.F. .... " + String.format("%.2f", dvs.getTotal()) + " \n"
                        + "5. Base I.R.P.F. por retib. en especie ..." + 0 + "  \n");
            }
            resp = SLeer1.datoString("\nDesea repetir la nomina [SI|NO]\n");

        } while (!"NO".equals(resp.toUpperCase()));

        System.out.println("\nFINAL DEL PROGRAMA\n");

    }
}
