package ual.hmis.sesion05.ejercicio5;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.converter.ConvertWith;
import org.junit.jupiter.params.provider.CsvSource;

class Ejercicio5Test {

	@CsvSource({
		"'','',''",
		"'','1,2','1,2'",
		"'1,2','','1,2'",
		"'1,2','1,2','1,2'",
		"'1,3','2,4','1,2,3,4'"
	})
	
	@ParameterizedTest(name = "{index} => Fusionar array ordenada  ({0}) con el array ordenado ({1})  sale {2}")
	void testMergeArrays_parametrized(@ConvertWith(StringArrayConverter.class) String[] a1,
			@ConvertWith(StringArrayConverter.class) String[] a2,String result) {
		// Arrange
		Ejercicio5 e5 = new Ejercicio5();
		ArrayList<Comparable> array2 = e5.mergeArrays(a1, a2);
		String sResult ="";
		if (array2.size()>0) {
			for (int i =0;i<array2.size();i++) {
			sResult +=  "," + array2.get(i) ;
		}
		sResult = sResult.substring(1);
		}
		assertEquals(result, sResult);
		
	}
	
}
