package main;

import java.time.LocalDate;
import modell.Konzerv;
import modell.Raktar;

class Program {

    public static void main(String[] args) {
        Raktar r1 = new Raktar();
        r1.felvesz(new Konzerv("leiras", "fájl", "5konz", "senki", LocalDate.now().plusYears(10)));
        r1.felvesz(new Konzerv("leiras", "fájl", "2konz", "senki", LocalDate.now().plusYears(50)));
        r1.felvesz(new Konzerv("leiras", "fájl", "1konz", "senki"));
        
        System.out.println(r1+"\n");
        
        r1.nevSzerint();
    }
    
}
