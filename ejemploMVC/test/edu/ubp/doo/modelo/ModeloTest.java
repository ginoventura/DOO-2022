/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ubp.doo.modelo;

import java.lang.annotation.Target;
import java.util.Arrays;
import java.util.Collection;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

/**
 *
 * @author agustin
 */
@RunWith(Parameterized.class)
public class ModeloTest {
    
    
    int numero1;
    int numero2;
    int resultadoSumEsperado;
    int resultadoRestEsperado;
    
    @Parameters(name = "{index} --> Suma esperada: {2}, Resta esperada: {3}")
    public static Collection datos(){
        return Arrays.asList(new Object[][]{
            {2,1,3,1},
            {3,2,5,1},
            {4,5,9,-1}
        });
    } 
    
    public ModeloTest(int numero1, int numero2, int resultadoSumEsperado, int resultadoRestEsperado) {
        this.numero1 = numero1;
        this.numero2 = numero2;
        this.resultadoSumEsperado = resultadoSumEsperado;
        this.resultadoRestEsperado = resultadoRestEsperado;
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

//    /**
//     * Test of getNumero1 method, of class Modelo.
//     */
//    @Test
//    public void testGetNumero1() {
//        System.out.println("getNumero1");
//        Modelo instance = new Modelo();
//        int expResult = 0;
//        int result = instance.getNumero1();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of setNumero1 method, of class Modelo.
//     */
//    @Test
//    public void testSetNumero1() {
//        System.out.println("setNumero1");
//        int numero1 = 0;
//        Modelo instance = new Modelo();
//        instance.setNumero1(numero1);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of getNumero2 method, of class Modelo.
//     */
//    @Test
//    public void testGetNumero2() {
//        System.out.println("getNumero2");
//        Modelo instance = new Modelo();
//        int expResult = 0;
//        int result = instance.getNumero2();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of setNumero2 method, of class Modelo.
//     */
//    @Test
//    public void testSetNumero2() {
//        System.out.println("setNumero2");
//        int numero2 = 0;
//        Modelo instance = new Modelo();
//        instance.setNumero2(numero2);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of sumar method, of class Modelo.
//     */
    @Test
    public void testSumar() {
        System.out.println("sumar");
        Modelo instance = new Modelo();
        instance.setNumero1(this.numero1);
        instance.setNumero2(this.numero2);
        int expResult = this.resultadoSumEsperado;
        int result = instance.sumar();
        assertEquals(expResult, result);
    }

    /**
     * Test of restar method, of class Modelo.
     */
    @Test
    public void testRestar() {
        System.out.println("restar");
        Modelo instance = new Modelo();
        instance.setNumero1(this.numero1);
        instance.setNumero2(this.numero2);
        int expResult = this.resultadoRestEsperado;
        int result = instance.restar();
        assertEquals(expResult, result);
        
    }
//
//    /**
//     * Test of multiplicar method, of class Modelo.
//     */
//    @Test
//    public void testMultiplicar() {
//        System.out.println("multiplicar");
//        Modelo instance = new Modelo();
//        int expResult = 0;
//        int result = instance.multiplicar();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of dividir method, of class Modelo.
//     */
//    @Test
//    public void testDividir() {
//        System.out.println("dividir");
//        Modelo instance = new Modelo();
//        int expResult = 0;
//        int result = instance.dividir();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
    
}
