package WekaAPICustomTest;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import weka.core.Instances;
import weka.classifiers.Classifier;
import weka.classifiers.Evaluation;
import weka.classifiers.evaluation.Prediction;
import weka.classifiers.trees.J48;

public class WekaPredictAPIExample {

	
	
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		 
		 /*Instances train = new Instances(new BufferedReader(new FileReader("C:\\Users\\rushi_000\\git\\CS297-Interactive-Phishing-Filter-\\CS297(Interactive-Phising-Filter)\\src\\WekaAPICustomTest\\weather.nominal.arff")));   // from somewhere
		 Instances test = new Instances(new BufferedReader(new FileReader("C:\\Users\\rushi_000\\git\\CS297-Interactive-Phishing-Filter-\\CS297(Interactive-Phising-Filter)\\src\\WekaAPICustomTest\\test.arff")));    // from somewhere
		 // train classifier
		 train.setClassIndex(train.numAttributes() - 1);
		 Classifier cls = new J48();
		 cls.buildClassifier(train);
		 Evaluation eval = new Evaluation(train);
		 test.setClassIndex(test.numAttributes() - 1);
		 System.out.println(eval.toSummaryString("\nResults\n======\n", false));*/
		 
		 
		 /*String rootPath="C:\\Users\\rushi_000\\git\\CS297-Interactive-Phishing-Filter-\\CS297(Interactive-Phising-Filter)\\src\\WekaAPICustomTest\\"; 
		 Classifier cls = (Classifier) weka.core.SerializationHelper.read(rootPath+"train.model");

		 //predict instance class values
		 Instances originalTrain= new Instances(new BufferedReader(new FileReader("C:\\Users\\rushi_000\\git\\CS297-Interactive-Phishing-Filter-\\CS297(Interactive-Phising-Filter)\\src\\WekaAPICustomTest\\test.arff")));//load or create Instances to predict

		 //which instance to predict class value
		 int s1=0; 

		 //perform your prediction
		 double value=cls.classifyInstance(originalTrain.instance(s1));*/

		 //get the name of the class value
		 //String prediction=originalTrain.classAttribute().value((int) [...]
		
		 String rootPath="C:\\Users\\rushi_000\\git\\CS297-Interactive-Phishing-Filter-\\CS297(Interactive-Phising-Filter)\\src\\WekaAPICustomTest\\"; 
		

	        //load model
	        Classifier cls = (Classifier) weka.core.SerializationHelper.read(rootPath+"train2.model");

	        //predict instance class values
	        Instances originalTrain= new Instances(new BufferedReader(new FileReader("C:\\Users\\rushi_000\\git\\CS297-Interactive-Phishing-Filter-\\CS297(Interactive-Phising-Filter)\\src\\WekaAPICustomTest\\test.arff"))); //load or create Instances to predict
	        originalTrain.setClassIndex(originalTrain.numAttributes() - 1);
	        //which instance to predict class value
	        int s1=2;

	        //perform your prediction
	        double value=cls.classifyInstance(originalTrain.instance(s1));

	        //get the prediction percentage or distribution
	        double[] percentage=cls.distributionForInstance(originalTrain.instance(s1));

	        //get the name of the class value
	        String prediction=originalTrain.classAttribute().value((int)value); 

	        System.out.println("The predicted value of instance "+
	                                Integer.toString(s1)+
	                                ": "+prediction); 

	        //Format the distribution
	        String distribution="";
	        for(int i=0; i <percentage.length; i=i+1)
	        {
	            if(i==value)
	            {
	                distribution=distribution+"*"+Double.toString(percentage[i])+",";
	            }
	            else
	            {
	                distribution=distribution+Double.toString(percentage[i])+",";
	            }
	        }
	        distribution=distribution.substring(0, distribution.length()-1);

	        System.out.println("Distribution:"+ distribution);
		
		
	}

}
