package org.hmis;

import org.junit.jupiter.api.extension.ParameterContext;
import org.junit.jupiter.params.aggregator.ArgumentsAccessor;
import org.junit.jupiter.params.aggregator.ArgumentsAggregationException;
import org.junit.jupiter.params.aggregator.ArgumentsAggregator;

class CocheAggregator implements ArgumentsAggregator {

	    @Override
	    public Object aggregateArguments(ArgumentsAccessor accessor, ParameterContext context)
	      throws ArgumentsAggregationException {
	        return new Coche(	        		
	          accessor.getString(1), accessor.getString(2), accessor.getInteger(3), accessor.getInteger(4));
	    }
	}

