package openaitranscript.rest.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import openaitranscript.rest.RestApplication;
import openaitranscript.rest.model.TranscriptRequest;
import openaitranscript.rest.model.TranscriptResponse;

@FeignClient(
        name = "openai-service",
        url = "${openai-service.urls.base-url}",
        configuration = RestApplication.class
)
public interface RestClient {
    @PostMapping(value = "${openai-service.urls.create-transcription-url}", headers = {"Content-Type=multipart/form-data"})
    TranscriptResponse createTranscript(@ModelAttribute TranscriptRequest whisperTranscriptRequest);
}
