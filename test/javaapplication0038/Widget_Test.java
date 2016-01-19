/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaapplication0038;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author stefan
 */
public class Widget_Test {
    
    public Widget_Test() {
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
     * Test of getLength method, of class Widget_.
     */
    @Test
    public void testGetLength() {
        System.out.println("TEST: getLength");
        
        // default constructor
        Widget_ instance = new Widget_();
        int expResult = 100;
        int result = instance.getLength();
        assertEquals(expResult, result);
        
        // constructor w/ parameters
        Widget_ instance2 = new Widget_(1,200);
        int expResult2 = 200;
        int result2 = instance2.getLength();
        assertEquals(expResult2, result2);        
        
    }

    /**
     * Test of getWidth method, of class Widget_.
     */
    @Test
    public void testGetWidth() {
        System.out.println("TEST: getWidth");
        Widget_ instance = new Widget_(10, 100);
        
        instance.increaseWidth(10) ;
        int expResult = 20;
        int result = instance.getWidth();
        assertEquals(expResult, result);

        instance.increaseWidth(10) ;
        expResult = 30;
        result = instance.getWidth();
        assertEquals(expResult, result);
        
        // try to go beyond maxWidth -> does not affect the width!
        instance.increaseWidth(100) ;
        expResult = 30;
        result = instance.getWidth();
        assertEquals(expResult, result);        
        
    }

    /**
     * Test of increaseWidth method, of class Widget_.
     */
    @Test
    public void testIncreaseWidth() {
        System.out.println("increaseWidth");
        int increment = 0;
        Widget_ instance = new Widget_();
        int expResult = 0;
        int result = instance.increaseWidth(increment);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of decreaseWidth method, of class Widget_.
     */
    @Test
    public void testDecreaseWidth() {
        System.out.println("decreaseWidth");
        int decrement = 0;
        Widget_ instance = new Widget_();
        int expResult = 0;
        int result = instance.decreaseWidth(decrement);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of increaseLength method, of class Widget_.
     */
    @Test
    public void testIncreaseLength() {
        System.out.println("TEST: increaseLength");
        // test case 1: use default ctor, increase the length by 500
        int increment = 500;
        Widget_ instance = new Widget_();
        int expResult = 600;
        int result = instance.increaseLength(increment);
        assertEquals(expResult, result);
        
        // test case 2: use the default ctor, increase the length by 5000
        // -> should result in NO same length as before (maxLength exceeded!)
        int increment2 = 5000;
        Widget_ instance2 = new Widget_();
        int expResult2 = 100;
        int result2 = instance2.increaseLength(increment2);
        assertEquals(expResult2, result2);
        
    }

    /**
     * Test of decreaseLength method, of class Widget_.
     */
    @Test
    public void testDecreaseLength() {
        System.out.println("decreaseLength");
        int decrement = 0;
        Widget_ instance = new Widget_();
        int expResult = 0;
        int result = instance.decreaseLength(decrement);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of print method, of class Widget_.
     */
    @Test
    public void testPrint() {
        System.out.println("print");
        Widget_ instance = new Widget_();
        Widget_ expResult = null;
        Widget_ result = instance.print();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
