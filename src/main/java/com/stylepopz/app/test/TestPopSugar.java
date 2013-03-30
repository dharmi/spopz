package com.stylepopz.app.test;

import com.stylepopz.app.aggregator.Aggregator;
import com.stylepopz.app.aggregator.AggregatorFactory;



public class TestPopSugar {
	
	public static void main(String args[]) {
   	 
        String aggregatorType = "PopSugar";
        String classifierUrl = "http://www.calivintage.com/";

        Aggregator aggregator = AggregatorFactory.createAggregator(aggregatorType);

        System.out.println(aggregator.getAggregatorData(classifierUrl).toString());
    }

}
