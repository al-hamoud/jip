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
public class CompositeFolderTest {

    public CompositeFolderTest() {
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
     * Test of getNodeName method, of class CompositeFolder.
     */
    @Test
    public void testGetNodeName() {
        System.out.println("getNodeName");
        CompositeFolder instance = new CompositeFolder();
        String expResult = "";
        String result = instance.getNodeName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of add method, of class CompositeFolder.
     */
    @Test
    public void testAdd() {
        System.out.println("add");
        Root folder = null;
        CompositeFolder instance = new CompositeFolder();
        boolean expResult = false;
        boolean result = instance.add(folder);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of remove method, of class CompositeFolder.
     */
    @Test
    public void testRemove() {
        System.out.println("remove");
        Root folder = null;
        CompositeFolder instance = new CompositeFolder();
        boolean expResult = false;
        boolean result = instance.remove(folder);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of returnNodesAsSet method, of class CompositeFolder.
     */
    @Test
    public void testReturnNodesAsSet() {
        System.out.println("returnNodesAsSet");
        CompositeFolder instance = new CompositeFolder();
        Set expResult = null;
        Set result = instance.returnNodesAsSet();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of IsFolder method, of class CompositeFolder.
     */
    @Test
    public void testIsFolder() {
        System.out.println("IsFolder");
        CompositeFolder instance = new CompositeFolder();
        boolean expResult = false;
        boolean result = instance.IsFolder();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSuccessor method, of class CompositeFolder.
     */
    @Test
    public void testGetSuccessor() {
        System.out.println("getSuccessor");
        CompositeFolder instance = new CompositeFolder();
        Root expResult = null;
        Root result = instance.getSuccessor();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

}