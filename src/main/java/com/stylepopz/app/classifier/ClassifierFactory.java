package com.stylepopz.app.classifier;

public class ClassifierFactory {
	
	public static Classifier createClassifier(String classifierType) {
		
		Classifier classifier = null;
		if (classifierType. equalsIgnoreCase ("Alchemy")){
			classifier =  new Alchemy();
        }
		
		return classifier;
	}

}
