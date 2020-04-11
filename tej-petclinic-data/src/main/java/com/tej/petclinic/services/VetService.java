package com.tej.petclinic.services;

import com.tej.petclinic.model.Owner;
import com.tej.petclinic.model.Vet;

import java.util.Set;

/**
 * @project tej-petclinic
 * @autor tejnal on 2020-04-11
 */
public interface VetService {

    Vet findById(Long id);
    Vet save(Owner owner);
    Set<Vet> findAll();
}
