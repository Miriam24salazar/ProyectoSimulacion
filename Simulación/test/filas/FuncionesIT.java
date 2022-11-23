/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package filas;

import Filas.Funciones;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author miria
 */
public class FuncionesIT {
    
    public FuncionesIT() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of Z method, of class Funciones.
     */
    @Test
    public void testZ() {
        System.out.println("Z");
        //0.8145, 0.1355, 0.7114, 0.8174
        double[] miu = {5, 5, 5, 10};
        double[] sigma2 = {2, 1, 2, 3};
        Funciones instance = new Funciones();
        int[] expResult = {(int)((0.9)*sigma2[0]+miu[0]), (int)((-1.11)*sigma2[1]+miu[1]), (int)((0.56)*sigma2[2]+miu[2]), (int)((0.91)*sigma2[3]+miu[3])};
        for (int i = 0; i < miu.length; i++) {
            int result = instance.Z(miu[i], sigma2[i]);
            assertEquals(expResult[i], result);
        }
    }

    /**
     * Test of Salir method, of class Funciones.
     */
    @Test
    public void testSalir() {
        //0.8145, 0.1355, 0.7114, 0.8174
        System.out.println("Salir");
        double[] lambda = {0.5, 0.3, 0.1, 0};
        int[] n = {1, 0, 10, 50};
        Funciones instance = new Funciones();
        boolean[] expResult = {(1-Math.exp(-lambda[0]*n[0])<0.8145), false, (1-Math.exp(-lambda[2]*n[2])<0.8145), false};
        for (int i = 0; i < lambda.length; i++) {
            boolean result = instance.Salir(lambda[i], n[i]);
            assertEquals(expResult[i], result);
        }
    }
    
}
