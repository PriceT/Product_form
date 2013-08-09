/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Approved_Source;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author tysonmauriceprice
 */
public class textProd_NameTest {
    
    public textProd_NameTest() {
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
     * Test of setText method, of class textProd_Name.
     */
    @Test
    public void testSetText() {
        System.out.println("setText");
        String Prod_Name = "";
        textProd_Name.setText(Prod_Name);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getText method, of class textProd_Name.
     */
    @Test
    public void testGetText() {
        System.out.println("getText");
        String expResult = "";
        String result = textProd_Name.getText();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}