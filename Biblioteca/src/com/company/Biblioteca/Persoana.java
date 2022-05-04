package com.company.Biblioteca;

public class Persoana {
    private String nume;
    private Adresa adresa;
    private String email;
    private String telefon;

    public Persoana( String nume, Adresa adresa, String email, String telefon){
        this.nume=nume;
        this.adresa=adresa;
        this.email=email;
        this.telefon=telefon;
    }

    public String getNume(){
        return nume;
    }
    public Adresa getAdresa(){
        return adresa;
    }
    public String getEmail(){
        return email;
    }
    public String getTelefon(){
        return telefon;
    }
}
