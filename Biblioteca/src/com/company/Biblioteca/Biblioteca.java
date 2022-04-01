package com.company.Biblioteca;
import java.util.ArrayList;

public class Biblioteca {
    final String nume="Biblioteca Proiect";
    private static Adresa adresa = new Adresa("Bd Unirii","Bucuresti","Bucuresti","032453","Romania");
    private static Biblioteca single_instance = null;

    public static Biblioteca getInstance()
    {
        if (single_instance == null)
            single_instance = new Biblioteca(adresa);

        return single_instance;
    }

    ArrayList<Carte> listaCarti = new ArrayList<Carte>();
    ArrayList<Exemplar> listaExemplare = new ArrayList<Exemplar>();
    ArrayList<Abonat> listaAbonati = new ArrayList<Abonat>();
    ArrayList<Administrator> listaAdministratori = new ArrayList<Administrator>();
   public static ArrayList<Sectiune> listaSectiuni = new ArrayList<Sectiune>();
    ArrayList<Autor> listaAutori = new ArrayList<Autor>();


    private Biblioteca(Adresa adresa){
        this.adresa=adresa;
    }

    public Adresa getAdresa()
    {
        return adresa;
    }
}






