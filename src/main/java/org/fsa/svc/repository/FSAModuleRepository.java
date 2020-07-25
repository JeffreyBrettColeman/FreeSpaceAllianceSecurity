package org.fsa.svc.repository;

import org.fsa.svc.model.jpa.FSAModule;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FSAModuleRepository extends CrudRepository<FSAModule, Long>{

}
