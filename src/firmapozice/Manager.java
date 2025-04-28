package firmapozice;

import java.time.LocalDate;

public class Manager extends Zamestnanec {
    private int pocetRizenychZamestnancu;
    public Manager(String jmeno, String prijmeni, String pozice, int plat, int pocetRizenychZamestnancu, LocalDate datumNastupu) {
        super(jmeno, prijmeni, pozice, plat, datumNastupu);
        this.pocetRizenychZamestnancu=pocetRizenychZamestnancu;
    }
    public void vypisInfo(){
        super.vypisInfo();
        System.out.println("Počet řízených zaměstnanců: "+ pocetRizenychZamestnancu);
    }
    public void priradZamestnance(){
        pocetRizenychZamestnancu++;
        System.out.println(pocetRizenychZamestnancu);
    }

}
