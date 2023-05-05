package openaitranscript.rest.model;

import java.io.Serializable;

import org.springframework.web.multipart.MultipartFile;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class AccuracyResponse implements Serializable {
	private String originalsentence;
	private String spokensentence;
	private double accuracypercent;
}
