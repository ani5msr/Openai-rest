package openaitranscript.rest.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;
import openaitranscript.rest.model.TranscriptRequest;
import openaitranscript.rest.model.TranscriptResponse;
import openaitranscript.rest.service.RestService;

@RestController
@RequiredArgsConstructor
@RequestMapping(value = "/api/v1")
public class TranscriptController {
	private final RestService ClientService;
	@PostMapping(value = "/transcription", consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
	    public TranscriptResponse createTranscription(@ModelAttribute TranscriptRequest transcriptionRequest){
	        return ClientService.createTranscript(transcriptionRequest);
	    }
}
