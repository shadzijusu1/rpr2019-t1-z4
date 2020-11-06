package ba.unsa.etf.rpr;

public class Supermarket {
    private Artikl[] artikliUSupermarketu = new Artikl[1000];
    private int brojArtikalaUSupermarketu;

    public void dodajArtikl(Artikl a) {
        artikliUSupermarketu[brojArtikalaUSupermarketu] = new Artikl(a.getNaziv(), a.getCijena(), a.getKod());
        brojArtikalaUSupermarketu++;
    }

    public Artikl izbaciArtiklSaKodom(String kod) {
        Artikl a = null;
        for(int i = 0; i < brojArtikalaUSupermarketu; i++) {
            if(artikliUSupermarketu[i].getKod().equals(kod)) {
                a = artikliUSupermarketu[i];
                brojArtikalaUSupermarketu--;
                for(int j = i; j < brojArtikalaUSupermarketu; j++)
                    artikliUSupermarketu[j] = artikliUSupermarketu[j+1];
            }
        }
        return a;
    }

    public Artikl[] getArtikli() {
        return artikliUSupermarketu;
    }
}
