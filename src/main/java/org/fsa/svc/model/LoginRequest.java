package org.fsa.svc.model;

import java.util.UUID;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class LoginRequest {
	private String name;
	private String hash;
	private UUID terminalId;
}
