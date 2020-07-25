package org.fsa.svc.model.jpa;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
@Entity
public class Floor {
	
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    
	@OneToMany(targetEntity=Terminal.class, mappedBy="terminalFloor")
    private Set<Terminal> terminals = new HashSet<>();
	private String name;
}
