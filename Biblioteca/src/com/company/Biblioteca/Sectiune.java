package com.company.Biblioteca;

public class Sectiune {
    protected int id=0;
    protected String nume;
    protected String descriere;

    public Sectiune (String nume, String descriere){
        this.id=generateid();
        this.nume=nume;
        this.descriere=descriere;
    }

    public int generateid(){
        id=id+1;
        return id;
    }
}
