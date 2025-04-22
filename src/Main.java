import firmapozice.Manager;
import firmapozice.Tester;
import firmapozice.Vyvojar;

public class Main {
    public static void main(String[] args) {
        Manager manager = new Manager("Milan","Kozel","Manager", 50000,5);
        manager.vypisInfo();
        Vyvojar vyvojar= new Vyvojar("Luboš","Novotný","Vyvojar", 45000,"Java,C++");
        vyvojar.vypisInfo();
        Tester tester = new Tester("Kryšpýn", "Libovolný", "Tester",35000,0);
        for(int i =0; i<20; i++){
            tester.naselJsemNovouChybu();
        }
        tester.vypisInfo();
    }
}