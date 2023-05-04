package openaitranscript.rest.model;

import java.io.Serializable;

import lombok.Data;

@Data
public class TranscriptResponse implements Serializable {
	private String text;
}
