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
                " 1-Adaugare Autor\n" +
                " 2-Adaugare Sectiune\n" +
                " 3-Creare Abonat\n" +
                " 4-Suspendare Cont\n");

        int selection = input.nextInt();
        while (selection != 0)
        {
            switch(selection){
                case 1:
                    AdaugaAutor adaugaAutor;
                    adaugaAutor.adaugareAutor();
                    break;

                case 2:
                    System.out.println("Enter ID number");
                    break;

                case 3:
                    System.out.println("Enter amount to be credited");
                    break;
            }
            System.out.println("1. Transfer\n2.Check balance\n3.Recharge");
            selection = input.nextInt(); // add this
        }

    }
}
