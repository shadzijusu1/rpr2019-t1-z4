package ba.unsa.etf.rpr;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
class ArtiklTest {

    @Test
    void getNaziv() {
    Artikl a = new Artikl("Lopta", 5, "13");
    String naziv = a.getNaziv();
    assertEquals("Lopta", naziv);
    }

    @Test
    void getKod() {
        Artikl a = new Artikl("Lopta", 5, "13");
        String kod = a.getKod();
        assertEquals("13", kod);
    }

    @Test
    void getCijena() {
        Artikl a = new Artikl("Lopta", 5, "13");
        int cijena = a.getCijena();
        assertEquals(5, cijena);
    }
}