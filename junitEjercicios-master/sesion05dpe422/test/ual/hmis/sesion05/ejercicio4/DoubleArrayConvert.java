package ual.hmis.sesion05.ejercicio4;

import java.util.Arrays;

import org.junit.jupiter.api.extension.ParameterContext;
import org.junit.jupiter.params.converter.ArgumentConversionException;
import org.junit.jupiter.params.converter.ArgumentConverter;

public class DoubleArrayConvert implements ArgumentConverter {

	@Override
	public Object convert(Object source, ParameterContext context) throws ArgumentConversionException {
		if (!(source instanceof String)) {
			throw new IllegalArgumentException("The argument should be a string: " + source);
		}
		try {
			return  Arrays.stream(((String) source).split(",")).mapToDouble(Double::parseDouble).toArray();
		} catch (Exception e) {
			e.printStackTrace();
			throw new IllegalArgumentException("Failed to convert", e);
		}
	}
//    @ParameterizedTest
//    @CsvSource(value = {
//            "13,14,65,456,31,83;1331,65456",
//            "1,2,3,4,5,6;10,20"}, delimiterString = ";")
//    public void palindromeCombos(@ConvertWith(IntArrayConverter.class) int[] input,
//                                 @ConvertWith(IntArrayConverter.class) int[] expected) {
//        System.out.println(Arrays.toString(input));
//        System.out.println(Arrays.toString(expected));
//    }    

}