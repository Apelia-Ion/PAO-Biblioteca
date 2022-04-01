package com.company.Servicii;
import com.company.Biblioteca.*;
import java.util.Scanner;

public class AdaugaCarte {

    protected String isbn;
    protected String titlu;
    protected Autor autor;
    protected String numeautor;
    protected String descriereautor;
    protected Sectiune sectiune;
    protected String subiect;
    protected String editura;
    protected String limba;
    protected int nr_pagini;

    public void creareCarte(){
        Scanner ob = new Scanner(System.in);
        System.out.println("Introduceti isbn");
        isbn = ob.nextLine();

        System.out.println("Introduceti titlu");
        titlu = ob.nextLine();

        //AdaugaSectiune.creareSectiune();

        System.out.println("Introduceti nume autor");
        numeautor = ob.nextLine();
        System.out.println("Introduceti descriere autor");
        descriereautor = ob.nextLine();
        autor = new Autor(numeautor,descriereautor);



        System.out.println("Introduceti Subiect");
        subiect = ob.nextLine();
        System.out.println("Introduceti editura");
        editura = ob.nextLine();
        System.out.println("Introduceti limba");
        limba = ob.nextLine();
        System.out.println("Introduceti nr pagini");
        nr_pagini = ob.nextInt();


    }
    //Carte carteNoua = new Carte(isbn, titlu, autor,);


}
