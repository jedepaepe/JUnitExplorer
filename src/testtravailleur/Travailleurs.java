
package testtravailleur;

import java.util.LinkedList;

/**
 *
 * @author jedepaepe
 */
public class Travailleurs extends LinkedList<Travailleur>{
    public String print() {
        String print = "";
        for(Travailleur t : this) {
            print = t.getPrenom() + " " + t.getNom() + "\n";
        }
        return print;
    }
}
