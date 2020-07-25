package org.fsa.svc.model.jpa;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
@Entity
public class Terminal {
	
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
	private String name;
	
	@ManyToMany(targetEntity=User.class)
	private Set<User> users;
	
	@ManyToOne
	private Floor terminalFloor;
	
	@OneToOne(targetEntity=User.class)
	@JoinColumn(name="user_id")
	private User presentUser;
	
	@OneToOne(targetEntity=FSAModule.class, mappedBy="terminal")
	private FSAModule  accessToModule;
	
	private String notes;
	private String instructions;
}
