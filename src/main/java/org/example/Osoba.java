package org.example;

public class Osoba {
    private String ime,prezime;
    public Osoba(String ime,String prezime) {
        this.ime=ime;
        this.prezime=prezime;
    }
    public Osoba(Osoba o){
        this.ime=o.ime;
        this.prezime=o.prezime;
    }
    public String toString(){
      return ime+" "+prezime;
    }
}
