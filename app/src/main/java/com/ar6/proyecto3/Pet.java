package com.ar6.proyecto3;

public class Pet {

    private String varNombre;
    private int varRanking;
    private int varEdad;

    public Pet() {
    }

    public Pet(String varNombre, int varRanking, int varEdad) {
        this.varNombre = varNombre;
        this.varRanking = varRanking;
        this.varEdad = varEdad;
    }

    public String getVarNombre() {
        return varNombre;
    }

    public void setVarNombre(String varNombre) {
        this.varNombre = varNombre;
    }

    public int getVarRanking() {
        return varRanking;
    }

    public void setVarRanking(int varRanking) {
        this.varRanking = varRanking;
    }

    public int getVarEdad() {
        return varEdad;
    }

    public void setVarEdad(int varEdad) {
        this.varEdad = varEdad;
    }

}
