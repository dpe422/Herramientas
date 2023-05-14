package ual.hmis.sesion05.ejercicio5;

import org.junit.jupiter.params.converter.SimpleArgumentConverter;
import org.junit.jupiter.params.converter.ArgumentConversionException;

public class StringArrayConverter extends SimpleArgumentConverter {

	@Override
	protected Object convert(Object source, Class<?> targetType) throws ArgumentConversionException {
        if (source instanceof String && String[].class.isAssignableFrom(targetType)) {
        	if (((String) source).isEmpty()) 
        		return new String[0];
        	else
        		return ((String) source).split("\\s*,\\s*");
        } else if(source==null){
    		return new String[0];
        } else {
            throw new IllegalArgumentException("Conversion from " + source.getClass() + " to "
                                               + targetType + " not supported.");
        }
	}

}
