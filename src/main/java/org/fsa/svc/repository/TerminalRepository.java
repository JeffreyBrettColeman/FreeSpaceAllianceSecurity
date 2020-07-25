package org.fsa.svc.repository;

import org.fsa.svc.model.jpa.Terminal;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TerminalRepository extends CrudRepository<Terminal, Long>{

}