package openaitranscript.rest.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;
import openaitranscript.rest.model.AccuracyResponse;
import openaitranscript.rest.model.TranscriptRequest;
import openaitranscript.rest.model.TranscriptResponse;
import openaitranscript.rest.service.RestService;
import openaitranscript.rest.utility.AccuracyMeasure;

import org.apache.commons.text.similarity.LevenshteinDistance;
@RestController
@RequiredArgsConstructor
@RequestMapping(value = "/api/v1")
public class TranscriptController {
	private final RestService ClientService;
	public TranscriptResponse response;
	public String compstring ;
	public double percent;
	@PostMapping(value = "/transcription", consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
	    public AccuracyResponse createTranscription(@ModelAttribute TranscriptRequest transcriptionRequest){
		    AccuracyResponse resp;
			response = ClientService.createTranscript(transcriptionRequest);
			compstring = response.getText();
			AccuracyMeasure accuracyobj = new AccuracyMeasure();
			resp = accuracyobj.checkaccuracy(compstring);
	        return resp;
	    }
}
