package com.company.Biblioteca;
import java.util.ArrayList;

public class Biblioteca {
    final String nume="Biblioteca Proiect";
    private static Adresa adresa = new Adresa("Bd Unirii","Bucuresti","Bucuresti","032453","Romania");
    private static Biblioteca singleInstance = null;

    public static Biblioteca getInstance()
    {
        if (singleInstance == null)
            singleInstance = new Biblioteca(adresa);

        return singleInstance;
    }

    public static ArrayList<Carte> listaCarti = new ArrayList<>();
    public static ArrayList<Exemplar> listaExemplare = new ArrayList<>();
    public static ArrayList<Abonat> listaAbonati = new ArrayList<>();
    public static ArrayList<Administrator> listaAdministratori = new ArrayList<>();
    public static ArrayList<Sectiune> listaSectiuni = new ArrayList<>();
    public static ArrayList<Autor> listaAutori = new ArrayList<>();


    private Biblioteca(Adresa adresa){
        this.adresa=adresa;
    }

    public Adresa getAdresa()
    {
        return adresa;
    }
}






