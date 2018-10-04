package model;

public class Animal {
    private String especie;
    private String caracteristica;

    public Animal() {
    }

    public Animal(String especie, String caracteristica) {

        this.especie = especie;
        this.caracteristica = caracteristica;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getCaracteristica() {
        return caracteristica;
    }

    public void setCaracteristica(String caracteristica) {
        this.caracteristica = caracteristica;
    }
}
