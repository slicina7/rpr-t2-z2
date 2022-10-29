package org.example;

public class Racun {
    public  Osoba korisnikRacuna;
    public boolean odobrenjePrekoracenja;
    public Double stanjeRacuna;
    public Long brojRaucna;
    public Racun(Long x,Osoba o){
        this.brojRaucna=x;
        this.korisnikRacuna=new Osoba(o);
        this.stanjeRacuna=0.0;
        this.odobrenjePrekoracenja=false;
    }
    public Racun(Racun r){
        this.brojRaucna=r.brojRaucna;
        this.korisnikRacuna=r.korisnikRacuna;
        this.odobrenjePrekoracenja=r.odobrenjePrekoracenja;
        this.stanjeRacuna=r.stanjeRacuna;
    }
    private boolean provjeriOdobrenjePrekoracenja(Double x){
        return odobrenjePrekoracenja;
    }
    public boolean izvrsiUplatu(Double x){
        stanjeRacuna=stanjeRacuna+x;
        return true;
    }
    public boolean izvrsiIsplatu(Double x){
        if(stanjeRacuna<x) return false;
        stanjeRacuna=stanjeRacuna-x;
        return true;
    }
    public void odobriPrekoracenje(Double x){
        odobrenjePrekoracenja=true;
    }

}
