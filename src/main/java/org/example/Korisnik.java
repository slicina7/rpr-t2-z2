package org.example;

public class Korisnik extends Osoba{
    private Racun racun;

    public Korisnik(String ime, String prezime) {
        super(ime,prezime);
    }
    public void dodajRacun(Racun x) {
        racun=new Racun(x);
    }
}
