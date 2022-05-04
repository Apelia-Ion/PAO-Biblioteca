package com.company.Biblioteca;

import java.util.Date;

public class Abonat extends Cont {
    protected Date data_abonarii;

    public Abonat(String parola, Persoana persoana, Date data_abonarii, StatusCont status) {
        super(parola, persoana, status);
        this.data_abonarii = data_abonarii;
    }


}
