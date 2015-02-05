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
 * @author jedepaepe
 */
public class TravailleursTest {
    
    public TravailleursTest() {
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

    @Test
    public void testSomeMethod() {
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of print method, of class Travailleurs.
     */
    @Test
    public void testPrint() {
        System.out.println("print");
        Travailleurs instance = new Travailleurs();
        String expResult = "";
        String result = instance.print();
        assertEquals(expResult, result);
        
        instance.add(new Travailleur("A", "B", 1));
        result = instance.print();
        assertEquals("A B\n", result);
    }
    
}
