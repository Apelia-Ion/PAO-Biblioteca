package com.company;
import com.company.Biblioteca.*;
import com.company.Servicii.*;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        //instantiez clasa singleton Biblioteca ce contine liste de carti, exemplare, abonati, etc
        Biblioteca ob = Biblioteca.getInstance();


        //Meniul de operatii
        Scanner input=new Scanner(System.in);
        System.out.println("Aegeti optiunea:\n" +
                " 0-Iesire Program\n"+
                " 1-Adaugare Autor\n" +
                " 2-Adaugare Sectiune\n" +
                " 3-Creare Abonat\n" +
                " 4-Suspendare Cont\n" +
                " 5-Vizualizare carti dupa Autor\n" +
                " 6-Vizualizare carti dupa Sectiune\n" +
                " 7-Vizualizare lista abonati\n" +
                " 8-Imprumut\n");

        int selection = input.nextInt();
        while (selection != 0)
        {
            switch(selection){
                case 1:
                    AdaugaAutor adaugaAutor = new AdaugaAutor();
                    adaugaAutor.adaugareAutor();
                    break;

                case 2:
                    AdaugaSectiune adaugaSectiune = new AdaugaSectiune();
                    adaugaSectiune.adaugareSectiune();
                    break;

                case 3:
                    CreareAbonat creareAbonat = new CreareAbonat();
                    creareAbonat.adaugareAbonat();
                    break;

                case 4:
                    System.out.println("Introduceti id-ul contului:\n");
                    int id = input.nextInt();
                    SuspendareCont suspendareCont = new SuspendareCont();
                    suspendareCont.ModificareStatus(id);
                    break;

                case 5:
                    System.out.println("Introduceti autorul:\n");
                    Autor autor;
                    AdaugaAutor adaugaAutor2 = new AdaugaAutor();
                    autor = adaugaAutor2.citireAutor();
                    Vizualizare vizualizare = new Vizualizare();
                    vizualizare.VizaulizareCartiDupaAutor(autor);
                    break;

                case 6:
                    System.out.println("Introduceti sectiunea:\n");
                    Sectiune sectiune;
                    AdaugaSectiune adaugaSectiune1 = new AdaugaSectiune();
                    sectiune = adaugaSectiune1.creareSectiune();
                    Vizualizare vizualizare1 = new Vizualizare();
                    vizualizare1.VizualizareCartiDupaSectiune(sectiune);
                    break;
                case 7:
                    Vizualizare vizualizare2 = new Vizualizare();
                    vizualizare2.VizualizareCititori();
                    break;


            }
            System.out.println("Alegeti o noua optiune!\n");
            selection = input.nextInt();
        }

    }
}
