import firmapozice.Manager;
import firmapozice.Tester;
import firmapozice.Vyvojar;
import firmapozice.Zamestnanec;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> jazyky = new ArrayList<>();
        Manager manager = new Manager("Milan","Kozel","Manager", 50000,5,LocalDate.now());
        manager.vypisInfo();
        Vyvojar vyvojar= new Vyvojar("Luboš","Novotný","Vyvojar", 45000, jazyky,LocalDate.now());
        vyvojar.vypisInfo();
        Tester tester = new Tester("Kryšpýn", "Libovolný", "Tester",35000,LocalDate.now());
        for(int i =0; i<20; i++){
            tester.naselJsemNovouChybu();
        }
        tester.vypisInfo();

        List<Zamestnanec>zamestnanci = new ArrayList<Zamestnanec>();
        while(true){
            System.out.println("----Menu----");
            System.out.println("Koho chces pridat?");
            System.out.println("1.Vyvojar");
            System.out.println("2.Tester");
            System.out.println("3.Manager");
            switch(sc.nextInt()){
                case 1:
                    System.out.println("Zadej jmeno");
                    String jmenoW = sc.nextLine();
                    System.out.println("Zadej prijmeni");
                    String prijmeniW = sc.nextLine();
                    System.out.println("Zadej pozici");
                    String poziceW = sc.nextLine();
                    System.out.println("Zadej plat");
                    int platW = sc.nextInt();
                    System.out.println("Zadej kolik jazyku umi");
                    int kolikW = sc.nextInt();
                    sc.nextLine();
                    ArrayList<String> arrayList = new ArrayList<>();
                    for (int i =0; i<= kolikW; i++){
                        System.out.println("Zadej jazyk"+(i+1));
                        arrayList.add(sc.nextLine());
                    }
                    Vyvojar vyvojar1 = new Vyvojar(jmenoW, prijmeniW, poziceW, platW,jazyky,LocalDate.now());
                    zamestnanci.add(vyvojar1);
                    break;
                case 2:
                    System.out.println("Zadej jmeno");
                    String jmenoT = sc.nextLine();
                    System.out.println("Zadej prijmeni");
                    String prijmeniT = sc.nextLine();
                    System.out.println("Zadej pozici");
                    String poziceT = sc.nextLine();
                    System.out.println("Zadej plat");
                    int platT = sc.nextInt();
                    sc.nextLine();
                    Tester tester1 = new Tester(jmenoT,prijmeniT,poziceT,platT, LocalDate.now());
                    break;

                case 3:
                    System.out.println("Zadej jmeno");
                    String jmenoM = sc.nextLine();
                    System.out.println("Zadej prijmeni");
                    String prijmeniM = sc.nextLine();
                    System.out.println("Zadej pozici");
                    String poziceM = sc.nextLine();
                    System.out.println("Zadej plat");
                    int platM = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Zadej kolik ma lidi");
                    int kolikM = sc.nextInt();
                    sc.nextLine();
                    Manager manager1 = new Manager(jmenoM,prijmeniM,poziceM,platM,kolikM,LocalDate.now());
                    break;
            }


        }
    }
}