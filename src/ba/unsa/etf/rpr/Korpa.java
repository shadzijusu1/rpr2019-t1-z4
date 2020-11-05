package ba.unsa.etf.rpr;
public class Korpa {
    private Artikl[] artikliUKorpi = new Artikl[50];
    private int brojArtikalaUKorpi;

    public boolean dodajArtikl(Artikl a) {
        artikliUKorpi[brojArtikalaUKorpi] = a;
        brojArtikalaUKorpi++;
        return true;
    }

    public Artikl[] getArtikli() {
        return artikliUKorpi;
    }

    public Artikl izbaciArtiklSaKodom(String kod) {
        Artikl a = null;
        for(int i = 0; i < brojArtikalaUKorpi; i++) {
            if(artikliUKorpi[i].getKod().equals(kod)) {
                a = artikliUKorpi[i];
                brojArtikalaUKorpi--;
                if (brojArtikalaUKorpi - i >= 0)
                    System.arraycopy(artikliUKorpi, i + 1, artikliUKorpi, i, brojArtikalaUKorpi - i);
            }
        }
        return a;
    }

    public int dajUkupnuCijenuArtikala() {
        int ukupno = 0;
        for(int i = 0; i < brojArtikalaUKorpi; i++)
            ukupno = ukupno + artikliUKorpi[i].getCijena();
        return ukupno;
    }
    public int getBrojArtikalaUKorpi() {
        return brojArtikalaUKorpi;
    }

}
