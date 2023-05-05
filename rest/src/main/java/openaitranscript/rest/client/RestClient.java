package openaitranscript.rest.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import openaitranscript.rest.RestApplication;
import openaitranscript.rest.model.TranscriptRequest;
import openaitranscript.rest.model.TranscriptResponse;
import openaitranscript.rest.model.WhisperTranscriptRequest;

@FeignClient(
        name = "openai-service",
        url = "${openai-service.urls.base-url}",
        configuration = FeignConfig.class
)
public interface RestClient {
    @PostMapping(value = "${openai-service.urls.create-transcription-url}", headers = {"Content-Type=multipart/form-data"})
    TranscriptResponse createTranscript(@ModelAttribute WhisperTranscriptRequest TranscriptRequest);
}
