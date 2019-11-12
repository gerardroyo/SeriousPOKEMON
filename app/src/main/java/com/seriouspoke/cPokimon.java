package com.seriouspoke;

public class cPokimon {

    private String numPokedex;
    private String nombre;
    private String tipo1;
    private String tipo2 = "";
    //private String habilidad;
    //private String habOculta;
    //private double peso;
    //private double altura;
    //private String generoM;
    //private String generoF;
    //private String habitat;

    public cPokimon (String sNumPokedex, String sNombre, String sTipo1, String sTipo2) {
        numPokedex = sNumPokedex;
        nombre = sNombre;
        tipo1 = sTipo1;
        tipo2 = sTipo2;
    }

    public String getNumPokedex() { return numPokedex; }

    public void setNumPokedex(String numPokedex) { this.numPokedex = numPokedex; }

    public String getNombre() { return nombre; }

    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getTipo1() { return tipo1; }

    public void setTipo1(String tipo1) { this.tipo1 = tipo1; }

    public String getTipo2() { return tipo2; }

    public void setTipo2(String tipo2) { this.tipo2 = tipo2; }
}
