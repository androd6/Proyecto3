package com.ar6.proyecto3;

public class Pet {

    private String varNombre;
    private int varRanking;
    private int varEdad;
    private int varFoto;
    private byte varID;

    public Pet() {
    }

    public Pet(String varNombre, int varRanking, int varEdad, int varFoto, byte varID) {
        this.varNombre = varNombre;
        this.varRanking = varRanking;
        this.varEdad = varEdad;
        this.varFoto = varFoto;
        this.varID = varID;
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

    public int getVarFoto() {
        return varFoto;
    }

    public void setVarFoto(int varFoto) {
        this.varFoto = varFoto;
    }

    public byte getVarID() {
        return varID;
    }

    public void setVarID(byte varID) {
        this.varID = varID;
    }

}
