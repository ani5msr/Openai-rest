package openaitranscript.rest.model;

import java.io.Serializable;

import org.springframework.web.multipart.MultipartFile;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
@Data
@Builder
@AllArgsConstructor
public class WhisperTranscriptRequest implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String model;
    private MultipartFile file;
}
