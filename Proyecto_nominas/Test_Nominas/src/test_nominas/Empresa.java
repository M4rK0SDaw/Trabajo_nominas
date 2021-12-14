/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test_nominas;

/**
 *
 * @author Marek
 */
public class Empresa {
    private String Empresa, Domicilio, CIF, CCC;

    public String setEmpresa(String a) {
        Empresa = a;
        return Empresa;
    }

    public String getEmpresa() {
        System.out.print("Empresa:");
        return Empresa;
    }

    public String setDomicilio(String b) {
        Domicilio = b;
        return Domicilio;
    }

    public String getDomicilio() {
        System.out.print("Domicilio:");
        return Domicilio;
    }

    public String setCIF(String c) {
        CIF = c;
        return CIF;
    }

    public String getCIF() {
        System.out.print("CIF:");
        return CIF;
    }

    public String setCCC(String d) {
        CCC = d;
        return CCC;
    }

    public String getCCC() {
        System.out.print("CCC:");
        return CCC;
    }
}
