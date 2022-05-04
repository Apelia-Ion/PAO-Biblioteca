package com.company.Biblioteca;

public class Autor {
    protected String nume;
    protected String descriere;

    @Override
    public String toString() {
        return "Autor{" +
                "nume='" + nume + '\'' +
                ", descriere='" + descriere + '\'' +
                '}';
    }

    public Autor(String nume, String descriere){
        this.nume=nume;
        this.descriere=descriere;
    }

    public String getNume() {
        return nume;
    }

    public String getDescriere() {
        return descriere;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public void setDescriere(String descriere) {
        this.descriere = descriere;
    }
}
