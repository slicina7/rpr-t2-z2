package org.example;

import java.util.List;

public class Banka {
    private long brojRacuna;
    public List<Korisnik> korisnici;
    public List<Uposlenik> uposlenici;

    public Banka(){}
    public Korisnik kreirajNovogKorisnika(String ime, String prezime) {
        Korisnik k=new Korisnik(ime,prezime);
        korisnici.add(k);
        return k;
    }
    public Uposlenik kreirajNovogUposlenika(String ime,String prezime) {
        Uposlenik u=new Uposlenik(ime, prezime);
        uposlenici.add(u);
        return u;
    }
    public Racun kreirajRacunZaKorisnika(Korisnik k) {
        Racun r=new Racun(Long.valueOf(12345),k);
        k.dodajRacun(r);
        return r;
    }
}
