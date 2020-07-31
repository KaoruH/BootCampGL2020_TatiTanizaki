package com.globallogic.bootcampgl.junitTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class AppTest {

    @Test
    @DisplayName("Ejercicio 1.1")
    void test(){

        assertEquals("Test", "Teste");
    }

    @Test
    @DisplayName("Ejercicio 1.2")
    void test2(){

        String string1 = "soyIgual";
        String string2 = "soyIgual";
        String string3 = "noSoyIgual";

        assertTrue(!string1.equals(string2) && string1.equals(string3));
        
    }

    @Test
    @DisplayName("Ejercicio 1.3")
    void test3(){

       assertTrue(23 < 12);
       assertFalse(25 < 27);

    }

    @Test
    @DisplayName("Ejercicio 1.4")
    void test4(){
        Long longTeste = 1L;

        assertNull(longTeste);

        longTeste = null;

        assertNotNull(longTeste);
    }

    @Test
    @DisplayName("Ejercicio 1.6")
    void test5(){

        assertTrue(suma(5, 8) == 13);

        assertFalse(suma(2, 3) == 9, "El resultado está mal: ");
    }

    public int suma(int numero1, int numero2){

        return numero1 + numero2;
    }

    @Test
    @DisplayName("Ejercicio 1.7")
    void test6(){
        
        assertTrue(metodoDelTest6(8), "Esta variable no es true");

        assertFalse(metodoDelTest6(2), "Esta variable no es");
    }

    public boolean metodoDelTest6(int numero){

        for (int i = 0; i <= numero; i++) {

            if (i == 3) {

                return true;
                
            }
            
        }
        return false;
    }

    
    
}