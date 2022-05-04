package com.company.Biblioteca;

import java.util.Date;

public class Exemplar extends Carte {
    protected int id_exemplar;
    protected Date data_imprumut;
    protected Date data_returnare;
    protected int pret;
    protected StatusExemplar status = StatusExemplar.Disponibil;


    public Exemplar(String isbn, String titlu, Autor autor, Sectiune sectiune, String subiect, String editura, String limba, int nrPagini,
                    Date data_imprumut, Date data_returnare, int pret, StatusExemplar status) {
        super(isbn, titlu, autor, sectiune, subiect, editura, limba, nrPagini);
        this.id_exemplar = generateid_exemplar();
        this.data_imprumut = data_imprumut;
        this.data_returnare = data_returnare;
        this.pret = pret;
        this.status = status;
    }

    public int generateid_exemplar() {
        id_exemplar = id_exemplar + 1;
        return id_exemplar;
    }

    public int getId_exemplar() {
        return id_exemplar;
    }

    public void setId_exemplar(int id_exemplar) {
        this.id_exemplar = id_exemplar;
    }

    public Date getData_imprumut() {
        return data_imprumut;
    }

    public void setData_imprumut(Date data_imprumut) {
        this.data_imprumut = data_imprumut;
    }

    public Date getData_returnare() {
        return data_returnare;
    }

    public void setData_returnare(Date data_returnare) {
        this.data_returnare = data_returnare;
    }

    public int getPret() {
        return pret;
    }

    public void setPret(int pret) {
        this.pret = pret;
    }

    public StatusExemplar getStatus() {
        return status;
    }

    public void setStatus(StatusExemplar status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Exemplar{" +
                "id_exemplar=" + id_exemplar +
                ", data_imprumut=" + data_imprumut +
                ", data_returnare=" + data_returnare +
                ", pret=" + pret +
                ", status=" + status +
                '}';
    }
}
