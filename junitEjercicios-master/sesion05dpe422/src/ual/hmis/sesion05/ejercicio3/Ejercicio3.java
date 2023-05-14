package ual.hmis.sesion05.ejercicio3;

public class Ejercicio3 {
	public String encriptar ( String password){
		// Si la longitud de la cadena de entrada está entre 5 y 8 caracteres
		if (password.length()>= 5 && password.length()<= 8)
			return "*".repeat(8);
		// Si la cadena de entrada si está entre 12 y 40 caracteres
		if (password.length()>= 12 && password.length()<= 40)
			return "*".repeat(12);
		// comprobar la longitud sea menor 5
		if (password.length()<= 4)
			return "password demasiado corto";
		// Si el password de entrada si es mayor que 40 caracteres	
		if (password.length()> 40 )
			return "password demasiado largo";
		// Cualquier otro caso se devuelve un cadena con * con la longitud de password.
		return "*".repeat(password.length());

	}

}
