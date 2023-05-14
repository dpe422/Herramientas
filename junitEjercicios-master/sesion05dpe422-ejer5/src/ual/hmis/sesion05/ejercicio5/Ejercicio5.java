package ual.hmis.sesion05.ejercicio5;

import java.util.ArrayList;

public class Ejercicio5 {
	

	public ArrayList<Comparable> mergeArrays(Comparable[] arrayOne, Comparable[] arrayTwo){
	    
		ArrayList<Comparable> lista = new ArrayList<Comparable>();
	    int i = 0, j = 0, k=0 ;
	    
	    while (k< (arrayOne.length + arrayTwo.length) ) {
	        if(i >= arrayOne.length) {
	            lista.add(arrayTwo[j]);
	            ++j;
	        }
	        else if(j >= arrayTwo.length) {
	        	lista.add(arrayOne[i]);
	            ++i;
	        }
	        else {
	            if(arrayOne[i].compareTo(arrayTwo[j]) > 0) {
	            	lista.add(arrayTwo[j]);
	                ++j;
	            }
	            else if(arrayOne[i].compareTo(arrayTwo[j]) < 0) {
	            	lista.add(arrayOne[i]);
	                ++i;
	            }
	            else {
	            	lista.add(arrayOne[i]);
	                ++k;
	                ++j;
	                ++i;
	            }
	        }
	        k++;
	    	
	    }
	    return lista;
	}
}
