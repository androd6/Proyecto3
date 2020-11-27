package com.ar6.proyecto3;

import java.util.ArrayList;

public class CreatePet {

    private ArrayList<Pet> varPets = new ArrayList<Pet>();

    public CreatePet() {

        try {

            varPets.add(new Pet("Lukas", 0, 1,"@drawable/pet1.jpg", (byte) 1));
            varPets.add(new Pet("Matias", 0, 3,"@drawable/pet3.jpg", (byte) 2));
            varPets.add(new Pet("Candy", 0, 1,"@drawable/pet2.jpg", (byte) 3));
            varPets.add(new Pet("Trosky", 0, 4,"@drawable/pet5.jpg", (byte) 4));
            varPets.add(new Pet("Turqueza", 0, 4,"@drawable/pet7.jpg", (byte) 5));
            varPets.add(new Pet("Spok", 0, 1,"@drawable/pet8.jpg", (byte) 6));
            varPets.add(new Pet("sakura", 0, 2,"@drawable/pet9.jpg", (byte) 7));
            varPets.add(new Pet("Pulgitas", 0, 1,"@drawable/pet6.jpg", (byte) 8));
        }
        catch (Exception ex){

        }
    }

    public ArrayList<Pet> getVarPets() {
        return varPets;
    }

    public void setVarPets(ArrayList<Pet> varPets) {
        this.varPets = varPets;
    }
}
