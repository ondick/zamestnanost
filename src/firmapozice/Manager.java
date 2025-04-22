package firmapozice;

public class Manager extends Zamestnanec {
    private int pocetRizenychZamestnancu;
    public Manager(String jmeno, String prijmeni, String pozice, int plat,int pocetRizenychZamestnancu) {
        super(jmeno, prijmeni, pozice, plat);
        this.pocetRizenychZamestnancu=pocetRizenychZamestnancu;
    }
    public void vypisInfo(){
        System.out.println("Jmeno: " + getJmeno() + ", Příjmení: " + getPrijmeni() + ", Pozice: " + getPozice()+ ", Plat: " + getPlat()+", Počet řízených zaměstnanců: "+ pocetRizenychZamestnancu);
    }


}
