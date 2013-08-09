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
public class textUPC_CodeTest {
    
    public textUPC_CodeTest() {
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
     * Test of setText method, of class textUPC_Code.
     */
    @Test
    public void testSetText() {
        System.out.println("setText");
        String UPC_Code = "";
        textUPC_Code.setText(UPC_Code);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getText method, of class textUPC_Code.
     */
    @Test
    public void testGetText() {
        System.out.println("getText");
        String expResult = "";
        String result = textUPC_Code.getText();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}