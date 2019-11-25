/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Testing;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author lamon
 */
public class PersonTest {
    
    public PersonTest() {
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
     * Test of getName method, of class Person.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        Person instance = new Person("Bob", "123 Fake Street", "bob@yahoo.ca", "1234password");
        String expResult = "Bob";
        String result = instance.getName();
        assertEquals(expResult, result);
    }

    /**
     * Test of getAddress method, of class Person.
     */
    @Test
    public void testGetAddress() {
        System.out.println("getAddress");
        Person instance = new Person("Bob", "123 Fake Street", "bob@yahoo.ca", "1234password");
        String expResult = "123 Fake Street";
        String result = instance.getAddress();
        assertEquals(expResult, result);
    }

    /**
     * Test of changeAddress method, of class Person.
     */
    @Test
    public void testChangeAddress() {
        System.out.println("changeAddress");
        String address = "321 Real Street";
        Person instance = new Person("Bob", "123 Fake Street", "bob@yahoo.ca", "1234password");
        instance.changeAddress(address);
        
        String expectedValue = "321 Real Street";
        String result = instance.getAddress();
        assertEquals(expectedValue, result);
    }

    /**
     * Test of isValid method, of class Person.
     */
    @Test
    public void testIsValid() {
        System.out.println("isValid");
        String email = "bob@yahoo.ca";
        String password = "1234password";
        Person instance = new Person("Bob", "123 Fake Street", "bob@yahoo.ca", "1234password");
        boolean expResult = true;
        boolean result = instance.isValid(email, password);
        assertEquals(expResult, result);  
    }
    
    @Test
    public void incorrectEmail() {
        System.out.println("isValid");
        String email = "bob@gmail.com";
        String password = "1234password";
        Person instance = new Person("Bob", "123 Fake Street", "bob@yahoo.ca", "1234password");
        boolean expResult = false;
        boolean result = instance.isValid(email, password);
        assertEquals(expResult, result);  
    }
    
    @Test
    public void noPasswordGiven() {
        System.out.println("isValid");
        String email = "bob@yahoo.ca";
        String password = "";
        Person instance = new Person("Bob", "123 Fake Street", "bob@yahoo.ca", "1234password");
        boolean expResult = false;
        boolean result = instance.isValid(email, password);
        assertEquals(expResult, result);  
    }
    
}
