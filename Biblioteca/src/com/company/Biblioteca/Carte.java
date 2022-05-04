package com.company.Biblioteca;
import java.util.Date;

public class Carte {
    protected String isbn;
    protected String titlu;
    protected Autor autor;
    protected Sectiune sectiune;
    protected String subiect;
    protected String editura;
    protected String limba;
    protected int nrPagini;

    public Carte (String isbn, String titlu,Autor autor, Sectiune sectiune, String subiect, String editura, String limba, int nrPagini){
        this.isbn=isbn;
        this.titlu=titlu;
        this.autor=autor;
        this.sectiune=sectiune;
        this.subiect=subiect;
        this.editura=editura;
    }


    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitlu() {
        return titlu;
    }

    public void setTitlu(String titlu) {
        this.titlu = titlu;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public Sectiune getSectiune() {
        return sectiune;
    }

    public void setSectiune(Sectiune sectiune) {
        this.sectiune = sectiune;
    }

    public String getSubiect() {
        return subiect;
    }

    public void setSubiect(String subiect) {
        this.subiect = subiect;
    }

    public String getEditura() {
        return editura;
    }

    public void setEditura(String editura) {
        this.editura = editura;
    }

    public String getLimba() {
        return limba;
    }

    public void setLimba(String limba) {
        this.limba = limba;
    }

    public int getnrPagini() {
        return nrPagini;
    }

    public void setnrPagini(int nrPagini) {
        this.nrPagini = nrPagini;
    }

    @Override
    public String toString() {
        return "Carte{" +
                "isbn='" + isbn + '\'' +
                ", titlu='" + titlu + '\'' +
                ", autor=" + autor +
                ", sectiune=" + sectiune +
                ", subiect='" + subiect + '\'' +
                ", editura='" + editura + '\'' +
                ", limba='" + limba + '\'' +
                ", nrPagini=" + nrPagini +
                '}';
    }
}

