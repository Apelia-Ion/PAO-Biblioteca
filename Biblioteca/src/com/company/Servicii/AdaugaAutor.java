package com.company.Servicii;
import com.company.Biblioteca.*;
import java.util.Scanner;

public class AdaugaAutor {
    String nume;
    String descriere;

    public Autor citireAutor(){
        Scanner ob = new Scanner(System.in);
        System.out.println("Introduceti nume autor");
        nume = ob.nextLine();

        System.out.println("Introduceti descriere autor");
        descriere = ob.nextLine();
        Autor autorNou = new Autor(nume, descriere);
        return autorNou;
    }

    public void adaugareAutor(){

        Biblioteca.listaAutori.add(citireAutor());

    }
}
