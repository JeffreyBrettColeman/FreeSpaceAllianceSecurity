package org.fsa.svc.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ResponseStatus {
	private Integer responseCode;
	private String message;
}
