/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package testtravailleur;

import java.util.LinkedList;

/**
 *
 * @author localwsp
 */
public class TravailleurList {
    public static void main(String[] args) {
        LinkedList o = new LinkedList();
        o.add(new Travailleur("Vincent", "Castanie", 230));
        o.add(new Travailleur("Macia", "Chaufontaine", 230));
        o.add(new Travailleur("Christian", "Gerts", 230));
        o.add(new Travailleur("Michael", "Chouffe", 230));
        
        for(Object all : o ) {
            Travailleur extract = (Travailleur) all;
            System.out.println(extract.getNom());
            System.out.println(extract.getPrenom());
            System.out.println(extract.getTelephone());
        }
        
        LinkedList<Travailleur> tt = new LinkedList<>();
        Travailleurs ts = new Travailleurs();
        
        
    }
}