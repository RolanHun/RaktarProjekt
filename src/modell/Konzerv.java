package modell;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDate;

public class Konzerv extends Elelmiszer{
    private String leiras, receptLeiras;

    public Konzerv(String leiras, String receptLeiras, String nev, String gyarto, LocalDate lejarat) {
        super(nev, gyarto, lejarat);
        this.leiras = leiras;
        this.receptLeiras = receptLeiras;
    }

    public Konzerv(String leiras, String receptLeiras, String nev, String gyarto) {
        super(nev, gyarto);
        this.leiras = leiras;
        this.receptLeiras = receptLeiras;
    }
    
    
    public void receptetMutat(){
        if(Files.exists(Paths.get(receptLeiras))){
            System.out.println("Létezik");
        }
        else{
            System.out.println("Nem létezik");
        }
    }

    @Override
    public String toString() {
        return "\n" + "Konzerv{" + "nev=" + this.getNev() + ", gyarto=" + this.getGyarto() + ", lejarat=" + this.getLejarat() + ", leiras=" + leiras + ", receptLeiras=" + receptLeiras  + '}';
    }
    
}
