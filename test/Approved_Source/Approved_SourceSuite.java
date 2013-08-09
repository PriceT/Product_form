/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Approved_Source;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 *
 * @author tysonmauriceprice
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({Approved_Source.textUPC_CodeTest.class, Approved_Source.textDate_FoundTest.class, Approved_Source.textProd_CodeTest.class, Approved_Source.ProductsTest.class, Approved_Source.textManu_InfoTest.class, Approved_Source.textESTTest.class, Approved_Source.textProd_NameTest.class})
public class Approved_SourceSuite {

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }
    
}