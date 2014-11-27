/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vectors;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author patryk
 */
public class Vector3DTest {
    
    public Vector3DTest() {
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
     * Test of length method, of class Vector3D.
     */
    @Test
    public void testLength() {
        System.out.println("length");
        Vector3D instance = new Vector3D(4,5,2);
        double expResult = 6.7082039325;
        double result = instance.length();
        assertEquals(expResult, result, 0.0001);

    }

    /**
     * Test of add method, of class Vector3D.
     */
    @Test
    public void testAdd() {
        System.out.println("add");
        Vector3D anotherVector = new Vector3D(2,3,4);
        Vector3D instance = new Vector3D(4,5,6);
        Vector3D expResult = new Vector3D(6,8,10);
        Vector3D result = instance.add(anotherVector);
        assertEquals(expResult, result);
    }

    /**
     * Test of multiplyByScalar method, of class Vector3D.
     */
    @Test
    public void testMultiplyByScalar() {
        System.out.println("multiplyByScalar");
        double alpha = 1.5;
        Vector3D instance = new Vector3D(2,3,4);
        Vector3D expResult = new Vector3D(3,4.5,6);
        Vector3D result = instance.multiplyByScalar(alpha);
        assertEquals(expResult, result);

    }

    /**
     * Test of dotProduct method, of class Vector3D.
     */
    @Test
    public void testDotProduct() {
        System.out.println("dotProduct");
        Vector3D anotherVector = new Vector3D(2,3,4);
        Vector3D instance = new Vector3D(4,2,3);
        double expResult = 26;
        double result = instance.dotProduct(anotherVector);
        assertEquals(expResult, result, 0.0);

    }

    /**
     * Test of crossProduct method, of class Vector3D.
     */
    @Test
    public void testCrossProduct() {
        System.out.println("crossProduct");
        Vector3D anotherVector = new Vector3D(1,2,3);
        Vector3D instance = new Vector3D(2,3,4);
        Vector3D expResult = new Vector3D(2*4-3*3,3*2-1*4,1*3-2*2);
        Vector3D result = instance.crossProduct(anotherVector);

    }

    /**
     * Test of toString method, of class Vector3D.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Vector3D instance = new Vector3D(2.0,3.0,4.0);
        String expResult = "[2.0, 3.0, 4.0]";
        String result = instance.toString();
        assertEquals(expResult, result);
    }

    /**
     * Test of equals method, of class Vector3D.
     */
    @Test
    public void testEquals() {
        //Check when result should be true
        Object anotherObject = new Vector3D(2,4,5);
        Vector3D instance = new Vector3D(2,4,5);
        boolean expResult = true;
        boolean result = instance.equals(anotherObject);
        assertEquals(expResult, result);
        
        //Check when result should be false but object type is the same
        anotherObject = new Vector3D(2,4,6);
        expResult=false;
        result = instance.equals(anotherObject);
        assertEquals(expResult, result);
        
        //Check when comparing 2 different objects
        anotherObject = new String();
        expResult=false;
        result = instance.equals(anotherObject);
        assertEquals(expResult, result);

    }
    
}
