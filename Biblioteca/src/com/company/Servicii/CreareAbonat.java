package com.company.Servicii;
import com.company.Biblioteca.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.text.ParseException;


public class CreareAbonat {
    String id;
    String parola;

    private String nume;

    String strada;
    String oras;
    String judet;
    String codPostal;
    String tara;
    private Adresa adresa = new Adresa(strada,oras,judet,codPostal,tara);

    private String email;
    private String telefon;
    Persoana persoana = new Persoana(nume,adresa,email,telefon);

    Date data_abonarii;
    StatusCont status = StatusCont.Activ ;


    public void citireAbonat(){
        Scanner ob = new Scanner(System.in);
        System.out.println("Introduceti date persoana: nume,\n" +
                " adresa(strada,  oras,  judet,  codPostal,  tara)\n" +
                " email, telefon");
        nume = ob.nextLine();
        strada = ob.nextLine();
        oras = ob.nextLine();
        judet = ob.nextLine();
        codPostal = ob.nextLine();
        tara = ob.nextLine();
        email = ob.nextLine();
        telefon = ob.nextLine();
        System.out.println("Introduceti parola");
        parola = ob.nextLine();
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println("Introduceti data abonarii");
        String dateString = ob.next();
        try {
            data_abonarii = format.parse(dateString);
        }
        catch (Exception e) {
            System.out.println("Nu s-a putut parsa data");
        }

    }

    public void adaugareAbonat(){
        citireAbonat();
        Abonat abonatNou = new Abonat( parola, persoana, data_abonarii, status);
        Biblioteca.listaAbonati.add(abonatNou);

    }

}
