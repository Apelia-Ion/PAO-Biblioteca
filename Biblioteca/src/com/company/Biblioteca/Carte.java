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
    protected int nr_pagini;

    public Carte (String isbn, String titlu,Autor autor, Sectiune sectiune, String subiect, String editura, String limba, int nr_pagini){
        this.isbn=isbn;
        this.titlu=titlu;
        this.autor=autor;
        this.sectiune=sectiune;
        this.subiect=subiect;
        this.editura=editura;
    }


}

class Exemplar extends Carte{
    protected int id_exemplar;
    protected Date data_imprumut;
    protected Date data_returnare;
    protected int pret;
    protected StatusExemplar status;


    public Exemplar(String isbn, String titlu, Autor autor, Sectiune sectiune, String subiect, String editura, String limba, int nr_pagini,
    int id_exemplar, Date data_imprumut, Date data_returnare, int pret, StatusExemplar status) {
        super(isbn, titlu, autor, sectiune, subiect, editura, limba, nr_pagini);
        this.id_exemplar=id_exemplar;
        this.data_imprumut=data_imprumut;
        this.data_returnare=data_returnare;
        this.pret=pret;
        this.status=status;
    }
}
