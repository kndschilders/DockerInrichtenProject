/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.s63.koenthomas.calculator.Calculator;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author Koen
 */
public class CalculatorTest {
    
    protected Calculator calc;
    
    public CalculatorTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        this.calc = new Calculator();
    }
    
    @After
    public void tearDown() {
    }

    @Test(timeout=1)
    public void testAdd() {
        Assert.assertEquals(2, calc.add(1, 1));
    }

    @Test(timeout=1)
    public void testSubtract() {
        Assert.assertEquals(0, calc.subtract(1, 1));
    }

    @Test(timeout=5)
    public void testMultiply() {
        Assert.assertEquals(1, calc.multiply(1, 1));
    }

    @Test(timeout=1)
    public void testDivide() {
        Assert.assertEquals(1, calc.divide(1, 1));
    }
}
