package org.fsa.svc.model.jpa;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
@Entity
public class User {
	@JsonIgnore
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
	private String userName;
	@JsonIgnore
	private String passwordHash;
	
	@OneToOne(targetEntity=Terminal.class, mappedBy="presentUser")
	private Terminal presentTerminal;
	
	@OneToMany(targetEntity=Terminal.class, mappedBy="users")
	private Set<Terminal> terminals = new HashSet<>();	
}
