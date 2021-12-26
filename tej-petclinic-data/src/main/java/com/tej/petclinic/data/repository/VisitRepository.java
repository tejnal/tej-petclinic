package com.tej.petclinic.data.repository;

import com.tej.petclinic.data.model.Visit;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by jt on 8/5/18.
 */
public interface VisitRepository extends CrudRepository<Visit, Long> {
}

