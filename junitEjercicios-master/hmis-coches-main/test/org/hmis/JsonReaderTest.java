package org.hmis;


import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.aggregator.AggregateWith;
import org.junit.jupiter.params.provider.CsvSource;

class JsonReaderTest {

	@Test
	void testLeerCochesJSON() {
		String ruta = "data/coches.json";
		Coche [] coches = JsonReader.leerCochesJSON(ruta);
		assertEquals (4, coches.length);
	}

	@Test
	void testLeerCochesJSONprimero() {
		String ruta = "data/coches.json";
		Coche primero = new Coche ("Toyota", "Corolla", 2022, 22000);
		Coche [] coches = JsonReader.leerCochesJSON(ruta);
		assertEquals(primero, coches[0]);
		assertTrue (primero.equals(coches[0]));
		assertTrue (coches[0].equals(primero));
	}

	@ParameterizedTest (name = "{index} => Con entrada ({0}) sale {1}")
	@CsvSource({"data/coches.json, 4",  "data/hola,0"})
	void testLeerCochesJSONPar(String ruta, int expected) {		
		Coche [] coches = JsonReader.leerCochesJSON(ruta);
		if (coches==null) {
			assertNull(coches);
		}else {
			assertEquals (expected, coches.length);
		}
	}
	
	
	@ParameterizedTest
	@CsvSource({"true, Toyota, Corolla, 2022, 22000", "false, Toyota, Corolla, 2022, 22001"})
	void testLeerCochesJSONprimeroPar(boolean expected, @AggregateWith(CocheAggregator.class) Coche primero) {
		String ruta = "data/coches.json";
		Coche [] coches = JsonReader.leerCochesJSON(ruta);
		if(expected) {
		assertEquals(primero, coches[0]);
		assertTrue (primero.equals(coches[0]));
		assertTrue (coches[0].equals(primero));
		}else {
			assertNotEquals(primero, coches[0]);
			assertFalse (primero.equals(coches[0]));
			assertFalse (coches[0].equals(primero));
		}
	}
}
