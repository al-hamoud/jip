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
public class RootTest {

    public RootTest() {
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

    @Test
    public void testSetSuccessor() {
        System.out.println("setSuccessor");
        Root successor = null;
        Root instance = new RootImpl();
        instance.setSuccessor(successor);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetFullPath() {
        System.out.println("getFullPath");
        Root instance = new RootImpl();
        String expResult = "";
        String result = instance.getFullPath();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNodeName method, of class Root.
     */
    @Test
    public void testGetNodeName() {
        System.out.println("getNodeName");
        Root instance = new RootImpl();
        String expResult = "";
        String result = instance.getNodeName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSuccessor method, of class Root.
     */
    @Test
    public void testGetSuccessor() {
        System.out.println("getSuccessor");
        Root instance = new RootImpl();
        Root expResult = null;
        Root result = instance.getSuccessor();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of IsFolder method, of class Root.
     */
    @Test
    public void testIsFolder() {
        System.out.println("IsFolder");
        Root instance = new RootImpl();
        boolean expResult = false;
        boolean result = instance.IsFolder();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of returnNodesAsSet method, of class Root.
     */
    @Test
    public void testReturnNodesAsSet() {
        System.out.println("returnNodesAsSet");
        Root instance = new RootImpl();
        Set expResult = null;
        Set result = instance.returnNodesAsSet();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class RootImpl extends Root {

        public String getNodeName() {
            return "";
        }

        public Root getSuccessor() {
            return null;
        }

        public boolean IsFolder() {
            return false;
        }

        public Set<Root> returnNodesAsSet() {
            return null;
        }
    }

}