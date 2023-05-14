package ual.hmis.sesion05.ejercicio3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import ual.hmis.sesion05.ejercicio2.Ejercicio2;

class Ejercicio3Test {

	@CsvSource({
		"pass,password demasiado corto",
		"pass5,********",
		"passl678,********",
		"passlongitud15,************",
		"passordsuperlarguisimimomayor de 40 carecteres no se que escribir,password demasiado largo",
		"otrocaso10,**********"
	})
	
	@ParameterizedTest(name = "{index} => Con password ({0}) sale {1}")
	void testEncriptar_parametrized(String password, String result) {
		// Arrange
		Ejercicio3 e3 = new Ejercicio3();
		// Act
		// Assert
		assertEquals(result, e3.encriptar(password));
	}
	
}
