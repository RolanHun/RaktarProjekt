package modell;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class Raktar {
    private ArrayList<Elelmiszer> tartalma;

    public Raktar() {
        this.tartalma = new ArrayList<>();
    }
    
    public void felvesz(Elelmiszer elelmiszer){
        tartalma.add(elelmiszer);
    }
    
    public void nevSzerint(){
        ArrayList<String> nevszerint = new ArrayList<>();
        for(int i = 0; i < tartalma.size(); i++){
                nevszerint.add(tartalma.get(i).getNev());
            }
        
        nevszerint.sort(String::compareToIgnoreCase);
        
        System.out.println("Név szerint rendezve:\n");
        for (String string : nevszerint) {
            System.out.println(string);
            }
        System.out.println("");
    }
    
    public void kiir() throws FileNotFoundException, IOException{
        try (ObjectOutputStream objKi = new ObjectOutputStream(new FileOutputStream("raktar.bin"))) {
            objKi.writeObject(this);
        }    
    }

    @Override
    public String toString() {
        return "Raktar{" + "tartalma=" + tartalma + '}';
    }
    
    
}
