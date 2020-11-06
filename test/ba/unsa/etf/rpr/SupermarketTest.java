package ba.unsa.etf.rpr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SupermarketTest {
    @Test
    void dodajArtikl() {
        Supermarket s = new Supermarket();
        Artikl a = new Artikl("Lopta", 5, "13");
        s.dodajArtikl(a);
        Artikl[] artikli = s.getArtikli();
        assertEquals(a.getNaziv(), artikli[0].getNaziv());
    }

    @Test
    void izbaciArtiklSkodom() {
        Supermarket s = new Supermarket();
        Artikl a = new Artikl("Lopta", 5, "13");
        Artikl b = new Artikl("Biciklo", 1000, "7");
        s.dodajArtikl(a);
        s.dodajArtikl(b);
        s.izbaciArtiklSaKodom(a.getKod());
        Artikl[] artikli = s.getArtikli();
        assertEquals(b.getNaziv(), artikli[0].getNaziv());
    }
}