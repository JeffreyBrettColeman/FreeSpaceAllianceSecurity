package org.fsa.svc.repository;

import org.fsa.svc.model.jpa.Floor;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FloorRepository extends CrudRepository<Floor, Long> {

}
