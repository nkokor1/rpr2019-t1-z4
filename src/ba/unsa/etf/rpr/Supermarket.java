package ba.unsa.etf.rpr;

public class Supermarket {
    private Artikl[] artikli = new Artikl[1000];
    private int brojArtikalaUSuperMarketu = 0;
    public boolean dodajArtikl(Artikl artikl){
        if(brojArtikalaUSuperMarketu>=1000){
            return false;
        } else {
            artikli[brojArtikalaUSuperMarketu] = new Artikl(artikl.getNaziv(), artikl.getCijena(), artikl.getKod());
            brojArtikalaUSuperMarketu++;
            return true;
        }
    }
    public Artikl[] getArtikli(){
        return artikli;
    }
    public Artikl izbaciArtiklSaKodom(String kod){
        for(int i=0; i<brojArtikalaUSuperMarketu; i++){
            if(artikli[i].getKod().equals(kod)){
                Artikl novi = new Artikl (artikli[i].getNaziv(), artikli[i].getCijena(), artikli[i].getKod());
                artikli[i]=null;
                for(int j=i; j<brojArtikalaUSuperMarketu; j++){
                    artikli[j]=artikli[j+1];
                }
                artikli[brojArtikalaUSuperMarketu]=null;
                brojArtikalaUSuperMarketu--;
                return novi;
            }
        }
        return null;
    }
}
