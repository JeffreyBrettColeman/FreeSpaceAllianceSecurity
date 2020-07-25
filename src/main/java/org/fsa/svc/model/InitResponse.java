package org.fsa.svc.model;

import java.util.Set;

import org.fsa.svc.model.jpa.Terminal;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class InitResponse {
	private ResponseStatus responseStatus;
	private Terminal currentTerminal;
	private Set<Terminal> terminals;
}
