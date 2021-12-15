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

    private String Trabajador, Nif, SeguridadSocial, GProfesional, GCotizacion;

    public String setTrabajador(String a) {
        Trabajador = a;
        return Trabajador;
    }

    public String getTrabajador() {

        return Trabajador;
    }

    public String setNif(String b) {
        Nif = b;
        return Nif;
    }

    public String getNif() {

        return Nif;
    }

    public String setSeguridadSocial(String c) {
        SeguridadSocial = c;
        return SeguridadSocial;
    }

    public String getSeguridadSocial() {

        return SeguridadSocial;
    }

    public String setGProfesional(String d) {
        GProfesional = d;
        return Trabajador;
    }

    public String getGProfesional() {

        return GProfesional;
    }

    public String setGCotizacion(String e) {
        GCotizacion = e;
        return GCotizacion;
    }

    public String getGCotizacion() {

        return GCotizacion;
    }
}
