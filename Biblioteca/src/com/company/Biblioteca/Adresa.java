package com.company.Biblioteca;

public class Adresa {
protected String strada;
protected String oras;
protected String judet;
protected String codPostal;
protected String tara;

public Adresa (String strada, String oras, String judet, String codPostal, String tara){
    this.strada=strada;
    this.oras=oras;
    this.judet=judet;
    this.codPostal=codPostal;
    this.tara=tara;
}

    public String getStrada() {
        return strada;
    }

    public void setStrada(String strada) {
        this.strada = strada;
    }

    public String getOras() {
        return oras;
    }

    public void setOras(String oras) {
        this.oras = oras;
    }

    public String getJudet() {
        return judet;
    }

    public void setJudet(String judet) {
        this.judet = judet;
    }

    public String getCodPostal() {
        return codPostal;
    }

    public void setCodPostal(String codPostal) {
        this.codPostal = codPostal;
    }

    public String getTara() {
        return tara;
    }

    public void setTara(String tara) {
        this.tara = tara;
    }

    @Override
    public String toString() {
        return "Adresa{" +
                "strada='" + strada + '\'' +
                ", oras='" + oras + '\'' +
                ", judet='" + judet + '\'' +
                ", codPostal='" + codPostal + '\'' +
                ", tara='" + tara + '\'' +
                '}';
    }
}
