package ual.hmis.sesion05.ejercicio3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;




class Ejercicio3Test2 {


	@ParameterizedTest (name = "{index} => Con entrada ({0}) sale {1}")
	@CsvFileSource(resources = "Ejercicio3data.txt", numLinesToSkip = 0)
	
	void testEncriptar_parametrized(String password, String result) {
		// Arrange
		Ejercicio3 e3 = new Ejercicio3();
		// Act
		// Assert
		assertEquals(result, e3.encriptar(password));
	}
}
