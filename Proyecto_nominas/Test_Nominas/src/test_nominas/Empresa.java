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
        
        return Empresa;
    }

    public void setDomicilio(String b) {
        Domicilio = b;
    }

    public String getDomicilio() {
        return Domicilio;
    }

    public void setCIF(String c) {
        CIF = c;
    }

    public String getCIF() {    
        return CIF;
    }

    public void setCCC(String d) {
        CCC = d;
    }

    public String getCCC() {      
        return CCC;
    }
}
