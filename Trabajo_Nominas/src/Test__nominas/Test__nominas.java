/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test__nominas;

import Sleer1.SLeer1;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author Marek
 */
public class Test__nominas {

    private static byte pc;
    private static Empresa Emp = new Empresa();
    private static Trabajador Tbr = new Trabajador();
    private static Devengos dvs = new Devengos();
    private static Contingencias cont = new Contingencias();

    public static byte pideContrato() {

        do {
            pc = SLeer1.datoByte("\n"
                    + " Selecciona el tipo de contrato \n"
                    + " \n"
                    + "[ ' 1 '  contrato de duracionón determinada ]\n"
                    + "\n"
                    + "[ ' 2 ' contratos de duracion indefinido ]\n");
        } while (pc > 2 || pc < 1);
        return pc;
    }

    public static void pideEmpresas() {

        //pideContrato();
        String pideNomEmp = SLeer1.datoString("Nombre de la  empresa: ");
        Emp.setEmpresa(pideNomEmp);
        //domicilio
        String domEmp = SLeer1.datoString("Domicilio de la empresa ");
        Emp.setDomicilio(domEmp);
        //CCC
        String cccEmp = SLeer1.datoString("Código cuenta de cliente  de la empresa ");
        Emp.setCCC(cccEmp);
        //CIF
        String cifEmp = SLeer1.datoString("C.I.F de la empresa ");
        Emp.setCIF(cifEmp);

    }

    public static void PideTrabajador() {
        String nomtbr = SLeer1.datoString("Nombre del trabajador ");
        Tbr.setTrabajador(nomtbr);
        String nifTbr = SLeer1.datoString("NIF del trabajador ");
        Tbr.setNif(nifTbr);
        String ssTbr = SLeer1.datoString("Seguridad Social del trabajador ");
        Tbr.setSeguridadSocial(ssTbr);
        String gptbr = SLeer1.datoString("Grupo profesional del trabajador ");
        Tbr.setGProfesional(gptbr);
        String gctbr = SLeer1.datoString("Grupo de cotización del trabajador ");
        Tbr.setGCotizacion(gctbr);

    }

    public static void Devengos() {
        String per_liq =  SLeer1.datoString("Periodo de liquidación ");
        dvs.setTotal();
        dvs.setContigC();
        dvs.setContigP();
        
    
    }
    
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        pideEmpresas();
        PideTrabajador();
        Devengos();
        
        System.out.println("\n"
                + "\nEMPRESA\n" //sacamos por pantalla la empresa.....
                + "Empresa : ............. " + Emp.getEmpresa() + " \n"
                + "Domiciolio : ............." + Emp.getDomicilio() + " \n"
                + "CCC : ............." + Emp.getCCC() + " \n"
                + "CIF : ............." + Emp.getCIF() + " \n"
                + "---------------------------------------\n"
                + "\nTRBAJADOR\n" //sacamos por pantalla el trabajador...
                + "Trbajador : ............. " + Tbr.getTrabajador() + " \n"
                + "NIF : ............. " + Tbr.getNif() + " \n"
                + "Seg.Soc. : ............. " + Tbr.getSeguridadSocial() + " \n"
                + "Grupo profesional : ............. " + Tbr.getGProfesional() + " \n"
                + "Grupo cotización : ............. " + Tbr.getGCotizacion() + " \n"
        );
        
        System.out.println(""
                + " DEVENGOS \n"
                + "1. Percepciones salariales " + dvs.salarioBase() + " \n"
                + "     Complemetos salariales " + dvs.getComp() + " \n"
                + "                         A.Total devengado " + dvs.getTotal() + " \n"                            
        );      
        System.out.println(""
                + "1. Contingencias comunes"
                + "     Remuneracion mensual  " 
                + "     Prorrata de pagas extraodinarias"
                + "     Base incapacidad temporal "
                + "     Base de cotizacion ala S.Soc "
                + "\n"
                + "2. Contingencias Profesionales"
                + "     AT y EP  "
                + "     Desempleo "
                + "     Formación profesional"
                + "     Fondo de Garantia Salarial"
                + "\n"
                + "3. Cotizacion adicional horas extra"
                + "     Total aportación empresarial"
                + "4. BAse sujeta a retención de I.R.P.F."
                + "5. Base I.R.P.F. por retib. en especie"
                + "");

    }

}
