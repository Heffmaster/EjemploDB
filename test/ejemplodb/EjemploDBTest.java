/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplodb;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author FHERNADEZ
 */
public class EjemploDBTest {
    
    public EjemploDBTest() {
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
     * Test of main method, of class EjemploDB.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        EjemploDB.main(args);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of Insert method, of class EjemploDB.
     */
    @Test
    public void testInsert() {
        System.out.println("Insert");
        EjemploDB.Insert();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of Select method, of class EjemploDB.
     */
    @Test
    public void testSelect() {
        System.out.println("Select");
        EjemploDB.Select();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of Update method, of class EjemploDB.
     */
    @Test
    public void testUpdate() {
        System.out.println("Update");
        EjemploDB.Update();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of Delete method, of class EjemploDB.
     */
    @Test
    public void testDelete() {
        System.out.println("Delete");
        EjemploDB.Delete();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
