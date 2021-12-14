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
public class Trabajador {
    private String Trabajador, Nif, SeguridadSocial, GProfesional, GCotizacion;

    public String setTrabajador(String a) {
        Trabajador = a;
        return Trabajador;
    }

    public String getTrabajador() {
        System.out.print("Trabajador:");
        return Trabajador;
    }

    public String setNif(String b) {
        Nif = b;
        return Nif;
    }

    public String getNif() {
        System.out.print("Nif:");
        return Nif;
    }

    public String setSeguridadSocial(String c) {
        SeguridadSocial = c;
        return SeguridadSocial;
    }

    public String getSeguridadSocial() {
        System.out.print("SeguridadSocial:");
        return SeguridadSocial;
    }

    public String setGProfesional(String d) {
        GProfesional = d;
        return Trabajador;
    }

    public String getGProfesional() {
        System.out.print("GProfesional:");
        return GProfesional;
    }

    public String setGCotizacion(String e) {
        GCotizacion = e;
        return GCotizacion;
    }

    public String getGCotizacion() {
        System.out.print("GCotizacion:");
        return GCotizacion;
    }
}
