package WekaAPICustomTest;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import weka.classifiers.Classifier;
import weka.classifiers.Evaluation;
import weka.classifiers.trees.J48;
import weka.core.Instances;

public class WekaPredictOtherMethods {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		 
		 Instances train = new Instances(new BufferedReader(new FileReader("C:\\Users\\rushi_000\\git\\CS297-Interactive-Phishing-Filter-\\CS297(Interactive-Phising-Filter)\\src\\WekaAPICustomTest\\weather.nominal.arff")));   // from somewhere
		 Instances test = new Instances(new BufferedReader(new FileReader("C:\\Users\\rushi_000\\git\\CS297-Interactive-Phishing-Filter-\\CS297(Interactive-Phising-Filter)\\src\\WekaAPICustomTest\\test.arff")));    // from somewhere
		 // train classifier
		 train.setClassIndex(train.numAttributes() - 1);
		 //test.setClassIndex(test.numAttributes() - 1);
		 Classifier cls = new J48();
		 cls.buildClassifier(train);
		 Evaluation eval = new Evaluation(train);
		 test.setClassIndex(test.numAttributes() - 1);
		 System.out.println(eval.toSummaryString("\nResults\n======\n", false));
	}

}
