package com.company.Biblioteca;
import java.util.Date;

public abstract class Cont {
    protected String id;
    protected String parola;
    protected Persoana persoana;

    public Cont(String id, String parola, Persoana persoana){
        this.id=id;
        this.parola=parola;
        this.persoana=persoana;
    }

}

class Abonat extends Cont {
    protected Date data_abonarii;
    protected int total_carti;

    public Abonat (String id, String parola, Persoana persoana, Date data_abonarii, int total_carti){
        super(id,parola,persoana);
        this.data_abonarii=data_abonarii;
        this.total_carti=total_carti;
    }

}

class Administrator extends Cont {

    public Administrator(String id, String parola, Persoana persoana) {
        super(id, parola, persoana);
    }
}
