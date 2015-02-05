/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package testtravailleur;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author localwsp
 */
public class TravailleurTest {
    
    public TravailleurTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getPrenom method, of class Travailleur.
     */
    @Test
    public void testGetPrenom() {
        System.out.println("getPrenom");
        String expResult = "Jean";
        Travailleur instance =  new Travailleur(expResult, "Michel", 250);
        assertEquals(expResult, instance.getPrenom());
    }

    /**
     * Test of setPrenom method, of class Travailleur.
     */
    @Test
    public void testSetPrenom() {
        System.out.println("setPrenom");
        String prenom = "Jean";
        Travailleur instance = new Travailleur(prenom, "Michel", 250);
        instance.setPrenom(prenom);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of getNom method, of class Travailleur.
     */
    @Test
    public void testGetNom() {
        System.out.println("getNom");
        String expResult = "Sirto";
        Travailleur instance = new Travailleur("Michel", expResult, 243);
        String result = instance.getNom();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of setNom method, of class Travailleur.
     */
    @Test
    public void testSetNom() {
        System.out.println("setNom");
        String nom = "Michel";
        Travailleur instance =  new Travailleur("Jean", "Michel", 250);
        instance.setNom(nom);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of getTelephone method, of class Travailleur.
     */
    @Test
    public void testGetTelephone() {
        System.out.println("getTelephone");
        Travailleur instance =  new Travailleur("Jean", "Michel", 250);
        int expResult = 250;
        int result = instance.getTelephone();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of setTelephone method, of class Travailleur.
     */
    @Test
    public void testSetTelephone() {
        System.out.println("setTelephone");
        int telephone = 250;
        Travailleur instance =  new Travailleur("Jean", "Michel", 250);
        instance.setTelephone(telephone);
        // TODO review the generated test code and remove the default call to fail.
        
    }
    
}
