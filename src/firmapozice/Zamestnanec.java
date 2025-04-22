package firmapozice;

public class Zamestnanec {
    private String jmeno;
    private String prijmeni;
    private String pozice;
    private int plat;
    public Zamestnanec(String jmeno, String prijmeni, String pozice, int plat) {
        this.jmeno = jmeno;
        this.prijmeni = prijmeni;
        this.pozice = pozice;
        this.plat = plat;
    }
    public void vypisInfo(){
        System.out.println("Jmeno: " + jmeno + ", Příjmení: " + prijmeni + ", Pozice: " + pozice+ ", Plat: " + plat);
    }

    public String getJmeno() {
        return jmeno;
    }

    public String getPrijmeni() {
        return prijmeni;
    }

    public String getPozice() {
        return pozice;
    }

    public int getPlat() {
        return plat;
    }

    public void setJmeno(String jmeno) {
        this.jmeno = jmeno;
    }

    public void setPrijmeni(String prijmeni) {
        this.prijmeni = prijmeni;
    }

    public void setPozice(String pozice) {
        this.pozice = pozice;
    }

    public void setPlat(int plat) {
        this.plat = plat;
    }
}
