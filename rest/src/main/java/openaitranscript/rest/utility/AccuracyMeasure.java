package openaitranscript.rest.utility;

import org.apache.commons.text.similarity.LevenshteinDistance;

import openaitranscript.rest.model.AccuracyResponse;

public class AccuracyMeasure {
	public String example = "This is my family. I live in a city.";
	public AccuracyResponse checkaccuracy(String str) {
		LevenshteinDistance levenshteinDistance = new LevenshteinDistance();
		int editDistance = levenshteinDistance.apply(example, str);
	    int maxLength = Math.max(example.length(), str.length());
	    double similarityPercentage = ((double) (maxLength - editDistance)) / maxLength * 100.0;
	    AccuracyResponse response = new AccuracyResponse(example,str,similarityPercentage);
	    return response;
	}
}
