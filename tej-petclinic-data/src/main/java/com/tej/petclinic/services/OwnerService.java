package com.tej.petclinic.services;

import com.tej.petclinic.model.Owner;

import java.util.Set;

/**
 * @project tej-petclinic
 * @autor tejnal on 2020-04-11
 */
public interface OwnerService {

    Owner findByLastName();
    Owner findById(Long id);
    Owner save(Owner owner);
    Set<Owner> findAll();
}
