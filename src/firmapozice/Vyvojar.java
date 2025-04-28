package firmapozice;

import java.time.LocalDate;
import java.util.List;

public class Vyvojar extends Zamestnanec{
    private List<String> Jazyky;
    public Vyvojar(String jmeno, String prijmeni, String pozice, int plat, List<String> Jazyky, LocalDate datumNastupu) {
        super(jmeno, prijmeni, pozice, plat,datumNastupu);
        Jazyky = Jazyky;
    }
    public void vypisInfo(){
        super.vypisInfo();
        System.out.println("Jazyky: "+ Jazyky);;
    }
}
