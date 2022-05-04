package com.company.Servicii;
import com.company.Biblioteca.*;
import java.util.Scanner;

//caut id-ul contului pe care doresc sa il suspend si ii schimb statusul in inchis.
public class SuspendareCont {
    int id = citireId();

    public int citireId(){
        Scanner ob = new Scanner(System.in);
        System.out.println("Introduceti id-ul contului de inchis: ");
        id = ob.nextInt();
        return id;
    }

    public void ModificareStatus(int id) {
        for (int i = 0; i <= Biblioteca.listaAbonati.size(); i++){
            if (Biblioteca.listaAbonati.get(i).getId() == id){
                Biblioteca.listaAbonati.get(i).setStatus(StatusCont.Inchis);
            }
        }
    }

}
