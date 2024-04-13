import org.br.calculadora.Calculadora;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;


public class CalculadoraTest {

    private Calculadora calc;
    @BeforeEach
    public  void inicializar(){
        this.calc = new Calculadora();
    }
    @ParameterizedTest
    @CsvSource({"1,2,3", "2,3,5", "6,3,9"})
    @DisplayName("Teste Somar")
    public void testSomar(int a, int b, int resultadoEsperado){
        Calculadora calculadora = new Calculadora();
        int resultado = calculadora.somar(a,b);
        assertEquals(resultadoEsperado,resultado);
    }
    @ParameterizedTest
    @CsvSource({"10,2,8", "60,3,57", "6,3,3"})
    @DisplayName("Teste Subtracao")
    public void testSubtracao(int a, int b, int resultadoEsperado){
        Calculadora calculadora = new Calculadora();
        int resultado = calculadora.subtrair(a,b);
        assertEquals(resultadoEsperado,resultado);
    }
    @ParameterizedTest
    @CsvSource({"1,2,2", "2,3,6", "6,3,18"})
    @DisplayName("Teste Multplicacao")
    public void testMultiplicacao(int a, int b, int resultadoEsperado){
        Calculadora calculadora = new Calculadora();
        int resultado = calculadora.multiplicar(a,b);
        assertEquals(resultadoEsperado,resultado);
    }
    @ParameterizedTest
    @CsvSource({"10,2,5", "15,3,5", "6,3,2"})
    @DisplayName("Teste Divisao")
    public void testDivisao(int a, int b, int resultadoEsperado){
        Calculadora calculadora = new Calculadora();
        double resultado = calculadora.dividir(a,b);
        assertEquals(resultadoEsperado,resultado);
    }
    @ParameterizedTest
    @CsvSource({"10,2,5", "15,3,5", "6,3,2"})
    @DisplayName("Teste Divisao2")
    public void testDivisao2(int a, int b, int resultadoEsperado){
        Calculadora calculadora = new Calculadora();
        double resultado = calculadora.dividir(a,b);
        assertNotEquals(resultadoEsperado,resultado);
    }
}
