package ba.unsa.etf.rpr;

public class Artikl {
    private String naziv;
    private String kod;
    private int cijena;

    public Artikl(String naziv, int cijena, String kod){
        this.naziv=naziv; this.kod=kod; this.cijena=cijena;
    }
    public String getNaziv() {
        return naziv;
    }
    public int getCijena(){
        return cijena;
    }
    public String getKod() {
        return kod;
    }
    public void IspisiArtikl() {
        System.out.print(naziv);
        System.out.println(" " + kod);
    }
}
