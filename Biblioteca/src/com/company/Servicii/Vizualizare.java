package com.company.Servicii;
import com.company.Biblioteca.*;
import java.util.Scanner;

public  class Vizualizare {

    Scanner ob = new Scanner(System.in);
    void VizaulizareCartiDupaAutor(Autor autor){
        for (int i = 0; i <= Biblioteca.listaCarti.size(); i++){
            if (Biblioteca.listaCarti.get(i).getAutor() == autor) {
                Biblioteca.listaCarti.get(i).toString();
            }

        }
    }
    void VizualizareCartiDupaSectiune (Sectiune sectiune) {
        for (int i = 0; i <= Biblioteca.listaCarti.size(); i++){
            if (Biblioteca.listaCarti.get(i).getSectiune() == sectiune) {
                Biblioteca.listaCarti.get(i).toString();
            }

        }

    }

    void VizualizareCititori() {
        for (int i = 0; i <= Biblioteca.listaAbonati.size(); i++){

                Biblioteca.listaAbonati.get(i).toString();
        }
    }

}



