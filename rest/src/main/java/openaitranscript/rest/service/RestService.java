package openaitranscript.rest.service;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import openaitranscript.rest.client.FeignConfig;
import openaitranscript.rest.client.RestClient;
import openaitranscript.rest.model.TranscriptRequest;
import openaitranscript.rest.model.TranscriptResponse;
import openaitranscript.rest.model.WhisperTranscriptRequest;

@Service
@RequiredArgsConstructor
public class RestService {
	private final RestClient restClient;
    private final FeignConfig ClientConfig;

    public TranscriptResponse createTranscript(TranscriptRequest transcriptionRequest){
        WhisperTranscriptRequest whisperTranscriptionRequest = WhisperTranscriptRequest.builder()
                .model(transcriptionRequest.getModel())
                .file(transcriptionRequest.getFile())
                .build();
        return restClient.createTranscript(whisperTranscriptionRequest);
    }
}
