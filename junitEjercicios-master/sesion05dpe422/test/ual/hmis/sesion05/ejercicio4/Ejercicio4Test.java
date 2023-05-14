package ual.hmis.sesion05.ejercicio4;

import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.converter.ConvertWith;
import org.junit.jupiter.params.provider.CsvSource;

class Ejercicio4Test {

	@CsvSource({"'1,2,3,4,5;0,1,0,5,0;1,0,1,0,0;0,5,3,1,0;2,0,6,4,1',"
			+ "'1.0\t1.0\t1.0\t1.0\t1.0\t\n\r5.0\t5.0\t1.0\t5.0\t2.0\t\n\r'", "'1,2,3,4,5;0,1,0,5,0;1,0,1,0,0;0,5,3,1,0',"
					+ "''"})
	@ParameterizedTest(name = "{index} => Diagonales de la matriz ({0}) sale {1}")
	
	void testDiagonals_parametrized(@ConvertWith(DoubleArrayBiConvert.class) double[][] input,
			 String expected)
{
		// Arrange
		Ejercicio4 dia = new Ejercicio4();
		double[][] matrizDiagonales =  dia.obtenerDiagonales(input);
		
		assertEquals(MatrizToString(matrizDiagonales), expected);
		
	}
	
	@CsvSource({"'1,2,3,4,5;0,1,0,5,0;1,0,1,0,0;0,5,3,1,0;2,0,6,4,1',"
			+ "'4.0,8.0,13.0,14.0,6.0'"})
	@ParameterizedTest(name = "{index} => Sumar las columnas de matriz ({0}) sale {1}")
	void testDiagonalsSuma_parametrized(@ConvertWith(DoubleArrayBiConvert.class) double[][] input,
			@ConvertWith(DoubleArrayConvert.class) double[] expected)
{
		// Arrange
		Ejercicio4 dia = new Ejercicio4();
		double[] matrizDiagonales =  dia.sumarColumnas(input);
		
		assertEquals(ArrayToString(matrizDiagonales), ArrayToString(expected));
		
	}	
	
	private String MatrizToString (double [][] matriz) {
	 String result="";
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				result +=matriz[i][j] + "\t";
			}
			result += "\n\r";
	}
		return result;
	}
	
	private String ArrayToString (double [] matriz) {
		 String result="";
			for (int i = 0; i < matriz.length; i++) {
					result +=matriz[i] + "\t";
			result += "\n\r";
		}
			return result;
		}
	
}
