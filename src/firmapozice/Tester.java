package firmapozice;

import java.time.LocalDate;

public class Tester extends Zamestnanec{
    private int pocetChyb = 0;
    public Tester(String jmeno, String prijmeni, String pozice, int plat, LocalDate datumNastupu) {
        super(jmeno, prijmeni, pozice, plat, datumNastupu);
    }
    public void naselJsemNovouChybu(){
        pocetChyb++;
    }
    public void vypisInfo(){
        super.vypisInfo();
        System.out.println("Počet chyb: "+ pocetChyb);
    }
}
