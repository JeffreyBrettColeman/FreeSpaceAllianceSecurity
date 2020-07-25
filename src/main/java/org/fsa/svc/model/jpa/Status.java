package org.fsa.svc.model.jpa;

public enum Status {
	LOCKED(1), ACTIVE(2), INACTIVE(3), PROCESSING(4);

	public final int code;

	Status(int i) {
		this.code = i;
	}
}
