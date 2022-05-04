package com.company.Servicii;
import com.company.Biblioteca.*;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class AdaugaCarte {

    protected String isbn;
    protected String titlu;

    protected String numeAutor;
    protected String descriereAutor;
    protected Autor autor = new Autor(numeAutor,descriereAutor);

    protected String numeSectiune;
    protected String descriereSectiune;
    protected Sectiune sectiune = new Sectiune(numeSectiune, descriereSectiune);

    protected String subiect;
    protected String editura;
    protected String limba;
    protected int nrPagini;


    //pentru exemplar

    protected int id_exemplar;
    protected Date data_imprumut;
    protected Date data_returnare;
    protected int pret;
    protected StatusExemplar status = StatusExemplar.Disponibil;
    //

    public Carte citireCarte(){
        Scanner ob = new Scanner(System.in);
        System.out.println("Introduceti isbn");
        isbn = ob.nextLine();

        System.out.println("Introduceti titlu");
        titlu = ob.nextLine();

        System.out.println("Introduceti nume autor");
        numeAutor = ob.nextLine();
        System.out.println("Introduceti descriere autor");
        descriereAutor = ob.nextLine();
        autor = new Autor(numeAutor,descriereAutor);
        
        System.out.println("Introduceti Subiect");
        subiect = ob.nextLine();
        System.out.println("Introduceti editura");
        editura = ob.nextLine();
        System.out.println("Introduceti limba");
        limba = ob.nextLine();
        System.out.println("Introduceti nr pagini");
        nrPagini = ob.nextInt();
        Carte carteNoua = new Carte(isbn, titlu, autor, sectiune, subiect,  editura,  limba, nrPagini);
        return carteNoua;

    }
    
    public void adaugareCarte(){

        Biblioteca.listaCarti.add(citireCarte());

    }

    public Exemplar CitireExemplar(){
        citireCarte();
        Scanner ob = new Scanner(System.in);
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println("Introduceti data imprumutului");
        String dateString = ob.next();
        try {
            data_imprumut = format.parse(dateString);
        }
        catch (Exception e) {
            System.out.println("Nu s-a putut parsa data");
        }

        System.out.println("Introduceti data de returnare");
        String dateString2 = ob.next();
        try {
            data_returnare = format.parse(dateString2);
        }
        catch (Exception e) {
            System.out.println("Nu s-a putut parsa data");
        }

        System.out.println("Introduceti pretul:");
        pret = ob.nextInt();

        Exemplar exemplarNou = new Exemplar(isbn, titlu, autor, sectiune, subiect,  editura,  limba, nrPagini, data_imprumut, data_returnare, pret, status);
        return exemplarNou;
    }

    public void AdaugareExemplar(){
        Biblioteca.listaExemplare.add(CitireExemplar());
    }

}
