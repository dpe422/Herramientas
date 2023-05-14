package ual.hmis.sesion05.ejercicio4;

public class Ejercicio4 {

	public static double[][] obtenerDiagonales(double[][] matriz) {
		if(matriz.length!=matriz[0].length)
			 return new double[0][0];
		double[][] matrizDiagonales = new double[2][matriz.length];
		for (int i = 0; i < matriz.length; i++) {
			matrizDiagonales[0][i] = matriz[i][i];
			matrizDiagonales[1][i] = matriz[i][matriz.length - 1 - i];
		}
		return matrizDiagonales;
	}

	public static double[] sumarColumnas(double[][] matriz) {
		double[] suma = new double[matriz[0].length];
		for (int j = 0; j < matriz[0].length; j++) {
			for (int i = 0; i < matriz.length; i++) {
				suma[j] += matriz[i][j];
			}
		}
		return suma;
	}

}
