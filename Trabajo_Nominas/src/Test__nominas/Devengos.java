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
public class Devengos {

    String per_liq;
    private final int dias_trab;
    private final double salarioB;
    private final double comp_sal;
    double total_dev;
    double bccc;
    double bccp;
    int pagas;

    public Devengos() {
        per_liq = " ";
        dias_trab = 30;
        salarioB = 25035.54;
        comp_sal = 1754.77;
        pagas = 2;

    }

    public void setTotal() {
        total_dev = salarioB + comp_sal;

    }

    public void setContigC() {
        bccc = (salarioB + comp_sal) + (salarioB * pagas / 12);
    }

    public void setContigP() {
        bccp = bccc;

    }

    public double getSalario() {
        return salarioB;
    }

    public double getComp() {
        return comp_sal;
    }

    public double getTotal() {

        return total_dev;
    }

    public double getDiasTrab() {
        return dias_trab;
    }

    public double getContigC() {

        return bccc;
    }

    public double getContigP() {

        return bccp;
    }

}
