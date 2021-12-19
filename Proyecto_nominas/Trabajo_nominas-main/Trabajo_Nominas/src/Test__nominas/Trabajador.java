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
public class Trabajador {

    private String Trabajador, Nif, SeguridadSocial, GCotizacion;
    private char GProfesional;

    public void setTrabajador(String a) {
        Trabajador = a;
    }

    public String getTrabajador() {
        return Trabajador;
    }

    public void setNif(String b) {
        Nif = b;
    }

    public String getNif() {
        return Nif;
    }

    public void setSeguridadSocial(String c) {
        SeguridadSocial = c;
    }

    public String getSeguridadSocial() {
        return SeguridadSocial;
    }

    public void setGProfesional(char d) {
        GProfesional = d;
    }

    public char getGProfesional() {
        return GProfesional;
    }

    public void setGCotizacion(String e) {
        GCotizacion = e;
    }

    public String getGCotizacion() {
        return GCotizacion;
    }
}
