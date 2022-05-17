package modell;

import java.time.LocalDate;


public abstract class Elelmiszer {
    private String nev, gyarto;
    private LocalDate lejarat;

    public Elelmiszer(String nev, String gyarto) {
        this(nev, gyarto, LocalDate.now().plusYears(1));
    }

    public Elelmiszer(String nev, String gyarto, LocalDate lejarat) {
        this.nev = nev;
        this.gyarto = gyarto;
        this.lejarat = lejarat;
    }

    public String getNev() {
        return nev;
    }

    public String getGyarto() {
        return gyarto;
    }

    public LocalDate getLejarat() {
        return lejarat;
    }
    
    
}
