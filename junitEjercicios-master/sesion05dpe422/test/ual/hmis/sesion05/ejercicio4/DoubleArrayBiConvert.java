package ual.hmis.sesion05.ejercicio4;

import java.util.Arrays;

import org.junit.jupiter.api.extension.ParameterContext;
import org.junit.jupiter.params.converter.ArgumentConversionException;
import org.junit.jupiter.params.converter.ArgumentConverter;

public class DoubleArrayBiConvert implements ArgumentConverter {

	@Override
	public Object convert(Object source, ParameterContext context) throws ArgumentConversionException {
		if (!(source instanceof String)) {
			throw new IllegalArgumentException("The argument should be a string: " + source);
		}
		try {
			double[][] matriz = null;
			String[] rows = ((String) source).split(";");
			if (rows.length > 0) {
//            	int [] row = Arrays.stream(rows[0].split(",")).mapToInt(Integer::parseInt).toArray();
				matriz = new double[rows.length][];
				for (int i = 0; i < rows.length; i++) {
					double[] row = Arrays.stream(rows[i].split(",")).mapToDouble(Double::parseDouble).toArray();
					matriz[i] = row;
				}
				return matriz;
			} else {
				throw new IllegalArgumentException("Incorrect Argument", null);
			}
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