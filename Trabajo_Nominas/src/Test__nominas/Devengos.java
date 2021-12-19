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
public class Devengos extends Trabajador {

    String per_liq;
    private final int dias_trab;
    private double salarioB;
    private double comp_sal;
    double total_dev;
    double bccc;
    double bccp;

    public Devengos() {
        per_liq = " ";
        dias_trab = 30;

    }

    public double setSalario(char sal) {
        salarioB=sal;
        switch (sal) {
            case 'A':
                salarioB = 25035.54;

                break;

            case 'B':
                salarioB = 24297.46;

                break;
            case 'C':
                salarioB = 23099.31;

                break;
            case 'D':
                salarioB = 16548.44;

                break;
            case 'E':
                salarioB = 14817.89;

                break;

        }
        return sal;
    }

    public double setComp(char comp) {
        comp_sal=comp;
        switch (comp) {
            case 'A':
                
                comp_sal = 1754.77;
                break;

            case 'B':
                
                comp_sal = 1698.13;
                break;
            case 'C':
                
                comp_sal = 1541.06;
                break;
            case 'D':
                
                comp_sal = 1167.21;
                break;
            case 'E':
                
                comp_sal = 1042.67;
                break;

        }
        return comp;
    }

    public void setTotal() {
        total_dev = salarioB + comp_sal;

    }

    public void setContigC() {
        bccc = (salarioB + comp_sal) + (salarioB / 12);
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
