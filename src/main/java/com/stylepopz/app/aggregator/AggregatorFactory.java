package com.stylepopz.app.aggregator;

public class AggregatorFactory {
	
	public static Aggregator createAggregator(String aggregatorType) {
		
		Aggregator aggregator = null;
		if (aggregatorType. equalsIgnoreCase ("PopSugar")){
			aggregator =  new PopSugar();
        }
		
		return aggregator;
	}

}
