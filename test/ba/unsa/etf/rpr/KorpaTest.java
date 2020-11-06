package ba.unsa.etf.rpr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class KorpaTest {
    @Test
    void izbaciArtiklSKodom() {
    Korpa k = new Korpa();
    Artikl a = new Artikl("Lopta", 5, "13");
    Artikl b = new Artikl("Biciklo", 1000, "20");
    Artikl c = new Artikl("Skije", 5000, "7");
    k.dodajArtikl(a);
    k.dodajArtikl(b);
    k.dodajArtikl(c);
    k.izbaciArtiklSaKodom(a.getKod());
    Artikl[] artikli = k.getArtikli();
    assertEquals(b, artikli[0]);
    }
    @Test
    void dajUkupnuCijenuArtikla() {
    Korpa k = new Korpa();
    Artikl a = new Artikl("Lopta", 5, "13");
    Artikl b = new Artikl("Biciklo", 1000, "7");
    k.dodajArtikl(a);
    k.dodajArtikl(b);
    int ukupno = k.dajUkupnuCijenuArtikala();
    assertEquals(1005, ukupno);
    }
    @Test
    void getBrojArtikalaUKorpi() {
        Korpa k = new Korpa();
        Artikl a = new Artikl("Lopta", 5, "13");
        Artikl b = new Artikl("Biciklo", 1000, "7");
        k.dodajArtikl(a);
        k.dodajArtikl(b);
        assertEquals(2, k.getBrojArtikalaUKorpi());
    }
    @Test
    void dodajArtikl() {
        Korpa k = new Korpa();
        Artikl a = new Artikl("Lopta", 5, "13");
        k.dodajArtikl(a);
        Artikl[] artikli = k.getArtikli();
        assertEquals(a, artikli[0]);
    }
}