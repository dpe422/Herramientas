package ual.hmis.sesion05.ejercicio1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;




class Ejercicio1Test2 {


	@ParameterizedTest (name = "{index} => Con entrada ({0}) sale {1}")
	@CsvFileSource(resources = "Ejercicio1data.txt", numLinesToSkip = 0)
	
	void testTransformar(int input, int expected) {
		Ejercicio1 c = new Ejercicio1();
		assertEquals(expected, c.transformar(input));
	}
}
