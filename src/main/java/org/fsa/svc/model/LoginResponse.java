package org.fsa.svc.model;

import java.util.Set;

import org.fsa.svc.model.jpa.Terminal;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class LoginResponse {
	private ResponseStatus responseStatus;
	private Set<Terminal> terminalsLinked;
}
