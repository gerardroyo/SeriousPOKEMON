package com.seriouspoke;

public class cPokimon {

    private String numPokedex;
    private String nombre;
    private String tipo1;
    private String tipo2 = "";
    private String habilidad;
    private String habOculta;
    private double peso;
    private double altura;
    private String generoM;
    private String generoF;
    private String habitat;

    public cPokimon(String sNumPokedex, String sNombre, String sTipo1, String sTipo2, String sHabilidad, String sHabOculta, double sPeso, double sAltura, String sGeneroM, String sGeneroF, String sHabitat) {
        numPokedex = sNumPokedex;
        nombre = sNombre;
        tipo1 = sTipo1;
        tipo2 = sTipo2;
        habilidad = sHabilidad;
        habOculta = sHabOculta;
        peso = sPeso;
        altura = sAltura;
        generoM = sGeneroM;
        generoF = sGeneroF;
        habitat = sHabitat;
    }

    public String getNumPokedex() { return numPokedex; }

    public void setNumPokedex(String numPokedex) { this.numPokedex = numPokedex; }

    public String getNombre() { return nombre; }

    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getTipo1() { return tipo1; }

    public void setTipo1(String tipo1) { this.tipo1 = tipo1; }

    public String getTipo2() { return tipo2; }

    public void setTipo2(String tipo2) { this.tipo2 = tipo2; }

    public String getHabilidad() { return habilidad; }

    public void setHabilidad(String habilidad) { this.habilidad = habilidad; }

    public String getHabOculta() { return habOculta; }

    public void setHabOculta(String habOculta) { this.habOculta = habOculta; }

    public double getPeso() { return peso; }

    public void setPeso(double peso) { this.peso = peso; }

    public double getAltura() { return altura; }

    public void setAltura(double altura) { this.altura = altura; }

    public String getGeneroM() { return generoM; }

    public void setGeneroM(String generoM) { this.generoM = generoM; }

    public String getGeneroF() { return generoF; }

    public void setGeneroF(String generoF) { this.generoF = generoF; }

    public String getHabitat() { return habitat; }

    public void setHabitat(String habitat) { this.habitat = habitat; }
}
