package com.company.Servicii;
import com.company.Biblioteca.*;
import java.util.Scanner;

public class AdaugaSectiune {
    protected String nume;
    protected String descriere;


    public Sectiune creareSectiune(){
        Scanner ob = new Scanner(System.in);
        System.out.println("Introduceti nume sectiune");
        nume = ob.nextLine();

        System.out.println("Introduceti descriere sectiune");
        descriere = ob.nextLine();
        Sectiune sectiuneNoua = new Sectiune(nume,descriere);
        return sectiuneNoua;
    }

    public void adaugareSectiune(){
        Biblioteca.listaSectiuni.add(creareSectiune());

    }



}
