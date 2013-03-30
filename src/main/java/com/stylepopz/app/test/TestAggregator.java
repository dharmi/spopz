package com.stylepopz.app.test;

import com.stylepopz.app.classifier.Classifier;
import com.stylepopz.app.classifier.ClassifierFactory;


public class TestAggregator {

    public static void main(String args[]) {
    	 
        String classifierType = "Alchemy";
        String url = "http://www.calivintage.com/";

        Classifier aggregator = ClassifierFactory.createClassifier(classifierType);

        System.out.println(aggregator.getClassifierData(url).toString());
    }

}
