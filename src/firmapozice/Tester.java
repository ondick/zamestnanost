package firmapozice;

public class Tester extends Zamestnanec{
    private int pocetChyb;
    public Tester(String jmeno, String prijmeni, String pozice, int plat,int pocetChyb) {
        super(jmeno, prijmeni, pozice, plat);
        this.pocetChyb = pocetChyb;
    }
    public void naselJsemNovouChybu(){
        pocetChyb++;
    }
    public void vypisInfo(){
        System.out.println("Jmeno: " + getJmeno() + ", Příjmení: " + getPrijmeni() + ", Pozice: " + getPozice()+ ", Plat: " + getPlat()+", Počet chyb: "+ pocetChyb);
    }
}
