/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deducciones;

/**
 *
 * @author pablo
 */
public class deduccioneesnomina {
  private double fp = 0.10;
  private double cc  = 4.70;
  private double desempleo = 1.55;
  private double desempleodd = 1.60;
  private double irpf = 2.00;
  double totaldeducciones = 0;
  double totaldeduccionesdd = 0;
  public double fpcalc(){
    double fpcalc = fp * bccp * 100; 
    return fpcalc;   
  }
  public double cccalc(){
      double cccalc = cc * bccc * 100;
      return cccalc;
  }
  public double desempleocalc(){
      double desempleocalc = desempleo * bccp * 100;
      return desempleocalc;
  }
  public double desempleoddcalc(){
      double desempleoddcalc = desempleodd * bccp * 100;
      return desempleoddcalc;
  }
  public double irpfcalc(){
      double irpfcalc = irpf * total_dev * 100;
      return irpfcalc;
  }
  public double sumatoriodeducciones(){
     double sumatoriodeducciones = irpfcalc + desempleocalc + cccalc + fpcalc;
    double sumatoriodeduccionesdd = desempleoddcalc + irpfcalc + cccalc + fpcalc;
     return sumatoriodeducciones;
  }
}
