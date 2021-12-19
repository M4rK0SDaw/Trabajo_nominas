/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test__nominas;

/**
 *
 * @author marqu
 */
public class Empresa {

    private String Empresa, Domicilio, CIF;
    private int CCC;

    public void setEmpresa(String a) {
        Empresa = a;

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

    public void setCCC(int d) {
        CCC = d;
    }

    public int getCCC() {

        return CCC;
    }
}
