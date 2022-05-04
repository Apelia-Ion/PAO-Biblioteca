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

    public void setNume(String nume) {
        this.nume = nume;
    }

    public void setAdresa(Adresa adresa) {
        this.adresa = adresa;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }

    @Override
    public String toString() {
        return "Persoana{" +
                "nume='" + nume + '\'' +
                ", adresa=" + adresa +
                ", email='" + email + '\'' +
                ", telefon='" + telefon + '\'' +
                '}';
    }
}
