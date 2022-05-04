package com.company.Biblioteca;
import java.util.Date;

public abstract class Cont {
    protected static int id;
    protected String parola;
    protected Persoana persoana;
    protected StatusCont status;

    public Cont(String id, String parola, Persoana persoana, StatusCont status){
        this.id=generateid();
        this.parola=parola;
        this.persoana=persoana;
        this.status=status;

    }

    public void setStatus(StatusCont status) {
        this.status = status;
    }

    public Cont(String parola, Persoana persoana, StatusCont status) {
        this.id=generateid();
        this.parola = parola;
        this.persoana = persoana;
        this.status=status;
    }

    public static int getId() {
        return id;
    }

    public String getParola() {
        return parola;
    }

    public Persoana getPersoana() {
        return persoana;
    }

    public StatusCont getStatus() {
        return status;
    }

    public int generateid(){
        id=id+1;
        return id;
    }

}

class Administrator extends Cont {

    public Administrator(String id, String parola, Persoana persoana, StatusCont status) {

        super(id, parola, persoana, status);
    }
}
