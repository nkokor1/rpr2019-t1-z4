package ba.unsa.etf.rpr;

public class Korpa {
    private Artikl[] artikli = new Artikl[50];
    private int brojArtikala = 0;
    public boolean dodajArtikl(Artikl artikl){
        for(int i=0; i<brojArtikala; i++){
            artikli[i].IspisiArtikl();
        }
        if(brojArtikala>=50){
            return false;
        }
        else{
            artikli[brojArtikala] = new Artikl(artikl.getNaziv(), artikl.getCijena(), artikl.getKod());
            brojArtikala++;
            return true;
        }
    }
    public Artikl[] getArtikli(){
        return artikli;
    }
    public Artikl izbaciArtiklSaKodom(String kod){
        for(int i=0; i<brojArtikala; i++){
            artikli[i].IspisiArtikl();
        }
        for(int i=0; i<brojArtikala; i++){
            if(artikli[i].getKod().equals(kod)){
                Artikl pomjereni=new Artikl(artikli[i].getNaziv(), artikli[i].getCijena(), artikli[i].getKod());
                artikli[i]=null;
                for(int j=i; j<brojArtikala; j++){
                    artikli[j]=artikli[j+1];
                }
                artikli[brojArtikala]=null;
                brojArtikala--;
                return pomjereni;
            }
        }
        return null;
    }
    public int dajUkupnuCijenuArtikala(){
        int ukupnaCijena = 0;
        for(int i=0; i<brojArtikala; i++){
            ukupnaCijena += artikli[i].getCijena();
        }
        return ukupnaCijena;
    }
}
