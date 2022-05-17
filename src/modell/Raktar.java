package modell;

import java.util.ArrayList;

public class Raktar {
    private ArrayList<Elelmiszer> tartalma;

    public Raktar() {
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

    @Override
    public String toString() {
        return "Raktar{" + "tartalma=" + tartalma + '}';
    }
    
    
}
