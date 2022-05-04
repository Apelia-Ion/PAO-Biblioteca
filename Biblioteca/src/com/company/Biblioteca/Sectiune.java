package com.company.Biblioteca;

public class Sectiune {
    protected static int id=0;
    protected String nume;
    protected String descriere;

    @Override
    public String toString() {
        return "Sectiune{" +
                "nume='" + nume + '\'' +
                ", descriere='" + descriere + '\'' +
                '}';
    }

    public Sectiune (String nume, String descriere){
        this.id=generateid();
        this.nume=nume;
        this.descriere=descriere;
    }

    public static int getId() {
        return id;
    }

    public static void setId(int id) {
        Sectiune.id = id;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getDescriere() {
        return descriere;
    }

    public void setDescriere(String descriere) {
        this.descriere = descriere;
    }

    public int generateid(){
        id=id+1;
        return id;
    }
}
