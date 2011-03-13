/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Set;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author ihsan
 */
public class PageFileTest {

    public PageFileTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of getNodeName method, of class PageFile.
     */
    @Test
    public void testGetNodeName() {
        System.out.println("getNodeName");
        PageFile instance = null;
        String expResult = "";
        String result = instance.getNodeName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of IsFolder method, of class PageFile.
     */
    @Test
    public void testIsFolder() {
        System.out.println("IsFolder");
        PageFile instance = null;
        boolean expResult = false;
        boolean result = instance.IsFolder();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of returnNodesAsSet method, of class PageFile.
     */
    @Test
    public void testReturnNodesAsSet() {
        System.out.println("returnNodesAsSet");
        PageFile instance = null;
        Set expResult = null;
        Set result = instance.returnNodesAsSet();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSuccessor method, of class PageFile.
     */
    @Test
    public void testGetSuccessor() {
        System.out.println("getSuccessor");
        PageFile instance = null;
        Root expResult = null;
        Root result = instance.getSuccessor();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

}